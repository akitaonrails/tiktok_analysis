package X;

import com.bytedance.android.live.marketing.service.ILiveMarketingService;

/* JADX INFO: renamed from: X.0f91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115890f91 implements InterfaceC1120520fGU {
    public static final C1115890f91 LIZ = new C1115890f91();
    public static final ILiveMarketingService LIZIZ = (ILiveMarketingService) C1161920gLG.LIZJ(ILiveMarketingService.class);

    @Override // X.InterfaceC1120520fGU
    public final boolean Iq() {
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService != null) {
            return iLiveMarketingService.Iq();
        }
        return false;
    }

    @Override // X.InterfaceC1120520fGU
    public final boolean Ot() {
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService != null) {
            return iLiveMarketingService.Ot();
        }
        return false;
    }

    @Override // X.InterfaceC1120520fGU
    public final EnumC1115870f8z hc() {
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService != null) {
            return iLiveMarketingService.hc();
        }
        return null;
    }

    @Override // X.InterfaceC1120520fGU
    public final boolean isAvailable() {
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService != null) {
            return iLiveMarketingService.isAvailable();
        }
        return false;
    }

    @Override // X.InterfaceC1120520fGU
    public final void LIZ(EnumC1115870f8z enumC1115870f8z, C21211417zc c21211417zc) {
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService != null) {
            iLiveMarketingService.g81(enumC1115870f8z, c21211417zc);
        }
    }

    @Override // X.InterfaceC1120520fGU
    public final C1115970f99 t5(EnumC1115870f8z enumC1115870f8z, C1115940f96 c1115940f96, long j) {
        C1115970f99 c1115970f99T5;
        ILiveMarketingService iLiveMarketingService = LIZIZ;
        if (iLiveMarketingService == null || (c1115970f99T5 = iLiveMarketingService.t5(enumC1115870f8z, c1115940f96, j)) == null) {
            return new C1115970f99(false, null);
        }
        return c1115970f99T5;
    }
}
