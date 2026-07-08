package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0v52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728460v52 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(RootData rootData, String str, String str2, String str3, String str4) {
        C1729570v6p.LJ(rootData.roomId, rootData.authorId, rootData.isNewUser, rootData.LIZ(), str, str2, str3, str4, null, null);
    }

    public static void LIZ(RootData rootData, String str, String str2, String str3, String str4, String str5, boolean z, Long l, Integer num, String str6) {
        String str7;
        C1729570v6p.LJ(rootData.roomId, rootData.authorId, rootData.isNewUser, rootData.LIZ(), str, str2, str3, str4, num, str6);
        String str8 = rootData.roomId;
        String str9 = rootData.authorId;
        boolean z2 = rootData.isNewUser;
        String strLIZ = rootData.LIZ();
        if (z) {
            str7 = "success";
        } else {
            str7 = "fail";
        }
        Map mapLIZ = C1729250v6J.LIZ(str8, str9, strLIZ, z2, str, null);
        mapLIZ.put("resource_id", str2);
        mapLIZ.put(Scene.SCENE_SERVICE, str3);
        if (l != null) {
            l.longValue();
            mapLIZ.put("duration", l);
        }
        mapLIZ.put("duration_type", str5);
        mapLIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str7);
        C1421105hJ.LIZJ("rd_ttec_billboard_effect_duration_event", mapLIZ);
    }
}
