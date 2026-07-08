package X;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.03RE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, String str3) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_ec_mall_track_id_md5", true) && (strLIZ = C2085508Ez.LIZ(strLIZIZ)) != null) {
            return strLIZ;
        }
        return strLIZIZ;
    }
}
