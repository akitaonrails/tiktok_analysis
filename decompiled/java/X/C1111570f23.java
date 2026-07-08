package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111570f23 extends AbstractC1111540f20<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> {
    public final boolean LJI;

    @Override // X.AbstractC1111810f2R
    public final int LJIIIIZZ() {
        return R.layout.gg0;
    }

    @Override // X.AbstractC1111810f2R
    public final String LJIIJ() {
        return "extended_common";
    }

    @Override // X.AbstractC1111810f2R
    public final boolean LJIIL() {
        return true;
    }

    public C1111570f23(boolean z) {
        this.LJI = z;
    }

    @Override // X.AbstractC1111810f2R
    public final AbstractC1111020f1A LJIILJJIL(View view) {
        return new C1111050f1D(view, LJIIZILJ(view), this.LJI, LJIIJJI().LIZLLL, true, true);
    }
}
