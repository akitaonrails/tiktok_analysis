package X;

import android.text.TextUtils;
import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Y2J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2J {
    public long LIZ;
    public C0Y2H LIZIZ;
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
            this.LIZIZ = new C0Y2H(c0yem) { // from class: X.0Y2I
                public final Map<String, DeleteConversationRequest> LIZ = new ConcurrentHashMap();
                public final C0YEM LIZIZ;

                @Override // X.C0Y2H
                public final void init() {
                }

                @Override // X.C0Y2H
                public final Map<String, DeleteConversationRequest> LIZ() {
                    Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
                    while (it2.hasNext()) {
                        ((DeleteConversationRequest) it2.next()).retryTimes++;
                    }
                    HashMap map = new HashMap(this.LIZ);
                    ((ConcurrentHashMap) this.LIZ).clear();
                    return map;
                }

                {
                    this.LIZIZ = c0yem;
                }

                @Override // X.C0Y2H
                public final void remove(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ConcurrentHashMap) this.LIZ).remove(str);
                    }
                }

                @Override // X.C0Y2H
                public final void LIZIZ(int i2, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
                    if (!TextUtils.isEmpty(str) && deleteConversationRequestBody != null) {
                        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
                            C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("WaitDelCon_CacheStore, add, already in cache, cid:");
                            sbLIZ2.append(str);
                            c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        ((ConcurrentHashMap) this.LIZ).put(str, DeleteConversationRequest.fromReqBody(i2, str, deleteConversationRequestBody));
                        return;
                    }
                    C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("WaitDelCon_CacheStoreadd, invalid param, cid:");
                    sbLIZ3.append(str);
                    c868780Y6iLIZLLL3.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                }
            };
        } else {
            this.LIZIZ = new C0Y2K(this.LIZJ, i);
        }
        this.LIZIZ.init();
    }

    public C0Y2J(C0YEM c0yem) {
        this.LIZJ = c0yem;
        this.LIZLLL = c0yem.LJIIIZ().LJJIIZI;
    }
}
