package X;

import Y.ACListenerS152S0100000_17;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0g0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148920g0I extends AbstractC1149030g0T {
    public final View LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final InterfaceC1149050g0V LLILZIL;
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public C16F5 LLIZLLLIL;
    public ImageView LLJ;
    public C16F5 LLJI;
    public ImageView LLJIJIL;
    public View LLJILJIL;
    public final long LLJILJILJ;
    public C1148910g0H LLJILLL;

    public final void L5() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        if (this.LLILZ) {
            P5(this.LLJILLL);
        } else {
            N5();
        }
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LLFFF(this.LLJIJIL);
        ImageView imageView = this.LLIZ;
        if (imageView != null && (viewPropertyAnimatorAnimate = imageView.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(this.LLJILJILJ)) != null) {
            duration.start();
        }
        C500260Jjc.LJIILIIL(this.LLJILJIL);
    }

    public final void N5() {
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        C16F5 c16f52 = this.LLIZLLLIL;
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        }
        ImageView imageView = this.LLJ;
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
    }

    @Override // X.AbstractC1149030g0T
    public final void I5(C1148910g0H c1148910g0H) {
        String strLJIJI;
        this.LLJILLL = c1148910g0H;
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            int i = C1148890g0F.LIZ[c1148910g0H.LJ.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        strLJIJI = "";
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131841870);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131843763);
                }
            } else if (c1148910g0H.LJI) {
                strLJIJI = C497740JfY.LJIJI(2131843763);
            } else {
                strLJIJI = c1148910g0H.LIZ;
            }
            c16f5.setText(strLJIJI);
        }
        C0JSS.LJFF(this.LLIZ, c1148910g0H.LIZIZ, R.drawable.et9, new C0IYA() { // from class: X.0fPM
            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZ() {
                C20441214yg.LIZ("onLoadStarted");
            }

            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZLLL(String str, Exception exc) {
                C20441214yg.LIZ("onLoadFailed");
            }

            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str) {
                C20441214yg.LIZ("onLoadSuccess");
            }
        });
        if (this.LLILLL) {
            ImageView imageView = this.LLJIJIL;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.eus);
            }
            if (c1148910g0H.LJI) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0g0M
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C766270U4b.LIZLLL(2131841954);
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("edit_featured_area_toast_show");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII("unavailable", "toast_message_content");
                        C1129850fVX.LIZ(c474500IjALIZ);
                        c474500IjALIZ.LIZ();
                    }
                }, this.LLILLJJLI);
            }
            ImageView imageView2 = this.LLJIJIL;
            if (imageView2 != null) {
                C786410Ut5.Q7(imageView2, new ACListenerS152S0100000_17(this, 184));
            }
        } else {
            if (c1148910g0H.LJII) {
                ImageView imageView3 = this.LLJIJIL;
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.eur);
                }
            } else {
                ImageView imageView4 = this.LLJIJIL;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.euq);
                }
            }
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 185), this.LLILLJJLI);
        }
        P5(c1148910g0H);
        if (c1148910g0H.LJI) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            ImageView imageView5 = this.LLIZ;
            if (imageView5 != null) {
                imageView5.setColorFilter(colorMatrixColorFilter);
            }
            N5();
            return;
        }
        ImageView imageView6 = this.LLIZ;
        if (imageView6 != null) {
            imageView6.setColorFilter((ColorFilter) null);
        }
        P5(this.LLJILLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (X.C123100dR.LIZ(r0) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.C1148910g0H r5) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1148920g0I.P5(X.0g0H):void");
    }

    public C1148920g0I(View view, boolean z, boolean z2, InterfaceC1149050g0V interfaceC1149050g0V) {
        super(view);
        this.LLILLJJLI = view;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = interfaceC1149050g0V;
        this.LLJILJILJ = 150L;
        C500260Jjc.LLFFF(view);
        this.LLILZLL = (C16F5) view.findViewById(R.id.p6q);
        this.LLIZ = (ImageView) view.findViewById(R.id.p6p);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.p6n);
        this.LLJ = (ImageView) view.findViewById(R.id.e3l);
        this.LLJI = (C16F5) view.findViewById(R.id.t19);
        this.LLJIJIL = (ImageView) view.findViewById(R.id.uki);
        this.LLJILJIL = view.findViewById(R.id.ulz);
    }
}
