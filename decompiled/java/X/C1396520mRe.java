package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396520mRe extends AbstractC1396720mRy<C1384300m7w> implements Drawable.Callback {
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final boolean LLJJJ = C293660BfA.LIZ();
    public final AbstractC1396720mRy<?> LLJILLL;
    public int LLJJI;
    public C1396540mRg LLJJIJIIJIL;
    public final C1396500mRc LLJJ = new C1396500mRc();
    public final boolean LLJJIII = C444960Hcc.LIZIZ();
    public final Paint LLJJIJI = new Paint(5);

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 20004;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJII() {
        if (LLJJJ) {
            super.LJJII();
            this.LLJJIJI.reset();
            this.LLJJ.LJJII();
        }
    }

    public final boolean LJJJ() {
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        if (c1384300m7w != null) {
            if (c1384300m7w.LJIILJJIL) {
                if (c1384300m7w.LJIIL > 0) {
                    return true;
                }
            } else if (c1384300m7w.LJJI) {
                return true;
            }
        }
        return false;
    }

    public C1396520mRe(AbstractC1396720mRy<?> abstractC1396720mRy) {
        this.LLJILLL = abstractC1396720mRy;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIL(C1384750m8f c1384750m8f) {
        if (!LLJJJ) {
            return;
        }
        this.LLJJ.LJIL(c1384750m8f);
        float fLJI = this.LLJILLL.LJI();
        this.LLILZLL = fLJI;
        this.LLILZIL = this.LLJJ.LLILZIL + fLJI + LLJJIJIL;
        this.LLJJI = (int) ((fLJI - (0.72f * fLJI)) * 0.5f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJI(C1384750m8f c1384750m8f) {
        C1384300m7w c1384300m7w;
        if ((LLJJJ || LJJJ()) && (c1384300m7w = (C1384300m7w) this.LL) != null) {
            C1396540mRg c1396540mRgLIZIZ = C1396610mRn.LIZ.LIZIZ();
            if (c1396540mRgLIZIZ == null) {
                c1396540mRgLIZIZ = new C1396540mRg();
            }
            this.LLJJIJIIJIL = c1396540mRgLIZIZ;
            C1396540mRg c1396540mRg = this.LLJJIJIIJIL;
            if (c1396540mRg != null) {
                c1396540mRg.setCallback(this);
            }
            c1384300m7w.LJJIIJZLJL = new AwS387S0200000_21(this, c1384300m7w, 100);
            if (c1384300m7w.LJJI) {
                C1396540mRg c1396540mRg2 = this.LLJJIJIIJIL;
                if (c1396540mRg2 != null) {
                    c1396540mRg2.LIZIZ(1);
                    return;
                }
                return;
            }
            C1396540mRg c1396540mRg3 = this.LLJJIJIIJIL;
            if (c1396540mRg3 == null) {
                return;
            }
            c1396540mRg3.LIZIZ(2);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1052760dVC c1052760dVC;
        String strLIZIZ;
        boolean z;
        Function0<Unit> function0;
        if (!LLJJJ) {
            return;
        }
        C1052760dVC c1052760dVC2 = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC2 != null) {
            c1052760dVC2.LJIIL = -1056964609;
        }
        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
        if (c1384300m7w != null && (function0 = c1384300m7w.LJJIIJ) != null) {
            function0.invoke();
        }
        C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
        if (c1384300m7w2 != null) {
            C1396540mRg c1396540mRg = this.LLJJIJIIJIL;
            if (c1396540mRg != null && c1396540mRg.LIZ()) {
                z = true;
            } else {
                z = false;
            }
            c1384300m7w2.LJJIII = z;
        }
        C1396540mRg c1396540mRg2 = this.LLJJIJIIJIL;
        if ((c1396540mRg2 != null && c1396540mRg2.LIZ()) || (c1052760dVC = (C1052760dVC) this.LLJJ.LL) == null) {
            return;
        }
        C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
        if (c1384300m7w3 != null) {
            strLIZIZ = C1843500y4a.LIZIZ(c1384300m7w3.LJIIL);
        } else {
            strLIZIZ = null;
        }
        c1052760dVC.LJIIJJI = strLIZIZ;
    }

    @Override // X.AbstractC1396720mRy, X.InterfaceC1396460mRY
    public final int LIZ(float f, float f2) {
        if (LLJJJ && LJJJ()) {
            if (this.LLJJIII) {
                float f3 = this.LLILLJJLI;
                if (f >= f3) {
                    float f4 = f3 + this.LLILZIL;
                    int i = C1396430mRV.LLJJJ;
                    if (f < f4 + (C1396430mRV.LLJJJ / 2)) {
                        C1384300m7w c1384300m7w = (C1384300m7w) this.LL;
                        if (c1384300m7w != null && c1384300m7w.LJJI) {
                            return 2;
                        }
                        return 1;
                    }
                }
            } else {
                float f5 = this.LLILLJJLI;
                int i2 = C1396430mRV.LLJJJ;
                if (f >= f5 - (C1396430mRV.LLJJJ / 2) && f < f5 + this.LLILZIL) {
                    C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
                    if (c1384300m7w2 != null && c1384300m7w2.LJJI) {
                        return 2;
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        C1384300m7w c1384300m7w = (C1384300m7w) abstractC1384320m7y;
        if (LLJJJ) {
            this.LLJJIJI.setFlags(5);
            C1396500mRc c1396500mRc = this.LLJJ;
            C1052760dVC c1052760dVC = new C1052760dVC();
            c1052760dVC.LJIIL = c1384300m7w.LJIJI;
            c1052760dVC.LJIILIIL = null;
            c1052760dVC.LJIIJJI = C1843500y4a.LIZIZ(c1384300m7w.LJIIL);
            c1396500mRc.LL = c1052760dVC;
        }
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
        C1384300m7w c1384300m7w;
        if (!LLJJJ) {
            return;
        }
        if (!LJJJ() && (c1384300m7w = (C1384300m7w) this.LL) != null && !c1384300m7w.LJJIII) {
            return;
        }
        if (this.LLJJIII) {
            C1384300m7w c1384300m7w2 = (C1384300m7w) this.LL;
            if (c1384300m7w2 != null && c1384300m7w2.LJIILJJIL && c1384300m7w2.LJIIL > 0) {
                LJJIL(canvas, c1384750m8f);
            }
            float f = this.LLILLJJLI + this.LLJJ.LLILZIL;
            float f2 = this.LLJJI;
            canvas.translate(f + f2, this.LLILLL + f2);
            LJJIZ(canvas, c1384750m8f);
            return;
        }
        canvas.save();
        float f3 = this.LLILLJJLI;
        float f4 = this.LLJJI;
        canvas.translate(f3 + f4, this.LLILLL + f4);
        LJJIZ(canvas, c1384750m8f);
        canvas.restore();
        C1384300m7w c1384300m7w3 = (C1384300m7w) this.LL;
        if (c1384300m7w3 == null || !c1384300m7w3.LJIILJJIL || c1384300m7w3.LJIIL <= 0) {
            return;
        }
        LJJIL(canvas, c1384750m8f);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJLI(float f, float f2) {
        if (!LLJJJ) {
            return;
        }
        if (this.LLJJIII) {
            this.LLJJ.LJIILLIIL(f, f2);
        } else {
            C1396500mRc c1396500mRc = this.LLJJ;
            c1396500mRc.LJIILLIIL((f + this.LLILZIL) - c1396500mRc.LLILZIL, f2);
        }
    }

    public final void LJJIL(Canvas canvas, C1384750m8f c1384750m8f) {
        C1052760dVC c1052760dVC = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC != null) {
            c1052760dVC.LJIILIIL = -16777216;
        }
        C1052760dVC c1052760dVC2 = (C1052760dVC) this.LLJJ.LL;
        if (c1052760dVC2 != null) {
            c1052760dVC2.LJIIL = Integer.valueOf(C1396380mRQ.LIZ(-1056964609, c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue()));
        }
        this.LLJJ.LIZLLL(canvas, c1384750m8f);
    }

    public final void LJJIZ(Canvas canvas, C1384750m8f c1384750m8f) {
        C1396540mRg c1396540mRg = this.LLJJIJIIJIL;
        if (c1396540mRg != null) {
            c1396540mRg.LJII = c1384750m8f.LJ.LIZLLL;
            c1396540mRg.LJI = c1384750m8f.LJ.LJ;
            float f = this.LLILZLL;
            int i = this.LLJJI;
            c1396540mRg.setBounds(0, 0, (int) (f - (i * 2)), (int) (f - (i * 2)));
        }
        C1396540mRg c1396540mRg2 = this.LLJJIJIIJIL;
        if (c1396540mRg2 != null) {
            c1396540mRg2.LJFF = c1384750m8f.LIZLLL.LIZLLL.invoke(this.LL).intValue();
        }
        C1396540mRg c1396540mRg3 = this.LLJJIJIIJIL;
        if (c1396540mRg3 != null) {
            c1396540mRg3.draw(canvas);
        }
    }
}
