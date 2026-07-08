package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0QBT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBT {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(int i) {
        if (i < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(i);
    }

    public static int LIZJ(int i) {
        if (i <= 0) {
            return 0;
        }
        return i / LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static String LIZ(int i, boolean z) {
        if (i < 3600) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("00:");
                sbLIZ.append(LIZIZ(i / 60));
                sbLIZ.append(':');
                sbLIZ.append(LIZIZ(i % 60));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZIZ(i / 60));
            sbLIZ2.append(':');
            sbLIZ2.append(LIZIZ(i % 60));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LIZIZ(i / 3600));
        sbLIZ3.append(':');
        sbLIZ3.append(LIZ(i % 3600, false));
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static CharSequence LIZLLL(float f, int i) {
        boolean z;
        int i2 = (int) ((f * i) / 100);
        if (i >= 3600) {
            z = true;
        } else {
            z = false;
        }
        return LIZ(i2, z);
    }
}
