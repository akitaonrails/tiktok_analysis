package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0RBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691880RBy {
    public static final void LIZ(Context context, ViewGroup viewGroup, AwemeRawAd awemeRawAd, boolean z) {
        IAdsPreviewService iAdsPreviewService;
        C0RC0 c691890RBz;
        if (viewGroup == null || (iAdsPreviewService = (IAdsPreviewService) PluggableExtentionKt.pluggableSpi$default(IAdsPreviewService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iAdsPreviewService.LIZIZ(viewGroup);
        if (context == null || awemeRawAd == null || !C1017180cZo.LJIJ(awemeRawAd)) {
            return;
        }
        String str = "";
        if (z) {
            String previewWatermarkText = awemeRawAd.getPreviewWatermarkText();
            if (previewWatermarkText != null) {
                str = previewWatermarkText;
            }
            c691890RBz = new C0RC2(str);
        } else {
            String previewWatermarkText2 = awemeRawAd.getPreviewWatermarkText();
            if (previewWatermarkText2 != null) {
                str = previewWatermarkText2;
            }
            c691890RBz = new C691890RBz(str);
        }
        iAdsPreviewService.LJIIIIZZ(context, viewGroup, c691890RBz, null);
    }
}
