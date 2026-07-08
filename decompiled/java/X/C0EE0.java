package X;

import android.view.SurfaceView;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EE0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EE0 extends C09AY implements InterfaceC1685420txc<SurfaceView, Float, Float, Float, Float, Unit> {
    public C0EE0() {
        super(5);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(SurfaceView surfaceView, Float f, Float f2, Float f3, Float f4) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        float fFloatValue3 = f3.floatValue();
        surfaceView.animate().scaleX(fFloatValue).scaleY(fFloatValue2).translationX(fFloatValue3).translationY(f4.floatValue()).setInterpolator(C1619980sG4.LIZLLL()).setDuration(200L).start();
        return Unit.LIZ;
    }
}
