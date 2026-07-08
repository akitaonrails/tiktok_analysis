package X;

import Y.ARunnableS125S0100000_25;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664260tPU extends AbstractC1664270tPV {
    public final View LIZLLL;
    public final C19670811xi LJ;

    @Override // X.InterfaceC1664320tPa
    public final void LIZ() {
        C19670811xi c19670811xi = this.LJ;
        if (c19670811xi != null) {
            c19670811xi.setProgress(0);
        }
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZLLL() {
        LJI(71);
        LJFF(-1);
    }

    @Override // X.InterfaceC1664320tPa
    public final void LJ() {
        C19670811xi c19670811xi = this.LJ;
        if (c19670811xi != null) {
            c19670811xi.setProgress(100);
        }
        C19670811xi c19670811xi2 = this.LJ;
        if (c19670811xi2 != null) {
            C786410Ut5.G1(c19670811xi2, 8);
        }
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZIZ(boolean z) {
        if (z) {
            LJI(72);
            LJFF(-1);
        }
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZJ(AwS604S0100000_25 awS604S0100000_25) {
        awS604S0100000_25.invoke(500);
        C19670811xi c19670811xi = this.LJ;
        if (c19670811xi != null) {
            HandlerHook.viewPostDelay(c19670811xi, new ARunnableS125S0100000_25(this, 97), 500);
        }
    }

    public C1664260tPU(View view, C19670811xi c19670811xi) {
        super(view);
        this.LIZLLL = view;
        this.LJ = c19670811xi;
    }
}
