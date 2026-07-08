package X;

import Y.ARunnableS125S0100000_25;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664250tPT extends AbstractC1664270tPV {
    public final View LIZLLL;
    public final C19670911xj LJ;

    @Override // X.InterfaceC1664320tPa
    public final void LIZ() {
        C19670911xj c19670911xj = this.LJ;
        if (c19670911xj != null) {
            c19670911xj.setProgress(0);
        }
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZLLL() {
        LJI(71);
        LJFF(-1);
    }

    @Override // X.InterfaceC1664320tPa
    public final void LJ() {
        C19670911xj c19670911xj = this.LJ;
        if (c19670911xj != null) {
            c19670911xj.setProgress(100);
        }
        C19670911xj c19670911xj2 = this.LJ;
        if (c19670911xj2 != null) {
            C786410Ut5.H1(c19670911xj2, 8);
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
        C19670911xj c19670911xj = this.LJ;
        if (c19670911xj != null) {
            HandlerHook.viewPostDelay(c19670911xj, new ARunnableS125S0100000_25(this, 21), 500);
        }
    }

    public C1664250tPT(View view, C19670911xj c19670911xj) {
        super(view);
        this.LIZLLL = view;
        this.LJ = c19670911xj;
    }
}
