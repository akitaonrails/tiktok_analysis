package X;

import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SOZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SOZ extends C0SOX {
    public final EnumC707300Rom LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final /* synthetic */ C0SOW LJIIJ;

    @Override // X.C0SOX, X.AbstractC720520SOc
    public float LIZ() {
        return this.LIZ ? 0.17f : 0.6f;
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public int LIZIZ() {
        return this.LIZ ? R.drawable.cwr : R.drawable.bbo;
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public void LJIIIIZZ() {
        if (this.LJIIJ.getLeftBoundPos() == 0) {
            LJIILL(0);
            LJIILL(1);
        } else {
            LJIJ(this.LJIIJ.getLeftBoundPos());
            LJIJJ(this.LJIIJ.getLeftBoundPos() + 1);
        }
        if (this.LJIIJ.getRightBoundPos() == this.LJIIJ.getLastRealPos()) {
            LJIILL(this.LJIIJ.getRightBoundPos());
            LJIILL(this.LJIIJ.getRightBoundPos() - 1);
        } else {
            LJIJ(this.LJIIJ.getRightBoundPos());
            LJIJJ(this.LJIIJ.getRightBoundPos() - 1);
        }
    }

    @Override // X.C0SOX
    public int LJIILLIIL() {
        return this.LIZ ? R.drawable.crv : R.drawable.cry;
    }

    public int LJIJI() {
        return this.LIZ ? R.drawable.cru : R.drawable.crw;
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public void LJI() {
        super.LJI();
        LJIILL(this.LJIIJ.getLeftBoundPos() + 2);
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public void LJII() {
        super.LJII();
        LJIILL(this.LJIIJ.getRightBoundPos() - 2);
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public int LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public EnumC707300Rom LIZLLL() {
        return this.LJII;
    }

    @Override // X.C0SOX
    public final int LJIIZILJ() {
        return this.LJIIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SOZ(C0SOW c0sow) {
        super(c0sow);
        this.LJIIJ = c0sow;
        this.LJII = EnumC707300Rom.SLIDE;
        this.LJIIIIZZ = 7;
        this.LJIIIZ = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[LOOP:1: B:28:0x006f->B:30:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    @Override // X.C0SOX, X.AbstractC720520SOc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJFF(int r6) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SOZ.LJFF(int):void");
    }

    public void LJIJJ(int i) {
        if (i >= 0 && i < this.LJIIJ.LLIZ.size()) {
            C786410Ut5.V4((ImageView) ListProtector.get(this.LJIIJ.LLIZ, i), LIZ());
            ((ImageView) ListProtector.get(this.LJIIJ.LLIZ, i)).setImageResource(LJIJI());
        }
    }
}
