package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.TiktokEcSearchRegionConfigSettings;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchResultBgColor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0QYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672180QYe {
    public static final Map<String, C0QYK<? extends Serializable>> LIZ;
    public static final Set<String> LIZIZ;
    public static final List<Pair<Function1<String, Boolean>, Function1<String, EnumC671980QXk>>> LIZJ;

    static {
        Map<String, C0QYK<? extends Serializable>> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("common_source", new C0QZU() { // from class: X.0QZd
            public static final String LIZJ = "common_source";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("use_new_middle_view", new C0QYJ() { // from class: X.0QZJ
            public static final String LIZJ = "use_new_middle_view";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("btm_root_enter_from_type", new C0QZU() { // from class: X.0QZc
            public static final String LIZJ = "btm_root_enter_from_type";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("use_ec_container", C672050QXr.LIZIZ), new Pair("deals_skin_enter_from", new AbstractC1525805yC() { // from class: X.05yD
            public static final String LIZJ = "deals_skin_enter_from";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_ai_search", new C0QYJ() { // from class: X.0QZI
            public static final String LIZJ = "disable_ai_search";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("default_hint_word", new C0QZU() { // from class: X.0QZW
            public static final String LIZJ = "default_hint_word";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_disable_bg", new C0QYJ() { // from class: X.0QZ9
            public static final String LIZJ = "result_disable_bg";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_bg_url", new C0QZU() { // from class: X.0QZY
            public static final String LIZJ = "result_bg_url";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_bg_color", new C0QYK<ECSearchResultBgColor>() { // from class: X.0QYi
            public static final String LIZJ = "result_bg_color";

            @Override // X.C0QYK
            public final /* bridge */ /* synthetic */ ECSearchResultBgColor LIZ() {
                return null;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final ECSearchResultBgColor LIZIZ(String str) {
                if (C123100dR.LIZ(str)) {
                    try {
                        return (ECSearchResultBgColor) C7740030o.LIZ().getGson().LJII(u.LJJIFFI(u.LJJIFFI(str, "\\\\", "\\", false), "\\", "", false), ECSearchResultBgColor.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "resultBgColor parse failed");
                        return null;
                    }
                }
                return null;
            }
        }), new Pair("result_search_bar_mode", new C0QZU() { // from class: X.0QZX
            public static final String LIZJ = "result_search_bar_mode";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_vision_search", new C0QYJ() { // from class: X.0QZ7
            public static final String LIZJ = "disable_vision_search";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("photo_search_align_mall", new C0QYJ() { // from class: X.0QZ6
            public static final String LIZJ = "photo_search_align_mall";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("photo_search_enable", new C0QYM() { // from class: X.0QZ8
            public static final String LIZJ = "photo_search_enable";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_search_bar_ellipsis", new C0QYJ() { // from class: X.0QZ5
            public static final String LIZJ = "disable_search_bar_ellipsis";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("enable_new_user_module", new C0QYJ() { // from class: X.0QZQ
            public static final String LIZJ = "enable_new_user_module";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_guess_strategy", new C0QYJ() { // from class: X.0QY4
            public static final String LIZJ = "disable_guess_strategy";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZIZ(String str) {
                return LIZIZ(str);
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJII */
            public final Boolean LIZIZ(String str) {
                if (TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall) {
                    return Boolean.TRUE;
                }
                boolean z = false;
                if (Intrinsics.LJFF(str, "ecommerce_pdp_search_entrance")) {
                    if (C00Z4.LIZ() == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                if (Intrinsics.LJFF(str, "disable_guess_from_fashion")) {
                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "disable_guess_from_fashion", true, false));
                }
                return super.LIZIZ(str);
            }
        }), new Pair("guess_cache_strategy", new C0QYK<EnumC672280QYo>() { // from class: X.0QYp
            public static final String LIZJ = "guess_cache_strategy";
            public static final EnumC672280QYo LIZLLL = EnumC672280QYo.USE_COMMON_CACHE;

            @Override // X.C0QYK
            public final EnumC672280QYo LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final EnumC672280QYo LIZIZ(String str) {
                for (EnumC672280QYo enumC672280QYo : EnumC672280QYo.values()) {
                    if (Intrinsics.LJFF(str, enumC672280QYo.getCacheStrategy())) {
                        return enumC672280QYo;
                    }
                }
                if (Intrinsics.LJFF(str, "ec_search_pdp_guess_use_cache")) {
                    return EnumC672280QYo.BEFORE_SEARCH_NO_CACHE;
                }
                return LIZ();
            }
        }), new Pair("enable_disk_guess_cache_strategy", new C0QYJ() { // from class: X.0QYQ
            public static final String LIZJ = "enable_disk_guess_cache_strategy";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZIZ(String str) {
                return LIZIZ(str);
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJII */
            public final Boolean LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "ec_search_pdp_guess_use_cache")) {
                    return Boolean.FALSE;
                }
                return super.LIZIZ(str);
            }
        }), new Pair("middle_req_source", new C0QY6() { // from class: X.0QY1
            public static final String LIZJ = "middle_req_source";
            public static final String LIZLLL = "common_source";
            public static final String LJ = EnumC672000QXm.SOURCE_MALL_MIDDLE.getValue();

            @Override // X.C0QYK
            public final String LIZ() {
                return LJ;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final String LJ() {
                return LIZLLL;
            }

            @Override // X.C0QY6, X.C0QYK
            public final /* bridge */ /* synthetic */ String LIZJ(String str, String str2) {
                return LJI(str, str2);
            }

            @Override // X.C0QY6
            public final String LJI(String str, String str2) {
                String str3;
                C0QYK c0qyk = (C0QYK) ((LinkedHashMap) C672180QYe.LIZ).get(LIZLLL);
                Serializable serializable = null;
                if (c0qyk != null) {
                    serializable = (Serializable) c0qyk.LIZIZ(str2);
                }
                if ((serializable instanceof String) && (str3 = (String) serializable) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str3);
                    sbLIZ.append("_middle_page");
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                if (str == null) {
                    return LIZ();
                }
                return str;
            }
        }), new Pair("middle_request_preload", new C0QYJ() { // from class: X.0QZK
            public static final String LIZJ = "middle_request_preload";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("entrance_hint_word_in_top_once", new C0QYJ() { // from class: X.0QZL
            public static final String LIZJ = "entrance_hint_word_in_top_once";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("middle_guess_business_id", new C0QY6() { // from class: X.0QZ1
            public static final String LIZJ = "middle_guess_business_id";
            public static final String LIZLLL = "100011";

            @Override // X.C0QYK
            public final String LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("history_isolate_strategy", new C0QYK<C0QPT>() { // from class: X.0QPU
            public static final String LIZJ = "history_isolate_strategy";
            public static final C0QPT LIZLLL = C0QPT.NO_ISOLATE;

            @Override // X.C0QYK
            public final C0QPT LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final C0QPT LIZIZ(String str) {
                C0QPT c0qpt = C0QPT.ENTRANCE_ISOLATE;
                if (!Intrinsics.LJFF(str, c0qpt.getStrategy())) {
                    if (C275110AqL.LIZ() == C0C8T.SINGLE) {
                        return C0QPT.EC_SINGLE_ISOLATE;
                    }
                    if (C275110AqL.LIZ() == C0C8T.DOUBLE) {
                        return C0QPT.EC_DOUBLE_ISOLATE;
                    }
                    if (TiktokEcSearchRegionConfigSettings.LIZ().specifyHistoryFromMall) {
                        return C0QPT.EC_DOUBLE_ISOLATE;
                    }
                    for (C0QPT c0qpt2 : C0QPT.values()) {
                        if (Intrinsics.LJFF(str, c0qpt2.getStrategy())) {
                            return c0qpt2;
                        }
                    }
                    return LIZLLL;
                }
                return c0qpt;
            }
        }), new Pair("disable_history_strategy", new C0QYJ() { // from class: X.0QYI
            public static final String LIZJ = "disable_history_strategy";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZIZ(String str) {
                return LIZIZ(str);
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJII */
            public final Boolean LIZIZ(String str) {
                if (Intrinsics.LJFF(str, "disable_history_from_fashion")) {
                    return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "disable_history_from_fashion", true, false));
                }
                return super.LIZIZ(str);
            }
        }), new Pair("history_max_count", new AbstractC672260QYm() { // from class: X.0QYu
            public static final String LIZJ = "history_max_count";
            public static final int LIZLLL = 20;

            @Override // X.C0QYK
            public final Integer LIZ() {
                return Integer.valueOf(LIZLLL);
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("middle_history_control_style", new C0QZU() { // from class: X.0QZe
            public static final String LIZJ = "middle_history_control_style";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_sug_strategy", new C0QYK<EnumC671220QUm>() { // from class: X.0QUl
            public static final String LIZJ = "disable_sug_strategy";
            public static final EnumC671220QUm LIZLLL = EnumC671220QUm.NO_DISABLE;

            @Override // X.C0QYK
            public final EnumC671220QUm LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
            
                if (r6.equals("0.0") != false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
            
                r2 = r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
            
                if (r2 == 48) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
            
                if (r2 == 47602) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
            
                if (r2 != 97196323) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
            
                if (r6.equals("false") == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
            
                return X.EnumC671220QUm.NO_DISABLE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
            
                if (r6.equals(com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT) != false) goto L47;
             */
            @Override // X.C0QYK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.EnumC671220QUm LIZIZ(java.lang.String r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.config.SearchSecurityControlConfig r0 = com.ss.android.ugc.aweme.config.SearchSecurityControlConfig.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue r0 = com.ss.android.ugc.aweme.config.SearchSecurityControlConfig.LIZIZ()
                    boolean r0 = r0.disableSug
                    if (r0 == 0) goto L10
                    X.0QUm r2 = X.EnumC671220QUm.DISABLE_REQUEST
                Lf:
                    return r2
                L10:
                    com.ss.android.ugc.aweme.config.TiktokEcSearchRegionConfigSettings$TiktokEcSearchRegionConfigModel r0 = com.ss.android.ugc.aweme.config.TiktokEcSearchRegionConfigSettings.LIZ()
                    boolean r0 = r0.disableSugFromMall
                    if (r0 == 0) goto L1b
                    X.0QUm r2 = X.EnumC671220QUm.DISABLE_REQUEST
                    return r2
                L1b:
                    java.lang.String r4 = "disable_sug_from_fashion"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r4)
                    r1 = 0
                    if (r0 == 0) goto L34
                    X.0C64 r3 = X.C0C64.LJIILLIIL()
                    r2 = 31744(0x7c00, float:4.4483E-41)
                    r0 = 1
                    boolean r0 = r3.LJIIIZ(r2, r4, r0, r1)
                    if (r0 == 0) goto La8
                    X.0QUm r2 = X.EnumC671220QUm.DISABLE_REQUEST
                    return r2
                L34:
                    if (r6 == 0) goto L64
                    int r2 = r6.hashCode()
                    r0 = 49
                    if (r2 == r0) goto L53
                    r0 = 48563(0xbdb3, float:6.8051E-41)
                    if (r2 == r0) goto L7a
                    r0 = 3569038(0x36758e, float:5.001287E-39)
                    if (r2 != r0) goto L82
                    java.lang.String r0 = "true"
                    boolean r0 = r6.equals(r0)
                    if (r0 == 0) goto L82
                L50:
                    X.0QUm r2 = X.EnumC671220QUm.DISABLE_REQUEST
                    return r2
                L53:
                    java.lang.String r0 = "1"
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L50
                    goto L82
                L5c:
                    java.lang.String r0 = "0.0"
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L9c
                L64:
                    X.0QUm[] r4 = X.EnumC671220QUm.values()
                    int r3 = r4.length
                L69:
                    if (r1 >= r3) goto Lab
                    r2 = r4[r1]
                    java.lang.String r0 = r2.getStrategy()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
                    if (r0 != 0) goto Lf
                    int r1 = r1 + 1
                    goto L69
                L7a:
                    java.lang.String r0 = "1.0"
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L50
                L82:
                    int r2 = r6.hashCode()
                    r0 = 48
                    if (r2 == r0) goto L9f
                    r0 = 47602(0xb9f2, float:6.6705E-41)
                    if (r2 == r0) goto L5c
                    r0 = 97196323(0x5cb1923, float:1.9099262E-35)
                    if (r2 != r0) goto L64
                    java.lang.String r0 = "false"
                    boolean r0 = r6.equals(r0)
                    if (r0 == 0) goto L64
                L9c:
                    X.0QUm r2 = X.EnumC671220QUm.NO_DISABLE
                    return r2
                L9f:
                    java.lang.String r0 = "0"
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L9c
                    goto L64
                La8:
                    X.0QUm r2 = X.EnumC671220QUm.NO_DISABLE
                    return r2
                Lab:
                    X.0QUm r2 = X.C671210QUl.LIZLLL
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C671210QUl.LIZIZ(java.lang.String):java.lang.Object");
            }
        }), new Pair("middle_sug_source", new C0QY6() { // from class: X.0QYY
            public static final String LIZJ = "middle_sug_source";
            public static final String LIZLLL = "common_source";
            public static final String LJ = C0QXW.SOURCE_SHOP.getValue();

            @Override // X.C0QYK
            public final String LIZ() {
                return LJ;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final String LJ() {
                return LIZLLL;
            }
        }), new Pair("back_button_style", new AbstractC672260QYm() { // from class: X.0QYd
            public static final String LIZJ = "back_button_style";

            @Override // X.C0QYK
            public final Integer LIZ() {
                return Integer.valueOf(EnumC671590QVx.DEFAULT.getValue());
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_source", new C0QY6() { // from class: X.0QYX
            public static final String LIZJ = "result_source";
            public static final String LIZLLL = "common_source";
            public static final String LJ = C0QXV.SOURCE_SHOP.getValue();

            @Override // X.C0QYK
            public final String LIZ() {
                return LJ;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final String LJ() {
                return LIZLLL;
            }
        }), new Pair("result_channel", new C0QY6() { // from class: X.0QYc
            public static final String LIZJ = "result_channel";
            public static final String LIZLLL = C0QXU.CHANNEL_SHOP.getValue();

            @Override // X.C0QYK
            public final String LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_chunk", new C0QYJ() { // from class: X.0QZA
            public static final String LIZJ = "disable_chunk";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_disable_filter", new C0QYJ() { // from class: X.0QZB
            public static final String LIZJ = "result_disable_filter";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("shop_lynx_schema", new C0QZU() { // from class: X.0QZa
            public static final String LIZJ = "shop_lynx_schema";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("shop_api_version", new C0QZU() { // from class: X.0QZZ
            public static final String LIZJ = "shop_api_version";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_life_retain", new C0QYJ() { // from class: X.0QZ3
            public static final String LIZJ = "disable_life_retain";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("enable_chunk_delay", new C0QYJ() { // from class: X.0QZD
            public static final String LIZJ = "enable_chunk_delay";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("enable_shift_filter", new C0QYM() { // from class: X.0QZF
            public static final String LIZJ = "enable_shift_filter";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("enable_tab_sort_entry", new C0QYM() { // from class: X.0QZG
            public static final String LIZJ = "enable_tab_sort_entry";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("enable_native_filter_entry", new C0QYM() { // from class: X.0QZE
            public static final String LIZJ = "enable_native_filter_entry";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("disable_lynx_filter_entry_count", new C0QYM() { // from class: X.0QZC
            public static final String LIZJ = "disable_lynx_filter_entry_count";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("single_tab_type", new C0QZU() { // from class: X.0QZV
            public static final String LIZJ = "single_tab_type";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("trigger_show_old_result_experiment", new C0QYJ() { // from class: X.0QZ4
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "trigger_show_old_result_experiment";
            }
        }), new Pair("enter_from_second", new C0QZU() { // from class: X.0QZf
            public static final String LIZJ = "enter_from_second";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("vertical_search_scene", new C0QZU() { // from class: X.0QZj
            public static final String LIZJ = "vertical_search_scene";

            @Override // X.C0QYK
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_type", new C0QY6() { // from class: X.0QYs
            public static final String LIZJ = "result_type";
            public static final String LIZLLL = C0QXX.TYPE_SHOP.getValue();

            @Override // X.C0QYK
            public final String LIZ() {
                return LIZLLL;
            }

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_search_type", new C0QZU() { // from class: X.0QZi
            public static final String LIZJ = "result_search_type";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("result_page_search_type", new C0QZU() { // from class: X.0QZh
            public static final String LIZJ = "result_page_search_type";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("middle_search_position", new C0QZU() { // from class: X.0QZg
            public static final String LIZJ = "middle_search_position";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return LIZJ;
            }
        }), new Pair("expand_height", new AbstractC672310QYr() { // from class: X.0QZO
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "expand_height";
            }
        }), new Pair("tux_sheet_mode", new C0QYM() { // from class: X.0QZP
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "tux_sheet_mode";
            }
        }), new Pair("enable_swipe_right_to_close", new C0QYJ() { // from class: X.0QYx
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_swipe_right_to_close";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final Boolean LIZ() {
                return Boolean.TRUE;
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.TRUE;
            }
        }), new Pair("enable_slide_down_to_close", new C0QYJ() { // from class: X.0QYw
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_slide_down_to_close";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final Boolean LIZ() {
                return Boolean.TRUE;
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.TRUE;
            }
        }), new Pair("enable_slide_vertical", new C0QYJ() { // from class: X.0QYT
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_slide_vertical";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZ() {
                return LIZ();
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.valueOf(C1205804ng.LIZ());
            }
        }), new Pair("enable_slide_back_seven_screen", new C0QYJ() { // from class: X.0QYU
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_slide_back_seven_screen";
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.valueOf(((Boolean) C0A4Y.LIZ.getValue()).booleanValue());
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZ() {
                return LIZ();
            }
        }), new Pair("enable_slide_following_hand_opt", new C0QYJ() { // from class: X.0QYq
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_slide_following_hand_opt";
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.valueOf(((Boolean) C672330QYt.LIZ.getValue()).booleanValue());
            }

            @Override // X.C0QYJ, X.C0QYK
            public final /* bridge */ /* synthetic */ Boolean LIZ() {
                return LIZ();
            }
        }), new Pair("enable_player_control", new C0QYJ() { // from class: X.0QZN
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_player_control";
            }
        }), new Pair("half_search_disable_mall_event", new C0QYJ() { // from class: X.0QZM
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "half_search_disable_mall_event";
            }
        }), new Pair("show_query_without_search_bar", new C0QYJ() { // from class: X.0QYz
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "show_query_without_search_bar";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }
        }), new Pair("hide_grabber", new C0QYJ() { // from class: X.0QYy
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "hide_grabber";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }
        }), new Pair("container_type", new C0QYM() { // from class: X.0QZH
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "container_type";
            }
        }), new Pair("skeleton_type", new C0QYM() { // from class: X.0QY0
            public static final String LIZJ = "disable_sug_strategy";

            @Override // X.C0QYK
            public final String LIZLLL() {
                return "skeleton_type";
            }

            @Override // X.C0QYK
            public final String LJ() {
                return LIZJ;
            }

            @Override // X.C0QYK
            public final Integer LIZJ(String str, String str2) {
                Serializable serializable;
                Integer numLJIIJJI;
                C0QYK c0qyk = (C0QYK) ((LinkedHashMap) C672180QYe.LIZ).get(LIZJ);
                if (c0qyk != null) {
                    serializable = (Serializable) c0qyk.LIZIZ(str2);
                } else {
                    serializable = null;
                }
                if (!(serializable instanceof EnumC671220QUm)) {
                    serializable = null;
                }
                if (serializable == EnumC671220QUm.DISABLE_PAGE) {
                    return Integer.valueOf(EnumC671580QVw.NO_SUG.getType());
                }
                if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
                    return null;
                }
                return Integer.valueOf(numLJIIJJI.intValue());
            }
        }), new Pair("page_type", new C0QZU() { // from class: X.0QZb
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "page_type";
            }
        }), new Pair("enable_show_photo_bubble_guide_in_guess", new C0QYJ() { // from class: X.0QYv
            @Override // X.C0QYK
            public final String LIZLLL() {
                return "enable_show_photo_bubble_guide_in_guess";
            }

            @Override // X.C0QYJ, X.C0QYK
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }

            @Override // X.C0QYJ
            /* JADX INFO: renamed from: LJI */
            public final Boolean LIZ() {
                return Boolean.FALSE;
            }
        }));
        if (C1205804ng.LIZ()) {
            mapLJIIJ.put("guess_cache_read_strategy", C672210QYh.LIZIZ);
            mapLJIIJ.put("guess_cache_write_strategy", new AbstractC672260QYm() { // from class: X.0QYf
                public static final String LIZJ = "guess_cache_write_strategy";
                public static final String LIZLLL = "disable_guess_strategy";
                public static final int LJ = EnumC672230QYj.COMMON.getValue();

                @Override // X.C0QYK
                public final boolean LJFF() {
                    return false;
                }

                @Override // X.C0QYK
                public final Integer LIZ() {
                    return Integer.valueOf(LJ);
                }

                @Override // X.C0QYK
                public final String LIZLLL() {
                    return LIZJ;
                }

                @Override // X.C0QYK
                public final String LJ() {
                    return LIZLLL;
                }

                @Override // X.C0QYK
                public final Integer LIZJ(String str, String str2) {
                    Float fLJIIIIZZ;
                    Boolean bool;
                    Map<String, C0QYK<? extends Serializable>> map = C672180QYe.LIZ;
                    C672210QYh.LIZIZ.getClass();
                    C0QYK c0qyk = (C0QYK) ((LinkedHashMap) map).get(C672210QYh.LIZLLL);
                    Serializable serializable = null;
                    if (c0qyk != null) {
                        serializable = (Serializable) c0qyk.LIZIZ(str2);
                    }
                    if ((serializable instanceof Boolean) && (bool = (Boolean) serializable) != null && bool.booleanValue()) {
                        return Integer.valueOf(EnumC672230QYj.DISABLE.getValue());
                    }
                    for (EnumC672230QYj enumC672230QYj : EnumC672230QYj.values()) {
                        if (str != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str)) != null && ((int) fLJIIIIZZ.floatValue()) == enumC672230QYj.getValue()) {
                            return Integer.valueOf(enumC672230QYj.getValue());
                        }
                    }
                    return LIZIZ(str);
                }
            });
            mapLJIIJ.remove("disable_vision_search");
        }
        LIZ = mapLJIIJ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0QYK c0qyk : ((LinkedHashMap) mapLJIIJ).values()) {
            if (c0qyk.LJFF()) {
                linkedHashSet.add(c0qyk.LIZLLL());
            }
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = C672530QZn.LIZ;
        String[] strArr2 = (String[]) c0c64LJIILLIIL.LJJIII("ec_search_schema_params", 0, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str : strArr) {
            linkedHashSet.add(str);
        }
        LIZIZ = linkedHashSet;
        ArrayList arrayList = new ArrayList();
        for (EnumC671980QXk enumC671980QXk : EnumC671980QXk.values()) {
            arrayList.add(new Pair(new AwS589S0100000_10(enumC671980QXk, 606), new AwS589S0100000_10(enumC671980QXk, 607)));
        }
        arrayList.add(new Pair(AFwS241S0000000_10.get$arr$(547), AFwS241S0000000_10.get$arr$(548)));
        arrayList.add(new Pair(AFwS241S0000000_10.get$arr$(549), AFwS241S0000000_10.get$arr$(550)));
        LIZJ = arrayList;
    }

    public static EnumC671980QXk LIZ(String str) {
        for (Pair pair : (ArrayList) LIZJ) {
            if (((Boolean) ((Function1) pair.getFirst()).invoke(str)).booleanValue()) {
                return (EnumC671980QXk) ((Function1) pair.getSecond()).invoke(str);
            }
        }
        return EnumC671980QXk.NONE;
    }
}
