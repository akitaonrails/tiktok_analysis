package Y;

import X.AbstractC1387200mCc;
import X.C0FWJ;
import X.C1245340iVo;
import X.C1389890mGx;
import X.C1906580ziK;
import X.C1C7U;
import android.view.View;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS2S0010000_19 implements Runnable {
    public final int $t;
    public boolean z0;

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

    public static final void run$0(ARunnableS2S0010000_19 aRunnableS2S0010000_19) {
        boolean zLIZ;
        View viewLJI;
        int i;
        C1C7U.LIZ("FundraiserService@c82a.showStickerWillAddToast$1");
        try {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (viewLJI = abstractC1387200mCcLJ.LJI()) != null) {
                boolean z = aRunnableS2S0010000_19.z0;
                if (C0FWJ.LIZ()) {
                    if (z) {
                        i = 2131824885;
                    } else {
                        i = 2131824878;
                    }
                } else if (z) {
                    i = 2131824884;
                } else {
                    i = 2131824865;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(viewLJI);
                c1389890mGx.LJIIJ(viewLJI.getResources().getString(i));
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FundraiserService@c82a.showStickerWillAddToast$1");
    }

    public static final void run$1(ARunnableS2S0010000_19 aRunnableS2S0010000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.resetInfoForEveryFeature$1");
        try {
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            boolean z = aRunnableS2S0010000_19.z0;
            c1245340iVo.getClass();
            C1245340iVo.LJIIIIZZ(z);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.resetInfoForEveryFeature$1");
    }

    public ARunnableS2S0010000_19(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
