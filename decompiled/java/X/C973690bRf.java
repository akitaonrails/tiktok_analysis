package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCohostContentGuideEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFunnyEffectPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSpecificGiftPlaybookIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.PreviewEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973690bRf {
    public static long LIZIZ;
    public static long LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static boolean LJI;
    public static final C973690bRf LIZ = new C973690bRf();
    public static Map<String, String> LIZJ = C2097608Jq.LJ();

    public static String LJIILLIIL() {
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.TAKE_THE_STAGE;
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        c962950bAL.getClass();
        return C962950bAL.LIZ(enumC962960bAM, size);
    }

    public final void LJIJJLI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILIIL(linkedHashMap, false);
        boolean value = LiveMatchCohostContentGuideEnabledSetting.INSTANCE.getValue();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (value) {
            linkedHashMap.put("is_oncemore_change_type", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("new_match_type", LJIILL(false));
        }
        if (C915980Zwa.LIZLLL().L6()) {
            str = "1";
        }
        linkedHashMap.put("is_enlarge_mode", str);
        LJJIJIIJIL(12, this, "livesdk_pk_oncemore_click", linkedHashMap, false);
    }

    public final void LJIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILIIL(linkedHashMap, false);
        boolean value = LiveMatchCohostContentGuideEnabledSetting.INSTANCE.getValue();
        String str = CardStruct.IStatusCode.DEFAULT;
        if (value) {
            linkedHashMap.put("is_oncemore_change_type", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("new_match_type", LJIILL(false));
        }
        if (C915980Zwa.LIZLLL().L6()) {
            str = "1";
        }
        linkedHashMap.put("is_enlarge_mode", str);
        LJJIJIIJIL(12, this, "livesdk_pk_oncemore_show", linkedHashMap, false);
    }

    public static String LJIILJJIL() {
        String value;
        if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
            EnumC973870bRx enumC973870bRxLIZJ = C973930bS3.LIZJ();
            return (enumC973870bRxLIZJ == null || (value = enumC973870bRxLIZJ.getValue()) == null) ? "" : value;
        }
        int i = C963900bBs.LIZ[C915980Zwa.LIZIZ().JV1(false).ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "victory_lap" : "" : "final_call" : "performance";
    }

    public static void LIZ(Map map) {
        Boolean boolValueOf;
        String str;
        C981550beL c981550beL;
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) map).get("anchor_type");
        if (charSequence == null || charSequence.length() == 0) {
            C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM91 != null && (c981550beL = c981480beEM91.LJJIJ) != null) {
                boolValueOf = Boolean.valueOf(c981550beL.LIZJ);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            map.put("anchor_type", str);
        }
    }

    public static void LIZJ(Map map) {
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF == null) {
            return;
        }
        for (Map.Entry<String, String> entry : interfaceC975870bVBLJFF.LJIIJJI().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() > 0 && !map.containsKey(key)) {
                map.put(key, value);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILL(boolean r5) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973690bRf.LJIILL(boolean):java.lang.String");
    }

    public static final void LJIJ(EnumC973680bRe enumC973680bRe) {
        boolean z;
        String string;
        String str = LIZJ.get("pk_id");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logTakeTheStagePKEnd return due to empty pk_id from connection_success");
            return;
        }
        if (C500260Jjc.LJJIIZ(LJ) && Intrinsics.LJFF(LJ, LIZJ.get("pk_id"))) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logTakeTheStagePKEnd return due to duplicate report");
            return;
        }
        LJ = LIZJ.get("pk_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C982390bfh c982390bfh = (C982390bfh) ((LinkedHashMap) C973920bS2.LJFF).get(Long.valueOf(C950220apo.LJ()));
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (c982390bfh == null || (string = Long.valueOf(c982390bfh.LIZIZ).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("bean_score", string);
        linkedHashMap.put("connection_time", String.valueOf((C158B.LIZ() - LIZIZ) / 1000));
        LJFF(enumC973680bRe, linkedHashMap);
        linkedHashMap.put("final_sub_match_type", "catch_bean");
        LJ(linkedHashMap, null, false);
        C150800hu.LIZ(linkedHashMap);
        LIZJ(linkedHashMap);
        if (C915980Zwa.LIZLLL().L6()) {
            str2 = "1";
        }
        linkedHashMap.put("is_enlarge_mode", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_end");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIJIIJI(EnumC973680bRe enumC973680bRe) {
        boolean z;
        String string;
        String str = LIZJ.get("pk_id");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logTakeTheStagePKEnd return due to empty pk_id from connection_success");
            return;
        }
        if (C500260Jjc.LJJIIZ(LJ) && Intrinsics.LJFF(LJ, LIZJ.get("pk_id"))) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logTakeTheStagePKEnd return due to duplicate report");
            return;
        }
        LJ = LIZJ.get("pk_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(enumC973680bRe, linkedHashMap);
        String str2 = LIZJ.get("request_from");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("request_from", str2);
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        if (size < 2) {
            size = Math.max(2, C915980Zwa.LJI().LIZ().LJLIIL());
        }
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
        c917350Zyn.getClass();
        linkedHashMap.put("final_sub_match_type", C917350Zyn.LIZIZ(enumC919170a1j, size));
        C982390bfh c982390bfh = (C982390bfh) ((LinkedHashMap) C973920bS2.LJFF).get(Long.valueOf(C950220apo.LJ()));
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (c982390bfh == null || (string = Long.valueOf(c982390bfh.LIZJ).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("individual_rank", string);
        linkedHashMap.put("take_stage_time", String.valueOf(C973920bS2.LJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        linkedHashMap.put("take_stage_cnt", String.valueOf(C973920bS2.LIZLLL));
        LJIILIIL(linkedHashMap, false);
        LJ(linkedHashMap, null, false);
        C150800hu.LIZ(linkedHashMap);
        LIZJ(linkedHashMap);
        if (C915980Zwa.LIZLLL().L6()) {
            str3 = "1";
        }
        linkedHashMap.put("is_enlarge_mode", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pk_end");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void LJJI(boolean z) {
        String string;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        if (z) {
            linkedHashMap.put("connection_type", "anchor");
        }
        if (C915980Zwa.LIZLLL().L6()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str);
        LJJIJIIJIL(12, this, "livesdk_connection_transform", linkedHashMap, false);
    }

    public final void LJJIFFI(boolean z) {
        String str;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_type", "disconnect_punish");
        if (z) {
            str = "disconnect";
        } else {
            str = "go_back";
        }
        linkedHashMap.put("selection", str);
        String str2 = "1";
        if (LJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        LJIILIIL(linkedHashMap, false);
        if (!C915980Zwa.LIZLLL().L6()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str2);
        LJJIJIIJIL(12, this, "livesdk_pk_disconnect_click", linkedHashMap, false);
    }

    public final void LJJIJ(String str) {
        Object obj;
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = "1";
        if (size > 2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi_guide", obj);
        linkedHashMap.put("guide_type", str);
        linkedHashMap.put("invitee_list", C955400ayA.LJJIZ);
        if (!C915980Zwa.LIZLLL().L6()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str2);
        LJJIJIIJIL(12, this, "livesdk_pk_guide_show", linkedHashMap, false);
    }

    public static void LIZIZ(Map map, boolean z) {
        String strValueOf;
        if (z && C915980Zwa.LJI().LJIIIZ().LJIIIZ() != 0) {
            strValueOf = String.valueOf(C915980Zwa.LJI().LJIIIZ().LJIIIZ());
        } else {
            strValueOf = String.valueOf(C915980Zwa.LJII().getChannelId());
        }
        map.put("channel_id", strValueOf);
    }

    public static final void LJFF(EnumC973680bRe enumC973680bRe, Map<String, String> map) {
        String str;
        String string;
        String str2 = LIZJ.get("connection_type");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        map.put("connection_type", str2);
        String str4 = LIZJ.get("anchor_type");
        if (str4 == null) {
            str4 = "";
        }
        map.put("anchor_type", str4);
        String str5 = LIZJ.get("channel_id");
        if (str5 == null) {
            str5 = "";
        }
        map.put("channel_id", str5);
        String str6 = LIZJ.get("pk_id");
        if (str6 == null) {
            str6 = "";
        }
        map.put("pk_id", str6);
        String str7 = LIZJ.get("pk_inviter_id");
        if (str7 == null) {
            str7 = "";
        }
        map.put("pk_inviter_id", str7);
        String str8 = LIZJ.get("pk_invitee_id");
        if (str8 == null) {
            str8 = "";
        }
        map.put("pk_invitee_id", str8);
        String str9 = LIZJ.get("pk_invitee_list");
        if (str9 == null) {
            str9 = "";
        }
        map.put("pk_invitee_list", str9);
        String str10 = LIZJ.get("request_from");
        if (str10 == null) {
            str10 = "";
        }
        map.put("request_from", str10);
        String str11 = LIZJ.get("invitee_list");
        if (str11 == null) {
            str11 = "";
        }
        map.put("invitee_list", str11);
        String str12 = LIZJ.get("current_connection_cnts");
        if (str12 == null) {
            str12 = "";
        }
        map.put("current_connection_cnts", str12);
        String str13 = LIZJ.get("uid_list");
        if (str13 == null) {
            str13 = "";
        }
        map.put("uid_list", str13);
        String str14 = LIZJ.get("is_multi");
        if (str14 == null) {
            str14 = "";
        }
        map.put("is_multi", str14);
        map.put("over_type", enumC973680bRe.getType());
        boolean z = LJI;
        String str15 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_oncemore", str);
        String str16 = LIZJ.get("sub_match_type");
        if (str16 == null) {
            str16 = "";
        }
        map.put("sub_match_type", str16);
        String str17 = LIZJ.get("connection_inviter_id");
        if (str17 == null) {
            str17 = "";
        }
        map.put("connection_inviter_id", str17);
        String str18 = LIZJ.get("connection_invitee_id");
        if (str18 == null) {
            str18 = "";
        }
        map.put("connection_invitee_id", str18);
        String str19 = LIZJ.get("sub_match_type");
        if (str19 != null) {
            str3 = str19;
        }
        map.put("sub_match_type", str3);
        map.put("connection_time", String.valueOf((C158B.LIZIZ() - LIZLLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        C982390bfh c982390bfh = (C982390bfh) ((LinkedHashMap) C973920bS2.LJFF).get(Long.valueOf(C950220apo.LJ()));
        if (c982390bfh != null && (string = Long.valueOf(c982390bfh.LIZIZ).toString()) != null) {
            str15 = string;
        }
        map.put("pk_score", str15);
        LJIIIIZZ(map, false);
    }

    public static void LJI(Map map, EnumC919170a1j enumC919170a1j) {
        String str;
        if (!enumC919170a1j.isTakeTheStage() && !enumC919170a1j.isCatchBeans()) {
            if (enumC919170a1j.isMatch()) {
                str = "match_panel";
            } else {
                str = "unknown_panel";
            }
        } else {
            str = "plaza_panel";
        }
        map.put("panel_type", str);
    }

    public static void LJIIIIZZ(Map map, boolean z) {
        boolean z2;
        Object obj;
        Object obj2;
        C973800bRq c973800bRqZ8;
        if (!LiveMatchCohostContentGuideEnabledSetting.INSTANCE.getValue()) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        CharSequence charSequence = (CharSequence) linkedHashMap.get("request_from");
        boolean z3 = false;
        if (charSequence != null && charSequence.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            obj = "rematch";
        } else {
            obj = linkedHashMap.get("request_from");
        }
        CharSequence charSequence2 = (CharSequence) linkedHashMap.get("is_oncemore");
        if (charSequence2 == null || charSequence2.length() == 0) {
            z3 = true;
        }
        if (z3) {
            obj2 = "1";
        } else {
            obj2 = linkedHashMap.get("is_oncemore");
        }
        if (Intrinsics.LJFF(obj, "rematch") && Intrinsics.LJFF(obj2, "1") && (c973800bRqZ8 = C915980Zwa.LIZIZ().z8()) != null) {
            if (z) {
                map.put("oncemore_from", c973800bRqZ8.LIZ);
            }
            map.put("is_oncemore_change_type", c973800bRqZ8.LIZIZ);
            map.put("oncemore_old_match_type", c973800bRqZ8.LIZJ);
        }
    }

    public static void LJIIIZ(Map map, boolean z) {
        String strLJJIJIIJI = C915980Zwa.LJI().LJIIJ().LJJIJIIJI();
        EnumC973640bRa enumC973640bRaLJ = C925640aCA.LJ(strLJJIJIIJI);
        if (enumC973640bRaLJ != EnumC973640bRa.OTHER_VALUE) {
            strLJJIJIIJI = enumC973640bRaLJ.getValue();
        }
        if (Intrinsics.LJFF(strLJJIJIIJI, EnumC973640bRa.PK_ICON.getValue())) {
            strLJJIJIIJI = "plaza_icon";
        } else if (Intrinsics.LJFF(strLJJIJIIJI, EnumC973640bRa.TAKE_STAGE_GUIDE.getValue()) || Intrinsics.LJFF(strLJJIJIIJI, EnumC973640bRa.TAKE_STAGE_GUIDE_V2.getValue()) || Intrinsics.LJFF(strLJJIJIIJI, EnumC973640bRa.CATCH_BEANS_GUIDE.getValue())) {
            strLJJIJIIJI = "popup_guide";
        }
        map.put("request_from", strLJJIJIIJI);
        LJIIIIZZ(map, z);
    }

    public static void LJIIJ(String str, Map map) {
        String str2;
        if (Intrinsics.LJFF(EnumC975850bV9.INVITEE_REJECT_BUTTON_CLICK.getSource(), str)) {
            str2 = "reject";
        } else if (Intrinsics.LJFF(EnumC975850bV9.INVITEE_TIMEOUT.getSource(), str)) {
            str2 = "invitee_time_out";
        } else if (Intrinsics.LJFF(EnumC975850bV9.CANCEL_AFTER_INVITE.getSource(), str)) {
            str2 = "withdraw";
        } else if (Intrinsics.LJFF(EnumC975850bV9.INVITER_TIMEOUT.getSource(), str)) {
            str2 = "inviter_time_out";
        } else {
            str2 = "invite";
        }
        map.put("show_reason", str2);
    }

    public static void LJIIJJI(String str, Map map) {
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) map).get("sub_match_type");
        if (charSequence == null || charSequence.length() == 0) {
            if (str.length() == 0) {
                map.put("sub_match_type", LJIILL(false));
            } else {
                map.put("sub_match_type", str);
            }
        }
    }

    public static void LJIIL(String str, Map map) {
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) map).get("sub_match_type");
        if (charSequence == null || charSequence.length() == 0) {
            if (str.length() == 0) {
                map.put("sub_match_type", LJIILL(true));
            } else {
                map.put("sub_match_type", str);
            }
        }
    }

    public static void LJIILIIL(Map map, boolean z) {
        if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
            C973930bS3.LIZIZ(map, z);
        }
    }

    public static final void LJIJJ(EnumC973680bRe enumC973680bRe, boolean z) {
        boolean z2;
        Object obj;
        String str = LIZJ.get("pk_id");
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logCompetitionPunishEnd return due to empty pk_id from connection_success");
            return;
        }
        if (C500260Jjc.LJJIIZ(LJFF) && Intrinsics.LJFF(LJFF, LIZJ.get("pk_id"))) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logCompetitionPunishEnd return due to duplicate report");
            return;
        }
        if (C973920bS2.LJI <= 0) {
            C20441214yg.LIZIZ("CompetitionTrackingUtil", "logCompetitionPunishEnd return due to not start punish");
            return;
        }
        LJFF = LIZJ.get("pk_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = LIZJ.get("connection_type");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("connection_type", str2);
        linkedHashMap.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        String str4 = LIZJ.get("anchor_type");
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("anchor_type", str4);
        String str5 = LIZJ.get("channel_id");
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("channel_id", str5);
        String str6 = LIZJ.get("pk_id");
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("pk_id", str6);
        String str7 = LIZJ.get("pk_inviter_id");
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("pk_inviter_id", str7);
        String str8 = LIZJ.get("pk_invitee_id");
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("pk_invitee_id", str8);
        String str9 = LIZJ.get("pk_invitee_list");
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMap.put("pk_invitee_list", str9);
        String str10 = LIZJ.get("connection_inviter_id");
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("connection_inviter_id", str10);
        String str11 = LIZJ.get("connection_invitee_id");
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("connection_invitee_id", str11);
        String str12 = LIZJ.get("request_from");
        if (str12 == null) {
            str12 = "";
        }
        linkedHashMap.put("request_from", str12);
        String str13 = LIZJ.get("invitee_list");
        if (str13 == null) {
            str13 = "";
        }
        linkedHashMap.put("invitee_list", str13);
        String str14 = LIZJ.get("current_connection_cnts");
        if (str14 == null) {
            str14 = "";
        }
        linkedHashMap.put("current_connection_cnts", str14);
        String str15 = LIZJ.get("uid_list");
        if (str15 == null) {
            str15 = "";
        }
        linkedHashMap.put("uid_list", str15);
        String str16 = LIZJ.get("is_multi");
        if (str16 == null) {
            str16 = "";
        }
        linkedHashMap.put("is_multi", str16);
        linkedHashMap.put("over_type", enumC973680bRe.getType());
        String str17 = "1";
        if (LJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        String str18 = LIZJ.get("sub_match_type");
        if (str18 != null) {
            str3 = str18;
        }
        linkedHashMap.put("sub_match_type", str3);
        linkedHashMap.put("connection_time", String.valueOf((C158B.LIZIZ() - C973920bS2.LJI) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        LJIILIIL(linkedHashMap, z);
        LJ(linkedHashMap, null, false);
        LJIIIIZZ(linkedHashMap, false);
        if (!C915980Zwa.LIZLLL().L6()) {
            str17 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str17);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_punish_end");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public final void LJIIZILJ(int i, boolean z) {
        String str;
        String str2;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i == 0) {
            str = "disconnect_game";
        } else {
            str = "disconnect_victory";
        }
        linkedHashMap.put("request_type", str);
        if (z) {
            str2 = "disconnect";
        } else {
            str2 = "go_back";
        }
        linkedHashMap.put("selection", str2);
        String str3 = "1";
        if (LJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        if (!C915980Zwa.LIZLLL().L6()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str3);
        LJJIJIIJIL(12, this, "livesdk_pk_disconnect_click", linkedHashMap, false);
    }

    public final void LJIJI(long j, Room room) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973750bRl c973750bRl = C973760bRm.LIZ;
        long jLIZ = c973750bRl.LIZ();
        C973750bRl c973750bRl2 = C973760bRm.LIZIZ;
        long jLIZ2 = c973750bRl2.LIZ();
        C973750bRl c973750bRl3 = C973760bRm.LIZJ;
        long jLIZ3 = c973750bRl3.LIZ();
        C973750bRl c973750bRl4 = C973760bRm.LIZLLL;
        long jLIZ4 = c973750bRl4.LIZ();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        linkedHashMap.put("watch_connection_duration", String.valueOf(jLIZ / j2));
        linkedHashMap.put("takestage_performance_watch_duration", String.valueOf(jLIZ2 / j2));
        linkedHashMap.put("takestage_finalcall_watch_duration", String.valueOf(jLIZ3 / j2));
        linkedHashMap.put("takestage_victorylap_watch_duration", String.valueOf(jLIZ4 / j2));
        linkedHashMap.put("pk_id", String.valueOf(j));
        linkedHashMap.put("sub_match_type", LJIILL(false));
        String str = LIZJ.get("is_multi");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("is_multi", str);
        C955400ayA.LJJIIJZLJL(linkedHashMap, room, "competition_watch_duration");
        c973750bRl.LIZ = 0L;
        c973750bRl.LIZIZ = 0L;
        c973750bRl2.LIZ = 0L;
        c973750bRl2.LIZIZ = 0L;
        c973750bRl3.LIZ = 0L;
        c973750bRl3.LIZIZ = 0L;
        c973750bRl4.LIZ = 0L;
        c973750bRl4.LIZIZ = 0L;
        LJJIJIIJIL(4, this, "livesdk_connection_watch_duration", linkedHashMap, true);
    }

    public static void LJ(Map map, ActivePlaybook activePlaybook, boolean z) {
        Long lValueOf;
        Object obj;
        String string;
        PreviewEffect previewEffectLJI;
        Map<String, List<Map<String, Object>>> mapLJIILLIIL;
        List list;
        Number numberValueOf;
        List list2;
        String str;
        Playbook playbook;
        if (!C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZLLL().qp0()))) {
            return;
        }
        if (activePlaybook == null) {
            activePlaybook = C915980Zwa.LJI().LIZ().LIZIZ();
        }
        Long lValueOf2 = null;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_playbook_panel_shown", obj);
        if (activePlaybook == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_in_playbook", str2);
        String str3 = "";
        if (lValueOf == null || (string = lValueOf.toString()) == null) {
            string = "";
        }
        map.put("playbook_id", string);
        if (activePlaybook != null) {
            lValueOf2 = Long.valueOf(activePlaybook.playId);
        }
        map.put("play_id", String.valueOf(lValueOf2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long value = LiveMatchSpecificGiftPlaybookIdSetting.INSTANCE.getValue();
        if (lValueOf != null && lValueOf.longValue() == value && activePlaybook != null && (mapLJIILLIIL = PlaybookUtilKt.LJIILLIIL(activePlaybook)) != null && (list = (List) ((LinkedHashMap) mapLJIILLIIL).get("designated_gift")) != null) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Map map2 = (Map) it2.next();
                DesignatedGiftConfig designatedGiftConfig = new DesignatedGiftConfig(0L, "", C1697810uHb.LJIIJJI("https://p16-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png", "https://p19-webcast.tiktokcdn.com/img/alisg/webcast-sg/gift_only_all_gifts~tplv-obj.png"));
                Object obj2 = map2.get("gift_id");
                if (!(obj2 instanceof Double) || (numberValueOf = (Number) obj2) == null) {
                    numberValueOf = Long.valueOf(designatedGiftConfig.giftId);
                }
                Object obj3 = map2.get("gift_name");
                if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                    str3 = str;
                }
                Object obj4 = map2.get("gift_image_urls");
                if (!(obj4 instanceof List) || (list2 = (List) obj4) == null) {
                    list2 = C13BV.INSTANCE;
                }
                linkedHashMap.put("gift_id", String.valueOf(new DesignatedGiftConfig(numberValueOf.longValue(), str3, list2).giftId));
            }
        }
        long value2 = LiveMatchFunnyEffectPlaybookIdSetting.INSTANCE.getValue();
        if (lValueOf != null && lValueOf.longValue() == value2 && activePlaybook != null && (previewEffectLJI = C978440bZK.LJI(activePlaybook)) != null) {
            linkedHashMap.put("effect_id", previewEffectLJI.resourceId);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("game_feature_value", linkedHashMap.toString());
        }
    }

    public static void LJJIIZ(EnumC919170a1j enumC919170a1j, String str, boolean z) {
        String str2;
        C973690bRf c973690bRf = LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_1VN) {
            linkedHashMap.put("default_pk_mode", "team_match");
            linkedHashMap.put("sub_match_type", "team_match");
        } else {
            EnumC919170a1j.Companion.getClass();
            linkedHashMap.put("default_pk_mode", C917350Zyn.LIZJ(enumC919170a1j));
        }
        linkedHashMap.put("default_gift_mode", "all_gifts");
        C973660bRc.LJIJ(C973660bRc.LIZ, linkedHashMap, false, false, false, 12);
        C973660bRc.LJIIIIZZ(linkedHashMap);
        LJI(linkedHashMap, enumC919170a1j);
        LJIIJ(str, linkedHashMap);
        LJIIIZ(linkedHashMap, true);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_clickable", str2);
        LJ(linkedHashMap, null, false);
        if (C915980Zwa.LJII().LLILZLL(true).size() > 2 || Intrinsics.LJFF(linkedHashMap.get("default_pk_mode"), "take_stage") || Intrinsics.LJFF(linkedHashMap.get("default_pk_mode"), "catch_bean")) {
            LJJIJIIJIL(12, c973690bRf, "livesdk_pk_invite_popup_show", linkedHashMap, false);
        }
    }

    public final void LJJ(String str, boolean z, boolean z2) {
        String string;
        Boolean boolValueOf;
        long j;
        long j2;
        Object obj;
        C981550beL c981550beL;
        LJI = z2;
        LIZIZ = C158B.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM912 != null && (c981550beL = c981480beEM912.LJJIJ) != null) {
            boolValueOf = Boolean.valueOf(c981550beL.LIZJ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJIIIZ(linkedHashMap, true);
            linkedHashMap.put("pk_inviter_id", String.valueOf(C950220apo.LJ()));
            linkedHashMap.put("pk_invitee_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList = new ArrayList();
            for (C954460awe c954460awe : listLLILZLL) {
                if (c954460awe.LJ != C950220apo.LJ()) {
                    arrayList.add(c954460awe);
                }
            }
            linkedHashMap.put("pk_invitee_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(157), 30));
        } else {
            C981480beE c981480beEM913 = C915980Zwa.LIZIZ().M91(false);
            if (c981480beEM913 != null) {
                j = c981480beEM913.LJIIJJI;
            } else {
                j = 0;
            }
            linkedHashMap.put("pk_inviter_id", String.valueOf(j));
            linkedHashMap.put("pk_invitee_id", String.valueOf(C950220apo.LJ()));
            List<C954460awe> listLLILZLL2 = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList2 = new ArrayList();
            for (C954460awe c954460awe2 : listLLILZLL2) {
                long j3 = c954460awe2.LJ;
                C981480beE c981480beEM914 = C915980Zwa.LIZIZ().M91(false);
                if (c981480beEM914 != null) {
                    j2 = c981480beEM914.LJIIJJI;
                } else {
                    j2 = 0;
                }
                if (j3 != j2) {
                    arrayList2.add(c954460awe2);
                }
            }
            linkedHashMap.put("pk_invitee_list", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(158), 30));
        }
        String str2 = "1";
        if (LJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        LIZ(linkedHashMap);
        LJIILIIL(linkedHashMap, false);
        LJ(linkedHashMap, null, false);
        LJIIIIZZ(linkedHashMap, true);
        if (z) {
            if (!C915980Zwa.LIZLLL().L6()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enlarge_mode", str2);
            LJJIJIIJIL(12, this, str, linkedHashMap, false);
            LIZJ = linkedHashMap;
        }
        LIZLLL = C158B.LIZIZ();
    }

    public static void LJII(C973690bRf c973690bRf, String str, String str2, Map map) {
        c973690bRf.getClass();
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) map).get(str);
        if (charSequence == null || charSequence.length() == 0) {
            map.put(str, str2);
        }
    }

    public final void LJJII(long j, String str, String str2, boolean z) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        linkedHashMap.put("pk_inviter_id", String.valueOf(C950220apo.LJ()));
        linkedHashMap.put("pk_invitee_id", String.valueOf(j));
        LJIIL(str, linkedHashMap);
        linkedHashMap.put("connection_type", str2);
        LJIIIZ(linkedHashMap, true);
        LJIILIIL(linkedHashMap, true ^ z);
        LJ(linkedHashMap, null, false);
        LIZJ(linkedHashMap);
        C955520ayM.LIZLLL(linkedHashMap);
        C150800hu.LIZ(linkedHashMap);
        if (!C915980Zwa.LIZLLL().L6()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str3);
        LJJIJIIJIL(12, this, "livesdk_connection_invite", linkedHashMap, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(X.EnumC919170a1j r15, java.lang.String r16, webcast.data.multi_guest_play.ActivePlaybook r17, boolean r18) {
        /*
            r14 = this;
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_1VN
            java.lang.String r2 = "selected_pk_mode"
            if (r15 != r0) goto L97
            java.lang.String r1 = "team_match"
            r9.put(r2, r1)
            java.lang.String r0 = "sub_match_type"
            r9.put(r0, r1)
        L15:
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bV5 r8 = r0.LIZLLL()
            r10 = 0
            r5 = 1
            if (r8 == 0) goto L94
            java.util.List r0 = r8.LIZLLL()
            if (r0 == 0) goto L94
            java.util.Iterator r7 = r0.iterator()
        L2b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r6 = r7.next()
            r0 = r6
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r0
            long r0 = r0.giftId
            long r3 = r8.LJIIIZ()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L2b
        L42:
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r6 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r6
            if (r6 == 0) goto L94
            java.lang.String r1 = r6.giftName
            if (r1 == 0) goto L94
        L4a:
            java.lang.String r0 = "selected_gift_mode"
            r9.put(r0, r1)
            X.0bRc r8 = X.C973660bRc.LIZ
            r13 = 12
            r11 = r10
            r12 = r10
            X.C973660bRc.LJIJ(r8, r9, r10, r11, r12, r13)
            X.C973660bRc.LJIIIIZZ(r9)
            LJIIIZ(r9, r5)
            LJI(r9, r15)
            r0 = r16
            LJIIJ(r0, r9)
            if (r18 == 0) goto L8f
            java.lang.String r1 = "1"
        L6a:
            java.lang.String r0 = "is_default_mode"
            r9.put(r0, r1)
            X.0a1j r0 = X.EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE
            if (r15 != r0) goto L84
            X.14i1<java.lang.Long> r0 = X.InterfaceC1106030et7.o9
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "time_setting"
            r9.put(r0, r1)
        L84:
            r0 = r17
            LJ(r9, r0, r10)
            java.lang.String r0 = "livesdk_pk_mode_selected"
            LJJIJIIJIL(r13, r14, r0, r9, r10)
            return
        L8f:
            java.lang.String r1 = "0"
            goto L6a
        L92:
            r6 = 0
            goto L42
        L94:
            java.lang.String r1 = "all_gifts"
            goto L4a
        L97:
            X.0Zyn r0 = X.EnumC919170a1j.Companion
            r0.getClass()
            java.lang.String r0 = X.C917350Zyn.LIZJ(r15)
            r9.put(r2, r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973690bRf.LJJIIZI(X.0a1j, java.lang.String, webcast.data.multi_guest_play.ActivePlaybook, boolean):void");
    }

    public static void LIZLLL(C973690bRf c973690bRf, Map map, boolean z, boolean z2, int i) {
        String str;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c973690bRf.getClass();
        LIZIZ(map, z2);
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if (arrayList.size() > 2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII(c973690bRf, "is_multi", str, map);
        LJII(c973690bRf, "current_connection_cnts", String.valueOf(arrayList.size()), map);
        if (!arrayList.isEmpty()) {
            if (z) {
                map.put("popup_uid_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            } else {
                map.put("uid_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            }
        }
        arrayList.size();
        arrayList.size();
        CharSequence charSequence = (CharSequence) ((LinkedHashMap) map).get("anchor_type");
        if (charSequence == null || charSequence.length() == 0) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LIZIZ(map);
        }
        map.put("old_channel_id", String.valueOf(C915980Zwa.LJII().js()));
        map.put("is_two_apply_two", String.valueOf(C915980Zwa.LJII().T9() ? 1 : 0));
        C955410ayB.LIZLLL(map, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        C955400ayA c955400ayA2 = C955400ayA.LIZ;
        C955400ayA.LJJIIZI(C915980Zwa.LJI().LIZ().LJIILLIIL(), map);
        map.put("connection_inviter_id", String.valueOf(C915980Zwa.LJI().LIZ().LJJIJL()));
        map.put("connection_invitee_id", String.valueOf(C915980Zwa.LJI().LIZ().LLJLLIL()));
        String str2 = C955400ayA.LJJJ;
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            map.put("request_id", str2);
        }
        if (!TextUtils.isEmpty(C915980Zwa.LJI().LIZ().LLJJJJLIIL())) {
            map.put("last_request_id", String.valueOf(C915980Zwa.LJI().LIZ().LLJJJJLIIL()));
        } else {
            if (TextUtils.isEmpty(C915980Zwa.LJI().LIZ().LJZ())) {
                return;
            }
            map.put("last_request_id", C915980Zwa.LJI().LIZ().LJZ());
        }
    }

    public static void LJJIJIIJIL(int i, C973690bRf c973690bRf, String str, Map map, boolean z) {
        String str2;
        String str3;
        String str4 = "";
        if ((i & 4) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c973690bRf.getClass();
        LJIIJJI(str2, map);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str5 = (String) linkedHashMap.get("connection_type");
        if (str5 == null || str5.length() == 0) {
            if (C915980Zwa.LIZIZ().Dn0().isTakeTheStage()) {
                str4 = "take_stage";
            } else if (C915980Zwa.LIZ().kg2()) {
                str4 = "catch_bean";
            } else if (C915980Zwa.LJFF().xB0().isMatch()) {
                str4 = "manual_pk";
            }
            map.put("connection_type", str4);
        }
        String str6 = (String) linkedHashMap.get("core_connection_type");
        if (str6 == null || str6.length() == 0) {
            map.put("core_connection_type", C915980Zwa.LIZLLL().oE2());
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            w.LIZ.getClass();
            map.put("enter_method", w.LJIIL());
            map.put("enter_from_merge", w.LJIIIZ());
            map.put("action_type", w.LIZLLL());
            if (room.liveSubOnly == 1) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_subscriber_only_live", str3);
        }
        LIZLLL(c973690bRf, map, false, z, 2);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJIILJJIL(str, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        if (Intrinsics.LJFF("livesdk_connection_watch_duration", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(str)) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
            return;
        }
        c474500IjALIZ.LIZ();
    }

    public final void LJJIIJ(long j, long j2, boolean z, String str, String str2) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pk_id", String.valueOf(j));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j2));
        linkedHashMap.put("pk_invitee_id", String.valueOf(C950220apo.LJ()));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        LJIIL(str, linkedHashMap);
        LJIIIIZZ(linkedHashMap, false);
        linkedHashMap.put("connection_type", str2);
        LIZLLL(this, linkedHashMap, true, false, 4);
        LJ(linkedHashMap, null, false);
        C955520ayM.LIZLLL(linkedHashMap);
        if (!C915980Zwa.LIZLLL().L6()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str3);
        LJJIJIIJIL(12, this, "livesdk_connected_popup_show", linkedHashMap, false);
    }

    public final void LJJIII(String str, String str2, long j, long j2, long j3, boolean z) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pk_id", String.valueOf(j));
        linkedHashMap.put("pk_invitee_id", String.valueOf(j3));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j2));
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        LJIIL(str, linkedHashMap);
        linkedHashMap.put("connection_type", str2);
        LJIIIZ(linkedHashMap, true);
        LJIILIIL(linkedHashMap, true ^ z);
        C955520ayM.LIZLLL(linkedHashMap);
        LIZJ(linkedHashMap);
        C150800hu.LIZ(linkedHashMap);
        if (!C915980Zwa.LIZLLL().L6()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str3);
        LJJIJIIJIL(12, this, "livesdk_connection_invite_send_success", linkedHashMap, false);
    }

    public final void LJJIIJZLJL(long j, long j2, String str, String str2, boolean z, boolean z2) {
        String str3;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pk_id", String.valueOf(j));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j2));
        linkedHashMap.put("pk_invitee_id", String.valueOf(C950220apo.LJ()));
        if (z) {
            str3 = "accept";
        } else {
            str3 = "reject";
        }
        linkedHashMap.put("selection", str3);
        String str4 = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        linkedHashMap.put("connection_type", str2);
        LJIIIIZZ(linkedHashMap, false);
        LJIIL(str, linkedHashMap);
        LIZLLL(this, linkedHashMap, true, false, 4);
        LJ(linkedHashMap, null, false);
        C955520ayM.LIZLLL(linkedHashMap);
        if (!C915980Zwa.LIZLLL().L6()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_enlarge_mode", str4);
        LJJIJIIJIL(12, this, "livesdk_connection_invited", linkedHashMap, false);
    }
}
