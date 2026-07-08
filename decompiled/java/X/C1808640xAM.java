package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerApiProviderService;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StickerApiStubs;
import com.ss.android.ugc.aweme.im.sticker.basic.provider.BasicStickerApiProviderService;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0xAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808640xAM {
    public static final C1808640xAM LIZ = new C1808640xAM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(280));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(467));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(408));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(277));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(279));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(466));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(278));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(274));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(275));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(276));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(273));

    public static InterfaceC1839980xyu LIZIZ() {
        InterfaceC1839980xyu photo2StickerEventTracker;
        InterfaceC1839980xyu photo2StickerEventTracker2 = StickerApiStubs.INSTANCE.getPhoto2StickerEventTracker();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerEventTracker = iStickerApiProviderServiceLIZ.getPhoto2StickerEventTracker()) == null) ? photo2StickerEventTracker2 : photo2StickerEventTracker;
    }

    public static InterfaceC1808750xAX LIZJ() {
        InterfaceC1808750xAX photo2StickerInlineRepository;
        InterfaceC1808750xAX photo2StickerInlineRepository2 = StickerApiStubs.INSTANCE.getPhoto2StickerInlineRepository();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerInlineRepository = iStickerApiProviderServiceLIZ.getPhoto2StickerInlineRepository()) == null) ? photo2StickerInlineRepository2 : photo2StickerInlineRepository;
    }

    public static C1ETI LIZLLL() {
        C1ETI photo2StickerKeva;
        C1ETI photo2StickerKeva2 = StickerApiStubs.INSTANCE.getPhoto2StickerKeva();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerKeva = iStickerApiProviderServiceLIZ.getPhoto2StickerKeva()) == null) ? photo2StickerKeva2 : photo2StickerKeva;
    }

    public static InterfaceC1808700xAS LJ() {
        InterfaceC1808700xAS photo2StickerPerfTracker;
        InterfaceC1808700xAS photo2StickerPerfTracker2 = StickerApiStubs.INSTANCE.getPhoto2StickerPerfTracker();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerPerfTracker = iStickerApiProviderServiceLIZ.getPhoto2StickerPerfTracker()) == null) ? photo2StickerPerfTracker2 : photo2StickerPerfTracker;
    }

    public static C0ZSY LJFF() {
        C0ZSY photo2StickerService;
        C0ZSY photo2StickerService2 = StickerApiStubs.INSTANCE.getPhoto2StickerService();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerService = iStickerApiProviderServiceLIZ.getPhoto2StickerService()) == null) ? photo2StickerService2 : photo2StickerService;
    }

    public static InterfaceC1808780xAa LJI() {
        InterfaceC1808780xAa photo2StickerUploadService;
        InterfaceC1808780xAa photo2StickerUploadService2 = StickerApiStubs.INSTANCE.getPhoto2StickerUploadService();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (photo2StickerUploadService = iStickerApiProviderServiceLIZ.getPhoto2StickerUploadService()) == null) ? photo2StickerUploadService2 : photo2StickerUploadService;
    }

    public static InterfaceC450290HlD LJII() {
        InterfaceC450290HlD stickerRepository;
        C450220Hl6 c450220Hl6 = (C450220Hl6) LIZJ.getValue();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (stickerRepository = iStickerApiProviderServiceLIZ.getStickerRepository()) == null) ? c450220Hl6 : stickerRepository;
    }

    public static InterfaceC1808720xAU LJIIIIZZ() {
        InterfaceC1808720xAU typingRecommendationStickerCache;
        C1808730xAV c1808730xAV = (C1808730xAV) LIZIZ.getValue();
        IStickerApiProviderService iStickerApiProviderServiceLIZ = LIZ();
        return (iStickerApiProviderServiceLIZ == null || (typingRecommendationStickerCache = iStickerApiProviderServiceLIZ.getTypingRecommendationStickerCache()) == null) ? c1808730xAV : typingRecommendationStickerCache;
    }

    public static IStickerApiProviderService LIZ() {
        if (!C457760HxG.LIZJ()) {
            return (IStickerApiProviderService) PluggableExtentionKt.pluggableSpi$default(IStickerApiProviderService.class, false, false, false, 14, null);
        }
        if (C457760HxG.LIZIZ(true)) {
            return (IStickerApiProviderService) PluggableExtentionKt.pluggableSpiForReal(IStickerApiProviderService.class);
        }
        IMStickerFallbackProvider iMStickerFallbackProvider = (IMStickerFallbackProvider) PluggableExtentionKt.pluggableSpi$default(IMStickerFallbackProvider.class, false, false, false, 14, null);
        BasicStickerApiProviderService basicStickerApiProviderServiceLIZ = iMStickerFallbackProvider != null ? iMStickerFallbackProvider.LIZ() : null;
        if (basicStickerApiProviderServiceLIZ instanceof IStickerApiProviderService) {
            return basicStickerApiProviderServiceLIZ;
        }
        return null;
    }
}
