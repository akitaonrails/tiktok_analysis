package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import mr0.r0;

/* JADX INFO: renamed from: X.0f22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111560f22<MODEL extends r0<? extends AbstractC1136060ffY>> extends AbstractC1111540f20<MODEL, C1111050f1D<MODEL>> {
    public final boolean LJI;

    @Override // X.AbstractC1111810f2R
    public final String LJIIJ() {
        return "common";
    }

    @Override // X.AbstractC1111810f2R
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC1111810f2R
    public final int LJIIIIZZ() {
        return LJIIJJI().LIZLLL ? R.layout.hk6 : R.layout.hk5;
    }

    public C1111560f22(boolean z) {
        this.LJI = z;
    }

    @Override // X.AbstractC1111810f2R
    public final AbstractC1111020f1A LJIILJJIL(View view) {
        return new C1111050f1D(view, LJIIZILJ(view), this.LJI, LJIIJJI().LIZLLL, false, LJIIJJI().LJI);
    }
}
