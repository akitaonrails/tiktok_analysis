package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.recommendationcard.data.BusinessInfo;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.aweme.recommendationcard.data.UrlStructV2;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12AG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12AG {
    public static CardMaterials LIZ;
    public static BusinessInfo LIZIZ;

    public static Object LIZ(Aweme aweme, InterfaceC1364105Vn interfaceC1364105Vn) {
        BusinessInfo businessInfo;
        CardMaterials cardMaterials = LIZ;
        if (cardMaterials != null && (businessInfo = LIZIZ) != null) {
            return new Pair(cardMaterials, businessInfo.musicId);
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C12AH(aweme, null));
    }

    public static void LIZIZ(CardMaterials cardMaterials, Context context) {
        List<CardContent> list;
        List<String> list2;
        UrlStructV2 urlStructV2;
        if (cardMaterials != null && (list = cardMaterials.cardContent) != null) {
            Iterator<CardContent> it2 = list.iterator();
            while (it2.hasNext()) {
                EffectStructV2 effectStructV2 = it2.next().effect;
                if (effectStructV2 != null && (urlStructV2 = effectStructV2.iconUrl) != null) {
                    list2 = urlStructV2.urlList;
                } else {
                    list2 = null;
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list2));
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJIILIIL();
            }
        }
    }

    public static void LIZJ(CardMaterials cardMaterials, Context context) {
        List<CardContent> list;
        List<String> urlList;
        Aweme aweme;
        Video video;
        UrlModel cover;
        if (cardMaterials != null && (list = cardMaterials.cardContent) != null) {
            Iterator<CardContent> it2 = list.iterator();
            while (it2.hasNext()) {
                List<Aweme> list2 = it2.next().awemeList;
                if (list2 != null && (aweme = (Aweme) C13LP.LJJJLL(list2)) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                    urlList = cover.getUrlList();
                } else {
                    urlList = null;
                }
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJJIFFI();
            }
        }
    }
}
