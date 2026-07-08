package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0ZwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915850ZwN {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZ() {
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) C948450amx.LIZIZ.LJIIJJI("ZOOM_SERVICE");
        return LIZIZ(interfaceC927510aFB != null ? interfaceC927510aFB.LIZIZ() : null);
    }

    public static void LJII() {
        String str;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
            str = "";
        }
        map.put("link_id", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_expand_both_success");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ() {
        String str;
        RtcUserInfo rtcUserInfoG0;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
            str = "";
        }
        map.put("link_id", str);
        map.put("layout_setting", "grid");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_guest_expand_both_over");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static boolean LIZIZ(List list) {
        Long lValueOf;
        List<LinkUser> listLIZLLL;
        LinkUser next;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        String str = null;
        if (roomLJJLI != null) {
            lValueOf = Long.valueOf(roomLJJLI.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            Iterator<LinkUser> it2 = listLIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.userId, lValueOf)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkUser linkUser = next;
            if (linkUser != null) {
                str = linkUser.linkMicId;
            }
        }
        if (list != null) {
            for (Object obj : list) {
                if (((PosIdentity) obj).LIZJ(str)) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(List list) {
        if (list != null) {
            for (Object obj : list) {
                if (((PosIdentity) obj).type == 2) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static void LJI(List list, boolean z) {
        Object obj;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        LinkUser linkUserLJJLJLI;
        Long l;
        LIZ = System.currentTimeMillis();
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PosIdentity) obj2).type == 1) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            long jLongValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            PosIdentity posIdentity = (PosIdentity) it2.next();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(posIdentity.value)) != null && (l = linkUserLJJLJLI.userId) != null) {
                jLongValue = l.longValue();
            }
            arrayList2.add(Long.valueOf(jLongValue));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            long jLongValue2 = ((Number) obj3).longValue();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            if (roomLJJLI == null || jLongValue2 != roomLJJLI.getOwnerUserId()) {
                if (jLongValue2 != 0) {
                    arrayList3.add(obj3);
                }
            }
        }
        map.put("expand_guest_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((PosIdentity) obj4).type == 1) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((PosIdentity) it3.next()).value);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            C930480aJy.LIZ.getClass();
            if (!C930480aJy.LJIJJLI((String) obj5)) {
                arrayList6.add(obj5);
            }
        }
        map.put("expand_guest_link_id_list", C13LP.LJJLIIIJ(arrayList6, ",", null, null, 0, null, null, 62));
        if (z) {
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            int i2 = -1;
            if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
                i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
            } else {
                i = -1;
            }
            MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
            }
            Pair pairLJII = C917520Zz4.LJII(C917140ZyS.LJFF(i, i2));
            map.put("layout_setting", pairLJII.getFirst());
            map.put("window_setting", pairLJII.getSecond());
        }
        map.put("link_id_list", C917520Zz4.LJ());
        String str = "1";
        if (LIZIZ(list)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor_expand", obj);
        if (!LIZJ(list)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_notice_board", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_expand_both_success");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(String str, boolean z) {
        String string;
        Object obj;
        String string2;
        LinkUser linkUserLJJLJLI;
        Long l;
        List<PosIdentity> listLIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("button_action_type", "show");
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) C948450amx.LIZIZ.LJIIJJI("ZOOM_SERVICE");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC927510aFB == null || (listLIZIZ = interfaceC927510aFB.LIZIZ()) == null || (string = Integer.valueOf(listLIZIZ.size()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("expand_user_num", string);
        if (LIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor_expand", obj);
        if (z) {
            map.put("is_from_notice_board", "1");
        } else {
            map.put("is_from_notice_board", CardStruct.IStatusCode.DEFAULT);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(str)) == null || (l = linkUserLJJLJLI.userId) == null || (string2 = l.toString()) == null) {
                string2 = "";
            }
            map.put("from_user_id", string2);
            map.put("link_id", str);
        }
        if (!C930540aK4.LIZJ()) {
            str2 = "1";
        }
        map.put("is_multi_guest_moderator", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_replace_expand_both_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(List list, boolean z, boolean z2) {
        Object obj;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        LinkUser linkUserLJJLJLI;
        Long l;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PosIdentity) obj2).type == 1) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            long jLongValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            PosIdentity posIdentity = (PosIdentity) it2.next();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(posIdentity.value)) != null && (l = linkUserLJJLJLI.userId) != null) {
                jLongValue = l.longValue();
            }
            arrayList2.add(Long.valueOf(jLongValue));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            long jLongValue2 = ((Number) obj3).longValue();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            if (roomLJJLI == null || jLongValue2 != roomLJJLI.getOwnerUserId()) {
                arrayList3.add(obj3);
            }
        }
        map.put("expand_guest_id_list", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((PosIdentity) obj4).type == 1) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((PosIdentity) it3.next()).value);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            C930480aJy.LIZ.getClass();
            if (!C930480aJy.LJIJJLI((String) obj5)) {
                arrayList6.add(obj5);
            }
        }
        map.put("expand_guest_link_id_list", C13LP.LJJLIIIJ(arrayList6, ",", null, null, 0, null, null, 62));
        if (z2) {
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            int i2 = -1;
            if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
                i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
            } else {
                i = -1;
            }
            MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
            }
            Pair pairLJII = C917520Zz4.LJII(C917140ZyS.LJFF(i, i2));
            map.put("layout_setting", pairLJII.getFirst());
            map.put("window_setting", pairLJII.getSecond());
        }
        map.put("link_id_list", C917520Zz4.LJ());
        map.put("duration", String.valueOf((System.currentTimeMillis() - LIZ) / 1000.0d));
        String str = "1";
        if (LIZJ(list)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_notice_board", obj);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor_expand", str);
        LIZ = 0L;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_expand_both_duration");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(long j, String str, boolean z, boolean z2) {
        String string;
        Object obj;
        String string2;
        LinkUser linkUserLJJLJLI;
        Long l;
        List<PosIdentity> listLIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("button_action_type", "click");
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) C948450amx.LIZIZ.LJIIJJI("ZOOM_SERVICE");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (interfaceC927510aFB == null || (listLIZIZ = interfaceC927510aFB.LIZIZ()) == null || (string = Integer.valueOf(listLIZIZ.size()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("expand_user_num", string);
        if (LIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor_expand", obj);
        if (z) {
            map.put("is_from_notice_board", "1");
        } else {
            map.put("is_from_notice_board", CardStruct.IStatusCode.DEFAULT);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLJJLJLI = interfaceC954180awCLLJLL.LJJLJLI(str)) == null || (l = linkUserLJJLJLI.userId) == null || (string2 = l.toString()) == null) {
                string2 = "";
            }
            map.put("from_user_id", string2);
        }
        if (z2) {
            map.put("is_replace_notice_board", "1");
        } else {
            map.put("is_replace_notice_board", CardStruct.IStatusCode.DEFAULT);
            map.put("replace_user_id", String.valueOf(j));
        }
        if (!z) {
            map.put("link_id", str);
        }
        if (!C930540aK4.LIZJ()) {
            str2 = "1";
        }
        map.put("is_multi_guest_moderator", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_replace_expand_both_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, long j, String str2, boolean z, boolean z2) {
        int size;
        Object obj;
        Object obj2;
        Object obj3;
        String str3;
        LinkUser linkUserLLD;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        List<PosIdentity> listLIZIZ;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) C948450amx.LIZIZ.LJIIJJI("ZOOM_SERVICE");
        if (interfaceC927510aFB != null && (listLIZIZ = interfaceC927510aFB.LIZIZ()) != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        map.put("button_action_type", str);
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_grey", obj);
        if (str2 != null) {
            map.put("request_page", str2);
        }
        map.put("expand_user_num", String.valueOf(size));
        if (LIZ()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor_expand", obj2);
        if (z2) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_from_notice_board", obj3);
        if (!z2) {
            map.put("from_user_id", String.valueOf(j));
        }
        if (size < 2) {
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            int i2 = -1;
            if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
                i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
            } else {
                i = -1;
            }
            MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
                i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
            }
            Pair pairLJII = C917520Zz4.LJII(C917140ZyS.LJFF(i, i2));
            map.put("layout_setting", pairLJII.getFirst());
            map.put("window_setting", pairLJII.getSecond());
        }
        if (!z2) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) == null || (str3 = linkUserLLD.linkMicId) == null) {
                str3 = "";
            }
            map.put("link_id", str3);
        }
        if (C930540aK4.LIZJ()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_multi_guest_moderator", str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_expand_both_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(int i, long j, String str, String str2, boolean z) {
        boolean z2;
        List<PosIdentity> listLIZIZ;
        int size;
        Object obj;
        Object obj2;
        String str3;
        LinkUser linkUserLLD;
        Object obj3;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) C948450amx.LIZIZ.LJIIJJI("ZOOM_SERVICE");
        if (interfaceC927510aFB != null && (listLIZIZ = interfaceC927510aFB.LIZIZ()) != null && (size = listLIZIZ.size()) >= 2) {
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("button_action_type", str);
            String str4 = "1";
            if (Intrinsics.LJFF(str, "show")) {
                if (!z2) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_grey", obj3);
            }
            map.put("expand_user_num", String.valueOf(size));
            if (LIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor_expand", obj);
            if (z) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_from_notice_board", obj2);
            if (!z) {
                map.put("from_user_id", String.valueOf(j));
            }
            if (str2 != null) {
                map.put("to_user_type", str2);
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(j)) == null || (str3 = linkUserLLD.linkMicId) == null) {
                str3 = "";
            }
            map.put("link_id", str3);
            if (C930540aK4.LIZJ()) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_multi_guest_moderator", str4);
            C404301hh.LIZ(map);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_shrink_entrance");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }
}
