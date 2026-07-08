package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.165h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C207179165h extends View {
    public C13LY<Double> LL;
    public C13LY<Double> LLILLJJLI;
    public InterfaceC207180165i LLILLL;

    public final C13LY<Double> getCoreAreaXRange() {
        return this.LL;
    }

    public final C13LY<Double> getCoreAreaYRange() {
        return this.LLILLJJLI;
    }

    public final InterfaceC207180165i getInteractiveListener() {
        return this.LLILLL;
    }

    public final void setCoreAreaXRange(C13LY<Double> c13ly) {
        this.LL = c13ly;
    }

    public final void setCoreAreaYRange(C13LY<Double> c13ly) {
        this.LLILLJJLI = c13ly;
    }

    public final void setInteractiveListener(InterfaceC207180165i interfaceC207180165i) {
        this.LLILLL = interfaceC207180165i;
    }

    public C207179165h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C207179165h(Context context, AttributeSet attributeSet, int i) {
        C0FFF c0fff;
        super(context, attributeSet, i);
        int iLJIIJ = C12ES.LJIIJ(context);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        if (C444960Hcc.LIZJ(context)) {
            double d = iLJIIJ;
            c0fff = new C0FFF(0.22d * d, d * 1.0d);
        } else {
            double d2 = iLJIIJ;
            c0fff = new C0FFF(0.0d * d2, d2 * 0.78d);
        }
        this.LL = c0fff;
        double d3 = iLJIIIIZZ;
        this.LLILLJJLI = new C0FFF(0.12d * d3, d3 * 0.59d);
    }

    public static boolean LIZ(float f, float f2, float f3, float f4) {
        if (Math.abs(f3 - f) < C341940Daq.LIZ(10.0d) && Math.abs(f4 - f2) < C341940Daq.LIZ(10.0d)) {
            return true;
        }
        return false;
    }
}
