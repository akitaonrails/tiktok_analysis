package X;

import android.app.Activity;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1AEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176151AEr extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C2176151AEr(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public static String LJJIIZ(float f, float f2) {
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            numValueOf = Integer.valueOf(C497820Jfg.LIZIZ(activityLIZIZ2));
        } else {
            numValueOf = null;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
            numValueOf2 = Integer.valueOf(C497820Jfg.LIZ(activityLIZIZ));
        } else {
            numValueOf2 = null;
        }
        if (numValueOf == null || numValueOf2 == null) {
            return null;
        }
        if (f > numValueOf.intValue() / 2) {
            i = 1;
        } else {
            i = 0;
        }
        if (f2 > numValueOf2.intValue() / 2) {
            i |= 2;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return "bottom_right_side";
                }
                return "bottom_left_side";
            }
            return "upper_right_side";
        }
        return "upper_left_side";
    }
}
