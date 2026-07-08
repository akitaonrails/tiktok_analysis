package X;

import Y.ACListenerS162S0100000_28;
import android.R;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.10D2, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10D2 {
    public final Context LIZ;
    public boolean LIZIZ;
    public final View LIZJ;

    public final void LIZ() {
        if (this.LIZIZ) {
            FrameLayout frameLayoutLIZIZ = LIZIZ();
            if (frameLayoutLIZIZ != null) {
                C786410Ut5.LJJJZ(this.LIZJ, frameLayoutLIZIZ);
            }
            this.LIZIZ = false;
            C786410Ut5.LJLLLLLL(8, this.LIZJ);
        }
    }

    public final FrameLayout LIZIZ() {
        Window window;
        View decorView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null || (window = c19egLIZIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return (FrameLayout) decorView.findViewById(R.id.content);
    }

    public C10D2(Context context) {
        this.LIZ = context;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), com.zhiliaoapp.musically.R.layout.ek_, LIZIZ(), false);
        this.LIZJ = viewTd;
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 13), viewTd);
    }
}
