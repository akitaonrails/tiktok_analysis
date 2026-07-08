package X;

import Y.ARunnableS114S0100000_14;
import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Y2P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0Y2P implements InterfaceC864940XwS {
    public final Map<Long, DeleteMsgRequest> LIZ = new ConcurrentHashMap();
    public volatile boolean LIZIZ = false;
    public final C0YEM LIZJ;
    public final int LIZLLL;

    @Override // X.InterfaceC864940XwS
    public final Map<Long, DeleteMsgRequest> LIZ() {
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaitDelCon_FileStore trigger, cache:");
        sbLIZ.append(((ConcurrentHashMap) this.LIZ).size());
        sbLIZ.append(", isInit:");
        sbLIZ.append(this.LIZIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (((ConcurrentHashMap) this.LIZ).isEmpty()) {
            return new HashMap();
        }
        for (DeleteMsgRequest deleteMsgRequest : ((ConcurrentHashMap) this.LIZ).values()) {
            deleteMsgRequest.retryTimes = Integer.valueOf(deleteMsgRequest.retryTimes.intValue() + 1);
        }
        HashMap map = new HashMap(this.LIZ);
        if (this.LIZLLL != 5) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
        LJ();
        return map;
    }

    public final void LJ() {
        this.LIZJ.LJIIL().LIZJ().execute(new ARunnableS114S0100000_14(this, 7));
    }

    @Override // X.InterfaceC864940XwS
    public final void init() {
        this.LIZJ.LJIIL().LIZIZ().execute(new Runnable() { // from class: X.0Y2Q
            public final void LIZ() {
                C0Y2P c0y2p = this.LL;
                String strLJJIIJ = c0y2p.LIZJ.LJIIZILJ().LIZIZ().LIZJ().LJJIIJ();
                if (!TextUtils.isEmpty(strLJJIIJ)) {
                    try {
                        Map map = (Map) C09EF.LIZ.LJIIIIZZ(strLJJIIJ, new TypeToken<ConcurrentHashMap<Long, DeleteMsgRequest>>() { // from class: X.0Y2T
                        }.getType());
                        if (map != null && !map.isEmpty()) {
                            ((ConcurrentHashMap) c0y2p.LIZ).putAll(map);
                        }
                        C868780Y6i c868780Y6iLIZLLL = c0y2p.LIZJ.LIZLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("WaitDelCon_FileStore initFromSp success, cache:");
                        sbLIZ.append(((ConcurrentHashMap) c0y2p.LIZ).size());
                        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C868780Y6i c868780Y6iLIZLLL2 = c0y2p.LIZJ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("WaitDelCon_FileStore initFromSp error:");
                        sbLIZ2.append(th);
                        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                this.LL.LIZIZ = true;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("WaitDelMessageManager$FileCacheStore@965e.init$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("WaitDelMessageManager$FileCacheStore@965e.init$1");
            }
        });
    }

    @Override // X.InterfaceC864940XwS
    public final void LIZIZ(long j) {
        if (((ConcurrentHashMap) this.LIZ).remove(Long.valueOf(j)) == null) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore remove not exist, msgId:");
            sbLIZ.append(j);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LJ();
    }

    public C0Y2P(C0YEM c0yem, int i) {
        this.LIZJ = c0yem;
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC864940XwS
    public final void LIZJ(int i, Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
        if (!this.LIZIZ) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore add, not init, msgId:");
            sbLIZ.append(l);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("WaitDelCon_FileStore , add, already in cache, msgId:");
            sbLIZ2.append(l);
            c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
        }
        DeleteMsgRequest deleteMsgRequestFromReqBody = DeleteMsgRequest.fromReqBody(i, deleteMessageRequestBody);
        ((ConcurrentHashMap) this.LIZ).put(deleteMessageRequestBody.message_id, deleteMsgRequestFromReqBody);
        LJ();
    }

    @Override // X.InterfaceC864940XwS
    public final void LIZLLL(int i, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        if (!this.LIZIZ) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore add, not init, msgId:");
            sbLIZ.append(l);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("WaitDelCon_FileStore , add, already in cache, msgId:");
            sbLIZ2.append(l);
            c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
        }
        DeleteMsgRequest deleteMsgRequestFromReqBody = DeleteMsgRequest.fromReqBody(i, deleteStrangerMessageRequestBody);
        ((ConcurrentHashMap) this.LIZ).put(deleteStrangerMessageRequestBody.server_message_id, deleteMsgRequestFromReqBody);
        LJ();
    }
}
