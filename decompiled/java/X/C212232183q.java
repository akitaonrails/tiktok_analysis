package X;

import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;

/* JADX INFO: renamed from: X.183q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212232183q extends C187Z<C185U, EnhancedBrandLogo, Object, AnonymousClass1841> {
    @Override // X.C187Z
    public final InterfaceC212322187c LJIIJJI() {
        return new AnonymousClass1841() { // from class: X.183r
            @Override // X.AnonymousClass1841
            public final void LJIIL(C185U c185u, EnhancedBrandLogo enhancedBrandLogo) {
                c185u.LIZ(enhancedBrandLogo, new C184O(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), EnumC1769850w9n.LIVE_POP_CARD_ICON_SELLER_LOGO, EnumC1769850w9n.LIVE_POP_CARD_ICON_BLUE_V);
            }
        };
    }

    public C212232183q(C185U c185u) {
        super(c185u, "seller_logo");
    }

    public final void LJIILIIL(EnhancedBrandLogo enhancedBrandLogo) {
        if (enhancedBrandLogo == null) {
            T t = this.LIZ;
            int visibility = t.getVisibility();
            t.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, t);
            return;
        }
        LJIIL().LJIIL((C185U) this.LIZ, enhancedBrandLogo);
        T t2 = this.LIZ;
        int visibility2 = t2.getVisibility();
        t2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, t2);
    }
}
