package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS288S0300000_10;

/* JADX INFO: renamed from: X.0Q3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664120Q3e {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Aweme LIZ;
    public final C19EG LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C00BD LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public boolean LJII;
    public SearchResultParam LJIIIIZZ;

    public final void LIZ(String str, Function1<? super Bundle, Unit> function1) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        String aid;
        if (this.LJII && this.LJIIIIZZ != null) {
            function1.invoke(null);
            SearchResultParam searchResultParam = this.LJIIIIZZ;
            if (searchResultParam != null) {
                searchResultParam.setKeyword(str);
            }
            SearchResultParam searchResultParam2 = this.LJIIIIZZ;
            if (searchResultParam2 != null) {
                C1440005kM.LIZ(new C588260N5k(searchResultParam2));
                return;
            }
            return;
        }
        Aweme aweme = this.LIZ;
        String str2 = this.LIZLLL;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("in_single_stack", "true", bundle);
        C786410Ut5.LJJJI("keyword", this.LIZJ, bundle);
        bundle.putBoolean("set_hint_by_sug_word", true);
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isLike());
        } else {
            boolValueOf = null;
        }
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(boolValueOf), bundle);
        if (aweme != null) {
            boolValueOf2 = Boolean.valueOf(AwemeExtKt.isCollected(aweme));
        } else {
            boolValueOf2 = null;
        }
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(boolValueOf2), bundle);
        if (aweme != null) {
            boolValueOf3 = Boolean.valueOf(AwemeBizExtKt.isCommentClicked(aweme));
        } else {
            boolValueOf3 = null;
        }
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(boolValueOf3), bundle);
        if (aweme != null) {
            boolValueOf4 = Boolean.valueOf(AwemeBizExtKt.isForwardClicked(aweme));
        } else {
            boolValueOf4 = null;
        }
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(boolValueOf4), bundle);
        C786410Ut5.LJJJI("search_position", str2, bundle);
        C786410Ut5.LJJJI("back_flag", "1", bundle);
        C786410Ut5.LJJJI("preClickImprId", this.LJFF, bundle);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C786410Ut5.LJJJI("group_id", aid, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("enter_method", this.LJ.getValue(), bundle);
        bundle.putBoolean("search_saf", true);
        boolean zIsEnableAdStarHub = false;
        if (aweme != null && aweme.isAd()) {
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                zIsEnableAdStarHub = commerceVideoAuthInfo.isEnableAdStarHub();
            }
            C786410Ut5.LJJJI("enable_ad_star_hub", String.valueOf(zIsEnableAdStarHub), bundle);
        }
        C786410Ut5.LJJJI("is_display_sevensplit_screen", "1", bundle);
        bundle.putBoolean("is_from_ocr_text_search", true);
        C0QEO c0qeo = C0QEO.LIZ;
        C19EG c19eg = this.LIZIZ;
        Uri.Builder builderBuildUpon = UriProtector.parse("//search").buildUpon();
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet != null) {
            for (String str3 : setKeySet) {
                try {
                    Object obj = bundle.get(str3);
                    if (obj != null) {
                        builderBuildUpon.appendQueryParameter(str3, obj.toString());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        c0qeo.LJIIJJI(c19eg, builderBuildUpon.build(), bundle, null, new AwS288S0300000_10(this, (C664120Q3e) bundle, (Bundle) function1, (Function1<? super Bundle, Unit>) 5));
    }

    public C664120Q3e(Aweme aweme, C19EG c19eg, String str, String str2, C00BD c00bd, String str3, Map<String, String> map) {
        this.LIZ = aweme;
        this.LIZIZ = c19eg;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = c00bd;
        this.LJFF = str3;
        this.LJI = map;
    }
}
