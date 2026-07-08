package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906180zhg {
    public static final String LIZ(GeneralTemplateNotice generalTemplateNotice, String str) {
        int size;
        String string;
        TitleTemplate titleTemplate;
        TitleTemplate titleTemplate2;
        List<User> list;
        String strOptString = null;
        if (str == null) {
            return null;
        }
        NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
        if (noticeUITemplate != null && (titleTemplate2 = noticeUITemplate.titleTemplate) != null && (list = titleTemplate2.fromUsers) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (size < 2) {
            return str;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getHost(), "digglist") && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "diggType"), "31")) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                NoticeUITemplate noticeUITemplate2 = generalTemplateNotice.uiTemplate;
                if (noticeUITemplate2 != null && (titleTemplate = noticeUITemplate2.titleTemplate) != null) {
                    StringBuilder sb = new StringBuilder();
                    List<User> list2 = titleTemplate.fromUsers;
                    if (list2 != null) {
                        Iterator<User> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            sb.append(it2.next().getSecUid());
                            sb.append(",");
                        }
                    }
                    string = a0.LJJJLIIL(sb, ",").toString();
                } else {
                    string = null;
                }
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("sec_user_ids", string);
                String str2 = generalTemplateNotice.messageExtra;
                if (str2 != null) {
                    strOptString = new JSONObject(str2).optString("business_extra");
                }
                if (C123100dR.LIZ(strOptString)) {
                    builderAppendQueryParameter.appendQueryParameter("business_extra", strOptString);
                }
                return builderAppendQueryParameter.build().toString();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return str;
        }
    }
}
