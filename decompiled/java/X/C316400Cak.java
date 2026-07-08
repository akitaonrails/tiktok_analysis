package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316400Cak {
    public static final C316400Cak LIZ = new C316400Cak();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2843));

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[Catch: Exception -> 0x00cf, PHI: r1 r5
      0x00ae: PHI (r1v9 java.util.List) = (r1v6 java.util.List), (r1v10 java.util.List) binds: [B:26:0x00ac, B:22:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r5v7 com.ss.android.ugc.aweme.model.MentionRecommendResponse) = 
      (r5v5 com.ss.android.ugc.aweme.model.MentionRecommendResponse)
      (r5v8 com.ss.android.ugc.aweme.model.MentionRecommendResponse)
     binds: [B:26:0x00ac, B:22:0x00a7] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00cf, blocks: (B:15:0x0087, B:17:0x0096, B:19:0x00a1, B:21:0x00a5, B:27:0x00ae, B:30:0x00b3), top: B:43:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ() throws X.C316370Cah {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316400Cak.LIZ():kotlin.Pair");
    }

    public static SearchUserSugResponse LIZIZ(String str, Set set) {
        Integer num;
        List listLLIIII = C13LP.LLIIII(set);
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        return ((ISearchUserService) LIZIZ.getValue()).LIZJ(new C317760Ccw(6L, null, str, "at_user", 20L, listLLIIII, num));
    }
}
