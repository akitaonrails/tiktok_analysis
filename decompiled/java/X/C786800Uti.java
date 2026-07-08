package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;

/* JADX INFO: renamed from: X.0Uti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786800Uti {
    public static final View LIZ(int i, Activity activity, int i2) {
        View viewFindViewById = activity.findViewById(i);
        if ((viewFindViewById instanceof View) && viewFindViewById != null) {
            return viewFindViewById;
        }
        ViewStub viewStub = (ViewStub) activity.findViewById(i2);
        if (viewStub == null) {
            return null;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        if (!(viewLJLLLL instanceof View)) {
            return null;
        }
        return viewLJLLLL;
    }
}
