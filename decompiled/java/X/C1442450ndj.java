package X;

import com.ss.android.ugc.aweme.property.bytebench.CanvasByteBenchStrategy;

/* JADX INFO: renamed from: X.0ndj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442450ndj implements InterfaceC1442440ndi {
    public static final /* synthetic */ C1442450ndj LJIILLIIL = new C1442450ndj();
    public final /* synthetic */ InterfaceC1442440ndi LJIILL;

    @Override // X.InterfaceC1442440ndi
    public final boolean enableCanvasDynamicResolution() {
        return this.LJIILL.enableCanvasDynamicResolution();
    }

    public C1442450ndj() {
        InterfaceC1442440ndi interfaceC1442440ndi;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1442440ndi = (InterfaceC1442440ndi) c09gaLIZIZ.LJII(CanvasByteBenchStrategy.class)) == null) ? new InterfaceC1442440ndi() { // from class: X.0ndk
            static {
                C1440300naG.LIZ("CanvasByteBenchApi -> use DefaultApi");
            }

            @Override // X.InterfaceC1442440ndi
            public final boolean enableCanvasDynamicResolution() {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "canvas_enable_dynamic_resolution", true, false);
            }
        } : interfaceC1442440ndi;
    }
}
