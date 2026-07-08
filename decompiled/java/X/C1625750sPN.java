package X;

import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerDowngradeStrategy;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;

/* JADX INFO: renamed from: X.0sPN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625750sPN implements InterfaceC1625730sPL {
    public static final /* synthetic */ C1625750sPN LJIILLIIL = new C1625750sPN();
    public final /* synthetic */ InterfaceC1625730sPL LJIILL;

    @Override // X.InterfaceC1625730sPL
    public final boolean enableUseDynamicEffectLabel() {
        return this.LJIILL.enableUseDynamicEffectLabel();
    }

    @Override // X.InterfaceC1625730sPL
    public final StickerPreviewResolutionConfig getResolutionConfig() {
        return this.LJIILL.getResolutionConfig();
    }

    public C1625750sPN() {
        InterfaceC1625730sPL interfaceC1625730sPL;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC1625730sPL = (InterfaceC1625730sPL) c09gaLIZIZ.LJII(StickerDowngradeStrategy.class)) == null) ? new InterfaceC1625730sPL() { // from class: X.0sPM
            @Override // X.InterfaceC1625730sPL
            public final boolean enableUseDynamicEffectLabel() {
                return false;
            }

            @Override // X.InterfaceC1625730sPL
            public final StickerPreviewResolutionConfig getResolutionConfig() {
                return null;
            }

            static {
                C201955140j.LIZ("StickerDowngradeBenchApi -> use DefaultApi");
            }
        } : interfaceC1625730sPL;
    }
}
