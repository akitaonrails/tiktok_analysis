package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.exp.TtlsReviewsThirdPartyResourcesConfigModel;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0h5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190820h5s {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(510));

    public static final Keva LIZJ() {
        return (Keva) LIZ.getValue();
    }

    public static final void LJIIIZ() {
        Keva kevaLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_review_tooltip_has_shown_");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        kevaLIZJ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static final float LIZLLL(PoiReviewsApi.PoiReviewContentModel poiReviewContentModel) {
        Float fLJIIIIZZ;
        String str = poiReviewContentModel.ratingStr;
        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null) {
            return fLJIIIIZZ.floatValue();
        }
        Double d = poiReviewContentModel.rating;
        if (d != null) {
            return (float) d.doubleValue();
        }
        return 0.0f;
    }

    public static final boolean LJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        if (poiReviewModel != null && poiReviewModel.getSource() != null) {
            Integer source = poiReviewModel.getSource();
            int value = EnumC1190240h4w.POIREVIEWSOURCE_TABELOG.getValue();
            if (source != null && source.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJFF(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        if (poiReviewModel != null && poiReviewModel.getSource() != null) {
            Integer source = poiReviewModel.getSource();
            int value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            if (source == null || source.intValue() != value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel) {
        Integer num = poiReviewSummaryModel.source;
        if (num != null) {
            if (num.intValue() != EnumC1190240h4w.PoiReviewSource_TikTok.getValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        if (poiReviewModel != null && poiReviewModel.getSource() != null) {
            Integer source = poiReviewModel.getSource();
            int value = EnumC1190240h4w.POIREVIEWSOURCE_TIKTOKORDER.getValue();
            if (source != null && source.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        if (poiReviewModel != null && poiReviewModel.getSource() != null) {
            Integer source = poiReviewModel.getSource();
            int value = EnumC1190240h4w.POIREVIEWSOURCE_TRIPADVISOR.getValue();
            if (source != null && source.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJIIJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        if (poiReviewModel.getAvatarThirdPartyBgColor() == null) {
            C1190830h5t.LIZ.getClass();
            List<String> list = ((TtlsReviewsThirdPartyResourcesConfigModel) C1190830h5t.LIZJ.getValue()).avatarsBgs;
            if (list != null && (true ^ list.isEmpty())) {
                str = (String) ListProtector.get(list, AbstractC19994813Le.Default.nextInt(list.size()));
            } else {
                str = "tux://color?token=SocialStreak032&from=ttls_reviews";
            }
            poiReviewModel.setAvatarThirdPartyBgColor(str);
        }
    }

    public static final boolean LJIIJJI(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        if (poiReviewModel.getBrandLogo() != null && poiReviewModel.getDarkModeBrandLogo() != null && C123100dR.LIZ(poiReviewModel.getBrandName())) {
            return true;
        }
        return false;
    }

    public static final UrlStruct LIZ(PoiReviewsApi.PoiReviewModel poiReviewModel, Context context) {
        boolean zLIZIZ;
        if (context != null) {
            zLIZIZ = C960203pA.LIZIZ(context);
        } else {
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            if (poiReviewModel == null) {
                return null;
            }
            UrlStruct darkModeBrandLogo = poiReviewModel.getDarkModeBrandLogo();
            if (darkModeBrandLogo == null) {
                return poiReviewModel.getBrandLogo();
            }
            return darkModeBrandLogo;
        }
        if (poiReviewModel == null) {
            return null;
        }
        return poiReviewModel.getBrandLogo();
    }

    public static final UrlModel LIZIZ(PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Context context) {
        CharSequence charSequenceLJIIIIZZ;
        if (context != null) {
            charSequenceLJIIIIZZ = C1308910kAL.LJIIIIZZ(context);
        } else {
            charSequenceLJIIIIZZ = null;
        }
        if (TextUtils.equals(charSequenceLJIIIIZZ, "TikTok Theme Dark")) {
            UrlModel urlModel = poiReviewSummaryModel.darkModeBrandLogo;
            if (urlModel == null) {
                return poiReviewSummaryModel.brandLogo;
            }
            return urlModel;
        }
        return poiReviewSummaryModel.brandLogo;
    }
}
