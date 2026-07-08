package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065000dow {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2112820503) {
                if (iHashCode != -720542318) {
                    if (iHashCode == 1475140466 && str.equals("lemon8_general_pick")) {
                        return "Lemon8 | lemon8_general_pick";
                    }
                    return null;
                }
                if (str.equals("lemon8_general_create_post")) {
                    return "Lemon8 | create";
                }
                return null;
            }
            if (str.equals("lemon8_general_sdk_share")) {
                return "Lemon8 | lemon8_general_sdk_share";
            }
            return null;
        }
        return null;
    }

    public static void LIZ(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null) {
            return;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(new JSONObject(anchorCommonStruct.getExtra()), "lemon8_ab_setting");
            if (C123100dR.LIZ(string)) {
                c2344009Gk.LJFF("lemon8_ab_setting", string);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
