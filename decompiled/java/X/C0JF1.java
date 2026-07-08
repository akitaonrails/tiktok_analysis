package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0JF1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JF1 {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZ(Context context, int i, ViewGroup viewGroup) {
        boolean z = true;
        if (C20673215v0.LIZ(i, context)) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                if (viewGroup == null) {
                    z = false;
                }
                return C20673215v0.LIZLLL(i, c19egLIZIZ, viewGroup, z);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            return C20742916Ex.LIZ(context, i, viewGroup, true, -1);
        }
        return C786410Ut5.LJLLJ(context, i, viewGroup);
    }
}
