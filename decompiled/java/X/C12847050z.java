package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.050z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12847050z {
    public static final Keva LIZ = Keva.getRepo("ad_inference_feedback_data");

    public static void LIZ(Boolean bool, String str, Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("time");
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (bool != null) {
            LIZ.storeBoolean(strLIZIZ, bool.booleanValue());
        }
        if (l != null) {
            LIZ.storeLong(strLIZIZ2, l.longValue());
        }
    }
}
