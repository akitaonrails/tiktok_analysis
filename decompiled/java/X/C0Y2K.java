package X;

import Y.ARunnableS114S0100000_14;
import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Y2K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0Y2K implements C0Y2H {
    public final Map<String, DeleteConversationRequest> LIZ = new ConcurrentHashMap();
    public volatile boolean LIZIZ = false;
    public final C0YEM LIZJ;
    public final int LIZLLL;

    @Override // X.C0Y2H
    public final Map<String, DeleteConversationRequest> LIZ() {
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
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((DeleteConversationRequest) it2.next()).retryTimes++;
        }
        HashMap map = new HashMap(this.LIZ);
        if (this.LIZLLL != 2) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
        LIZJ();
        return map;
    }

    public final void LIZJ() {
        this.LIZJ.LJIIL().LIZJ().execute(new ARunnableS114S0100000_14(this, 6));
    }

    @Override // X.C0Y2H
    public final void init() {
        this.LIZJ.LJIIL().LIZIZ().execute(new ARunnableS114S0100000_14(this, 5));
    }

    @Override // X.C0Y2H
    public final void remove(String str) {
        if (TextUtils.isEmpty(str)) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitDelCon_FileStore remove, invalid cid:");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (((ConcurrentHashMap) this.LIZ).remove(str) == null) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("WaitDelCon_FileStore remove not exist, cid:");
            sbLIZ2.append(str);
            c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LIZJ();
    }

    public C0Y2K(C0YEM c0yem, int i) {
        this.LIZJ = c0yem;
        this.LIZLLL = i;
    }

    @Override // X.C0Y2H
    public final void LIZIZ(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        if (!TextUtils.isEmpty(str) && deleteConversationRequestBody != null) {
            if (!this.LIZIZ) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WaitDelCon_FileStore add, not init, cid:");
                sbLIZ.append(str);
                c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("WaitDelCon_FileStore , add, already in cache, cid:");
                sbLIZ2.append(str);
                c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            }
            ((ConcurrentHashMap) this.LIZ).put(str, DeleteConversationRequest.fromReqBody(i, str, deleteConversationRequestBody));
            LIZJ();
            return;
        }
        C868780Y6i c868780Y6iLIZLLL3 = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("WaitDelCon_FileStore add, invalid param, cid:");
        sbLIZ3.append(str);
        c868780Y6iLIZLLL3.LJI(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
