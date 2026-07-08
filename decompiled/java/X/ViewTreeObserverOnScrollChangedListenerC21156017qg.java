package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallAndroidConfigSettings;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS25S1110000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.17qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class ViewTreeObserverOnScrollChangedListenerC21156017qg extends AbstractC21154817qU implements ViewTreeObserver.OnScrollChangedListener, View.OnAttachStateChangeListener, InterfaceC1768080w6w {
    public final View LLJILJILJ;
    public final View LLJILLL;
    public final String LLJJ;
    public C1772770wEV LLJJI;
    public C2252611DEt LLJJIII;
    public final int[] LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public long LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public final Rect LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final Rect LLJLIL;
    public float LLJLILLLLZIIL;
    public boolean LLJLL;
    public final long LLJLLIL;

    @Override // X.InterfaceC1768080w6w
    public final void LIZJ() {
        this.LLJLL = false;
        new AwS576S0100000_32(this, 723);
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJI() {
        new AwS576S0100000_32(this, 720);
        LJIL(false);
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILL() {
        C2252611DEt c2252611DEt = this.LLJJIII;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        this.LLJJIII = null;
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILLIIL() {
        C1772770wEV c1772770wEV = this.LLJJI;
        if (c1772770wEV != null) {
            c1772770wEV.release();
        }
        this.LLJJI = null;
    }

    public final void LJIJJLI() {
        if (this.LLJILJIL.getVisibility() == 0) {
            float y = (this.LLJILJIL.getY() - this.LLJJJJLIIL) - this.LLJLILLLLZIIL;
            if (y >= 0.0f) {
                if (this.LLJJL) {
                    this.LLJJL = false;
                    Rect rect = this.LLJJLIIIJLLLLLLLZ;
                    rect.top = 0;
                    this.LLJILJIL.setClipBounds(rect);
                    return;
                }
                return;
            }
            this.LLJJL = true;
            Rect rect2 = this.LLJJLIIIJLLLLLLLZ;
            int i = -((int) y);
            rect2.top = i;
            if (!this.LLJL) {
                if (i > rect2.bottom) {
                    this.LLJILJIL.setClipBounds(this.LLJLIL);
                } else {
                    this.LLJILJIL.setClipBounds(rect2);
                }
            }
            Rect rect3 = this.LLJJLIIIJLLLLLLLZ;
            this.LLJL = rect3.top > rect3.bottom;
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        if (!this.LLJJJJJIL) {
            if (this.LLJILJIL.getVisibility() == 0) {
                C786410Ut5.g2(this.LLJILJIL, 8);
            }
        } else {
            if (this.LLJLL) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.LLJJJJ < this.LLJLLIL) {
                return;
            }
            this.LLJJJJ = jElapsedRealtime;
            LJJ(false, true);
        }
    }

    @Override // X.InterfaceC1768080w6w
    public final void LIZ(boolean z) {
        if (this.LLILZLL) {
            return;
        }
        new AwS148S0110000_32(this, z, 10);
        if (this.LLJJIII != null && z) {
            new AwS576S0100000_32(this, 721);
            C324990Cob.LIZIZ(this.LLJJIII);
            this.LLJJIII = null;
        }
    }

    @Override // X.AbstractC21154817qU, X.InterfaceC21155017qW
    public final boolean LIZIZ(Rect rect) {
        if (!this.LLILZIL || this.LLILZLL) {
            return false;
        }
        int[] iArr = new int[2];
        this.LLJILJIL.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return rect.intersects(i, i2, this.LLJILJIL.getMeasuredWidth() + i, this.LLJILJIL.getMeasuredHeight() + i2);
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJ(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLL = z;
        new AwS576S0100000_32(this, 722);
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIJ(boolean z) {
        new AwS148S0110000_32(this, z, 9);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C21158417r4(this, null), 3);
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILJJIL(ConstraintLayout constraintLayout) {
        this.LL.LIZLLL.M4(this);
        if (!this.LLILLL.LJIILIIL) {
            ViewTreeObserver viewTreeObserver = this.LLILZ.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnScrollChangedListener.class);
            }
            this.LLILZ.removeOnAttachStateChangeListener(this);
        }
        C786410Ut5.LJJLI(this.LLJILJIL, constraintLayout);
        C786410Ut5.LJJLI(this.LLJILLL, constraintLayout);
    }

    public final void LJIL(boolean z) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C594570NTr(this, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(android.view.View r6) {
        /*
            r5 = this;
            java.lang.String r4 = r5.LJIILIIL()
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L3c
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto L3c
            java.lang.String r0 = r5.LLJJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "bubble_anchor_tag_"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r4, r0, r3)
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallAndroidConfigSettings$EcMixMallAndroidConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallAndroidConfigSettings.LIZIZ
            int r0 = r0.bubbleFindParentMaxDepth
            if (r0 <= 0) goto L3c
            int r1 = r5.LJIIJJI(r0)
            X.17pX r0 = new X.17pX
            r0.<init>(r5, r4, r1)
            if (r1 < 0) goto L3c
            java.lang.String r0 = java.lang.String.valueOf(r1)
            boolean r0 = kotlin.text.u.LJIIZILJ(r4, r0, r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3c
        L3b:
            r3 = 1
        L3c:
            kotlin.jvm.internal.AwS25S1110000_32 r1 = new kotlin.jvm.internal.AwS25S1110000_32
            r0 = 0
            r1.<init>(r5, r4, r3, r0)
            if (r3 == 0) goto L45
            return
        L45:
            r5.LLJJJJJIL = r2
            r5.LJIL(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnScrollChangedListenerC21156017qg.onViewAttachedToWindow(android.view.View):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        String strLJIILIIL = LJIILIIL();
        boolean z = true;
        if (strLJIILIIL == null || a0.LJJJIL(strLJIILIIL) || !Intrinsics.LJFF(strLJIILIIL, this.LLJJ)) {
            z = false;
        }
        new AwS25S1110000_32(this, strLJIILIIL, z, 1);
        if (!z) {
            return;
        }
        this.LLJJJJJIL = false;
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIIIZZ(int i, boolean z) {
        float f;
        if (z) {
            f = i;
        } else {
            f = 0.0f;
        }
        this.LLJLILLLLZIIL = f;
    }

    public final void LJJ(boolean z, boolean z2) {
        boolean z3;
        C20516615Pw.LIZ(this.LLILZ, this.LLJJIJI, Boolean.valueOf(this.LLJ), Integer.valueOf(this.LLJI));
        int[] iArr = this.LLJJIJI;
        float f = (iArr[1] - this.LLJJIJIL) + this.LLJJJIL;
        float f2 = (iArr[0] - this.LLJJIJIIJIL) + this.LLJJJ;
        if (this.LLJILJIL.getTranslationY() == f) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = !z3;
        if (z4 || this.LLJILJIL.getTranslationX() != f2 || z) {
            if (z2 && this.LLIZ && this.LLJILJIL.getVisibility() != 0) {
                C786410Ut5.g2(this.LLJILJIL, 0);
            }
            C1771930wD9 c1771930wD9 = this.LLJILJIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9);
            c1771930wD9.setTranslationY(f);
            C20516615Pw.LIZLLL(this.LLJILJIL, f2);
            if (z4 || z) {
                LJIJJLI();
            }
        }
    }

    public ViewTreeObserverOnScrollChangedListenerC21156017qg(C1771760wCs c1771760wCs, C21156817qo c21156817qo, C21156217qi c21156217qi, View view, View view2) {
        super(c1771760wCs, c21156817qo, c21156217qi, view);
        this.LLJILJILJ = view2;
        View view3 = new View(view.getContext());
        view3.setId(view3.hashCode());
        C786410Ut5.LJLLLLLL(4, view3);
        this.LLJILLL = view3;
        this.LLJJ = LJIILIIL();
        this.LLJJIJI = new int[2];
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = new Rect();
        this.LLJLIL = new Rect(-1, -1, 0, 0);
        this.LLJLLIL = EcMixMallAndroidConfigSettings.LIZIZ.bubbleRefreshFrameInterval;
        c1771760wCs.LIZLLL.L4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC21154817qU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(androidx.constraintlayout.widget.ConstraintLayout r32, int r33, final kotlin.jvm.internal.AwS681S0100000_32 r34, final kotlin.jvm.internal.AwS576S0100000_32 r35, final kotlin.jvm.internal.AwS169S0101000_32 r36) {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnScrollChangedListenerC21156017qg.LJIIZILJ(androidx.constraintlayout.widget.ConstraintLayout, int, kotlin.jvm.internal.AwS681S0100000_32, kotlin.jvm.internal.AwS576S0100000_32, kotlin.jvm.internal.AwS169S0101000_32):void");
    }
}
