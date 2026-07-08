package X;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187Q extends AbstractC19677311yl {
    public boolean LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public C184F LJIILLIIL;
    public float LJIIZILJ;
    public final float LJIJ;
    public boolean LJIJI;
    public final int LJIJJ;

    @Override // X.C187I
    public final int LJIILJJIL() {
        return 4;
    }

    @Override // X.C187I
    public final boolean LJIIZILJ() {
        return this.LJIIL && AbstractC212220183e.LJII(LJJII()) && !LJIJ();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    public final LinearLayout LJJII() {
        return (LinearLayout) this.LJIILIIL.getValue();
    }

    @Override // X.C187I
    public final Animator LJIIL() {
        return AnonymousClass1888.LIZIZ(LJJII(), this.LJIJJ);
    }

    @Override // X.C187I
    public final Animator LJIILIIL() {
        return LJJ(LJJIFFI(), LJJII());
    }

    @Override // X.C187I
    public final void LJIJJLI(boolean z) {
        if (this.LJIIL) {
            AbstractC212220183e.LJIIIZ(LJJII(), z);
        }
        if (!z) {
            this.LJIILLIIL = null;
        }
    }

    public C187Q(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 678));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 677));
        this.LJIILL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 676));
        this.LJIIZILJ = C418440Gaw.LIZIZ(52);
        this.LJIJ = C418440Gaw.LIZIZ(22);
        this.LJIJI = true;
        this.LJIIL = LJIILL(R.id.yct);
        this.LJIJJ = this.LIZLLL.getResources().getDimensionPixelOffset(R.dimen.uj);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    @Override // X.C187I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C187N LJIL(long r19, java.util.List<android.animation.Animator> r21) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187Q.LJIL(long, java.util.List):X.187N");
    }
}
