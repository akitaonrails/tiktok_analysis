package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18NJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NJ {
    public static final C18NJ LIZ = new C18NJ();

    public static int LIZ(int i) {
        if (i != C0TVM.ONLINE.ordinal()) {
            if (i == C0TVM.ORANGE_BAG.ordinal()) {
                return R.raw.icon_anchor_product_alt_2;
            }
            if (i == C0TVM.ORANGE_CART.ordinal()) {
                return R.raw.icon_anchor_product_alt_1;
            }
            return R.raw.icon_anchor_product;
        }
        return R.raw.icon_anchor_product;
    }

    public static ShowcaseContent LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        Type type;
        if (anchorCommonStruct == null) {
            return null;
        }
        try {
            String strOptString = new JSONObject(anchorCommonStruct.getExtra()).optString("shop_showcase_info");
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(ShowcaseContent.class));
                } else {
                    type = new TypeToken<ShowcaseContent>() { // from class: X.18OB
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strOptString, type);
                if (!(objLJIIIIZZ instanceof ShowcaseContent)) {
                    objLJIIIIZZ = null;
                }
                return (ShowcaseContent) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static boolean LIZLLL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZJ(C18NJ c18nj, Context context, ShowcaseContent showcaseContent, Aweme aweme, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String authorUid;
        String authorUid2;
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String aid;
        c18nj.getClass();
        String name = null;
        if (z) {
            if (showcaseContent != null) {
                str2 = showcaseContent.shopShowcaseSchemaFullScreen;
            } else {
                return;
            }
        } else if (showcaseContent == null) {
            return;
        } else {
            str2 = showcaseContent.shopShowcaseSchemaHalfScreen;
        }
        if (str2 != null && str2.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C18N7.LIZ.getClass();
            linkedHashMap.put("enter_method", C18N7.LIZIZ(aweme));
            String str5 = "";
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            linkedHashMap.put("enter_from", str3);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            linkedHashMap.put("source_previous_page", str4);
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                authorUid = "";
            }
            linkedHashMap.put("author_id", authorUid);
            LIZ.getClass();
            linkedHashMap.put("is_multi_anchor", Integer.valueOf(!LIZLLL(aweme) ? 1 : 0));
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("previous_page", str);
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str5 = aid;
            }
            linkedHashMap.put("list_source_content_id", str5);
            if (aweme != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid2 = null;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            linkedHashMap.put("is_self", Integer.valueOf(Intrinsics.LJFF(authorUid2, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
            C1735020vFc.LIZ.getClass();
            String strLJIIIIZZ = C1735020vFc.LJIIIIZZ(str2, "trackParams", linkedHashMap);
            if (context != null) {
                SmartRouter.buildRoute(context, strLJIIIIZZ).open();
            }
        }
    }
}
