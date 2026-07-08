package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.AwS33S0100001_25;

/* JADX INFO: renamed from: X.0sux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645330sux implements InterfaceC1645280sus {
    public ValueAnimator LIZ;
    public InterfaceC1645340suy LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC1645280sus
    public final void destroy() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC1645280sus
    public final void LIZ(InterfaceC1645340suy interfaceC1645340suy) {
        this.LIZIZ = interfaceC1645340suy;
    }

    @Override // X.InterfaceC1645280sus
    public final void LIZIZ(float f) {
        AwS33S0100001_25 awS33S0100001_25 = new AwS33S0100001_25(this, f, 1);
        if (!this.LIZJ) {
            awS33S0100001_25.invoke();
        }
    }

    @Override // X.InterfaceC1645280sus
    public final void LIZJ(float f, float f2, int i) {
        C1645320suw c1645320suw = new C1645320suw(this, f, f2, i);
        if (!this.LIZJ) {
            c1645320suw.invoke();
        }
    }
}
