package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544640LXq {
    public static final C544640LXq LIZ = new C544640LXq();

    public final void LIZJ(AIGCOfflineModel aIGCOfflineModel, String str) {
        String str2;
        String str3;
        Map mapLIZJ;
        if (aIGCOfflineModel != null) {
            str2 = aIGCOfflineModel.subAiPropType;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "v2v")) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        if (str != null) {
            mapLIZJ = C2097608Jq.LJIIIIZZ(new Pair("upload_image_cnt", str3), new Pair("shoot_tab_name", str));
        } else {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("upload_image_cnt", str3));
        }
        getClass();
        LIZ("ai_effect_interaction", aIGCOfflineModel, "video_shoot_page", mapLIZJ);
    }

    public final void LIZLLL(AIGCOfflineModel aIGCOfflineModel, String str) {
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("popup_type", str));
        getClass();
        LIZ("ai_generation_popup_show", aIGCOfflineModel, "video_shoot_page", mapLIZJ);
    }

    public static void LIZ(String str, AIGCOfflineModel aIGCOfflineModel, String str2, Map map) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Pair[] pairArr = new Pair[18];
        Integer numValueOf = null;
        if (aIGCOfflineModel != null) {
            str3 = aIGCOfflineModel.propId;
        } else {
            str3 = null;
        }
        pairArr[0] = new Pair("prop_id", str3);
        if (aIGCOfflineModel != null) {
            str4 = aIGCOfflineModel.creationId;
        } else {
            str4 = null;
        }
        pairArr[1] = new Pair("creation_id", str4);
        if (aIGCOfflineModel != null) {
            str5 = aIGCOfflineModel.resourceId;
        } else {
            str5 = null;
        }
        pairArr[2] = new Pair("resource_id", str5);
        pairArr[3] = new Pair("enter_from", str2);
        if (aIGCOfflineModel != null) {
            str6 = aIGCOfflineModel.enterMethod;
        } else {
            str6 = null;
        }
        String str19 = "";
        if (str6 == null) {
            str6 = "";
        }
        pairArr[4] = new Pair("enter_method", str6);
        if (aIGCOfflineModel != null) {
            str7 = aIGCOfflineModel.effectSource;
        } else {
            str7 = null;
        }
        pairArr[5] = new Pair("effect_source", str7);
        if (aIGCOfflineModel != null) {
            str8 = aIGCOfflineModel.isAiProp;
        } else {
            str8 = null;
        }
        pairArr[6] = new Pair("is_ai_prop", str8);
        if (aIGCOfflineModel != null) {
            str9 = aIGCOfflineModel.aiPropType;
        } else {
            str9 = null;
        }
        pairArr[7] = new Pair("ai_prop_type", str9);
        if (aIGCOfflineModel != null) {
            str10 = aIGCOfflineModel.isAsync;
        } else {
            str10 = null;
        }
        pairArr[8] = new Pair("is_async", str10);
        if (aIGCOfflineModel != null) {
            str11 = aIGCOfflineModel.subAiPropType;
        } else {
            str11 = null;
        }
        pairArr[9] = new Pair("sub_ai_prop_type", str11);
        if (aIGCOfflineModel != null) {
            str12 = aIGCOfflineModel.aiPropModelName;
        } else {
            str12 = null;
        }
        pairArr[10] = new Pair("ai_prop_model_name", str12);
        if (aIGCOfflineModel == null || (str13 = aIGCOfflineModel.tabKey) == null) {
            str13 = "";
        }
        pairArr[11] = new Pair("tab_key", str13);
        if (aIGCOfflineModel == null || (str14 = aIGCOfflineModel.shootTabName) == null) {
            str14 = "";
        }
        pairArr[12] = new Pair("shoot_tab_name", str14);
        if (aIGCOfflineModel == null || (str15 = aIGCOfflineModel.propSelectedFrom) == null) {
            str15 = "";
        }
        pairArr[13] = new Pair("prop_selected_from", str15);
        if (aIGCOfflineModel == null || (str16 = aIGCOfflineModel.shootWay) == null) {
            str16 = "";
        }
        pairArr[14] = new Pair("shoot_way", str16);
        if (aIGCOfflineModel == null || (str17 = aIGCOfflineModel.isDefaultProp) == null) {
            str17 = "";
        }
        pairArr[15] = new Pair("is_default_prop", str17);
        if (aIGCOfflineModel != null && (str18 = aIGCOfflineModel.aigcInteractionType) != null) {
            str19 = str18;
        }
        pairArr[16] = new Pair("prop_trigger_type", str19);
        if (aIGCOfflineModel != null) {
            numValueOf = Integer.valueOf(aIGCOfflineModel.isOfflineLoading);
        }
        pairArr[17] = new Pair("is_offline_loading", String.valueOf(numValueOf));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(map);
        String str20 = C0LC1.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event: ");
        sbLIZ.append(str);
        sbLIZ.append(" eventParams: ");
        sbLIZ.append(mapLJIIJ);
        C0LC0.LIZ(str20, C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL(str, mapLJIIJ);
    }
}
