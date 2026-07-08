package X;

import android.view.View;
import android.view.Window;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0K8U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8U {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final C0K8Z LIZLLL;
    public final EditText LJ;
    public final Function0<C0K8X> LJFF;
    public final Function1<C0K8X, Unit> LJI;
    public final Function1<Integer, Unit> LJII;
    public int LJIIJ;
    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH LJIIJJI;
    public int LJIIL;
    public C0K8X LJIIIIZZ = C0K8X.NONE;
    public boolean LJIIIZ = true;
    public final int LJIILIIL = 5;

    public final void LIZ() {
        C0K8X c0k8xInvoke;
        Function0<C0K8X> function0 = this.LJFF;
        if (function0 == null || (c0k8xInvoke = function0.invoke()) == null) {
            c0k8xInvoke = this.LJIIIIZZ;
        }
        C0K8X c0k8x = C0K8X.NONE;
        if (c0k8xInvoke != c0k8x) {
            this.LJIIIIZZ = c0k8x;
            Function1<C0K8X, Unit> function1 = this.LJI;
            if (function1 != null) {
                function1.invoke(c0k8x);
            }
        }
    }

    public C0K8U(View view, Window window, View view2, View view3, C0JCO c0jco, EditText editText, AwS551S0100000_7 awS551S0100000_7, AwS586S0100000_7 awS586S0100000_7, AwS586S0100000_7 awS586S0100000_72) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = c0jco;
        this.LJ = editText;
        this.LJFF = awS551S0100000_7;
        this.LJI = awS586S0100000_7;
        this.LJII = awS586S0100000_72;
        this.LJIIL = view.getResources().getDisplayMetrics().heightPixels;
    }
}
