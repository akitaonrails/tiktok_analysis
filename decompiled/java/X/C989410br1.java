package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0br1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989410br1 {
    public static C1035340d36 LIZ(C19EG c19eg) {
        C1035340d36 c1035340d36;
        FrameLayout frameLayoutLIZIZ = LIZIZ(c19eg);
        if (frameLayoutLIZIZ != null) {
            c1035340d36 = (C1035340d36) frameLayoutLIZIZ.findViewById(R.id.a8t);
        } else {
            c1035340d36 = null;
        }
        if (!(c1035340d36 instanceof C1035340d36)) {
            return null;
        }
        return c1035340d36;
    }

    public static FrameLayout LIZIZ(C19EG c19eg) {
        if (c19eg == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) c19eg.findViewById(R.id.a_v);
        if (viewStub != null && viewStub.getParent() != null) {
            return (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        }
        if (c19eg == null) {
            return null;
        }
        return (FrameLayout) c19eg.findViewById(R.id.a_u);
    }
}
