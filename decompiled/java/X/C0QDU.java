package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;

/* JADX INFO: renamed from: X.0QDU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDU implements InterfaceC20290714aP {
    public static final C0QDU LIZ = new C0QDU();

    @Override // X.InterfaceC20290714aP
    public final boolean LJIIIIZZ(Context context) {
        C0QDL c0qdlLIZLLL;
        ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
        if (iSearchSurveyLIZ != null && (c0qdlLIZLLL = iSearchSurveyLIZ.LIZLLL()) != null && c0qdlLIZLLL.LJIIIIZZ(context) && C0BRM.LIZIZ()) {
            return true;
        }
        return false;
    }
}
