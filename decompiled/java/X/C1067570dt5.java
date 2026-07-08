package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GamePartnership;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067570dt5 {
    public static int LIZIZ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        Long lValueOf;
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null && (lValueOf = Long.valueOf(gamePartnership.publisherTaskId)) != null && lValueOf.longValue() > 0 && aweme != null && (anchors = aweme.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2.getBizGroup() == 1 && anchorCommonStruct2.getType() == 79) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            if (!arrayList.isEmpty()) {
                return (aweme == null || AwemeExtKt.isPseudoAd(aweme)) ? 1 : 1;
            }
        }
        return 0;
    }

    public static void LIZ(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct, Aweme aweme) {
        String schema;
        Long adId;
        if (aweme == null) {
            return;
        }
        c2344009Gk.LIZJ(AwemeExtKt.getPromoteAdTypeForReport(aweme), "promote_ad_type");
        c2344009Gk.LIZJ(aweme.isAd() ? 1 : 0, "game_ad_type");
        c2344009Gk.LIZJ(LIZIZ(aweme), "roi2_status");
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (adId = awemeRawAd.getAdId()) != null) {
                c2344009Gk.LIZLLL(adId.longValue(), "game_ad_id");
            }
            if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                Uri uri = UriProtector.parse(schema);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    c2344009Gk.LJFF("game_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_name");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                    c2344009Gk.LJFF("game_name", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
