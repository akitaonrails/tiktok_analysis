package X;

import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;

/* JADX INFO: renamed from: X.0gqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181290gqV {
    public static C1180620gpQ LIZ(SlashApiResponse slashApiResponse, boolean z) {
        SlashPage slashPage = slashApiResponse.page;
        C1181190gqL c1181190gqLLJ = C1181230gqP.LJ(slashPage, slashPage.getLayout());
        C1181230gqP.LIZ(slashApiResponse.page, c1181190gqLLJ);
        C1180620gpQ c1180620gpQ = new C1180620gpQ(c1181190gqLLJ, false, slashApiResponse.page.getPageInfo(), z, slashApiResponse.page.getPreloadFlag());
        SlashPage slashPage2 = slashApiResponse.page;
        c1180620gpQ.status_code = slashPage2.status_code;
        c1180620gpQ.status_msg = slashPage2.status_msg;
        return c1180620gpQ;
    }
}
