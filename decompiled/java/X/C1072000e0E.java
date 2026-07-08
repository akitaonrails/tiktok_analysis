package X;

import Y.ACListenerS151S0100000_16;
import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0e0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072000e0E {
    public final Context LIZ;
    public boolean LIZIZ;
    public final FrameLayout LIZJ;
    public final View LIZLLL;

    public C1072000e0E(Context context) {
        this.LIZ = context;
        FrameLayout frameLayout = (FrameLayout) C1388190mED.LIZIZ(context).getWindow().getDecorView().findViewById(R.id.content);
        this.LIZJ = frameLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), com.zhiliaoapp.musically.R.layout.c_v, frameLayout, false);
        this.LIZLLL = viewTd;
        C786410Ut5.I7(new ACListenerS151S0100000_16(this, 58), viewTd);
    }
}
