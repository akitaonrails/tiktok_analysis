package X;

import Y.ACListenerS54S1200000_11;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.ad.AdAIGCLabel;

/* JADX INFO: renamed from: X.0RZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698050RZr implements InterfaceC698070RZt {
    public final Context LIZ;

    @Override // X.InterfaceC698070RZt
    public final Integer LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC698070RZt
    public final String LLLII() {
        return "annotation_container_bottom_label_ad_aigc";
    }

    public C698050RZr(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC698070RZt
    public final View.OnClickListener LIZ(VideoItemParams videoItemParams) {
        String str;
        AdAIGCLabel adAigcLabel;
        AwemeRawAd awemeRawAd = videoItemParams.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (adAigcLabel = awemeRawAd.getAdAigcLabel()) != null) {
            str = adAigcLabel.jumpUrl;
        } else {
            str = null;
        }
        return new ACListenerS54S1200000_11(this, str, videoItemParams, 4);
    }

    @Override // X.InterfaceC698070RZt
    public final String LIZJ(VideoItemParams videoItemParams) {
        AdAIGCLabel adAigcLabel;
        String str;
        AwemeRawAd awemeRawAd = videoItemParams.getAweme().getAwemeRawAd();
        if (awemeRawAd == null || (adAigcLabel = awemeRawAd.getAdAigcLabel()) == null || (str = adAigcLabel.text) == null) {
            return "";
        }
        return str;
    }
}
