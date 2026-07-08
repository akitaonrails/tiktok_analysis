package X;

import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Y2S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2S {
    public long LIZ;
    public InterfaceC864940XwS LIZIZ;
    public final C0YEM LIZJ;
    public final int LIZLLL;

    public final void LIZ() {
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaitDelCon onLogin, mode:");
        sbLIZ.append(this.LIZLLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LIZLLL;
        if (i == 0) {
            final C0YEM c0yem = this.LIZJ;
            this.LIZIZ = new InterfaceC864940XwS(c0yem) { // from class: X.0Y2R
                public final Map<Long, DeleteMsgRequest> LIZ = new ConcurrentHashMap();
                public final C0YEM LIZIZ;

                @Override // X.InterfaceC864940XwS
                public final void init() {
                }

                @Override // X.InterfaceC864940XwS
                public final Map<Long, DeleteMsgRequest> LIZ() {
                    for (DeleteMsgRequest deleteMsgRequest : ((ConcurrentHashMap) this.LIZ).values()) {
                        deleteMsgRequest.retryTimes = Integer.valueOf(deleteMsgRequest.retryTimes.intValue() + 1);
                    }
                    HashMap map = new HashMap(this.LIZ);
                    ((ConcurrentHashMap) this.LIZ).clear();
                    return map;
                }

                {
                    this.LIZIZ = c0yem;
                }

                @Override // X.InterfaceC864940XwS
                public final void LIZIZ(long j) {
                    ((ConcurrentHashMap) this.LIZ).remove(Long.valueOf(j));
                }

                @Override // X.InterfaceC864940XwS
                public final void LIZJ(int i2, Long l, DeleteMessageRequestBody deleteMessageRequestBody) {
                    if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("WaitDelCon_CacheStore, add, already in cache, msgId:");
                        sbLIZ2.append(l);
                        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    ((ConcurrentHashMap) this.LIZ).put(deleteMessageRequestBody.message_id, DeleteMsgRequest.fromReqBody(i2, deleteMessageRequestBody));
                }

                @Override // X.InterfaceC864940XwS
                public final void LIZLLL(int i2, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
                    if (((ConcurrentHashMap) this.LIZ).containsKey(l)) {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("WaitDelCon_CacheStore, add, already in cache, msgId:");
                        sbLIZ2.append(l);
                        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    ((ConcurrentHashMap) this.LIZ).put(deleteStrangerMessageRequestBody.server_message_id, DeleteMsgRequest.fromReqBody(i2, deleteStrangerMessageRequestBody));
                }
            };
        } else {
            this.LIZIZ = new C0Y2P(this.LIZJ, i);
        }
        this.LIZIZ.init();
    }

    public C0Y2S(C0YEM c0yem) {
        this.LIZJ = c0yem;
        this.LIZLLL = c0yem.LJIIIZ().LJJIJIIJI;
    }
}
