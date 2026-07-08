package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;

/* JADX INFO: renamed from: X.19LU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LU implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C19LU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(C19LU c19lu, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        ViewOnAttachStateChangeListenerC20604515jv specList;
        C420270Gdt c420270Gdt = (C420270Gdt) c19lu.l0;
        if (((C212363188r) c19lu.l1).getNeedScrollBar()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        C786410Ut5.LJLLLLLL(i9, c420270Gdt);
        ViewOnAttachStateChangeListenerC20604515jv specList2 = ((C212363188r) c19lu.l1).getSpecList();
        if (specList2 != null) {
            ((C212363188r) c19lu.l1).e0(specList2);
        }
        if (((C420270Gdt) c19lu.l0).getVisibility() == 0 && (specList = ((C212363188r) c19lu.l1).getSpecList()) != null) {
            specList.removeOnLayoutChangeListener(c19lu);
        }
    }

    public static final void onLayoutChange$1(C19LU c19lu, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer numValueOf;
        PriceTextConfig priceTextConfig;
        PriceTextConfig priceTextConfig2;
        boolean z;
        if (i3 - i != i7 - i5) {
            AnonymousClass1865 anonymousClass1865LJIIL = ((AnonymousClass1862) c19lu.l0).LJIIL();
            AnonymousClass1862 anonymousClass1862 = (AnonymousClass1862) c19lu.l0;
            TuxTextView tuxTextView = anonymousClass1862.LJIIIZ;
            TuxTextView tuxTextView2 = anonymousClass1862.LJIIJ;
            C185I c185i = anonymousClass1862.LJIIJJI;
            if (c185i != null) {
                z = c185i.LJI;
            } else {
                z = false;
            }
            if (anonymousClass1865LJIIL.LJIIIZ(tuxTextView, tuxTextView2, z)) {
                ((ViewGroup) c19lu.l1).requestLayout();
                return;
            }
        }
        AnonymousClass1865 anonymousClass1865LJIIL2 = ((AnonymousClass1862) c19lu.l0).LJIIL();
        AnonymousClass1862 anonymousClass18622 = (AnonymousClass1862) c19lu.l0;
        TuxTextView tuxTextView3 = anonymousClass18622.LJIIIZ;
        TuxTextView tuxTextView4 = anonymousClass18622.LJIIJ;
        AnonymousClass1868 anonymousClass1868 = anonymousClass18622.LJIIL;
        Integer numValueOf2 = null;
        if (anonymousClass1868 != null && (priceTextConfig2 = anonymousClass1868.LJIIIZ) != null) {
            int i9 = priceTextConfig2.font;
            InterfaceC1003930cER.LJIILIIL.getClass();
            numValueOf = Integer.valueOf(C1003920cEQ.LIZ(i9));
        } else {
            numValueOf = null;
        }
        AnonymousClass1868 anonymousClass18682 = ((AnonymousClass1862) c19lu.l0).LJIIL;
        if (anonymousClass18682 != null && (priceTextConfig = anonymousClass18682.LJIIJ) != null) {
            int i10 = priceTextConfig.font;
            InterfaceC1003930cER.LJIILIIL.getClass();
            numValueOf2 = Integer.valueOf(C1003920cEQ.LIZ(i10));
        }
        if (anonymousClass1865LJIIL2.LJI(tuxTextView3, tuxTextView4, numValueOf, numValueOf2)) {
            ((ViewGroup) c19lu.l1).requestLayout();
        }
    }

    public static final void onLayoutChange$2(C19LU c19lu, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Integer numValueOf;
        PriceTextConfig priceTextConfig;
        PriceTextConfig priceTextConfig2;
        C426160GnO c426160GnO;
        boolean z;
        if (i3 - i != i7 - i5) {
            C184Q c184qLJIIL = ((C184R) c19lu.l0).LJIIL();
            C184R c184r = (C184R) c19lu.l0;
            TuxTextView tuxTextView = c184r.LJIIL;
            TuxTextView tuxTextView2 = c184r.LJIILIIL;
            C184S c184s = c184r.LJIILJJIL;
            if (c184s != null) {
                z = c184s.LJFF;
            } else {
                z = false;
            }
            if (c184qLJIIL.LJIIIZ(tuxTextView, tuxTextView2, z)) {
                ((ViewGroup) c19lu.l1).requestLayout();
                return;
            }
        }
        ViewGroup viewGroup = (ViewGroup) c19lu.l1;
        Integer numValueOf2 = null;
        if (!(viewGroup instanceof C426160GnO) || (c426160GnO = (C426160GnO) viewGroup) == null || c426160GnO.getMaxTagCount() < 0) {
            C184Q c184qLJIIL2 = ((C184R) c19lu.l0).LJIIL();
            C184R c184r2 = (C184R) c19lu.l0;
            TuxTextView tuxTextView3 = c184r2.LJIIL;
            TuxTextView tuxTextView4 = c184r2.LJIILIIL;
            C184U c184u = c184r2.LJIILL;
            if (c184u != null && (priceTextConfig2 = c184u.LJII) != null) {
                int i9 = priceTextConfig2.font;
                InterfaceC1003930cER.LJIILIIL.getClass();
                numValueOf = Integer.valueOf(C1003920cEQ.LIZ(i9));
            } else {
                numValueOf = null;
            }
            C184U c184u2 = ((C184R) c19lu.l0).LJIILL;
            if (c184u2 != null && (priceTextConfig = c184u2.LJIIIIZZ) != null) {
                int i10 = priceTextConfig.font;
                InterfaceC1003930cER.LJIILIIL.getClass();
                numValueOf2 = Integer.valueOf(C1003920cEQ.LIZ(i10));
            }
            if (c184qLJIIL2.LJI(tuxTextView3, tuxTextView4, numValueOf, numValueOf2)) {
                ((ViewGroup) c19lu.l1).requestLayout();
            }
        }
    }
}
