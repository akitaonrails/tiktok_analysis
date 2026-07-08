package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.api.IMentionApi;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316410Cal {
    public static final C316410Cal LIZ = new C316410Cal();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5358));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5359));

    public static MentionRecommendResponse LIZIZ(MentionRecommendQueryRequest mentionRecommendQueryRequest) {
        Long lValueOf;
        IMentionApi iMentionApi = (IMentionApi) LIZIZ.getValue();
        long j = mentionRecommendQueryRequest.mentionType;
        String str = mentionRecommendQueryRequest.pagination;
        String str2 = mentionRecommendQueryRequest.awemeId;
        if (str2 != null) {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str2));
        } else {
            lValueOf = null;
        }
        return iMentionApi.queryMentionRecommendList(j, str, lValueOf, Long.valueOf(mentionRecommendQueryRequest.scene)).execute().LIZIZ;
    }

    public static Object LIZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C2394209Zs.LIZ(((IMentionApi) LIZIZ.getValue()).queryMentionCheck(str, str2, false, 0L), interfaceC1364105Vn);
    }

    public static SearchUserSugResponse LIZJ(long j, String str, List list, String str2) {
        Integer num;
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        return ((ISearchUserService) LIZJ.getValue()).LIZJ(new C317760Ccw(j, str, str2, list, num));
    }
}
