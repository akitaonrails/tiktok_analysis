package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.04sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237104sj {
    public static final Keva LIZ = Keva.getRepo("gift_gallery");

    public static void LIZ(Long l) {
        long jLongValue;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gallery_barrage_show_time_");
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        sbLIZ.append(jLongValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (lValueOf != null) {
            jLongValue2 = lValueOf.longValue();
        }
        keva.storeLong(strLIZIZ, jLongValue2);
    }
}
