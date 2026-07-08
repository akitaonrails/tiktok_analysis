package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0yzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878610yzD {
    public static String LIZ(String str) {
        int iIntValue;
        String str2;
        Integer numLJIIJJI;
        C0KYM c0kymLIZ = C513270KAz.LIZ(str);
        String strLIZIZ = c0kymLIZ.LIZIZ(Scene.SCENE_SERVICE);
        if (strLIZIZ != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ)) != null) {
            iIntValue = numLJIIJJI.intValue();
            if (iIntValue == 0) {
                str2 = "live";
            }
            String strLIZIZ2 = c0kymLIZ.LIZIZ("game_id");
            if (iIntValue == 0 ? (strLIZIZ = c0kymLIZ.LIZIZ("item_id")) == null : (strLIZIZ = c0kymLIZ.LIZIZ("room_id")) == null) {
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(strLIZIZ);
            sbLIZ.append('_');
            sbLIZ.append(strLIZIZ2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        iIntValue = -1;
        str2 = "video";
        String strLIZIZ22 = c0kymLIZ.LIZIZ("game_id");
        String strLIZIZ3 = iIntValue == 0 ? "" : "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str2);
        sbLIZ2.append('_');
        sbLIZ2.append(strLIZIZ3);
        sbLIZ2.append('_');
        sbLIZ2.append(strLIZIZ22);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
