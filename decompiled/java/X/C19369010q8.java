package X;

import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;

/* JADX INFO: renamed from: X.10q8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19369010q8 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(float f, boolean z, AbstractDetailFragment abstractDetailFragment) {
        C1260300itw helper;
        C1260290itv c1260290itv = abstractDetailFragment.mScrollableLayout;
        if ((c1260290itv != null && (helper = c1260290itv.getHelper()) != null && helper.LIZIZ()) || (z && f < 0.1f)) {
            abstractDetailFragment.mAnimator.LIZJ();
            return false;
        }
        return z;
    }

    public static boolean LIZIZ(float f, float f2, boolean z, AbstractDetailFragment abstractDetailFragment) {
        boolean zLIZIZ;
        C1260300itw helper;
        abstractDetailFragment.controlScroll();
        C1260290itv c1260290itv = abstractDetailFragment.mScrollableLayout;
        if (c1260290itv != null && (helper = c1260290itv.getHelper()) != null) {
            zLIZIZ = helper.LIZIZ();
        } else {
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            return true;
        }
        if (Math.abs(f) >= Math.abs(f2)) {
            return z;
        }
        if (f2 > 30.0f) {
            abstractDetailFragment.mAnimator.LIZIZ();
        } else if (f2 < -30.0f) {
            return true;
        }
        return z;
    }
}
