package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioDownloadsLynxUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ULm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770800ULm {
    public static void LIZ(Context context, String str, String str2) {
        String str3;
        if (context == null) {
            return;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(LiveStudioDownloadsLynxUrlSetting.INSTANCE.getLynxUrl()).buildUpon();
        if (C0IZJ.LIZ(str) > 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("from_message", str3).appendQueryParameter("enter_from", str2);
        C770600UKs.LIZ(builderAppendQueryParameter);
        Uri uriBuild = builderAppendQueryParameter.build();
        if (!TextUtils.isEmpty(uriBuild.toString())) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uriBuild);
        }
    }

    public static void LIZIZ(DetailLivePermission detailLivePermission, String str, String str2, String str3) {
        Boolean boolValueOf;
        if (!C500260Jjc.LJJIIZ(str)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_h5_advertise_redirect");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.enableLiveStudio);
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "has_ls_auth");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(str3, "land_page_btn");
        c474500IjALIZ.LIZ();
    }
}
