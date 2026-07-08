package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AdAnchorsExtras;
import com.ss.android.ugc.aweme.feed.model.AdPrefix;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.SecondLine;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0crG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028000crG extends AbstractC707180Roa {
    public final C01GW LLILZ;
    public Aweme LLILZIL;
    public AnchorCommonStruct LLILZLL;
    public final List<AnchorProductInfoModel> LLIZ;
    public final C01GW LLIZLLLIL;

    private final IAdPhotoModeService getAdPhotoModeService() {
        return (IAdPhotoModeService) this.LLIZLLLIL.getValue();
    }

    private final InterfaceC1028010crH getAnchorViewImpl() {
        return (InterfaceC1028010crH) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        getAnchorViewImpl().LIZ();
        C622680Oba.LIZLLL(this);
    }

    public C1028000crG(Context context) {
        super(context);
        this.LLILZ = C452501pT.LIZIZ(new AwS560S0100000_16(context, 30));
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(22));
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        C622680Oba.LIZJ(this);
        LJIILJJIL(0);
        C0R12 c0r12 = C0R12.LIZIZ;
        Aweme aweme = this.LLILZIL;
        Aweme aweme2 = null;
        if (aweme == null) {
            aweme = null;
        }
        if (c0r12.LJIL(aweme)) {
            Aweme aweme3 = this.LLILZIL;
            if (aweme3 != null) {
                aweme2 = aweme3;
            }
            if (C1010120cOQ.LJJJ(aweme2)) {
                LJIILIIL(true);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(boolean r23) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1028000crG.LJIILIIL(boolean):void");
    }

    public final void LJIILJJIL(int i) {
        AnchorProductInfo anchorProductInfo;
        UrlModel icon;
        int size;
        String uri;
        int productCount;
        long jLongValue;
        String str;
        AdPrefix adPrefix;
        String str2;
        AdPrefix adPrefix2;
        SecondLine secondLine;
        Long l;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<PhotoModeImageUrlModel> imageList2;
        String enterMethod = getAdPhotoModeService().getEnterMethod();
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLZIJ(i, this.LLIZ);
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            InterfaceC1028010crH anchorViewImpl = getAnchorViewImpl();
            String str3 = anchorProductInfo.title;
            if (str3 == null) {
                str3 = "";
            }
            anchorViewImpl.LIZLLL(str3, anchorProductInfo.adAnchorsExtras);
            InterfaceC1028010crH anchorViewImpl2 = getAnchorViewImpl();
            AdAnchorsExtras adAnchorsExtras = anchorProductInfo.adAnchorsExtras;
            AnchorCommonStruct anchorCommonStruct = this.LLILZLL;
            Aweme aweme = null;
            if (anchorCommonStruct != null) {
                icon = anchorCommonStruct.getIcon();
            } else {
                icon = null;
            }
            anchorViewImpl2.LJFF(adAnchorsExtras, icon);
            Aweme aweme2 = this.LLILZIL;
            if (aweme2 == null) {
                aweme2 = null;
            }
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null) {
                size = imageList2.size();
            } else {
                size = 0;
            }
            Aweme aweme3 = this.LLILZIL;
            if (aweme3 == null) {
                aweme3 = null;
            }
            PhotoModeImageInfo photoModeImageInfo2 = aweme3.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null) {
                uri = urlModel.getUri();
            } else {
                uri = null;
            }
            String strValueOf = String.valueOf(anchorProductInfo.productId);
            Aweme aweme4 = this.LLILZIL;
            if (aweme4 == null) {
                aweme4 = null;
            }
            AwemeRawAd awemeRawAd = aweme4.getAwemeRawAd();
            if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
                productCount = photoCarouselInfo.getProductCount();
            } else {
                productCount = 0;
            }
            AdAnchorsExtras adAnchorsExtras2 = anchorProductInfo.adAnchorsExtras;
            if (adAnchorsExtras2 != null && (secondLine = adAnchorsExtras2.secondLine) != null && (l = secondLine.showTime) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            boolean zLJ = getAnchorViewImpl().LJ();
            if (i == 0) {
                IAdPhotoModeService adPhotoModeService = getAdPhotoModeService();
                AdAnchorsExtras adAnchorsExtras3 = anchorProductInfo.adAnchorsExtras;
                if (adAnchorsExtras3 != null && (adPrefix2 = adAnchorsExtras3.prefix) != null) {
                    str2 = adPrefix2.prefixTagTracking;
                } else {
                    str2 = null;
                }
                Integer numValueOf = Integer.valueOf(zLJ ? 1 : 0);
                Long lValueOf = Long.valueOf(jLongValue);
                Aweme aweme5 = this.LLILZIL;
                if (aweme5 == null) {
                    aweme5 = null;
                }
                adPhotoModeService.LJ(uri, size, strValueOf, productCount, enterMethod, str2, numValueOf, lValueOf, aweme5.getAwemeRawAd());
            }
            IAdPhotoModeService adPhotoModeService2 = getAdPhotoModeService();
            int i2 = i + 1;
            AdAnchorsExtras adAnchorsExtras4 = anchorProductInfo.adAnchorsExtras;
            if (adAnchorsExtras4 != null && (adPrefix = adAnchorsExtras4.prefix) != null) {
                str = adPrefix.prefixTagTracking;
            } else {
                str = null;
            }
            Integer numValueOf2 = Integer.valueOf(zLJ ? 1 : 0);
            Long lValueOf2 = Long.valueOf(jLongValue);
            Aweme aweme6 = this.LLILZIL;
            if (aweme6 != null) {
                aweme = aweme6;
            }
            adPhotoModeService2.LJJ(i2, uri, size, strValueOf, productCount, enterMethod, str, numValueOf2, lValueOf2, aweme.getAwemeRawAd());
        }
    }

    public final void LJIILL(Aweme aweme) {
        AnchorProductInfo anchorProductInfo;
        int size;
        long jLongValue;
        SecondLine secondLine;
        Long l;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        int iLJJIJIIJIL = getAdPhotoModeService().LJJIJIIJIL();
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLZIJ(iLJJIJIIJIL, this.LLIZ);
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            int productCount = 0;
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
                productCount = photoCarouselInfo.getProductCount();
            }
            AdAnchorsExtras adAnchorsExtras = anchorProductInfo.adAnchorsExtras;
            if (adAnchorsExtras != null && (secondLine = adAnchorsExtras.secondLine) != null && (l = secondLine.showTime) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            getAdPhotoModeService().LJJIJ(iLJJIJIIJIL + 1, size, productCount, Long.valueOf(jLongValue), awemeRawAd);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPhotoPageSelected(C1001950cBF c1001950cBF) {
        String str = c1001950cBF.LIZ;
        Aweme aweme = this.LLILZIL;
        if (aweme == null) {
            aweme = null;
        }
        if (Intrinsics.LJFF(str, aweme.getAid()) && !c1001950cBF.LIZIZ) {
            LJIILJJIL(c1001950cBF.LIZJ);
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        LJIILIIL(false);
    }

    @Override // X.InterfaceC713230RyL
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        InterfaceC1028010crH anchorViewImpl = getAnchorViewImpl();
        anchorViewImpl.LIZIZ(this);
        anchorViewImpl.setAnchorImg(anchorCommonStruct.getIcon());
        if (!interfaceC1392640mLO.LJIIIIZZ() && !C715400S4k.LIZIZ()) {
            anchorViewImpl.LIZJ();
        }
        anchorViewImpl.setShowSecondLineListener(new AwS417S0200000_16(this, interfaceC1392640mLO, 6));
        this.LLILZIL = interfaceC1392640mLO.LJJLIIIJJIZ();
        this.LLILZLL = anchorCommonStruct;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        ((ArrayList) this.LLIZ).clear();
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        ((ArrayList) this.LLIZ).addAll(iECommerceAnchorService.LJJLIIIJL(anchorCommonStruct));
        AwemeRawAd awemeRawAd = awemeLJJLIIIJJIZ.getAwemeRawAd();
        if (awemeRawAd == null || awemeRawAd.getEcommerceClickAnchors() == null) {
            iECommerceAnchorService.LJL(awemeLJJLIIIJJIZ, this.LLIZ);
        }
        C622680Oba.LIZJ(this);
    }
}
