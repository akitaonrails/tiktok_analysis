package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.GetLeadsAnchorPublishResp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0e92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077460e92 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            default:
                return null;
        }
    }

    public C1077460e92(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C1077460e92 c1077460e92, C15O7 c15o7) {
        Unit unit;
        C1C7U.LIZ("FeedGradientBackgroundHelper@5dac.loadAutoColorBitmap$1$onCompleted$2");
        ImageView imageView = ((C1029200ctC) c1077460e92.l0).LIZJ;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) c15o7.LJIIL());
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("FeedGradientBackgroundHelper@5dac.loadAutoColorBitmap$1$onCompleted$2");
        return unit;
    }

    public static final Object then$1(C1077460e92 c1077460e92, C15O7 c15o7) {
        boolean z;
        InterfaceC1027210cpz interfaceC1027210cpz = (InterfaceC1027210cpz) c1077460e92.l0;
        C1C7U.LIZ("AdOpenBaseUtils@abbc.pendingDeepLinkLog$1L");
        if (!C1BN8.LIZ().LIZ.LIZIZ && System.currentTimeMillis() - C1BN8.LIZ().LIZ.LIZJ >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            z = false;
        } else {
            z = true;
        }
        interfaceC1027210cpz.LIZ(z);
        C1C7U.LIZIZ("AdOpenBaseUtils@abbc.pendingDeepLinkLog$1L");
        return null;
    }

    public static final Object then$2(C1077460e92 c1077460e92, C15O7 c15o7) {
        InterfaceC1027210cpz interfaceC1027210cpz = (InterfaceC1027210cpz) c1077460e92.l0;
        C1C7U.LIZ("AdOpenBaseUtils@abbc.pendingDeepLinkOpened$1L");
        interfaceC1027210cpz.LIZ(C1BN8.LIZ().LIZ.LIZIZ);
        C1C7U.LIZIZ("AdOpenBaseUtils@abbc.pendingDeepLinkOpened$1L");
        return null;
    }

    public static final Object then$3(C1077460e92 c1077460e92, C15O7 c15o7) {
        boolean z;
        C1C7U.LIZ("H5DeepLinkLog@f21e.pendingDeepLinkLog$1");
        if (!C2214201BlK.LJIIJJI && System.currentTimeMillis() - C2214201BlK.LJIILL >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            z = false;
        } else {
            z = true;
        }
        ((InterfaceC1029340ctQ) c1077460e92.l0).LIZ(z);
        C1C7U.LIZIZ("H5DeepLinkLog@f21e.pendingDeepLinkLog$1");
        return null;
    }

    public static final Object then$4(C1077460e92 c1077460e92, C15O7 c15o7) {
        C1C7U.LIZ("H5DeepLinkLog@f21e.pendingDeepLinkOpened$1");
        ((InterfaceC1029340ctQ) c1077460e92.l0).LIZ(C2214201BlK.LJIIJJI);
        C1C7U.LIZIZ("H5DeepLinkLog@f21e.pendingDeepLinkOpened$1");
        return null;
    }

    public static final Object then$5(C1077460e92 c1077460e92, C15O7 c15o7) {
        boolean z;
        InterfaceC1028440cry interfaceC1028440cry = (InterfaceC1028440cry) c1077460e92.l0;
        C1C7U.LIZ("NormalSplashAdSchemeHelper@1482.pendingDeepLinkLog$1L");
        if (!C1031100cwG.LIZ().isAppBackground() && System.currentTimeMillis() - C1031100cwG.LIZ().LJFF() >= Mp4ScreenVideoLoadTimeout.CONTROL) {
            z = false;
        } else {
            z = true;
        }
        C1028430crx c1028430crx = (C1028430crx) interfaceC1028440cry;
        Long l = c1028430crx.LIZ;
        String str = c1028430crx.LIZIZ;
        if (z) {
            C2184171Adz.LJ("splash_ad", "deeplink_success", l.toString(), str, null).LJII();
        } else {
            C2184171Adz.LJ("splash_ad", "deeplink_failed", l.toString(), str, null).LJII();
        }
        C1C7U.LIZIZ("NormalSplashAdSchemeHelper@1482.pendingDeepLinkLog$1L");
        return null;
    }

    public static final Object then$6(C1077460e92 c1077460e92, C15O7 c15o7) {
        int iIntValue;
        C1C7U.LIZ("BAGetLeadsAnchorStateApi@9c93.populateGetLeadsAnchor$1$1");
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) c1077460e92.l0;
        Integer num = ((GetLeadsAnchorPublishResp) c15o7.LJIIL()).anchor_status;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        anchorPublishStruct.getLeadsAnchorState = iIntValue;
        ((AnchorPublishStruct) c1077460e92.l0).getLeadsPageId = ((GetLeadsAnchorPublishResp) c15o7.LJIIL()).pageId;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BAGetLeadsAnchorStateApi@9c93.populateGetLeadsAnchor$1$1");
        return unit;
    }
}
