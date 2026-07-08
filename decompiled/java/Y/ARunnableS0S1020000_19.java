package Y;

import X.C1245340iVo;
import X.C1C7U;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS0S1020000_19 implements Runnable {
    public final int $t;
    public String s0;
    public boolean z1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1020000_19 aRunnableS0S1020000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateNicknameEllipsized$1");
        try {
            if (aRunnableS0S1020000_19.z1) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                C1245340iVo.LJIIZILJ = Boolean.valueOf(aRunnableS0S1020000_19.z2);
            } else {
                String str = aRunnableS0S1020000_19.s0;
                if (str != null && str.length() != 0) {
                    C1245340iVo.LJIJ.put(aRunnableS0S1020000_19.s0, Boolean.valueOf(aRunnableS0S1020000_19.z2));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateNicknameEllipsized$1");
    }

    public static final void run$1(ARunnableS0S1020000_19 aRunnableS0S1020000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateNicknameLineBreak$1");
        try {
            if (aRunnableS0S1020000_19.z1) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                C1245340iVo.LJIJI = Boolean.valueOf(aRunnableS0S1020000_19.z2);
            } else {
                String str = aRunnableS0S1020000_19.s0;
                if (str != null && str.length() != 0) {
                    C1245340iVo.LJIJJ.put(aRunnableS0S1020000_19.s0, Boolean.valueOf(aRunnableS0S1020000_19.z2));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateNicknameLineBreak$1");
    }

    public static final void run$2(ARunnableS0S1020000_19 aRunnableS0S1020000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateNicknameWordBreak$1");
        try {
            if (aRunnableS0S1020000_19.z1) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                C1245340iVo.LJIJJLI = Boolean.valueOf(aRunnableS0S1020000_19.z2);
            } else {
                String str = aRunnableS0S1020000_19.s0;
                if (str != null && str.length() != 0) {
                    C1245340iVo.LJIL.put(aRunnableS0S1020000_19.s0, Boolean.valueOf(aRunnableS0S1020000_19.z2));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateNicknameWordBreak$1");
    }

    public ARunnableS0S1020000_19(boolean z, boolean z2, String str, int i) {
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.s0 = str;
    }
}
