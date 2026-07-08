package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186330gyd {
    public static String LIZ(int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        if (str == null || !(!a0.LJJJIL(str))) {
            str = "unknown";
        }
        if (i == i2) {
            str2 = "first";
        } else {
            str2 = "non_first";
        }
        if (z) {
            str3 = "small";
        } else {
            str3 = "large";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_gallery_image_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
