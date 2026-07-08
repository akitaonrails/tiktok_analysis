package X;

import Y.ARunnableS131S0100000_31;
import android.os.Handler;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15W2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15W2 {
    public static final C01GW<Handler> LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(476));
    public static final String LJFF = "ExploreDoFrameBalancer";
    public final String LIZ;
    public final long LIZIZ;
    public boolean LIZJ;
    public ARunnableS131S0100000_31 LIZLLL;

    public final void LIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C2153908cD c2153908cD = C2153908cD.LIZ;
        String str = LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start DoFrameBalancer(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2153908cD.getClass();
        C2153908cD.LIZJ(3, strLIZIZ, str);
        C0N5P.LIZ.LIZLLL(this.LIZ, new C0N5R(16L, 30L));
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 161);
        this.LIZLLL = aRunnableS131S0100000_31;
        C786410Ut5.LJLIIL(this.LIZIZ, LJ.getValue(), aRunnableS131S0100000_31);
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LIZLLL;
            if (aRunnableS131S0100000_31 != null) {
                LJ.getValue().removeCallbacks(aRunnableS131S0100000_31);
                this.LIZLLL = null;
            }
            C0N5P c0n5p = C0N5P.LIZ;
            C0N5P.LJ(this.LIZ);
            this.LIZJ = false;
        }
    }

    public C15W2(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
