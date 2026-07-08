package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0jXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285020jXo {
    public static final int LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;

    static {
        int i = Build.VERSION.SDK_INT;
        LIZ = i;
        String str = Build.DEVICE;
        LIZIZ = str;
        String str2 = Build.MANUFACTURER;
        LIZJ = str2;
        String str3 = Build.MODEL;
        LIZLLL = str3;
        LJ = Build.HARDWARE;
        LJFF = Build.BRAND;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str3);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
