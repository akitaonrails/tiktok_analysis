package X;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.AdCarouselColorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CarouselColorImage;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyle;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0c9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001020c9k {
    public static final C1001020c9k LIZ = new C1001020c9k();

    public static AmazonCtaButtonStyle LIZIZ(AmazonCheckoutAdModel amazonCheckoutAdModel) {
        AmazonCtaButtonStyleModel ctaButtonStyle;
        List<AmazonProductDetailsModel> amazonProductDetails;
        if (amazonCheckoutAdModel != null) {
            ctaButtonStyle = amazonCheckoutAdModel.getCtaButtonStyle();
            amazonProductDetails = amazonCheckoutAdModel.getAmazonProductDetails();
        } else {
            ctaButtonStyle = null;
            amazonProductDetails = null;
        }
        if (C1017070cZd.LLJJJJLIIL(amazonProductDetails)) {
            if (ctaButtonStyle == null) {
                return null;
            }
            return ctaButtonStyle.getPrime();
        }
        if (ctaButtonStyle == null) {
            return null;
        }
        return ctaButtonStyle.getNormal();
    }

    public static final CarouselColorImage LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdCarouselColorInfo carouselColorInfo;
        List<CarouselColorImage> images;
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
        if (iAdPhotoModeService == null) {
            return null;
        }
        int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (carouselColorInfo = awemeRawAd.getCarouselColorInfo()) == null || (images = carouselColorInfo.getImages()) == null) {
            return null;
        }
        return (CarouselColorImage) C13LP.LJJJLZIJ(iLJJIJIIJIL, images);
    }

    public static final C1001030c9l LJ(Aweme aweme) {
        AmazonCheckoutAdModel amazonCheckoutData;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
        } else {
            amazonCheckoutData = null;
        }
        LIZ.getClass();
        AmazonCtaButtonStyle amazonCtaButtonStyleLIZIZ = LIZIZ(amazonCheckoutData);
        if (amazonCtaButtonStyleLIZIZ == null) {
            return null;
        }
        return LJII(aweme, new C1001030c9l(null, amazonCtaButtonStyleLIZIZ.getText(), amazonCtaButtonStyleLIZIZ.getTextColor(), amazonCtaButtonStyleLIZIZ.getBackgroundColor(), Integer.valueOf(R.raw.icon_chevron_right_offset_fill_ltr)));
    }

    public static final Integer LJFF(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static final int LIZ(int i, Aweme aweme) {
        String backgroundColor;
        AmazonCheckoutAdModel amazonCheckoutData;
        AwemeRawAd awemeRawAd;
        CarouselColorImage carouselColorImageLIZLLL = LIZLLL(aweme);
        if (carouselColorImageLIZLLL == null || (backgroundColor = carouselColorImageLIZLLL.getCtaBackGroundColor()) == null) {
            C1001020c9k c1001020c9k = LIZ;
            backgroundColor = null;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                amazonCheckoutData = awemeRawAd.getAmazonCheckoutData();
            } else {
                amazonCheckoutData = null;
            }
            c1001020c9k.getClass();
            AmazonCtaButtonStyle amazonCtaButtonStyleLIZIZ = LIZIZ(amazonCheckoutData);
            if (amazonCtaButtonStyleLIZIZ != null) {
                backgroundColor = amazonCtaButtonStyleLIZIZ.getBackgroundColor();
            }
        }
        Integer numLJFF = LJFF(backgroundColor);
        if (numLJFF != null) {
            return numLJFF.intValue();
        }
        return i;
    }

    public static final C1001030c9l LJII(Aweme aweme, C1001030c9l c1001030c9l) {
        AwemeRawAd awemeRawAd;
        AdCarouselColorInfo carouselColorInfo;
        List<CarouselColorImage> images;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (carouselColorInfo = awemeRawAd.getCarouselColorInfo()) == null || (images = carouselColorInfo.getImages()) == null || !(!images.isEmpty())) {
            return c1001030c9l;
        }
        CarouselColorImage carouselColorImageLIZLLL = LIZLLL(aweme);
        if (c1001030c9l == null || carouselColorImageLIZLLL == null) {
            return c1001030c9l;
        }
        return new C1001030c9l(c1001030c9l.LIZ, c1001030c9l.LIZIZ, carouselColorImageLIZLLL.getCtaTextColor(), carouselColorImageLIZLLL.getCtaBackGroundColor(), c1001030c9l.LJ);
    }

    public static final TuxIconDrawable LIZJ(int i, Context context, Integer num) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        if (num != null) {
            c419910GdJ.LIZ = num.intValue();
        }
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        return c419910GdJ.LIZ(context);
    }

    public static final void LJI(Context context, Aweme aweme, TuxTextView tuxTextView, ImageView imageView) {
        C1001030c9l c1001030c9lLJ = LJ(aweme);
        if (c1001030c9lLJ != null) {
            if (tuxTextView != null) {
                tuxTextView.setText(c1001030c9lLJ.LIZIZ);
            }
            Integer numLJFF = LJFF(c1001030c9lLJ.LIZJ);
            if (numLJFF != null) {
                int iIntValue = numLJFF.intValue();
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                }
                TuxIconDrawable tuxIconDrawableLIZJ = LIZJ(iIntValue, context, c1001030c9lLJ.LJ);
                if (imageView != null) {
                    imageView.setBackground(null);
                    imageView.setImageDrawable(tuxIconDrawableLIZJ);
                }
            }
        }
    }
}
