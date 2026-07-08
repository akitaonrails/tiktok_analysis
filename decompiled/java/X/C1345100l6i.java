package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;

/* JADX INFO: renamed from: X.0l6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345100l6i {
    public static final C1345100l6i LIZ = new C1345100l6i();

    public static void LIZ(Activity activity, Aweme aweme, String str, String str2, String str3, boolean z, String str4, int i, String str5) {
        String aid;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", str).appendQueryParameter("owner_id", str2).appendQueryParameter("report_type", "repost_with_text").appendQueryParameter("comment_with_emoji", CardStruct.IStatusCode.DEFAULT);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("related_object_ids", aid).appendQueryParameter("enter_from", str5).appendQueryParameter("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage()).appendQueryParameter("report_success_notification", "1");
        if (!TextUtils.isEmpty(str4)) {
            builderAppendQueryParameter2.appendQueryParameter("video_owner_id", str4);
        }
        n nVar = new n();
        nVar.LJJIIJ("unique_id", str3);
        nVar.LJJII(Boolean.valueOf(z), "is_blocked");
        builderAppendQueryParameter2.appendQueryParameter("extra", C08JS.LIZLLL(nVar));
        Bundle bundle = new Bundle();
        bundle.putInt("half_screen_height", i);
        ComplianceServiceProvider.LJJ().report(activity, builderAppendQueryParameter2, bundle);
    }
}
