package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924980aB6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(boolean z, boolean z2) {
        String str;
        String str2;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        map.put("click_type", str);
        if (z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        map.put("show_again", str2);
        C0KX4.LIZ("livesdk_guest_connection_apply_first_popup_click", map, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(boolean r6, boolean r7, java.lang.Integer r8, com.bytedance.ies.sdk.datachannel.DataChannel r9) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924980aB6.LIZJ(boolean, boolean, java.lang.Integer, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZLLL(int i, int i2, int i3, boolean z) {
        String str;
        String strLJJLIIIJ;
        List<String> listLJIILLIIL;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_user_apply", str);
        map.put("apply_guest_cnt", String.valueOf(i));
        map.put("connected_guest_cnt", String.valueOf(i2));
        map.put("request_page", "connection_button");
        map.put("live_room_mode", String.valueOf(i3));
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ == null || (listLJIILLIIL = interfaceC941720ac6LIZIZ.LJIILLIIL()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJIILLIIL, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        map.put("multi_tool", strLJJLIIIJ);
        C0KX4.LIZ("livesdk_guest_apply_panel_show", map, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(int i, int i2, Integer num, String str, DataChannel dataChannel, String str2, String str3, Map map, int i3) {
        Object obj;
        int i4;
        String strValueOf;
        Pair pair;
        String string;
        Pair pair2;
        List<String> listLJIILLIIL;
        String strLJJLIIIJ;
        String str4 = str;
        DataChannel dataChannel2 = dataChannel;
        Map map2 = map;
        String second = str3;
        String first = str2;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            str4 = null;
        }
        if ((i3 & 16) != 0) {
            dataChannel2 = null;
        }
        if ((i3 & 32) != 0) {
            first = null;
        }
        if ((i3 & 64) != 0) {
            second = null;
        }
        if ((i3 & 128) != 0) {
            map2 = null;
        }
        HashMap map3 = new HashMap();
        C01Z4.LIZ(null, map3);
        if (map2 != null) {
            map3.putAll(map2);
        }
        map3.put("guest_permission", C917520Zz4.LJIIIIZZ(false, null));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str5 = "";
        sbLIZ.append("");
        sbLIZ.append(i);
        map3.put("applying_guest_cnt", C2188811AlT.LIZIZ(sbLIZ));
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        String str6 = "1";
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (num2 != null && num2.intValue() == 1) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("is_applying", obj);
        String str8 = C925600aC6.LIZ;
        if (str8 == null) {
            str8 = "";
        }
        map3.put("request_page", str8);
        map3.put("empty_mic_count", String.valueOf(C921180a4y.LJ(C915980Zwa.LJIIIIZZ())));
        map3.put("auto_accept_request_initiate_type", String.valueOf(C925650aCB.LIZ()));
        if (Intrinsics.LJFF(C925600aC6.LIZ, "recommend_link_room_request")) {
            map3.put("enter_method", C0IUA.LJIIZILJ);
            map3.put("enter_from_merge", C0IUA.LJIILLIIL);
        }
        map3.put("layout_id", C917520Zz4.LIZJ());
        if (C917810ZzX.LJIILIIL()) {
            strValueOf = String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        } else {
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            if (multiGuestDataHolder != null) {
                i4 = multiGuestDataHolder.LJJIFFI;
            } else {
                i4 = 0;
            }
            strValueOf = String.valueOf(i4);
        }
        map3.put("connected_guest_cnt", strValueOf);
        map3.put("request_display_setting", C921220a52.LIZ(i2));
        if (num != null) {
            map3.put("own_rank", String.valueOf(num.intValue()));
        }
        if (C922770a7X.LIZIZ() && str4 != null) {
            map3.put("filter_request_setting", str4);
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null && (listLJIILLIIL = interfaceC941720ac6LIZIZ.LJIILLIIL()) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(listLJIILLIIL, ",", null, null, 0, null, null, 62)) != null) {
            str5 = strLJJLIIIJ;
        }
        map3.put("multi_tool", str5);
        map3.putAll(C917810ZzX.LIZLLL());
        Pair<String, String> pair3 = C928400aGc.LLJI;
        C928400aGc.LLJI = null;
        if (pair3 == null) {
            pair3 = C928340aGW.LLILZ;
            C928340aGW.LLILZ = null;
        }
        if (dataChannel2 == null || (pair2 = (Pair) dataChannel2.gg0(MultiGuestPreApprovedChannel.class)) == null || !((Boolean) pair2.getFirst()).booleanValue()) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("is_pre_accept_apply", str6);
        if (dataChannel2 != null && (pair = (Pair) dataChannel2.gg0(MultiGuestPreApprovedChannel.class)) != null && (string = Integer.valueOf(((Number) pair.getSecond()).intValue()).toString()) != null) {
            str7 = string;
        }
        map3.put("pre_accept_user_num", str7);
        C917750ZzR.LIZIZ(map3);
        C474500IjA c474500IjALIZ = C0KX4.LIZ("livesdk_guest_application_panel_show", map3, null, false);
        Pair[] pairArr = new Pair[1];
        if (first == null && (pair3 == null || (first = pair3.getFirst()) == null)) {
            first = "applyV";
        }
        if (second == null && (pair3 == null || (second = pair3.getSecond()) == null)) {
            second = "show";
        }
        pairArr[0] = new Pair(first, second);
        C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
        c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
        c945340ahw.LIZIZ();
    }
}
