package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SOT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOT extends C0SOW {
    public AbstractC720520SOc LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    private final float getBoundarySecondarySizePx() {
        return C339190DRl.LIZ(this.LLJJL);
    }

    private final float getBoundarySmallSizePx() {
        return C339190DRl.LIZ(this.LLJJJJLIIL);
    }

    private final float getRegularSizePx() {
        return C339190DRl.LIZ(this.LLJJJJJIL);
    }

    @Override // X.C0SOW
    public final void LJIIL() {
        int iLIZ = (int) C11VU.LIZ(this.LLJJJJ);
        int iLIZ2 = (int) C11VU.LIZ(66.0f);
        setPadding(iLIZ2, iLIZ, iLIZ2, iLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SOT.LJIILL():void");
    }

    public final void LJIILLIIL() {
        if (this.LLJL) {
            setDotSize(getMaxDotSizePx());
            setMargin(C341940Daq.LIZ(this.LLJJLIIIJLLLLLLLZ));
            if (this.LLILZLL > 1) {
                getLayoutParams().width = getLayoutManager().LJ();
                getLayoutParams().height = this.LLJ ? -2 : this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
                int i = this.LLILZLL;
                for (int i2 = 0; i2 < i; i2++) {
                    ImageView imageViewLIZLLL = LIZLLL(i2);
                    if (imageViewLIZLLL != null) {
                        ViewGroup.LayoutParams layoutParams = imageViewLIZLLL.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        int i3 = this.LLILLJJLI;
                        layoutParams2.width = i3;
                        layoutParams2.height = i3;
                        C786410Ut5.W5(imageViewLIZLLL, layoutParams2);
                    }
                }
                requestLayout();
            }
            LJIILL();
        }
    }

    public final int getNoStrokeDotBg() {
        return this.LLJJJIL ? R.drawable.cwq : R.drawable.bbo;
    }

    private final int getMaxDotSizePx() {
        return (int) Math.max(Math.max(getRegularSizePx(), getBoundarySmallSizePx()), getBoundarySecondarySizePx());
    }

    public final float getBoundarySecondaryDotSizeDp() {
        return this.LLJJL;
    }

    public final float getBoundarySmallDotSizeDp() {
        return this.LLJJJJLIIL;
    }

    public final float getDotSpacingDp() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0SOW
    public AbstractC720520SOc getLayoutManager() {
        return this.LLJJJ;
    }

    public final float getPaddingVerticalOut() {
        return this.LLJJJJ;
    }

    public final float getRegularDotSizeDp() {
        return this.LLJJJJJIL;
    }

    public final boolean getUseDarkColor() {
        return this.LLJJJIL;
    }

    @Override // X.C0SOW
    public final ImageView LIZJ(int i) {
        ImageView imageViewLIZJ = super.LIZJ(i);
        if (C07CO.LIZIZ()) {
            imageViewLIZJ.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        return imageViewLIZJ;
    }

    @Override // X.C0SOW, X.C0SC9
    public void setCount(int i) {
        super.setCount(i);
        if (i > 1 && this.LLJL) {
            LJIILL();
        }
    }

    @Override // X.C0SOW
    public void setLayoutManager(AbstractC720520SOc abstractC720520SOc) {
        this.LLJJJ = abstractC720520SOc;
    }

    @Override // X.C0SOW
    public void setLayoutManager$post_mode_release(EnumC707300Rom enumC707300Rom) {
        AbstractC720520SOc c720510SOb;
        if (getLayoutManager().LIZLLL() == enumC707300Rom) {
            return;
        }
        int i = C707320Roo.LIZ[enumC707300Rom.ordinal()];
        if (i == 1 || i != 2) {
            c720510SOb = new C720510SOb(this);
        } else {
            c720510SOb = new C0SOZ() { // from class: X.0SOa
                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final float LIZ() {
                    return 0.32f;
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final int LIZJ() {
                    return 7;
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final int LIZIZ() {
                    return this.LJIIJJI.getUseDarkColor() ? R.drawable.cwq : R.drawable.bbo;
                }

                @Override // X.C0SOZ, X.C0SOX
                public final int LJIILLIIL() {
                    C0SOT c0sot = this.LJIIJJI;
                    return c0sot.LLJL ? c0sot.getNoStrokeDotBg() : c0sot.getUseDarkColor() ? R.drawable.cws : R.drawable.bbp;
                }

                @Override // X.C0SOZ
                public final int LJIJI() {
                    C0SOT c0sot = this.LJIIJJI;
                    return c0sot.LLJL ? c0sot.getNoStrokeDotBg() : c0sot.getUseDarkColor() ? R.drawable.crx : R.drawable.crw;
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final void LJI() {
                    super.LJI();
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final void LJII() {
                    super.LJII();
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final void LJIIIIZZ() {
                    super.LJIIIIZZ();
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX, X.AbstractC720520SOc
                public final void LJIIL() {
                    super.LJIIL();
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX, X.AbstractC720520SOc
                public final void LJIILIIL() {
                    super.LJIILIIL();
                    this.LJIIJJI.LJIILL();
                }

                {
                    super(this.LJIIJJI);
                }

                @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
                public final void LJFF(int i2) {
                    super.LJFF(i2);
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX
                public final void LJIILL(int i2) {
                    super.LJIILL(i2);
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX
                public final void LJIJ(int i2) {
                    super.LJIJ(i2);
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOZ
                public final void LJIJJ(int i2) {
                    super.LJIJJ(i2);
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX, X.AbstractC720520SOc
                public final void LJIIJ(int i2, long j) {
                    super.LJIIJ(i2, j);
                    this.LJIIJJI.LJIILL();
                }

                @Override // X.C0SOX, X.AbstractC720520SOc
                public final void LJIIJJI(int i2, long j) {
                    super.LJIIJJI(i2, j);
                    this.LJIIJJI.LJIILL();
                }
            };
        }
        setLayoutManager(c720510SOb);
        LJIILL();
    }

    public final void setPaddingVerticalOut(float f) {
        float f2 = this.LLJJJJ;
        this.LLJJJJ = f;
        if (f != f2) {
            LJIIL();
        }
    }

    public final void setUseDarkColor(boolean z) {
        this.LLJJJIL = z;
    }

    public C0SOT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJ = new C720510SOb(this);
        this.LLJJJIL = true;
        this.LLJJJJ = 10.0f;
        this.LLJJJJJIL = 6.0f;
        this.LLJJJJLIIL = 6.0f;
        this.LLJJL = 6.0f;
        this.LLJJLIIIJLLLLLLLZ = 6.0f;
        if (C07CO.LIZIZ()) {
            LJIILLIIL();
        }
    }
}
