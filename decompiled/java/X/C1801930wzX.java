package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801930wzX {
    public static final C1801930wzX LIZ = new C1801930wzX();
    public static final C1800000wwQ LIZIZ = new C1800000wwQ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static boolean LIZIZ(C1801930wzX c1801930wzX, Activity activity, C07ZA c07za) {
        String string;
        Activity activityLIZIZ;
        c1801930wzX.getClass();
        int i = C1799950wwL.LIZ[c07za.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ?? r8 = activity;
                if (i == 3) {
                    if (activity == 0) {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                        } else {
                            activityLIZIZ = null;
                        }
                        boolean z = activityLIZIZ instanceof Activity;
                        r8 = activityLIZIZ;
                        if (!z || activityLIZIZ == null) {
                            return false;
                        }
                    }
                    C1395660mQG c1395660mQG = C1395660mQG.LIZ;
                    AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(324);
                    c1395660mQG.getClass();
                    C1395660mQG.LIZIZ(r8, aFwS259S0000000_21);
                    return true;
                }
                throw new C1954807lC();
            }
            return LIZ(c1801930wzX, activity, "revisit_edu_api", 12);
        }
        String str = c07za.LIZIZ;
        MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
        if (miniGameFragmentLIZIZ != null) {
            EnumC2196901AyW enumC2196901AyW = EnumC2196901AyW.STARTENTRANCEMISSION;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MinisFragment.LLLLLLJ;
            miniGameFragmentLIZIZ.SR(enumC2196901AyW, false);
        }
        if (activity == 0) {
            C844470XAv.LIZ.getClass();
            activity = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) activity, "//main");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
        smartRouteBuildRoute.withParam("minis_auto_open_profile_more", true);
        smartRouteBuildRoute.withParam("minis_auto_open_profile_more_from", "revisit_edu_api");
        smartRouteBuildRoute.withParam("minis_profile_sidebar_revisit_edu", "1");
        smartRouteBuildRoute.withParam("key_menu_specify_item_highlight", new String[]{"content_section_cell_tiktok_minis", "content_section_cell_tiktok_minis_rich_card"});
        smartRouteBuildRoute.addFlags(67108864);
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            smartRouteBuildRoute.withParam("minis_highlight_client_key", string);
        }
        smartRouteBuildRoute.open();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.app.Activity] */
    public static boolean LIZ(C1801930wzX c1801930wzX, Activity activity, String str, int i) {
        boolean z;
        boolean z2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        MiniGameFragment miniGameFragmentLIZIZ;
        if ((i & 2) != 0) {
            str = "revisit_edu_api";
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1801930wzX.getClass();
        if (z) {
            C1591070rVR.LIZ.getClass();
            if (!C1591070rVR.LIZ()) {
                return false;
            }
        }
        if (z2 && (miniGameFragmentLIZIZ = C2195221Avo.LIZIZ()) != null) {
            EnumC2196901AyW enumC2196901AyW = EnumC2196901AyW.STARTENTRANCEMISSION;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MinisFragment.LLLLLLJ;
            miniGameFragmentLIZIZ.SR(enumC2196901AyW, false);
        }
        if (activity == 0 && ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (activity = abstractC1387200mCcLIZIZ.LIZIZ()) == 0)) {
            C844470XAv.LIZ.getClass();
            activity = C844470XAv.LIZ();
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) activity, "//main");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute.withParam("show_feed_sidebar", 1);
        smartRouteBuildRoute.withParam("first_minis_guide", 1);
        smartRouteBuildRoute.withParam("show_feed_sidebar_guide", 1);
        smartRouteBuildRoute.withParam("minis_entrance_from", str);
        smartRouteBuildRoute.addFlags(67108864);
        smartRouteBuildRoute.open();
        return true;
    }
}
