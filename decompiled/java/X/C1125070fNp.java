package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0fNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125070fNp {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        int i = C1130100fVw.LIZ.LJFF;
        return i != 1 ? i != 15 ? i != 16 ? "" : "3" : "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZIZ(String str, String str2, long j, long j2, long j3, String str3, Long l) {
        String str4;
        String str5;
        String strLIZIZ = "null";
        if (!Intrinsics.LJFF(str2, "gift_gallery")) {
            str4 = "null";
        } else if (j < j2) {
            str4 = "no";
        } else {
            str4 = "yes";
        }
        if (!Intrinsics.LJFF(str2, "group_live_viewer_wishes")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(j2);
            sbLIZ.append(',');
            sbLIZ.append(j);
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_beacon_bubble");
        c474500IjALIZ.LJIL();
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(w.LJ()), "anchor_id");
        if (C2640010k.LIZIZ()) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        c474500IjALIZ.LJJII(str5, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str3, "request_panel_id");
        c474500IjALIZ.LJJII(String.valueOf(j3), "gift_id");
        c474500IjALIZ.LJJII(str2, "biz_scenario");
        c474500IjALIZ.LJJII(strLIZIZ, "process");
        c474500IjALIZ.LJJII(str4, "is_gift_titler");
        c474500IjALIZ.LJJII(LIZ(), "tab_name");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(l, "load_duration");
        c474500IjALIZ.LIZ();
    }
}
