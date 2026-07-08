package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContentAssemV2;

/* JADX INFO: renamed from: X.0JCY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCY {
    public static String LIZ(String str, String str2, String str3, boolean z, String str4, Integer num, int i) {
        String str5;
        int i2 = PcsCourseManagementContentAssemV2.LLJJJIL;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=smb_lynx_universal_component&host=webcast_lynxview_popup").buildUpon();
        String str6 = CardStruct.IStatusCode.DEFAULT;
        if (str4 != null) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("is_adding", str5).appendQueryParameter("always_show_mask", "1");
        if (z) {
            str6 = "1";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("allow_empty_submit", str6).appendQueryParameter("title", str2).appendQueryParameter("page_type", str).appendQueryParameter("hint_text", str3);
        if (num != null) {
            builderAppendQueryParameter2.appendQueryParameter("max_length", String.valueOf(num));
        }
        if (str4 != null) {
            builderAppendQueryParameter2.appendQueryParameter("initial_value", str4);
        }
        return builderAppendQueryParameter2.build().toString();
    }
}
