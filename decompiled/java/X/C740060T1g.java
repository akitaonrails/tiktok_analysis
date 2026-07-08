package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecommerce.track.TrackerProvider;

/* JADX INFO: renamed from: X.0T1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740060T1g {
    public static C1054104Ah LIZ(Context context) {
        C19EG c19egLIZIZ;
        Object obj = null;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return null;
        }
        Object obj2 = ((TrackerProvider) ViewModelProviders.of(c19egLIZIZ).get(TrackerProvider.class)).LL;
        if (obj2 instanceof C1054104Ah) {
            obj = obj2;
        }
        return (C1054104Ah) obj;
    }
}
