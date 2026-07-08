package X;

import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyHangupSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0aGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928460aGi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("enter_method", str);
        map.put("enter_from_merge", "live_detail");
        C0KX4.LIZ("livesdk_live_show", map, null, true);
    }

    public static void LIZIZ(String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("event_action_type", str);
        map.put("live_inner_push_status", str2);
        C0KX4.LIZ("livesdk_multi_live_inner_push_open_pop_up", map, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map LIZ(EnumC928480aGk enumC928480aGk, List list, String str, List list2) {
        Object obj;
        int size;
        Object obj2;
        int size2;
        Object obj3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC928480aGk enumC928480aGk2 = EnumC928480aGk.SHARE_PANEL;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (enumC928480aGk != enumC928480aGk2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_allow_applying", obj);
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size >= LinkMicApplyHangupSetting.getMaxApplyCount()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_up_to_request_limit", obj2);
        if (list != null) {
            size2 = list.size();
        } else {
            size2 = 0;
        }
        linkedHashMap.put("apply_room_in_line_num", String.valueOf(size2));
        if (list2 != null) {
            linkedHashMap.put("invite_room_in_line_num", String.valueOf(list2.size()));
        }
        linkedHashMap.put("sub_apply_panel_type", str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((GuestApplyStillInLineResponse.GuestApplyItem) next).status == 1) {
                    if (next != null) {
                        obj3 = "1";
                    }
                }
            }
            obj3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_apply_room_in_line_accepted", obj3);
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 1) {
            str2 = "1";
        }
        linkedHashMap.put("is_applying", str2);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.EnumC928480aGk r7, java.util.List r8, java.util.List r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, java.lang.String r11) {
        /*
            int[] r1 = X.C928470aGj.LIZ
            int r0 = r7.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L2b
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 == r0) goto L28
            r6 = 0
            r5 = r6
        L13:
            if (r11 == 0) goto L17
            java.lang.String r6 = "inviteBubble"
        L17:
            java.lang.String r0 = "still_in_line"
            java.util.Map r7 = LIZ(r7, r8, r0, r9)
            r0 = 0
            r2 = 0
            r8 = 15
            r4 = r10
            r1 = r0
            r3 = r2
            X.C924980aB6.LIZ(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L28:
            java.lang.String r6 = "multiguestBubble"
            goto L2d
        L2b:
            java.lang.String r6 = "shareIcon"
        L2d:
            java.lang.String r5 = "liveHome"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C928460aGi.LIZLLL(X.0aGk, java.util.List, java.util.List, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }
}
