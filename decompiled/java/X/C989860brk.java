package X;

import android.app.Activity;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0brk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989860brk {
    public static C1025890cnr LIZ(Activity activity) {
        C1025890cnr c1025890cnr;
        FrameLayout frameLayoutLIZIZ = LIZIZ(activity);
        if (frameLayoutLIZIZ != null) {
            c1025890cnr = (C1025890cnr) frameLayoutLIZIZ.findViewById(R.id.emv);
        } else {
            c1025890cnr = null;
        }
        if (!(c1025890cnr instanceof C1025890cnr)) {
            return null;
        }
        return c1025890cnr;
    }

    public static FrameLayout LIZIZ(Activity activity) {
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.emr);
        if (viewStub == null) {
            return (FrameLayout) activity.findViewById(R.id.emq);
        }
        return (FrameLayout) C786410Ut5.LJLLLL(viewStub);
    }
}
