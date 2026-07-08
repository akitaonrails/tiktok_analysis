package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.17zM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21209817zM implements InterfaceC21210317zR {
    public final WeakReference<C21212117zj> LL;
    public C21210517zT LLILLJJLI;

    @Override // X.InterfaceC21210317zR
    public final void LIZ() {
        C21210517zT c21210517zT = this.LLILLJJLI;
        if (c21210517zT != null) {
            c21210517zT.LLIZLLLIL = System.currentTimeMillis();
            c21210517zT.LLJIJIL = true;
            c21210517zT.LJJZ();
        }
    }

    @Override // X.InterfaceC21210317zR
    public final void LIZIZ() {
        C21210517zT c21210517zT = this.LLILLJJLI;
        if (c21210517zT != null) {
            c21210517zT.LLIZ = System.currentTimeMillis();
        }
        C21212117zj c21212117zj = this.LL.get();
        if (c21212117zj != null) {
            C1756140vng.LIZIZ(c21212117zj);
        }
    }

    @Override // X.InterfaceC21210317zR
    public final void onHide() throws JSONException {
        C21210517zT c21210517zT = this.LLILLJJLI;
        if (c21210517zT != null) {
            c21210517zT.LJJJZ();
        }
        C21212117zj c21212117zj = this.LL.get();
        if (c21212117zj != null) {
            C1756140vng.LIZ(c21212117zj);
        }
    }

    public C21209817zM(WeakReference<C21212117zj> weakReference, C21210517zT c21210517zT) {
        this.LL = weakReference;
        this.LLILLJJLI = c21210517zT;
    }

    public final void LIZJ(long j, Map<String, ? extends Object> map, C21210517zT c21210517zT) {
        if (c21210517zT != null) {
            this.LLILLJJLI = c21210517zT;
            return;
        }
        C21210517zT c21210517zT2 = this.LLILLJJLI;
        if (c21210517zT2 == null || !c21210517zT2.LLILZ) {
            return;
        }
        c21210517zT2.LL = j;
        c21210517zT2.LLILLJJLI = true;
        c21210517zT2.LLILLL = map;
        c21210517zT2.LLILZLL = false;
        c21210517zT2.LLJI = false;
        c21210517zT2.LLJIJIL = false;
        c21210517zT2.LLIZ = 0L;
        c21210517zT2.LLJ = C2097608Jq.LJ();
    }
}
