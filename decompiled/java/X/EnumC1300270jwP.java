package X;

import android.view.View;

/* JADX INFO: renamed from: X.0jwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1300270jwP {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static EnumC1300270jwP fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown measureMode");
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }

    public static int fromMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return EXACTLY.intValue();
                }
                throw new IllegalArgumentException("Unknown measureSpec");
            }
            return UNDEFINED.intValue();
        }
        return AT_MOST.intValue();
    }

    public static EnumC1300270jwP valueOf(String str) {
        return (EnumC1300270jwP) C08FF.LIZ(EnumC1300270jwP.class, str);
    }

    EnumC1300270jwP(int i) {
        this.LL = i;
    }
}
