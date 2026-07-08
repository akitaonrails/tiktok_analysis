package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.MovePartialAssetsData;

/* JADX INFO: renamed from: X.0w5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767130w5P {
    public static MoveFullEntryAssetsData LIZIZ;
    public static MovePartialAssetsData LIZJ;
    public static EnumC1987407qS LIZLLL;
    public static int LJ;
    public static long LJI;
    public static Integer LJII;
    public static String LJIIIIZZ;
    public static final C1767130w5P LIZ = new C1767130w5P();
    public static EnumC1767140w5Q LJFF = EnumC1767140w5Q.NOT_STARTED;

    public static boolean LIZ() {
        if (!C1767190w5V.LIZJ) {
            return false;
        }
        if (C1767190w5V.LIZ && LIZJ == null) {
            return false;
        }
        if (C1767190w5V.LIZIZ && LIZIZ == null) {
            return false;
        }
        C1198104mR.LIZ.getClass();
        if (C1198104mR.LJ().getBoolean(C1198104mR.LIZLLL(), false)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C1198104mR.LJ().getLong(C1198104mR.LIZIZ(), 0L);
        int i = C1767190w5V.LJFF;
        if (j == 0 || jCurrentTimeMillis - j <= ((long) (i * 24 * 60 * 60)) * 1000) {
            long j2 = C1198104mR.LJ().getLong(C1198104mR.LIZ(), 0L);
            return j2 == 0 || jCurrentTimeMillis - j2 >= ((long) (((C1767190w5V.LJI * 24) * 60) * 60)) * 1000;
        }
        C1198104mR.LJ().storeBoolean(C1198104mR.LIZLLL(), true);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.EnumC1767180w5U r30, boolean r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767130w5P.LIZIZ(X.0w5U, boolean, java.lang.String):void");
    }
}
