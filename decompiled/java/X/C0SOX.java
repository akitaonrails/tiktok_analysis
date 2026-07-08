package X;

import Y.AAListenerS263S0200000_11;
import Y.AAListenerS322S0100000_11;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SOX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SOX extends AbstractC720520SOc {
    public final EnumC707300Rom LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final /* synthetic */ C0SOW LJI;

    @Override // X.AbstractC720520SOc
    public int LIZIZ() {
        return this.LIZ ? R.drawable.cwr : R.drawable.bbo;
    }

    @Override // X.AbstractC720520SOc
    public int LJ() {
        return this.LJI.LIZIZ();
    }

    @Override // X.AbstractC720520SOc
    public void LJIIIIZZ() {
        if (this.LJI.getLeftBoundPos() == 0) {
            LJIILL(0);
        } else {
            LJIJ(this.LJI.getLeftBoundPos());
        }
        if (this.LJI.getRightBoundPos() == this.LJI.getLastRealPos()) {
            LJIILL(this.LJI.getLastRealPos());
        } else {
            LJIJ(this.LJI.getRightBoundPos());
        }
    }

    @Override // X.AbstractC720520SOc
    public void LJIIL() {
        int i = this.LJI.LLILZIL;
        long j = C0SOW.LLJJIJIIJIL;
        LJIIJJI(i, j);
        LJIIJ(this.LJI.LLILZ - 1, j);
        C0SOW c0sow = this.LJI;
        c0sow.LLILZ--;
        c0sow.LLILZIL--;
    }

    @Override // X.AbstractC720520SOc
    public void LJIILIIL() {
        int i = this.LJI.LLILZIL;
        long j = C0SOW.LLJJIJIIJIL;
        LJIIJJI(i, j);
        LJIIJ(this.LJI.LLILZ + 1, j);
        C0SOW c0sow = this.LJI;
        c0sow.LLILZ++;
        c0sow.LLILZIL++;
    }

    public int LJIILLIIL() {
        return this.LIZ ? R.drawable.crv : R.drawable.bbp;
    }

    @Override // X.AbstractC720520SOc
    public void LJI() {
        int iLJIIZILJ = LJIIZILJ();
        boolean z = this.LJI.getLeftBoundPos() > 0;
        int i = this.LJI.LLILZ;
        long j = C0SOW.LLJJIJIIJIL;
        LJIIJJI(i, j);
        C0SOW c0sow = this.LJI;
        c0sow.LLILZ--;
        int i2 = c0sow.LLILZIL;
        if (i2 > iLJIIZILJ || !z) {
            c0sow.LLILZIL = i2 - 1;
        } else {
            c0sow.LJIIJ(false);
            LJIIIIZZ();
        }
        LJIIJ(this.LJI.LLILZ, j);
    }

    @Override // X.AbstractC720520SOc
    public void LJII() {
        int iLIZJ = (LIZJ() - 1) - LJIIZILJ();
        boolean z = this.LJI.getLastRealPos() - this.LJI.getRightBoundPos() > 0;
        int i = this.LJI.LLILZ;
        long j = C0SOW.LLJJIJIIJIL;
        LJIIJJI(i, j);
        C0SOW c0sow = this.LJI;
        c0sow.LLILZ++;
        int i2 = c0sow.LLILZIL;
        if (i2 < iLIZJ || !z) {
            c0sow.LLILZIL = i2 + 1;
        } else {
            c0sow.LJIIJ(true);
            LJIIIIZZ();
        }
        LJIIJ(this.LJI.LLILZ, j);
    }

    @Override // X.AbstractC720520SOc
    public float LIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC720520SOc
    public int LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC720520SOc
    public EnumC707300Rom LIZLLL() {
        return this.LIZJ;
    }

    public int LJIIZILJ() {
        return this.LJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SOX(C0SOW c0sow) {
        super(c0sow);
        this.LJI = c0sow;
        this.LIZJ = EnumC707300Rom.DEFAULT;
        this.LIZLLL = 6;
        this.LJ = 1;
        this.LJFF = 0.6f;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[LOOP:1: B:48:0x00f6->B:49:0x00f8, LOOP_END] */
    @Override // X.AbstractC720520SOc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJFF(int r7) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SOX.LJFF(int):void");
    }

    public void LJIILL(int i) {
        if (i >= 0 && i < this.LJI.LLIZ.size()) {
            C0SOW c0sow = this.LJI;
            c0sow.LJII((ImageView) ListProtector.get(c0sow.LLIZ, i));
            C786410Ut5.V4((ImageView) ListProtector.get(this.LJI.LLIZ, i), LIZ());
        }
    }

    public void LJIJ(int i) {
        if (i >= 0 && i < this.LJI.LLIZ.size()) {
            C786410Ut5.V4((ImageView) ListProtector.get(this.LJI.LLIZ, i), LIZ());
            ((ImageView) ListProtector.get(this.LJI.LLIZ, i)).setImageResource(LJIILLIIL());
        }
    }

    @Override // X.AbstractC720520SOc
    public void LJIIJ(int i, long j) {
        ImageView imageViewLIZLLL = this.LJI.LIZLLL(i);
        if (imageViewLIZLLL == null) {
            return;
        }
        this.LJI.LJII(imageViewLIZLLL);
        if (C04WZ.LIZ()) {
            C786410Ut5.V4(imageViewLIZLLL, 1.0f);
            return;
        }
        C786410Ut5.V4(imageViewLIZLLL, LIZ());
        Animator animator = this.LJI.LLJILJIL;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZLLL, "alpha", LIZ(), 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new AAListenerS322S0100000_11(imageViewLIZLLL, 15));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LJI.LLJILJIL = objectAnimatorOfFloat;
    }

    @Override // X.AbstractC720520SOc
    public void LJIIJJI(int i, long j) {
        ImageView imageViewLIZLLL = this.LJI.LIZLLL(i);
        if (imageViewLIZLLL == null) {
            return;
        }
        this.LJI.LJII(imageViewLIZLLL);
        if (C04WZ.LIZ()) {
            C786410Ut5.V4(imageViewLIZLLL, LIZ());
            return;
        }
        C786410Ut5.V4(imageViewLIZLLL, 1.0f);
        Animator animator = this.LJI.LLJILJILJ;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZLLL, "alpha", 1.0f, LIZ());
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new AAListenerS263S0200000_11(imageViewLIZLLL, this, 1));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LJI.LLJILJILJ = objectAnimatorOfFloat;
    }
}
