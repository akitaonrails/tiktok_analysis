package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1331680kl4 implements Runnable {
    public final /* synthetic */ C1331510kkn LL;
    public final /* synthetic */ C1331790klF LLILLJJLI;

    public /* synthetic */ RunnableC1331680kl4(C1331510kkn c1331510kkn, C1331790klF c1331790klF) {
        this.LL = c1331510kkn;
        this.LLILLJJLI = c1331790klF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1331510kkn c1331510kkn = this.LL;
        C1331790klF c1331790klF = this.LLILLJJLI;
        C1C7U.LIZ("CancellableManager@3889.registerMainCancellable$1L");
        if (C1331710kl7.LIZIZ.size() > 30) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("size :");
            sbLIZ.append(C1331710kl7.LIZIZ.size());
            C1330590kjJ.LIZJ("CancellableManager", "checkSize", C2188811AlT.LIZIZ(sbLIZ));
            Iterator it2 = ((LinkedHashMap) C1331710kl7.LIZIZ).entrySet().iterator();
            while (it2.hasNext()) {
                C1331790klF c1331790klF2 = (C1331790klF) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                if (c1331790klF2 == null) {
                    it2.remove();
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("remove null cancellable:");
                    sbLIZ2.append(C1331710kl7.LIZIZ.size());
                    C1330590kjJ.LIZJ("CancellableManager", "checkSize", C2188811AlT.LIZIZ(sbLIZ2));
                } else if (c1331790klF2.LLILLL) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("remove cancelled :");
                    sbLIZ3.append(C1331710kl7.LIZIZ.size());
                    C1330590kjJ.LIZJ("CancellableManager", "checkSize", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("after trim size :");
            sbLIZ4.append(C1331710kl7.LIZIZ.size());
            C1330590kjJ.LIZJ("CancellableManager", "checkSize", C2188811AlT.LIZIZ(sbLIZ4));
        }
        C1331710kl7.LIZIZ.put(c1331510kkn, new WeakReference<>(c1331790klF));
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[ADD]@@");
        sbLIZ5.append(c1331510kkn.hashCode());
        sbLIZ5.append(" registerMainCancellable  size:");
        sbLIZ5.append(C1331710kl7.LIZIZ.size());
        C1330590kjJ.LIZIZ("CancellableManager", C2188811AlT.LIZIZ(sbLIZ5));
        C1C7U.LIZIZ("CancellableManager@3889.registerMainCancellable$1L");
    }
}
