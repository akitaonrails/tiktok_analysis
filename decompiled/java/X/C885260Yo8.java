package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885260Yo8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C878960Ydy c878960Ydy, List list, boolean z, String str) {
        String mobValue = c878960Ydy.LLILLL.getMobValue();
        if (mobValue == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC884440Ymo interfaceC884440Ymo = (InterfaceC884440Ymo) it2.next();
            if ((interfaceC884440Ymo instanceof C886420Yq0) && interfaceC884440Ymo != null) {
                arrayList.add(interfaceC884440Ymo);
            }
        }
        int i = 0;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("tab_name", mobValue), new Pair("enter_method", str));
        if (!z) {
            mapLJIIJ.put("total_chat_cnt", String.valueOf(arrayList.size()));
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                i = 0;
                while (it3.hasNext()) {
                    AbstractC884010Ym7 unreadState = ((AbstractC885530YoZ) it3.next()).getUnreadState();
                    if (unreadState != null && unreadState.getNum() > 0 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            mapLJIIJ.put("unread_chat_cnt", String.valueOf(i));
        }
        C885310YoD.LIZ.getClass();
        C885310YoD.LJIJJ().sendEvent("enter_message_request_page_tab", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.util.List r21, java.util.List r22, boolean r23, boolean r24, java.lang.String r25, java.lang.String r26, X.EnumC871430YGn r27) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885260Yo8.LIZIZ(java.util.List, java.util.List, boolean, boolean, java.lang.String, java.lang.String, X.0YGn):void");
    }

    public static void LIZJ(C878960Ydy c878960Ydy, List list, boolean z, Map map, boolean z2, C0YUD c0yud, String str, String str2) {
        Integer numValueOf;
        int followerCount;
        String str3 = str;
        if (c878960Ydy.LLILLL == EnumC880520YgU.MESSAGE_REQUEST_SPAM) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str4 = (String) linkedHashMap.get(c878960Ydy);
        if (str4 != null) {
            linkedHashMap.remove(c878960Ydy);
            if (z2) {
                LIZ(c878960Ydy, list, z, str4);
            }
            if (C880690Ygl.LIZIZ(c878960Ydy.LLILLL)) {
                int size = c0yud.LIZLLL().size();
                C879050Ye7 c879050Ye7 = C879050Ye7.LIZ;
                C879050Ye7.LIZLLL = size;
                C879050Ye7.LJ = str2;
                c879050Ye7.LIZ("fetch_data_end");
                if (str3 == null) {
                    str3 = "notification_page";
                }
                C885310YoD c885310YoD = C885310YoD.LIZ;
                User userLIZLLL = C461720I8s.LIZLLL();
                if (userLIZLLL != null) {
                    numValueOf = Integer.valueOf(userLIZLLL.getAccountType());
                } else {
                    numValueOf = null;
                }
                if (userLIZLLL != null) {
                    followerCount = userLIZLLL.getFollowerCount();
                } else {
                    followerCount = 0;
                }
                ArrayList arrayList = new ArrayList();
                if (followerCount > 1000) {
                    arrayList.add("creator");
                }
                if (numValueOf != null && numValueOf.intValue() == 3) {
                    arrayList.add("ttba");
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
                c885310YoD.getClass();
                C885310YoD.LJIJJ().sendEvent("enter_message_request_list", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str3), new Pair("num", String.valueOf(size)), new Pair("is_filtered", CardStruct.IStatusCode.DEFAULT), new Pair("receiver_user_type", strLJJLIIIJ)));
            }
        }
    }
}
