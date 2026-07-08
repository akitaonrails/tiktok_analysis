package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM;

/* JADX INFO: renamed from: X.0QIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668140QIq {
    public static SearchHistoryIconManagerVM LIZ(View view) {
        Activity activityLIZ;
        C19EG c19eg;
        Context context;
        if (!C07IV.LIZ) {
            return null;
        }
        if (view != null && (context = view.getContext()) != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
            return null;
        }
        return (SearchHistoryIconManagerVM) C679340Qkm.LIZ(view, c19eg).get(SearchHistoryIconManagerVM.class);
    }
}
