package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212325187f extends AbstractC19677211yk {
    public final int LJIIJJI;
    public boolean LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public boolean LJIILLIIL;
    public AtmosphereTag LJIIZILJ;
    public float LJIJ;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 4;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIL && C185J.LJI(LJJII()) && !LJIIZILJ();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    public final FrameLayout LJJII() {
        return (FrameLayout) this.LJIILIIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJII(), this.LJIIJJI);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJIL(LJJIFFI(), LJJII());
    }

    @Override // X.AbstractC19677211yk
    public final int LJJ() {
        return this.LJIIJJI;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIL) {
            C185J.LJIIIIZZ(LJJII(), z);
        }
        if (!z) {
            this.LJIIZILJ = null;
        }
    }

    public C212325187f(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIJJI = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.ui);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 539));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 537));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 535));
        this.LJIILLIIL = true;
        this.LJIJ = C418440Gaw.LIZIZ(56);
        this.LJIIL = LJIILJJIL(R.id.ycs);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    @Override // X.C187K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187X LJIJJLI(long r18, java.util.List<android.animation.Animator> r20) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212325187f.LJIJJLI(long, java.util.List):X.187X");
    }
}
