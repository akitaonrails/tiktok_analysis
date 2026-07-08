package X;

import X.AbstractC1066304Ez;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;

/* JADX INFO: renamed from: X.0w11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1764410w11<VO extends AbstractC1066304Ez> extends AbstractC1764400w10<VO> {
    public boolean LLJI;

    public final void LJIIJJI() {
        this.LLILLL = false;
        C04CN c04cn = this.LLJ;
        if (c04cn != null) {
            c04cn.LLILLL = false;
            C04CP c04cp = c04cn.LLILZLL;
            if (c04cp != null) {
                c04cp.LJIIIIZZ("module_show_over", null, null, null);
            }
        }
        this.LLILLL = false;
        LJIIIIZZ("show_over", null, null, null);
    }

    @Override // X.AbstractC1764400w10
    public final void LJIIJ() {
        super.LJIIJ();
        if (!(this instanceof C1764490w19)) {
            LJIIIIZZ("show", null, null, null);
        }
    }

    public C1764410w11(InterfaceC665370Q7z interfaceC665370Q7z, VO vo, C04FN c04fn) {
        super(interfaceC665370Q7z, vo, c04fn);
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, SeaPdpFragmentScope.class);
        boolean z = (c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(PdpContext.class) : null) instanceof PdpContext;
        this.LLJI = true;
    }
}
