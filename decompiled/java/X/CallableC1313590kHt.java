package X;

import Y.ARunnableS16S1300000_20;
import Y.ARunnableS89S0200000_20;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0kHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class CallableC1313590kHt implements Callable<Runnable> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1291290jhv LLILLL;
    public final /* synthetic */ Map LLILZ;
    public final /* synthetic */ boolean LLILZIL = false;
    public final /* synthetic */ C1313470kHh LLILZLL;

    @Override // java.util.concurrent.Callable
    public final Runnable call() {
        C1313490kHj c1313490kHj;
        C1C7U.LIZ("SDUIUIOwner@fafd.createViewAsync$1");
        ARunnableS16S1300000_20 aRunnableS16S1300000_20 = null;
        try {
            if (this.LL.equals("list")) {
                C1317100kNY c1317100kNY = this.LLILZLL.LIZJ.LLJJJJ;
                c1317100kNY.LJIJ = this.LLILLJJLI;
                c1317100kNY.LJIIL++;
            }
            String strLJI = (this.LL.equals("list") && this.LLILLL.LJII("custom-list-name")) ? this.LLILLL.LJI("custom-list-name") : this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UIOwner.createViewAsync.");
            sbLIZ.append(strLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            SDUIBaseUI sDUIBaseUILIZJ = this.LLILZLL.LIZJ(this.LLILLJJLI, strLJI, this.LLILZ, this.LLILZIL);
            SDUIBaseUI[] sDUIBaseUIArr = {sDUIBaseUILIZJ};
            C1313470kHh c1313470kHh = this.LLILZLL;
            C1291290jhv c1291290jhv = this.LLILLL;
            c1313470kHh.getClass();
            if (c1291290jhv != null) {
                c1313490kHj = C1313470kHh.LJII(c1291290jhv) ? new C1313490kHj(c1313470kHh.LIZJ, sDUIBaseUILIZJ) : null;
                sDUIBaseUILIZJ.LJLJI(c1291290jhv);
            } else {
                c1313490kHj = null;
            }
            aRunnableS16S1300000_20 = new ARunnableS16S1300000_20(this, sDUIBaseUIArr, c1313490kHj, strLJI, 7);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createViewAsync failed, tagName:");
            sbLIZ2.append(this.LL);
            sbLIZ2.append(", error:");
            sbLIZ2.append(th);
            Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ2));
            exc.setStackTrace(th.getStackTrace());
            C1290750jh3.LIZLLL(new ARunnableS89S0200000_20(this, exc, 184));
        }
        C1C7U.LIZIZ("SDUIUIOwner@fafd.createViewAsync$1");
        return aRunnableS16S1300000_20;
    }

    public CallableC1313590kHt(C1313470kHh c1313470kHh, String str, int i, C1291290jhv c1291290jhv, Map map) {
        this.LLILZLL = c1313470kHh;
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c1291290jhv;
        this.LLILZ = map;
    }
}
