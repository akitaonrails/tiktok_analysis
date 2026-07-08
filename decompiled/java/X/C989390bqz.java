package X;

import android.app.Activity;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989390bqz {
    public static FrameLayout LIZ(Activity activity) {
        if (activity == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.fmp);
        if (viewStub != null && viewStub.getParent() != null) {
            return (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        }
        if (activity == null) {
            return null;
        }
        return (FrameLayout) activity.findViewById(R.id.dn4);
    }
}
