package X;

import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;

/* JADX INFO: renamed from: X.185Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185Q extends AbstractC212320187a<C186M, EnhancedBrandLogo, InterfaceC2297911Ex3, InterfaceC212268185a> {
    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new InterfaceC212268185a() { // from class: X.185R
            @Override // X.InterfaceC212268185a
            public final void LJIILJJIL(C186M c186m, EnhancedBrandLogo enhancedBrandLogo) {
                c186m.LIZ(enhancedBrandLogo, new C186N(null, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), null, null, null, 59));
            }
        };
    }

    public C185Q(C186M c186m) {
        super(c186m);
    }

    @Override // X.AbstractC212320187a
    public final /* bridge */ /* synthetic */ InterfaceC212321187b LJIIJJI(InterfaceC2297911Ex3 interfaceC2297911Ex3) {
        return null;
    }

    public final void LJIILJJIL(EnhancedBrandLogo enhancedBrandLogo) {
        if (enhancedBrandLogo == null) {
            T t = this.LIZ;
            int visibility = t.getVisibility();
            t.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, t);
            return;
        }
        LJIIL().LJIILJJIL((C186M) this.LIZ, enhancedBrandLogo);
        T t2 = this.LIZ;
        int visibility2 = t2.getVisibility();
        t2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, t2);
    }
}
