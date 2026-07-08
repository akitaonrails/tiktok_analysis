package X;

import android.content.res.Resources;

/* JADX INFO: renamed from: X.0UxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788990UxF {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j, Resources resources) {
        StringBuilder sb = new StringBuilder();
        if (j < 60) {
            sb.append(resources.getString(2131847508, String.valueOf(j)));
        } else {
            long j2 = 60;
            long j3 = j % j2;
            long j4 = j / j2;
            if (j3 >= 30) {
                j4++;
            }
            long j5 = j4 * j2;
            if (j5 < 3600) {
                sb.append(resources.getString(2131847505, String.valueOf(j5 / j2)));
            } else {
                long j6 = 3600;
                long j7 = j5 / j6;
                long j8 = (j5 % j6) / j2;
                if (j8 == 0) {
                    sb.append(resources.getString(2131847504, String.valueOf(j7)));
                } else {
                    sb.append(resources.getString(2131847503, String.valueOf(j7), String.valueOf(j8)));
                }
            }
        }
        return sb.toString();
    }
}
