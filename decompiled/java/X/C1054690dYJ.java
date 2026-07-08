package X;

import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;

/* JADX INFO: renamed from: X.0dYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054690dYJ {
    public static String LIZIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append("_key_selected_album_");
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZ(String str, String str2, String str3, String str4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append("_composer_beauty_manual_");
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str4);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        sbLIZ.append("_composer_beauty_manual_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str4);
        sbLIZ.append('_');
        sbLIZ.append(str5);
        return MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ));
    }
}
