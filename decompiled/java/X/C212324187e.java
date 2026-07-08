package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212324187e extends AbstractC19677211yk {
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public AtmosphereTag LJIILL;
    public float LJIILLIIL;
    public final float LJIIZILJ;
    public boolean LJIJ;
    public final int LJIJI;

    @Override // X.C187K
    public final int LJIILIIL() {
        return 4;
    }

    @Override // X.C187K
    public final boolean LJIILLIIL() {
        return this.LJIIJJI && C185J.LJI(LJJII()) && !LJIIZILJ();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIILIIL.getValue();
    }

    public final LinearLayout LJJII() {
        return (LinearLayout) this.LJIIL.getValue();
    }

    @Override // X.C187K
    public final Animator LJIIJJI() {
        return AnonymousClass1889.LIZIZ(LJJII(), this.LJIJI);
    }

    @Override // X.C187K
    public final Animator LJIIL() {
        return LJIL(LJJIFFI(), LJJII());
    }

    @Override // X.AbstractC19677211yk
    public final int LJJ() {
        return this.LJIJI;
    }

    @Override // X.C187K
    public final void LJIJJ(boolean z) {
        if (this.LJIIJJI) {
            C185J.LJIIIIZZ(LJJII(), z);
        }
        if (!z) {
            this.LJIILL = null;
        }
    }

    public C212324187e(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 545));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 543));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 541));
        this.LJIILLIIL = C418440Gaw.LIZIZ(52);
        this.LJIIZILJ = C418440Gaw.LIZIZ(22);
        this.LJIJ = true;
        this.LJIIJJI = LJIILJJIL(R.id.yct);
        this.LJIJI = this.LIZJ.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    @Override // X.C187K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187X LJIJJLI(long r19, java.util.List<android.animation.Animator> r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212324187e.LJIJJLI(long, java.util.List):X.187X");
    }
}
