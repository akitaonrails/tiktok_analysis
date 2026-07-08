package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036770d5P {
    public static final C1036770d5P LIZ = new C1036770d5P();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(431));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext LIZ(android.content.Context r19, java.lang.String r20, android.os.Bundle r21, final X.C1035880d3y r22, X.InterfaceC1038080d7W r23, X.InterfaceC1036870d5Z r24, X.InterfaceC1036150d4P r25) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1036770d5P.LIZ(android.content.Context, java.lang.String, android.os.Bundle, X.0d3y, X.0d7W, X.0d5Z, X.0d4P):com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext");
    }

    public static AdWebSparkFragment LIZIZ(boolean z, Context context, String str, Bundle bundle, C1035880d3y c1035880d3y, InterfaceC1038080d7W interfaceC1038080d7W, InterfaceC1036870d5Z interfaceC1036870d5Z, InterfaceC1036150d4P interfaceC1036150d4P) {
        AdWebSparkFragment adWebSparkFragment;
        Bundle bundle2 = bundle;
        AdSparkHybridContext adSparkHybridContextLIZ = LIZ(context, str, bundle2, c1035880d3y, interfaceC1038080d7W, interfaceC1036870d5Z, interfaceC1036150d4P);
        new Object() { // from class: X.0d5l
        }.getClass();
        C1035880d3y c1035880d3y2 = (C1035880d3y) adSparkHybridContextLIZ.LJFF(C1035880d3y.class);
        InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
        Boolean boolValueOf = null;
        AwemeRawAd awemeRawAd = null;
        if (interfaceC1030370cv5 != null) {
            if (c1035880d3y2 != null) {
                awemeRawAd = c1035880d3y2.getAwemeRawAd();
            }
            boolValueOf = Boolean.valueOf(interfaceC1030370cv5.r42(awemeRawAd));
        }
        ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).N0();
        SparkFragment sparkFragmentLJIILIIL = C1037010d5n.LJIILIIL(c1035880d3y2);
        if (sparkFragmentLJIILIIL != null && (sparkFragmentLJIILIIL instanceof AdWebSparkFragment)) {
            adWebSparkFragment = (AdWebSparkFragment) sparkFragmentLJIILIIL;
        } else {
            adWebSparkFragment = new AdWebSparkFragment();
        }
        adWebSparkFragment.LLL = z;
        adSparkHybridContextLIZ.bizCert = new ThirdPartyBizCert(402657281);
        adSparkHybridContextLIZ.disableSeclinkExplicit = true;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(adSparkHybridContextLIZ);
        C786410Ut5.LJJJI("SparkContextContainerId", adSparkHybridContextLIZ.containerId, bundle2);
        adWebSparkFragment.setArguments(bundle2);
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            adWebSparkFragment.uS(EnumC1036690d5H.REUSE_FIRST_LOAD);
        }
        return adWebSparkFragment;
    }
}
