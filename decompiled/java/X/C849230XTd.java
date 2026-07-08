package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849230XTd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(SharePackage sharePackage, String str, long j) {
        String string;
        String string2;
        String string3;
        String string4;
        String str2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0I0B.LJFF.LIZIZ();
        String string5 = null;
        if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
            string = bundle5.getString("enter_method");
        } else {
            string = null;
        }
        if (!Intrinsics.LJFF("long_press", string) && !Intrinsics.LJFF("long_press_more", string)) {
            string = "more_button";
        }
        String str3 = "chat";
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            string2 = bundle4.getString("platform", "chat");
        } else {
            string2 = null;
        }
        if (!TextUtils.equals(string2, "chat_list")) {
            str3 = string2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share_video_success");
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZ = C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", str3);
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            string3 = bundle3.getString("aid");
        } else {
            string3 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", string3);
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            string4 = bundle2.getString("author_id");
        } else {
            string4 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", string4);
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            string5 = bundle.getString("enter_from");
        }
        c2344009Gk.LJIIIIZZ("enter_from", string5);
        if (j > 0) {
            str2 = "private";
        } else {
            str2 = "group";
        }
        c2344009Gk.LJIIIIZZ("chat_type", str2);
        c2344009Gk.LJIIIIZZ("enter_method", string);
        c2344009Gk.LJIIIIZZ("bind_id", strLIZ);
        C20684815ws.LJIILLIIL("share_video_success", c2344009Gk.LIZ);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("bind_id", strLIZ);
        c830490Whz.put("conversation_id", str);
        if (j > 0) {
            c830490Whz.put("to_user_id", String.valueOf(j));
        }
        C20684815ws.LJIILLIIL("share_video_success_info", c830490Whz);
    }

    public static void LIZ(SharePackage sharePackage, String str, long j, boolean z, String str2) {
        String string;
        String string2;
        String str3;
        String str4;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "chat");
        String string3 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            string = bundle3.getString("aid");
        } else {
            string = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", string);
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            string2 = bundle2.getString("author_id");
        } else {
            string2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", string2);
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            string3 = bundle.getString("enter_from");
        }
        c2344009Gk.LJIIIIZZ("enter_from", string3);
        c2344009Gk.LJIIIIZZ("conversation_id", str);
        if (j > 0) {
            c2344009Gk.LIZLLL(j, "to_user_id");
            str3 = "private";
        } else {
            str3 = "group";
        }
        c2344009Gk.LJIIIIZZ("chat_type", str3);
        c2344009Gk.LJIIIIZZ("enter_method", "more_button");
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
        c2344009Gk.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("share_video_response", c2344009Gk.LIZ);
    }
}
