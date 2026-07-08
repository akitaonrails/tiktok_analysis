package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754070vkL {
    public final Context LIZ;
    public C1754060vkK LIZIZ;
    public BPEAHandler LIZJ;
    public C1754560vl8 LIZLLL;
    public boolean LJ;
    public InterfaceC1754200vkY LJFF;
    public float LJI;
    public float LJII;
    public long LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public CartBenefitItem LJIIJJI;
    public boolean LJIILJJIL;
    public Function0<? extends View> LJIIJ = AFwS215S0000000_26.get$arr$(483);
    public Function0<Unit> LJIIL = AFwS215S0000000_26.get$arr$(481);
    public final AFwS215S0000000_26 LJIILIIL = AFwS215S0000000_26.get$arr$(482);
    public final ARunnableS126S0100000_26 LJIILL = new ARunnableS126S0100000_26(this, 107);
    public final C1754180vkW LJIILLIIL = new C1149100g0a() { // from class: X.0vkW
        @Override // X.C1149100g0a, X.InterfaceC21462418z0
        public final void LIZ() {
            this.LL.LJIILIIL.getClass();
        }

        @Override // X.C1149100g0a, X.InterfaceC21462418z0
        public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
            abstractC21463118z7.LJJII(this);
            this.LL.LJIIL.invoke();
            this.LL.LJ = false;
        }
    };

    public final void LIZ() {
        C1754060vkK c1754060vkK = this.LIZIZ;
        if (c1754060vkK != null) {
            C12ES.LJIILL(4, c1754060vkK);
            c1754060vkK.LLILLL = false;
            c1754060vkK.LLILZ.cancel();
            ViewGroup viewGroup = c1754060vkK.LLJILJIL;
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(c1754060vkK, viewGroup);
            }
            c1754060vkK.LLJILJIL = null;
            c1754060vkK.LLJILJILJ = null;
        }
        this.LIZIZ = null;
    }

    public final boolean LIZIZ() {
        C1754060vkK c1754060vkK = this.LIZIZ;
        return c1754060vkK != null && true == c1754060vkK.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vkW] */
    public C1754070vkL(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(View view, Float f) {
        C1754060vkK c1754060vkK;
        C1754060vkK c1754060vkK2;
        if (LIZIZ() && !this.LJ) {
            if (view != null && (c1754060vkK2 = this.LIZIZ) != null) {
                c1754060vkK2.setAnchor(view);
            }
            C1754060vkK c1754060vkK3 = this.LIZIZ;
            if (c1754060vkK3 != null && c1754060vkK3.LLILLL) {
                if (c1754060vkK3.LLILZ.isRunning()) {
                    c1754060vkK3.LLILZ.cancel();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1754060vkK3);
                    c1754060vkK3.setAlpha(1.0f);
                }
                c1754060vkK3.LIZIZ();
            }
            if (f != null && f.floatValue() >= 0.0f && f.floatValue() <= 1.0f && (c1754060vkK = this.LIZIZ) != null) {
                float fFloatValue = f.floatValue();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1754060vkK);
                c1754060vkK.setAlpha(fFloatValue);
            }
        }
    }
}
