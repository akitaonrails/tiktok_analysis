package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885310YoD implements InterfaceC890150Yw1 {
    public static final C885310YoD LIZ = new C885310YoD();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C885350YoH());
    public static final Map<String, Set<EnumC885330YoF>> LIZJ = new LinkedHashMap();
    public static final Map<InterfaceC879010Ye3, Set<String>> LIZLLL = new LinkedHashMap();
    public static final Map<InterfaceC879010Ye3, Set<String>> LJ = new LinkedHashMap();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C04W4());

    public static InterfaceC1493505sz LJIJJ() {
        return (InterfaceC1493505sz) LIZIZ.getValue();
    }

    public static void LJIILJJIL(C885310YoD c885310YoD) {
        c885310YoD.getClass();
        ((LinkedHashMap) LJ).clear();
    }

    public static void LJIILL(int i) {
        LJIJJ().sendEvent("enter_filtered_message_list", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "non_filtered_message_request"), new Pair("num", String.valueOf(i))));
    }

    public static String LJIJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        if (interfaceC879010Ye3 instanceof C878960Ydy) {
            int i = C880650Ygh.LIZ[((C878960Ydy) interfaceC879010Ye3).LLILLL.ordinal()];
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return null;
                }
                return "requests";
            }
            return "priority";
        }
        return null;
    }

    public static String LJIJI(InterfaceC1490905sZ interfaceC1490905sZ) {
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1709506mj.INSTANCE)) {
            return "stranger";
        }
        if (Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE)) {
            return "private";
        }
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE)) {
            return "group";
        }
        return "";
    }

    public static String LJIJJLI(AbstractC884010Ym7 abstractC884010Ym7) {
        if (abstractC884010Ym7 instanceof C880340YgC) {
            return "number_dot";
        }
        if (abstractC884010Ym7 instanceof C880330YgB) {
            return "yellow_dot";
        }
        return "report_null";
    }

    public static void LJJIIJZLJL(String str) {
        LJIJJ().sendEvent("filtered_request_guide", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("action_type", str)));
    }

    public static void LJJIIZ(String str) {
        LJIJJ().sendEvent("mr_guide_banner_action", C2097608Jq.LJIIIIZZ(new Pair("type", "manage_mr_permission"), new Pair("action_type", str)));
    }

    public static void LJJIJIIJI(int i) {
        LJIJJ().sendEvent("show_filtered_message_entrance", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "non_filtered_message_request"), new Pair("num", String.valueOf(i))));
    }

    public static void LJJIJIIJIL(String str) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("action_type", str));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_add_to_starred_page_action", mapLJIIIIZZ);
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJII(List<String> list) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1530505yx(list, null), 3);
    }

    @Override // X.InterfaceC890150Yw1
    public final String LJIIIZ(C0Y8T c0y8t) {
        if (c0y8t == null || C882340YjQ.LJ(c0y8t)) {
            return null;
        }
        List<FilterTabType> listLJIIIIZZ = C19212010Ec.LIZJ.LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (FilterTabType filterTabType : listLJIIIIZZ) {
            if (filterTabType != FilterTabType.OVERALL && filterTabType != FilterTabType.UNREAD && filterTabType != FilterTabType.UNANSWERED && filterTabType != FilterTabType.REQUEST) {
                arrayList.add(filterTabType);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        Set<EnumC880480YgQ> second = C19212010Ec.LIZJ.LJLIIIL().getSecond();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
            if (C880370YgF.LIZ((FilterTabType) obj, second, c0y8t, null, null, null)) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS248S0000000_14.get$arr$(425), 30);
    }

    public static void LJIIJJI(IMUser iMUser, Map map) {
        if (iMUser != null) {
            String recType = iMUser.getRecType();
            String str = "";
            if (recType == null) {
                recType = "";
            }
            map.put("rec_type", recType);
            LIZ.getClass();
            IMContactApi.LIZ.getClass();
            String strLJIL = C069P.LIZ().LIZ().LJIL(iMUser);
            if (strLJIL != null) {
                str = strLJIL;
            }
            map.put("relation_tag", str);
            map.put("follow_status", str);
        }
    }

    public static void LJJ(C885310YoD c885310YoD, InterfaceC1490905sZ interfaceC1490905sZ) {
        String str;
        C0I0B.LJFF.LIZIZ();
        c885310YoD.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1709506mj.INSTANCE)) {
            str = "message_box";
        } else {
            str = "message";
        }
        c830490Whz.put("enter_from", str);
        c830490Whz.put("target", "delete");
        c830490Whz.put("chat_type", LJIJI(interfaceC1490905sZ));
        C20684815ws.LJIILLIIL("chat_list_delete_confirm", c830490Whz);
    }

    public static void LJJIIJ(String str, String str2) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("tab_name", str2);
        c830490Whz.put("action", "select_all");
        c830490Whz.put("unread_cnt", "");
        c830490Whz.put("conversation_id", "");
        c830490Whz.put("to_user_id", "");
        LJIJJ().sendEvent("dm_multiselect_user", c830490Whz);
    }

    @Override // X.InterfaceC890150Yw1
    public final String LIZ(SessionInfo sessionInfo, boolean z) {
        C909290Zln c909290Zln;
        if (sessionInfo != null) {
            if (z && (sessionInfo instanceof C909290Zln) && (c909290Zln = (C909290Zln) sessionInfo) != null && c909290Zln.isTCM()) {
                return "tcm";
            }
            return C1677606ha.LIZ(sessionInfo.getChatType());
        }
        return "";
    }

    @Override // X.InterfaceC890150Yw1
    public final void LIZIZ(String str, String str2) {
        HashMap map = new HashMap();
        map.put("enter_from", str);
        map.put("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue());
        map.put("tab_name", str2);
        LJIJJ().sendEvent("enter_im_filter", map);
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJIIIIZZ(String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1530405yw(str, str2, null), 3);
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJIIJ(String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("inbox_filter_tab_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("tab_name", str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILLIIL(java.lang.Boolean r5, java.util.List r6, com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r7) {
        /*
            X.13DV r2 = X.C1697820uHc.LIZIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = "star"
            r2.add(r0)
        L11:
            r4 = 0
            if (r7 == 0) goto L56
            com.ss.android.ugc.aweme.friends.model.MutualStruct r0 = r7.mMutualStruct
            if (r0 == 0) goto L54
            int r0 = r0.mutualType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L52
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L3e
            java.lang.String r0 = "relation_share_muf"
        L29:
            r2.add(r0)
        L2c:
            java.util.List r0 = X.C1697820uHc.LIZ(r2)
            java.lang.String r1 = ","
            r2 = 0
            r4 = 0
            r7 = 62
            r3 = r2
            r5 = r2
            r6 = r2
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        L3e:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto L48
            java.lang.String r0 = "relation_follow_muf"
            goto L29
        L48:
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L52
            java.lang.String r0 = "relation_followed_by_muf"
            goto L29
        L52:
            if (r7 == 0) goto L56
        L54:
            java.lang.String r4 = r7.recommendReason
        L56:
            boolean r0 = X.C123100dR.LIZ(r4)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "relation_recommend_reason"
            goto L29
        L5f:
            if (r6 == 0) goto L2c
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r6, r0)
            r3.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L70:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r1.next()
            X.0YgO r0 = (X.C880460YgO) r0
            java.lang.String r0 = r0.mobValue
            r3.add(r0)
            goto L70
        L82:
            r2.addAll(r3)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885310YoD.LJIILLIIL(java.lang.Boolean, java.util.List, com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct):java.lang.String");
    }

    public static void LJJIII(int i, String str, long j) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("edit_mode_loading_time", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("action", "primary_selected"), new Pair("selected_count", String.valueOf(i)), new Pair("duration", String.valueOf(j))));
    }

    public static void LJJIJ(String str, String str2, String str3) {
        LJIJJ().sendEvent("message_request_page_top_banner_action", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("type", str2), new Pair("action_type", str3)));
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJFF(String str, String str2, String str3) {
        LJIJJ().sendEvent("enter_dm_multiselect_view", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("tab_name", str3)));
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJI(String str, String str2, String str3) {
        LJIJJ().sendEvent("change_archive_setting", C2097608Jq.LJIIIIZZ(new Pair("enter_method", str), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("action_type", str2), new Pair("setting_type", str3)));
    }

    public static void LJIL(C885310YoD c885310YoD, String str, int i, String str2) {
        C0I0B.LJFF.LIZIZ();
        c885310YoD.getClass();
        C20684815ws.LJIILLIIL("dm_multiselect_delete_confirm", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("num", String.valueOf(i)), new Pair("tab_name", str2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIIZI(AbstractC885530YoZ abstractC885530YoZ, InterfaceC879010Ye3 interfaceC879010Ye3, int i, InterfaceC1493105sv interfaceC1493105sv) {
        C0Y8T c0y8t;
        Object obj;
        IMUser iMUser;
        String string;
        IChatListEngine.LIZ.getClass();
        C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(abstractC885530YoZ.getKey(), interfaceC879010Ye3);
        if (c879540YeuLJII == null) {
            return;
        }
        T t = c879540YeuLJII.LIZJ;
        if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null) {
            C1490405sU<?> c1490405sU = c879540YeuLJII.LIZLLL.get(C1718806oE.LIZ);
            if (c1490405sU != null) {
                obj = c1490405sU.LIZIZ;
            } else {
                obj = null;
            }
            if (obj instanceof IMUser) {
                iMUser = (IMUser) obj;
            } else {
                iMUser = null;
            }
            Map<String, String> mapLJIIL = LJIIL(abstractC885530YoZ, interfaceC879010Ye3, c879540YeuLJII, c0y8t, iMUser);
            mapLJIIL.put("cell_order", String.valueOf(i));
            C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
            if (lastShowMessage != null && (string = Integer.valueOf(lastShowMessage.getMsgType()).toString()) != null && string.length() > 0) {
                mapLJIIL.put("hint_type", string);
            }
            C892210YzL.LIZIZ(c0y8t.getLastShowMessage(), mapLJIIL);
            interfaceC1493105sv.sendEvent("ttsocial_chat_cell_show", mapLJIIL);
        }
    }

    public static void LJJIJIL(C885310YoD c885310YoD, AbstractC885530YoZ abstractC885530YoZ, C878960Ydy c878960Ydy, int i) {
        C886420Yq0 c886420Yq0;
        C878630YdR key;
        String conversationId;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c885310YoD.getClass();
        if (c878960Ydy != null && (abstractC885530YoZ instanceof C886420Yq0) && (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) != null && (key = c886420Yq0.getKey()) != null && (conversationId = key.getConversationId()) != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJ;
            Object linkedHashSet = linkedHashMap.get(c878960Ydy);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(c878960Ydy, linkedHashSet);
            }
            if (((Set) linkedHashSet).add(conversationId)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1530605yy(i, abstractC885530YoZ, c878960Ydy, interfaceC1493505szLIZIZ, null), 3);
            }
        }
    }

    public static Map LJIIL(AbstractC885530YoZ abstractC885530YoZ, InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu c879540Yeu, C0Y8T c0y8t, IMUser iMUser) {
        String str;
        C878950Ydx c878950Ydx;
        String str2;
        String strLJIJI;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0y8t != null) {
            linkedHashMap.put("conversation_id", c0y8t.getConversationId());
            boolean zIsStickTop = c0y8t.isStickTop();
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (zIsStickTop) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_top", str2);
            AbstractC884010Ym7 unreadState = abstractC885530YoZ.getUnreadState();
            if ((unreadState instanceof C880340YgC) && unreadState != null && (string = Integer.valueOf(unreadState.getNum()).toString()) != null) {
                str3 = string;
            }
            linkedHashMap.put("unread_cnt", str3);
            C885310YoD c885310YoD = LIZ;
            AbstractC884010Ym7 unreadState2 = abstractC885530YoZ.getUnreadState();
            c885310YoD.getClass();
            linkedHashMap.put("notice_type", LJIJJLI(unreadState2));
            if (C879390Yef.LIZJ(c0y8t)) {
                strLJIJI = "tcm";
            } else {
                strLJIJI = LJIJI(c879540Yeu.LIZ);
            }
            linkedHashMap.put("chat_type", strLJIJI);
            linkedHashMap.put("to_user_id", C885340YoG.LIZ(c0y8t));
        }
        LIZ.getClass();
        if (interfaceC879010Ye3 instanceof C878960Ydy) {
            int i = C880650Ygh.LIZ[((C878960Ydy) interfaceC879010Ye3).LLILLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = "non_filtered_message_request";
                } else {
                    str = "message_request_spam";
                }
            } else {
                str = "filtered_message_request";
            }
        } else if (!(interfaceC879010Ye3 instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) == null || (str = c878950Ydx.LLILLJJLI) == null) {
            str = "notification_page";
        }
        linkedHashMap.put("enter_from", str);
        LJIIJJI(iMUser, linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.InterfaceC890150Yw1
    public final void LIZJ(String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put("enter_from", str);
        map.put("action_type", str2);
        map.put("option_name", str4);
        map.put("selected_options", str5);
        map.put("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue());
        map.put("tab_name", str3);
        LJIJJ().sendEvent("im_filter_panel_action", map);
    }

    @Override // X.InterfaceC890150Yw1
    public final void LJ(int i, String str, String str2, String str3, String str4) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("dm_multiselect_action", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("action", str3), new Pair("tab_name", str4), new Pair("num", String.valueOf(i))));
    }

    public static void LJJIFFI(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3, String str, String str2, String str3, String str4) {
        InterfaceC879010Ye3 interfaceC879010Ye3LIZLLL;
        if (interfaceC879010Ye3 == null) {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            interfaceC879010Ye3LIZLLL = C881500Yi4.LIZLLL();
        } else {
            interfaceC879010Ye3LIZLLL = interfaceC879010Ye3;
        }
        C1729806q0.LIZJ(interfaceC879010Ye3LIZLLL, new C881460Yi0(c879540Yeu, interfaceC879010Ye3, str, str2, str3, str4));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJI(java.lang.String r15, java.lang.String r16, X.InterfaceC879010Ye3 r17, X.C0Y8T r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885310YoD.LJJI(java.lang.String, java.lang.String, X.0Ye3, X.0Y8T, java.lang.String, java.lang.String, boolean):void");
    }

    public static void LJIILIIL(String str, String str2, String str3, IMUser iMUser, String str4, long j, String str5, String str6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("tab_name", str2);
        }
        linkedHashMap.put("unread_cnt", String.valueOf(j));
        if (iMUser != null) {
            linkedHashMap.put("to_user_id", String.valueOf(iMUser.getUid()));
        }
        linkedHashMap.put("conversation_id", str3);
        linkedHashMap.put("action", str4);
        if (str5 != null) {
            linkedHashMap.put("chat_label", str5);
        }
        linkedHashMap.put("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue());
        if (str6 != null) {
            linkedHashMap.put("chat_section", str6);
        }
        LJIJJ().sendEvent("dm_multiselect_user", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(java.lang.String r3, java.lang.String r4, X.InterfaceC1490905sZ r5, X.C0Y8T r6, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            X.0Whz r2 = new X.0Whz
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.put(r0, r3)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r4)
            java.lang.String r0 = "target"
            r2.put(r0, r8)
            java.lang.String r0 = "tab_name"
            r2.put(r0, r10)
            if (r6 == 0) goto Lc1
            java.lang.String r1 = r6.getConversationId()
        L1f:
            java.lang.String r0 = "conversation_id"
            r2.put(r0, r1)
            if (r9 == 0) goto L2b
            java.lang.String r0 = "action_type"
            r2.put(r0, r9)
        L2b:
            if (r7 == 0) goto L4c
            java.lang.String r1 = "to_user_id"
            java.lang.String r0 = r7.getUid()
            r2.put(r1, r0)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.06pF r0 = r0.LIZ()
            java.lang.String r1 = r0.LJIL(r7)
            java.lang.String r0 = "follow_status"
            r2.put(r0, r1)
        L4c:
            if (r11 == 0) goto L53
            java.lang.String r0 = "chat_label"
            r2.put(r0, r11)
        L53:
            X.01GW r0 = X.C885310YoD.LJFF
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics r0 = (com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics) r0
            java.lang.String r1 = r0.LIZ(r6)
            java.lang.String r0 = "is_message_request"
            r2.put(r0, r1)
            r3 = 1
            if (r6 == 0) goto Lbc
            boolean r0 = X.C879390Yef.LIZJ(r6)
            if (r0 != r3) goto Lbc
            java.lang.String r1 = "tcm"
        L6f:
            java.lang.String r0 = "chat_type"
            r2.put(r0, r1)
            if (r6 == 0) goto L9b
            boolean r0 = X.C878890Ydr.LIZIZ(r6)
            if (r0 != r3) goto L85
            java.lang.String r1 = "sub_chat_type"
            java.lang.String r0 = "message_request_spam"
            r2.put(r1, r0)
            if (r6 == 0) goto L9b
        L85:
            X.0YjR r3 = X.C882340YjQ.LIZIZ(r6)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L9b
            java.lang.String r1 = "chatbot_state"
            java.lang.String r0 = r3.LIZIZ
            r2.put(r1, r0)
            java.lang.String r1 = "chatbot_exist"
            java.lang.String r0 = "1"
            r2.put(r1, r0)
        L9b:
            X.10Ec r0 = X.C19212010Ec.LIZJ
            X.05RV r0 = r0.LIZJ()
            java.lang.String r1 = r0.getMobValue()
            java.lang.String r0 = "inbox_mode"
            r2.put(r0, r1)
            if (r12 == 0) goto Lb1
            java.lang.String r0 = "chat_section"
            r2.put(r0, r12)
        Lb1:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            java.lang.String r0 = "chat_list_feedback"
            X.C20684815ws.LJIILLIIL(r0, r2)
            return
        Lbc:
            java.lang.String r1 = LJIJI(r5)
            goto L6f
        Lc1:
            r1 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885310YoD.LJJII(java.lang.String, java.lang.String, X.05sZ, X.0Y8T, com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC890150Yw1
    public final void LIZLLL(String str, boolean z, String str2, String str3, String str4, EnumC868530Y5j enumC868530Y5j, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Object obj;
        String str12;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        String str13 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_filtered", obj);
        c830490Whz.put("chat_type", str3);
        c830490Whz.put("action", str2);
        c830490Whz.put("enter_method", str5);
        if (enumC868530Y5j == EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
            c830490Whz.put("accept_type", "primary");
        } else if (enumC868530Y5j == EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_SECONDARY) {
            c830490Whz.put("accept_type", "secondary");
        }
        c830490Whz.put("tab_name", str6);
        c830490Whz.put("chat_label", str7);
        if (str8 != null && C123100dR.LIZ(str8)) {
            c830490Whz.put("conversation_id", str8);
        }
        c830490Whz.put("to_user_id", String.valueOf(C0YNP.LJII(str8)));
        if (str9 != null && str9.length() > 0) {
            c830490Whz.put("entrance_type", str9);
        }
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(str8);
        if (c0y8tLIZ != null && C878890Ydr.LIZIZ(c0y8tLIZ)) {
            c830490Whz.put("sub_chat_type", "message_request_spam");
        }
        if (str10 != null && C123100dR.LIZ(str10)) {
            c830490Whz.put("rec_type", str10);
        }
        if (str11 != null && C123100dR.LIZ(str11)) {
            c830490Whz.put("follow_status", str11);
            c830490Whz.put("relation_tag", str11);
        }
        C0Y8T c0y8tLIZ2 = C0YSQ.LIZIZ(c0ysq).LIZ(str8);
        if (c0y8tLIZ2 != null) {
            IMAIServiceAPI.LIZ.getClass();
            if (!AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ2)) {
                str13 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("is_ai_involve", str13);
        }
        if (C885630Yoj.LIZJ(false)) {
            if (C300850Bql.LIZ() && !C612090Nzb.LIZ()) {
                str12 = "client";
            } else {
                str12 = "server";
            }
            c830490Whz.put("score_source", str12);
            c830490Whz.put("chat_section", str4);
        }
        LJIJJ().sendEvent("receive_message_request_response", c830490Whz);
    }
}
