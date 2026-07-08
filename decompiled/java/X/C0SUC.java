package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;

/* JADX INFO: renamed from: X.0SUC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SUC {
    public static C2189821An6 LIZ(Context context) {
        C19EG c19egLIZIZ;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C2189821An6 c2189821An6 = ((FeedParamProvider) ViewModelProviders.of(c19egLIZIZ).get(FeedParamProvider.class)).LL;
            if (c2189821An6 == null) {
                return new C2189821An6();
            }
            return c2189821An6;
        }
        return new C2189821An6();
    }

    public static void LIZIZ(Context context, C2189821An6 c2189821An6) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return;
        }
        ((FeedParamProvider) ViewModelProviders.of(c19egLIZIZ).get(FeedParamProvider.class)).LL = c2189821An6;
    }
}
