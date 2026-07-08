package X;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.19WM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19WM {
    public final View LIZ;
    public final float LIZIZ;
    public final Function0<Unit> LIZJ;
    public float LIZLLL;
    public float LJ;
    public boolean LJFF;
    public boolean LJI;
    public final Rect LJII = new Rect();
    public VelocityTracker LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public C19WF LJIIL;
    public Window.Callback LJIILIIL;
    public Window LJIILJJIL;

    public C19WM(float f, View view, AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = view;
        this.LIZIZ = f;
        this.LIZJ = awS559S0100000_15;
        this.LJIIIZ = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.LJIIJ = ViewConfiguration.get(view.getContext()).getScaledMaximumFlingVelocity();
        this.LJIIJJI = ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
    }
}
