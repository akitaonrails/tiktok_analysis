package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQ8 implements InterfaceC651090PgJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final PromotionInfo LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final Integer LJIIJ;
    public final Boolean LJIIJJI;
    public final Word LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(524));

    @Override // X.InterfaceC651090PgJ
    public final void LIZIZ(C0Q2Q<?> c0q2q) {
    }

    public final Bundle LJ() {
        return (Bundle) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC651090PgJ
    public final void LIZ(C0PXF c0pxf) {
        String str;
        String str2 = this.LJIILJJIL;
        if (str2 == null) {
            str = "comment_related_search";
        } else {
            str = str2;
        }
        c0pxf.LIZ = str;
        c0pxf.LIZIZ = this.LIZ;
        if (str2 == null) {
            str2 = "comment_related_search";
        }
        c0pxf.LIZJ = str2;
    }

    @Override // X.InterfaceC651090PgJ
    public final void LIZJ(Bundle bundle) {
        C786410Ut5.LJJIIJZLJL(bundle, LJ());
    }

    public final boolean LIZLLL(C19EG c19eg, Aweme aweme, boolean z) {
        return C1ER1.LIZIZ.j0(c19eg, aweme, this.LIZ, EnumC667230QFd.SEARCH_RELATED_WORD, false, z);
    }

    public final Bundle LJFF(C19EG c19eg, Aweme aweme, boolean z) {
        Map<String, String> mapLJLJL;
        String strLJII;
        boolean zIsEnableAdStarHub;
        boolean z2;
        boolean z3;
        C786410Ut5.LJJJI("in_single_stack", "true", LJ());
        C786410Ut5.LJJJI("keyword", this.LIZJ, LJ());
        C786410Ut5.LJJJI("group_id", aweme.getAid(), LJ());
        String str = "1";
        C786410Ut5.LJJJI("is_from_comment", "1", LJ());
        C786410Ut5.LJJJI("search_position", this.LIZ, LJ());
        C786410Ut5.LJJJI("tab_name", this.LIZIZ, LJ());
        C786410Ut5.LJJJI("set_hint_by_sug_word", "true", LJ());
        C786410Ut5.LJJJI("enter_from", this.LIZ, LJ());
        Bundle bundleLJ = LJ();
        String str2 = this.LJIILJJIL;
        if (str2 == null) {
            str2 = "comment_related_search";
        }
        C786410Ut5.LJJJI("enter_method", str2, bundleLJ);
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(aweme.isLike()), LJ());
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(aweme)), LJ());
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(aweme)), LJ());
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(aweme)), LJ());
        PromotionInfo promotionInfo = this.LJ;
        String str3 = null;
        boolean z4 = true;
        if (promotionInfo != null) {
            String promotionText = promotionInfo.getPromotionText();
            if (C123100dR.LIZ(promotionText) && !C1101304Sl.LIZ(this.LIZLLL)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                promotionText = null;
            }
            if (promotionText != null) {
                C786410Ut5.LJJIZ(LJ(), "extraLogParams", C786410Ut5.J3(new JSONObject().put("from_promotion_text", promotionText).put("from_promotion_type", promotionInfo.getPromotionType())));
            }
        }
        String str4 = this.LIZLLL;
        if (C123100dR.LIZ(str4)) {
            str3 = str4;
        }
        if (str3 != null) {
            C786410Ut5.LJJJI("words_extra_type", str3, LJ());
        }
        if (C1ER1.LIZIZ.LJJJLL(this.LIZ) || Intrinsics.LJFF("others_homepage", this.LIZ)) {
            C786410Ut5.LJJJI("is_from_video_fix", "1", LJ());
        }
        if (Intrinsics.LJFF(this.LIZ, EnumC669620QOi.PHOTO.getTabName())) {
            C786410Ut5.LJJJI("is_from_video", "1", LJ());
        }
        C786410Ut5.LJJJI("penetrate_info", this.LJFF, LJ());
        if (!C1101304Sl.LIZ(this.LIZLLL)) {
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LIZJ(aweme, this.LJIILIIL)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C786410Ut5.LJJJI("has_coin_entrance", "1", LJ());
            }
        }
        if (C1101304Sl.LIZ(this.LIZLLL)) {
            C786410Ut5.LJJJI("is_from_sensitive_words", "1", LJ());
        }
        if (aweme.isAd()) {
            Bundle bundleLJ2 = LJ();
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
            } else {
                zIsEnableAdStarHub = false;
            }
            C786410Ut5.LJJJI("enable_ad_star_hub", String.valueOf(zIsEnableAdStarHub), bundleLJ2);
        }
        if (!C1010120cOQ.LJIIJ(aweme)) {
            z4 = false;
        }
        if (z4 && (strLJII = C1010120cOQ.LJII(aweme)) != null) {
            C786410Ut5.LJJJI("search_ad_extra_context", strLJII, LJ());
        }
        Bundle bundleLJ3 = LJ();
        if (!LIZLLL(c19eg, aweme, z)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_display_sevensplit_screen", str, bundleLJ3);
        LJ().putBoolean("search_saf", C1826907Dn.LIZ());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null && (mapLJLJL = iEcomSearchService.LJLJL(this.LJFF)) != null) {
            linkedHashMap.putAll(mapLJLJL);
        }
        if (!linkedHashMap.isEmpty()) {
            try {
                C786410Ut5.LJJJI("suggest_word_mob_extra", C1741890vQh.LJIIIIZZ(linkedHashMap), LJ());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return LJ();
    }

    public C0QQ8(String str, String str2, String str3, String str4, PromotionInfo promotionInfo, String str5, String str6, String str7, String str8, int i, Integer num, Boolean bool, Word word, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = promotionInfo;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = i;
        this.LJIIJ = num;
        this.LJIIJJI = bool;
        this.LJIIL = word;
        this.LJIILIIL = str9;
        this.LJIILJJIL = str10;
    }
}
