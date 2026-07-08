package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0HDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437510HDp {
    public static final C437510HDp LIZ = new C437510HDp();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int LIZ(C437510HDp c437510HDp, User user, int i, Integer num, Integer num2, Integer num3, int i2) {
        if ((i2 & 2) != 0) {
            i = 2131827064;
        }
        if ((i2 & 4) != 0) {
            num = 2131827096;
        }
        if ((i2 & 8) != 0) {
            num2 = Integer.valueOf(i);
        }
        if ((i2 & 16) != 0) {
            num3 = 2131827065;
        }
        c437510HDp.getClass();
        switch (C437500HDo.LIZ[C437530HDr.LIZ(user).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (num != null) {
                    return num.intValue();
                }
                return i;
            case 5:
                if (num2 != null) {
                    return num2.intValue();
                }
                return i;
            case 6:
                if (num3 != null) {
                    return num3.intValue();
                }
                return i;
            default:
                return i;
        }
    }
}
