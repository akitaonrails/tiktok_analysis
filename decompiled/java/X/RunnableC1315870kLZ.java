package X;

import Y.ARunnableS10S2100000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import j27.s;

/* JADX INFO: renamed from: X.0kLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1315870kLZ implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ s LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1315720kLK LLILZLL;

    public final void LIZ() {
        String strLJ = this.LL;
        String strLJ2 = this.LLILLJJLI;
        try {
            if (this.LLILLL) {
                strLJ = this.LLILZLL.LJ(this.LLILZ, strLJ);
            }
            if (this.LLILZIL) {
                strLJ2 = this.LLILZLL.LJ(this.LLILZ, this.LLILLJJLI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("async redirect url failed, placeholder: ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", url:");
            sbLIZ.append(this.LL);
            sbLIZ.append(", msg:");
            sbLIZ.append(th.getMessage());
            LynxLog.e("Lynx-Image", C2188811AlT.LIZIZ(sbLIZ));
            strLJ = this.LL;
            strLJ2 = this.LLILLJJLI;
        }
        C1289620jfE.LIZJ(new ARunnableS10S2100000_20(this, strLJ, strLJ2, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ImageDelegate@8dd.setRedirectImageSource$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageDelegate@8dd.setRedirectImageSource$1");
    }

    public RunnableC1315870kLZ(C1315720kLK c1315720kLK, String str, String str2, boolean z, s sVar, boolean z2) {
        this.LLILZLL = c1315720kLK;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = sVar;
        this.LLILZIL = z2;
    }
}
