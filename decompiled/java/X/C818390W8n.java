package X;

import Y.ACListenerS148S0100000_13;
import android.R;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0W8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818390W8n {
    public boolean LIZ;
    public final FrameLayout LIZIZ;
    public final View LIZJ;

    public C818390W8n(Context context) {
        FrameLayout frameLayout;
        Window window;
        View decorView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (window = c19egLIZIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
        } else {
            frameLayout = null;
        }
        this.LIZIZ = frameLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), com.zhiliaoapp.musically.R.layout.ek7, frameLayout, false);
        this.LIZJ = viewTd;
        C786410Ut5.I7(new ACListenerS148S0100000_13(this, 44), viewTd);
    }
}
