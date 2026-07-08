package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveBannerResourceIdSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.settings.TtecLiveMultiBillboardResourceIdSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1728970v5r {
    public static final C1728970v5r LIZ = new C1728970v5r();

    public static boolean LIZJ() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) == null) {
            return false;
        }
        LiveEffect liveEffectLJI = interfaceC1728700v5QLLI.LJI(interfaceC1728700v5QLLI.LIZ());
        String resourceId = liveEffectLJI != null ? liveEffectLJI.getResourceId() : null;
        TtecLiveMultiBillboardResourceIdSettings.MultiBillboardResourceIdConfig multiBillboardResourceIdConfigLIZ = TtecLiveMultiBillboardResourceIdSettings.LIZ();
        if (C123100dR.LIZ(resourceId)) {
            return Intrinsics.LJFF(resourceId, multiBillboardResourceIdConfigLIZ.templateResourceId) || Intrinsics.LJFF(resourceId, multiBillboardResourceIdConfigLIZ.photoResourceId);
        }
        return false;
    }

    public static Object LIZ(AbstractC23140094w abstractC23140094w) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        String str;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) == null || (str = TtecLiveBannerResourceIdSettings.LIZ().resourceId) == null) {
            return null;
        }
        String str2 = TtecLiveBannerResourceIdSettings.LIZ().panel;
        if (str2 == null) {
            str2 = "live_ec_top_atmosphere";
        }
        String str3 = TtecLiveBannerResourceIdSettings.LIZ().categoryId;
        if (str3 == null) {
            str3 = "top_atmosphere";
        }
        return C23250099c.LJI(abstractC23140094w, C2126308Ur.LIZ, new C324360Cna(interfaceC1728700v5QLLI, str2, str, str3, null));
    }

    public static Object LIZIZ(AbstractC23140094w abstractC23140094w, Function1 function1) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1728700v5Q interfaceC1728700v5QLLI;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1728700v5QLLI = interfaceC20673515v3K4.LLI()) != null) {
            String str = TtecLiveMultiBillboardResourceIdSettings.LIZ().photoResourceId;
            if (str == null) {
                if (function1 != null) {
                    function1.invoke(new Throwable("getPhotoResourceId is null"));
                }
                return null;
            }
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
            c2252611DEt.LJIJJ();
            interfaceC1728700v5QLLI.LIZ();
            interfaceC1728700v5QLLI.LIZJ(str, "greenscreen", new AwS583S0100000_4(c2252611DEt, 352));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(abstractC23140094w);
            }
            return objLJIJ;
        }
        if (function1 != null) {
            function1.invoke(new Throwable("live.ecEffectExternalHelper service is null"));
        }
        return null;
    }
}
