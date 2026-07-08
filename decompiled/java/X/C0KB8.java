package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KB8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KB8 {
    public static final int LIZ(List<PGCSubscriptionProductDetailWithTemplateInfo> list) {
        PGCSubscriptionProductDetailWithTemplateInfo next;
        TemplateInfo templateInfo;
        TagInfo tagInfo;
        String str;
        TagInfo tagInfo2;
        String str2;
        if (list != null) {
            Iterator<PGCSubscriptionProductDetailWithTemplateInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    TemplateInfo templateInfo2 = next.getTemplateInfo();
                    if (templateInfo2 != null && (tagInfo2 = templateInfo2.tagInfo) != null && (str2 = tagInfo2.clickableDescExtraInfo) != null && a0.LJJIIZI(str2, "subscriber_count", false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = next;
            if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && (tagInfo = templateInfo.tagInfo) != null && (str = tagInfo.clickableDescExtraInfo) != null) {
                try {
                    return new JSONObject(str).optInt("subscriber_count");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }
}
