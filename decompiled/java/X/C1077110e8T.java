package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS85S0200000_16;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard.SearchAdAIProductCardCell;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.tako.multipletemplate.TakoTemplateActivity;

/* JADX INFO: renamed from: X.0e8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077110e8T extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void cm$0(C1077110e8T c1077110e8T, Uri uri, View view, Throwable th) {
    }

    public static final void cm$2(C1077110e8T c1077110e8T, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1077110e8T(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$1(C1077110e8T c1077110e8T, Uri uri, View view, Throwable th) {
        SmartImageView smartImageView = (SmartImageView) c1077110e8T.l0;
        HandlerHook.viewPost(smartImageView, new ARunnableS116S0100000_16(smartImageView, 154));
    }

    public static final void Ad$0(C1077110e8T c1077110e8T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        TakoTemplateActivity takoTemplateActivity = (TakoTemplateActivity) c1077110e8T.l0;
        SmartImageView smartImageView = takoTemplateActivity.LLJJLIIIJLLLLLLLZ;
        if (smartImageView != null) {
            HandlerHook.viewPost(smartImageView, new ARunnableS85S0200000_16(takoTemplateActivity, c428600GrK, 17));
        }
    }

    public static final void Ad$1(C1077110e8T c1077110e8T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        SmartImageView smartImageView = (SmartImageView) c1077110e8T.l0;
        HandlerHook.viewPost(smartImageView, new ARunnableS116S0100000_16(smartImageView, 153));
    }

    public static final void Ad$2(C1077110e8T c1077110e8T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String string;
        String creativeIdStr;
        String str;
        AbstractC1014240cV4 abstractC1014240cV4;
        AnoleComponentModel anoleComponentModel;
        C1009340cNA c1009340cNA;
        C1009340cNA c1009340cNA2;
        AwemeRawAd awemeRawAd;
        if (uri != null && (string = uri.toString()) != null) {
            SearchAdAIProductCardCell searchAdAIProductCardCell = (SearchAdAIProductCardCell) c1077110e8T.l0;
            if (!searchAdAIProductCardCell.LLJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SearchAdAIProductCardCell [trackImageLoadSuccess], cid = ");
                C1005290cGd item = searchAdAIProductCardCell.getItem();
                AwemeRawAd awemeRawAd2 = null;
                if (item != null && (c1009340cNA2 = item.LLIZLLLIL) != null && (awemeRawAd = c1009340cNA2.LIZLLL) != null) {
                    creativeIdStr = awemeRawAd.getCreativeIdStr();
                } else {
                    creativeIdStr = null;
                }
                sbLIZ.append(creativeIdStr);
                C2188811AlT.LIZIZ(sbLIZ);
                C1005290cGd item2 = searchAdAIProductCardCell.getItem();
                if (item2 != null && (c1009340cNA = item2.LLIZLLLIL) != null) {
                    awemeRawAd2 = c1009340cNA.LIZLLL;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "image_show_100pct", awemeRawAd2);
                c1022820ciuLIZLLL.LIZJ("image", "refer");
                c1022820ciuLIZLLL.LIZIZ(string, "image_id");
                C1005290cGd item3 = searchAdAIProductCardCell.getItem();
                if (item3 == null || (abstractC1014240cV4 = item3.LLILZLL) == null || (anoleComponentModel = abstractC1014240cV4.LL) == null || (str = anoleComponentModel.type) == null) {
                    str = "search_ad_card_list";
                }
                c1022820ciuLIZLLL.LIZIZ(str, "component_type");
                c1022820ciuLIZLLL.LJII();
                searchAdAIProductCardCell.LLJI = true;
            }
        }
    }
}
