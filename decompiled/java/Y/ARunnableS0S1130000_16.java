package Y;

import X.C1042650dEt;
import X.C1490740otc;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1490770otf;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS0S1130000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOfflinePreloadStatus, ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" \n isPreloaded=");
        sbLIZ.append(this.z2);
        sbLIZ.append("}, isRequestReused=");
        sbLIZ.append(this.z3);
        sbLIZ.append(", \n isSSPData=");
        sbLIZ.append(this.z4);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.W, "CommerceLandPageSSPContext_");
        if (this.z2 || this.z3) {
            ((C1042650dEt) this.l1).LJJI.add(this.s0);
        }
        if (this.z4) {
            ((C1042650dEt) this.l1).LJJIFFI.add(this.s0);
        }
    }

    public final void LIZ$1() {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrefetchStatus, ");
        sbLIZ.append(this.s0);
        sbLIZ.append(" \n isPreloaded=");
        sbLIZ.append(this.z2);
        sbLIZ.append("}, isRequestReused=");
        sbLIZ.append(this.z3);
        sbLIZ.append(", \n isSSPData=");
        sbLIZ.append(this.z4);
        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.W, "CommerceLandPageSSPContext_");
        if (this.z2 || this.z3) {
            ((C1042650dEt) this.l1).LJIJJ.add(this.s0);
        }
        if (this.z4) {
            ((C1042650dEt) this.l1).LJIJJLI.add(this.s0);
        }
    }

    public static final void run$0(ARunnableS0S1130000_16 aRunnableS0S1130000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPContext@54b7.onOfflinePreloadStatus$1");
        try {
            aRunnableS0S1130000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPContext@54b7.onOfflinePreloadStatus$1");
    }

    public static final void run$1(ARunnableS0S1130000_16 aRunnableS0S1130000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPContext@54b7.onPrefetchHitStatus$1");
        try {
            aRunnableS0S1130000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPContext@54b7.onPrefetchHitStatus$1");
    }

    public ARunnableS0S1130000_16(String str, boolean z, boolean z2, boolean z3, C1042650dEt c1042650dEt, int i) {
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.z3 = z2;
        this.z4 = z3;
        this.l1 = c1042650dEt;
    }
}
