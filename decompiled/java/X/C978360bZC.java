package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSlowFunctionOptABSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.0bZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978360bZC {
    public static long LIZ;
    public static long LIZIZ;
    public static long LJIIIIZZ;
    public static boolean LJIILJJIL;
    public static BasePlaybookViewModel LJIILL;
    public static C915190ZvJ LIZJ = new C915190ZvJ("", false, 6);
    public static String LIZLLL = "";
    public static C915190ZvJ LJ = new C915190ZvJ("", false, 6);
    public static String LJFF = "";
    public static final C098J<Long, String> LJI = new C098J<>(3);
    public static volatile String LJII = "";
    public static String LJIIIZ = "";
    public static String LJIIJ = "";
    public static String LJIIJJI = "";
    public static String LJIIL = "";
    public static String LJIILIIL = "fun_kit";
    public static final Map<Long, C978410bZH> LJIILLIIL = new LinkedHashMap();

    public static String LIZLLL() {
        C915190ZvJ c915190ZvJ = LJ;
        if (c915190ZvJ.LIZIZ) {
            return c915190ZvJ.LIZ;
        }
        C915190ZvJ c915190ZvJ2 = LIZJ;
        return c915190ZvJ2.LIZIZ ? c915190ZvJ2.LIZ : "";
    }

    public static String LJ() {
        C915190ZvJ c915190ZvJ = LIZJ;
        return c915190ZvJ.LIZIZ ? c915190ZvJ.LIZ : "";
    }

    public static C915190ZvJ LJFF() {
        return LJ.LIZ.length() > 0 ? LJ : LIZJ;
    }

    public static String LJI() {
        return String.valueOf(C500260Jjc.LJJIL() ? C933980aPc.LIZIZ() : C950220apo.LJ());
    }

    public static void LIZ(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
        }
    }

    public static void LIZJ(Map map) {
        if (LJIIL.length() > 0) {
            map.put("panel_page", LJIIL);
        }
        if (LJIIJJI.length() > 0) {
            map.put("panel_entrance", LJIIJJI);
        }
    }

    public static void LJII(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", String.valueOf(C933980aPc.LIZIZ()));
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("from_page", LJFF);
        LJJIIZI("livesdk_multi_funkit_feedback_entrance", linkedHashMap);
    }

    public static void LJIIJJI(List list) {
        String idStr;
        int size;
        boolean z;
        String str;
        List<LinkUser> listLIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String strLIZJ = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        List<String> listZP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ZP2();
        if (listZP2 != null) {
            linkedHashMap.put("guest_cnt", String.valueOf(listZP2.size()));
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        int i = size - 1;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", str);
        linkedHashMap.put("from_page", LIZLLL);
        linkedHashMap.put("guest_cnt", String.valueOf(i));
        if (!C500260Jjc.LJJIL()) {
            strLIZJ = C917520Zz4.LIZJ();
        }
        linkedHashMap.put("layout_id", strLIZJ);
        linkedHashMap.put("is_multi_guest_moderator", CardStruct.IStatusCode.DEFAULT);
        if (!((ArrayList) list).isEmpty()) {
            linkedHashMap.put("tool_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(6), 30));
        }
        LJJIIZI("livesdk_multi_anchor_funkit_panel_show", linkedHashMap);
    }

    public static void LJJIIJ(String str) {
        long jLongValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("anchor_id", String.valueOf(C950220apo.LJ()));
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            jLongValue = lLJIIJ.longValue();
        } else {
            jLongValue = 0;
        }
        linkedHashMap.put("room_id", String.valueOf(jLongValue));
        linkedHashMap.put("action_type", str);
        LJJIIZI("livesdk_multiguest_request_panel_fun_kit_entrance", linkedHashMap);
        LJIIIZ(str, "anchor_connection_panel");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJ(X.C915190ZvJ r2) {
        /*
            X.C978360bZC.LIZJ = r2
            java.lang.String r1 = r2.LIZ
            int r0 = r1.hashCode()
            switch(r0) {
                case 208756496: goto L31;
                case 1742796884: goto L26;
                case 1745098676: goto L1b;
                case 1888434640: goto L10;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = r2.LIZ
        Ld:
            X.C978360bZC.LIZLLL = r0
            return
        L10:
            java.lang.String r0 = "play_entrance_button"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "room_funkit_icon"
            goto Ld
        L1b:
            java.lang.String r0 = "live_take_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "live_setting"
            goto Ld
        L26:
            java.lang.String r0 = "request_panel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "anchor_connection_panel"
            goto Ld
        L31:
            java.lang.String r0 = "room_banner"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "activity"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978360bZC.LJJIJ(X.0ZvJ):void");
    }

    public static void LIZIZ(Long l, Map map) {
        long jLongValue;
        Object obj;
        Long lValueOf;
        String str;
        LiveMode streamType;
        C978410bZH c978410bZH;
        MutableLiveData<ActivePlaybook> mutableLiveData;
        ActivePlaybook value;
        Playbook playbook;
        map.put("anchor_id", LJI());
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            jLongValue = lLJIIJ.longValue();
        } else {
            jLongValue = 0;
        }
        map.put("room_id", String.valueOf(jLongValue));
        String str2 = "1";
        if (!C500260Jjc.LJJIL() && C930540aK4.LIZJ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_in_live", obj);
        BasePlaybookViewModel basePlaybookViewModel = LJIILL;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.playbook) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        if (lValueOf == null || (l != null && !Intrinsics.LJFF(lValueOf, l))) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_in_playbook", str2);
        if (l != null && (c978410bZH = (C978410bZH) ((LinkedHashMap) LJIILLIIL).get(l)) != null) {
            if (c978410bZH.LIZ.length() > 0) {
                map.put("module", c978410bZH.LIZ);
            }
            if (c978410bZH.LIZIZ.length() > 0) {
                map.put("sub_module", c978410bZH.LIZIZ);
            }
            int i = c978410bZH.LIZJ;
            if (i != 0) {
                map.put("label", String.valueOf(i));
            }
        }
        Room roomLIZJ = C950220apo.LIZJ();
        if (roomLIZJ == null || (streamType = roomLIZJ.getStreamType()) == null || (str = streamType.logStreamingType) == null) {
            str = "video_live";
        }
        map.put("live_type", str);
    }

    public static void LJIIIZ(String str, String str2) {
        if (AnchorSlowFunctionOptABSetting.INSTANCE.enable() && C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C465801rc(str, str2, null), 3);
        } else {
            LJJIIJZLJL(str, str2);
        }
    }

    public static void LJIIJ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("banner_id", str2);
        linkedHashMap.put("from_page", LIZJ.LIZ);
        LJJIIZI("livesdk_multi_anchor_funkit_panel_banner", linkedHashMap);
    }

    public static void LJJIIJZLJL(String str, String str2) {
        String idStr;
        String str3;
        List<LinkUser> listLIZLLL;
        C01HZ c01hzKi1;
        if (Intrinsics.LJFF(str, "click") && (c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1()) != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ(str2), null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        String strLIZJ = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        List<String> listZP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ZP2();
        if (listZP2 != null) {
            linkedHashMap.put("guest_cnt", String.valueOf(listZP2.size()));
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean z = true;
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() - 1 <= 0) {
            z = false;
        }
        String strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", str3);
        linkedHashMap.put("from_page", str2);
        linkedHashMap.put("action_type", str);
        if (!C500260Jjc.LJJIL()) {
            strLIZJ = C917520Zz4.LIZJ();
        }
        linkedHashMap.put("layout_id", strLIZJ);
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            strLIZLLL = C923330a8R.LIZLLL();
        }
        linkedHashMap.put("is_multi_guest_moderator", strLIZLLL);
        LJJIIZI("livesdk_multi_anchor_funkit_icon", linkedHashMap);
    }

    public static void LJJIIZ(long j, C978410bZH c978410bZH) {
        LJIILLIIL.put(Long.valueOf(j), c978410bZH);
    }

    public static void LJJIIZI(String str, Map map) {
        C978370bZD c978370bZDLIZIZ;
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20(str);
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ(map)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public static String LJJIJIIJI(Boolean bool, Integer num) {
        if (num == null || bool == null) {
            return "unknown";
        }
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                return "unknown";
            }
            if (zBooleanValue) {
                return "ugc_self";
            }
            return "ugc_other";
        }
        return "pgc";
    }

    public static void LJIIIIZZ(String str, List list, C949720ap0 c949720ap0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", String.valueOf(C933980aPc.LIZIZ()));
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("from_page", LJFF);
        linkedHashMap.put("exp_tag", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(5), 30));
        if (c949720ap0 != null) {
            linkedHashMap.put("slect_tag", String.valueOf(c949720ap0.LIZ));
        }
        LJJIIZI("livesdk_multi_funkit_feedback_panel", linkedHashMap);
    }

    public static void LJJII(long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(Long.valueOf(j), linkedHashMap);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("icon_type", str2);
        LJJIIZI("livesdk_multi_anchor_playbook_design_feature_icon", linkedHashMap);
    }

    public static void LJJIII(long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("button_type", str2);
        LJJIIZI("livesdk_multi_anchor_playbook_education_popup_show", linkedHashMap);
    }

    public static void LJIIZILJ(int i, int i2, int i3, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("label_type", String.valueOf(i2));
        if (i2 == 2) {
            linkedHashMap.put("recommend_label", String.valueOf(i));
        }
        if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable()) {
            linkedHashMap.put("recommend_label_vertical", String.valueOf(i3));
        }
        LJJIIZI("livesdk_multi_anchor_playbook_recommend_label", linkedHashMap);
    }

    public static void LJIJJLI(Long l, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String string;
        if (!PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        C915190ZvJ c915190ZvJ = LIZJ;
        if (c915190ZvJ != null) {
            linkedHashMap.put("from_page", c915190ZvJ.LIZ);
        }
        if (C500260Jjc.LJJIIZ(str3)) {
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("feature_name", str3);
        }
        linkedHashMap.put("page_type", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("edit_type", str2);
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_ai_generate", str4);
        if (l != null && (string = l.toString()) != null) {
            str6 = string;
        }
        linkedHashMap.put("playbook_id", str6);
        if (C758560TpG.LIZ) {
            str5 = "pgc";
        } else {
            str5 = "ugc_self";
        }
        linkedHashMap.put("playbook_create_type", str5);
        LJJIIZI("livesdk_multi_anchor_playbook_ugc_page_all", linkedHashMap);
    }

    public static void LJJ(String str, long j, String str2, Integer num, Boolean bool) {
        String strLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(Long.valueOf(j), linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("switch_to", str2);
        if (Intrinsics.LJFF(str, "show")) {
            linkedHashMap.put("button_before", str2);
        } else {
            String str3 = "on";
            if (Intrinsics.LJFF(str2, "on")) {
                str3 = "off";
            }
            linkedHashMap.put("button_before", str3);
        }
        if (C500260Jjc.LJJIL()) {
            strLIZJ = "";
        } else {
            strLIZJ = C917520Zz4.LIZJ();
        }
        linkedHashMap.put("layout_id", strLIZJ);
        linkedHashMap.put("playbook_create_type", LJJIJIIJI(bool, num));
        LJJIIZI("livesdk_multi_anchor_playbook_auto_icon", linkedHashMap);
    }

    public static void LJJIFFI(long j, String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(Long.valueOf(j), linkedHashMap);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("action_type", "apply");
        linkedHashMap.put("feature_name", str);
        linkedHashMap.put("goal_info", str2);
        linkedHashMap.put("result", str3);
        linkedHashMap.put("is_re_editing", str4);
        LJJIIZI("livesdk_multi_anchor_playbook_design_feature_apply", linkedHashMap);
    }

    public static void LJIJJ(String str, String str2, Long l, String str3, Boolean bool, int i) {
        String string;
        String str4;
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = Boolean.FALSE;
        }
        if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LIZIZ(null, linkedHashMap);
            C915190ZvJ c915190ZvJ = LIZJ;
            if (c915190ZvJ != null) {
                linkedHashMap.put("from_page", c915190ZvJ.LIZ);
            }
            linkedHashMap.put("page_type", str);
            linkedHashMap.put("icon_type", str2);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("edit_type", str3);
            String str5 = CardStruct.IStatusCode.DEFAULT;
            if (l == null || (string = l.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("playbook_id", string);
            if (C500260Jjc.LJJJI(bool)) {
                str5 = "1";
            }
            linkedHashMap.put("is_ai_generate", str5);
            linkedHashMap.put("action_type", "show");
            if (C500260Jjc.LJJIIZ(null)) {
                linkedHashMap.put("icon_param", "");
            }
            if (C758560TpG.LIZ) {
                str4 = "pgc";
            } else {
                str4 = "ugc_self";
            }
            linkedHashMap.put("playbook_create_type", str4);
            LJJIIZI("livesdk_multi_anchor_playbook_ugc_icon_all", linkedHashMap);
        }
    }

    public static void LJJI(String str, long j, String str2, String str3, Integer num, Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("page_type", str2);
        linkedHashMap.put("playbook_create_type", LJJIJIIJI(bool, num));
        linkedHashMap.put("play_id", str3);
        LJJIIZI("livesdk_multi_anchor_playbook_auto_step_close", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978360bZC.LJIIL(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int):void");
    }

    public static void LJIJ(String str, String str2, Long l, String str3, boolean z, String str4, String str5) {
        String string;
        String str6;
        if (!PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        C915190ZvJ c915190ZvJ = LIZJ;
        if (c915190ZvJ != null) {
            linkedHashMap.put("from_page", c915190ZvJ.LIZ);
        }
        linkedHashMap.put("page_type", str);
        linkedHashMap.put("icon_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("edit_type", str3);
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (l == null || (string = l.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("playbook_id", string);
        if (z) {
            str7 = "1";
        }
        linkedHashMap.put("is_ai_generate", str7);
        linkedHashMap.put("action_type", "click");
        if (C500260Jjc.LJJIIZ(str4)) {
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("icon_param", str4);
        }
        if (C500260Jjc.LJJIIZ(str5)) {
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("feature_name", str5);
        }
        if (C758560TpG.LIZ) {
            str6 = "pgc";
        } else {
            str6 = "ugc_self";
        }
        linkedHashMap.put("playbook_create_type", str6);
        LJJIIZI("livesdk_multi_anchor_playbook_ugc_icon_all", linkedHashMap);
    }

    public static void LJIILIIL(DataChannel dataChannel, String str, Playbook playbook, boolean z, String str2, int i, long j, int i2) {
        Long lValueOf;
        String str3;
        Integer numValueOf;
        List<PlaybookTagAggregation> list;
        PlaybookContent playbookContent;
        List<PlaybookTagAggregation> list2;
        String strLJJLIIIJ;
        PlaybookContent playbookContent2;
        List<PlaybookTagAggregation> list3;
        PlaybookContent playbookContent3;
        List<Integer> list4;
        String str4 = str2;
        Boolean boolValueOf = null;
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        long j2 = 0;
        if ((i2 & 64) != 0) {
            j = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        LIZIZ(lValueOf, linkedHashMap);
        linkedHashMap.put("action_type", str);
        if (str4 != null) {
            linkedHashMap.put("step_function", str4);
            linkedHashMap.put("step_num", String.valueOf(i));
        }
        linkedHashMap.put("from_page", LJFF().LIZ);
        if (playbook != null) {
            j2 = playbook.playbookId;
        }
        linkedHashMap.put("playbook_id", String.valueOf(j2));
        linkedHashMap.put("is_reference", String.valueOf(z ? 1 : 0));
        linkedHashMap.put("anchor_id", LJI());
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            if (C930540aK4.LJ()) {
                str3 = "guest";
            } else {
                str3 = "audience";
            }
        } else {
            str3 = "anchor";
        }
        linkedHashMap.put("from_user_type", str3);
        if (playbook != null && (playbookContent3 = playbook.content) != null && (list4 = playbookContent3.tagTypes) != null && (!list4.isEmpty())) {
            linkedHashMap.put("recommend_label_list", C13LP.LJJLIIIJ(list4, ",", null, null, 0, null, null, 62));
        }
        if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && playbook != null && (playbookContent = playbook.content) != null && (list2 = playbookContent.tagAggregations) != null && !list2.isEmpty()) {
            if (playbook == null || (playbookContent2 = playbook.content) == null || (list3 = playbookContent2.tagAggregations) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(7), 30)) == null) {
                strLJJLIIIJ = "";
            }
            linkedHashMap.put("recommend_label_vertical_list", strLJJLIIIJ);
        }
        if (Intrinsics.LJFF(str, "show")) {
            linkedHashMap.put("first_frame_duration", String.valueOf(j));
        }
        if (playbook != null) {
            PlaybookContent playbookContent4 = playbook.content;
            if (playbookContent4 != null && (list = playbookContent4.tagAggregations) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<PlaybookTagAggregation> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().playbookFirstLevelTagType));
                }
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                if (strLJJLIIIJ2 != null && strLJJLIIIJ2.length() > 0) {
                    linkedHashMap.put("playbook_biz", strLJJLIIIJ2);
                }
            }
            numValueOf = Integer.valueOf(playbook.playbookType);
            boolValueOf = Boolean.valueOf(playbook.isMyCreation);
        } else {
            numValueOf = null;
        }
        linkedHashMap.put("playbook_create_type", LJJIJIIJI(boolValueOf, numValueOf));
        linkedHashMap.put("live_status", C915980Zwa.LIZLLL().pY0(dataChannel));
        LIZJ(linkedHashMap);
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multi_anchor_playbook_detail", linkedHashMap);
        }
        if (Intrinsics.LJFF(LJIIJJI, "playbook_guide_capsule")) {
            linkedHashMap.put("module", "match_panel");
        }
        LJJIIZI("livesdk_multi_anchor_playbook_detail", linkedHashMap);
    }

    public static void LJIILLIIL(DataChannel dataChannel, boolean z, long j, int i, int i2, List list, String str, String str2, String str3, int i3) {
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        List list2 = list;
        if ((i3 & 8) != 0) {
            i = 0;
        }
        if ((i3 & 16) != 0) {
            i2 = 2;
        }
        if ((i3 & 32) != 0) {
            list2 = null;
        }
        if ((i3 & 64) != 0) {
            str6 = null;
        }
        if ((i3 & 128) != 0) {
            str5 = null;
        }
        if ((i3 & 256) != 0) {
            str4 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(null, linkedHashMap);
        C915190ZvJ c915190ZvJ = LIZJ;
        if (c915190ZvJ != null) {
            linkedHashMap.put("from_page", c915190ZvJ.LIZ);
        }
        linkedHashMap.put("is_favorites_show", String.valueOf(z ? 1 : 0));
        if (MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
            linkedHashMap.put("recommend_label", String.valueOf(i));
        }
        if (C500260Jjc.LJJIL()) {
            LJFF = "live_take_page";
        } else {
            LJFF = LIZJ.LIZ;
        }
        linkedHashMap.put("recommend_label_vertical", String.valueOf(i2));
        linkedHashMap.put("first_frame_duration", String.valueOf(j));
        if (str6 != null) {
            linkedHashMap.put("panel_page", str6);
        }
        if (str5 != null) {
            linkedHashMap.put("panel_entrance", str5);
        }
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((PlaybookTagAggregation) it2.next()).playbookFirstLevelTagType));
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("recommend_tabs", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            }
        }
        if (LiveMatchInviterPanelLynxConfigSetting.INSTANCE.isEnabled()) {
            linkedHashMap.put("cohost_module_type", str4);
        }
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multi_anchor_playbook_module_show", linkedHashMap);
        }
        LJJIIZI("livesdk_multi_anchor_playbook_module_show", linkedHashMap);
    }

    public static void LJIILJJIL(DataChannel dataChannel, String str, String str2, int i, long j, boolean z, String str3, Playbook playbook, PlayRule playRule, boolean z2, int i2) {
        String str4;
        Integer numValueOf;
        Boolean boolValueOf;
        C20357914lF config;
        EnumC937290aUx enumC937290aUx;
        PlaybookContent playbookContent;
        List<PlaybookTagAggregation> list;
        PlaybookContent playbookContent2;
        List<PlaybookTagAggregation> list2;
        PlaybookContent playbookContent3;
        List<PlaybookTagAggregation> list3;
        String strLJJLIIIJ;
        PlaybookContent playbookContent4;
        List<Integer> list4;
        String str5 = str3;
        String str6 = "";
        if ((i2 & 64) != 0) {
            str5 = "";
        }
        String str7 = null;
        if ((i2 & 256) != 0) {
            playRule = null;
        }
        if ((i2 & 512) != 0) {
            z2 = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(Long.valueOf(j), linkedHashMap);
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("feature_name", str2);
        linkedHashMap.put("step_num", String.valueOf(i));
        linkedHashMap.put("playbook_id", String.valueOf(j));
        linkedHashMap.put("is_reference", String.valueOf(z ? 1 : 0));
        if (str5.length() > 0) {
            linkedHashMap.put("show_from", str5);
        }
        if (!C500260Jjc.LJJIL() && !C930540aK4.LIZJ()) {
            if (C930540aK4.LJ()) {
                str4 = "guest";
            } else {
                str4 = "audience";
            }
        } else {
            str4 = "anchor";
        }
        linkedHashMap.put("from_user_type", str4);
        if (playbook != null && (playbookContent4 = playbook.content) != null && (list4 = playbookContent4.tagTypes) != null && (!list4.isEmpty())) {
            linkedHashMap.put("recommend_label_list", C13LP.LJJLIIIJ(list4, ",", null, null, 0, null, null, 62));
        }
        if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && playbook != null && (playbookContent2 = playbook.content) != null && (list2 = playbookContent2.tagAggregations) != null && !list2.isEmpty()) {
            if (playbook != null && (playbookContent3 = playbook.content) != null && (list3 = playbookContent3.tagAggregations) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(8), 30)) != null) {
                str6 = strLJJLIIIJ;
            }
            linkedHashMap.put("recommend_label_vertical_list", str6);
        }
        linkedHashMap.put("from_page", LJ.LIZ);
        if (playbook != null) {
            numValueOf = Integer.valueOf(playbook.playbookType);
            boolValueOf = Boolean.valueOf(playbook.isMyCreation);
        } else {
            numValueOf = null;
            boolValueOf = null;
        }
        linkedHashMap.put("playbook_create_type", LJJIJIIJI(boolValueOf, numValueOf));
        if (playbook != null && (playbookContent = playbook.content) != null && (list = playbookContent.tagAggregations) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PlaybookTagAggregation> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().playbookFirstLevelTagType));
            }
            str7 = null;
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
            if (strLJJLIIIJ2 != null && strLJJLIIIJ2.length() > 0) {
                linkedHashMap.put("playbook_biz", strLJJLIIIJ2);
            }
        }
        if (!z2) {
            if (C500260Jjc.LJJIL()) {
                enumC937290aUx = EnumC937290aUx.SETTING_PLAYBOOK;
            } else {
                enumC937290aUx = EnumC937290aUx.PLAYBOOK;
            }
            LJIIL(str2, str, enumC937290aUx.getValue(), false, str5, 0, 8);
        }
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multi_anchor_playbook_feature_entrance", linkedHashMap);
        }
        if (playRule != null && (config = playRule.getConfig()) != null) {
            str7 = config.LIZ;
        }
        if (Intrinsics.LJFF(str7, "leads")) {
            linkedHashMap.put("is_smb_service_plus", "1");
        }
        LJJIIZI("livesdk_multi_anchor_playbook_feature_entrance", linkedHashMap);
    }

    public static void LJIILL(DataChannel dataChannel, String str, Playbook playbook, String str2, int i, boolean z, boolean z2, Integer num, Integer num2, int i2, String str3, String str4, int i3) {
        List<PlaybookTagAggregation> list;
        long j;
        String str5 = str3;
        if ((i3 & 64) != 0) {
            z2 = false;
        }
        String str6 = null;
        if ((i3 & 128) != 0) {
            num = null;
        }
        if ((i3 & 256) != 0) {
            num2 = null;
        }
        if ((i3 & 512) != 0) {
            i2 = 0;
        }
        if ((i3 & 1024) != 0) {
            str5 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str6 = str4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(Long.valueOf(playbook.playbookId), linkedHashMap);
        linkedHashMap.put("action_type", str);
        String str7 = LIZJ.LIZ;
        if (str7 != null) {
            linkedHashMap.put("from_page", str7);
        }
        linkedHashMap.put("anchor_id", LJI());
        linkedHashMap.put("module", str2);
        if (Intrinsics.LJFF(str, "click")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!Intrinsics.LJFF(str2, "recommend") && !z2) {
                j = LIZIZ;
            } else {
                j = LIZ;
            }
            linkedHashMap.put("duration", String.valueOf((int) ((jCurrentTimeMillis - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        }
        linkedHashMap.put("rank", String.valueOf(i));
        linkedHashMap.put("is_in_playbook", String.valueOf(z ? 1 : 0));
        linkedHashMap.put("playbook_id", String.valueOf(playbook.playbookId));
        linkedHashMap.put("is_favorite", String.valueOf(playbook.isMyFavorite ? 1 : 0));
        linkedHashMap.put("favorite_num", String.valueOf(playbook.totalFavorites));
        linkedHashMap.put("hot_num", String.valueOf(playbook.totalUsage));
        if (MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable() && num != null) {
            linkedHashMap.put("recommend_label", num.toString());
        }
        if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && num2 != null) {
            linkedHashMap.put("recommend_label_vertical", num2.toString());
        }
        linkedHashMap.put("is_last_used", String.valueOf(i2));
        linkedHashMap.put("playbook_create_type", LJJIJIIJI(Boolean.valueOf(playbook.isMyCreation), Integer.valueOf(playbook.playbookType)));
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null && (list = playbookContent.tagAggregations) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PlaybookTagAggregation> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(it2.next().playbookFirstLevelTagType));
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                linkedHashMap.put("playbook_biz", strLJJLIIIJ);
            }
        }
        if (str5 != null) {
            linkedHashMap.put("panel_page", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("panel_entrance", str6);
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(C915980Zwa.LIZLLL().qp0()))) {
            LIZJ(linkedHashMap);
        }
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multi_anchor_playbook_list", linkedHashMap);
        }
        LJJIIZI("livesdk_multi_anchor_playbook_list", linkedHashMap);
    }
}
