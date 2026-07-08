package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.ExploreToFullPageAnimationParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SPA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPA {
    public static final C0SPA LIZ = new C0SPA();

    public static String LIZIZ(PostModeDetailParams postModeDetailParams) {
        if (LIZLLL(postModeDetailParams)) {
            if (postModeDetailParams != null) {
                return postModeDetailParams.tabName;
            }
            return null;
        }
        if (postModeDetailParams != null) {
            return postModeDetailParams.eventType;
        }
        return null;
    }

    public static boolean LIZJ(PostModeDetailParams postModeDetailParams) {
        ExploreToFullPageAnimationParam exploreToFullPageAnimationParam;
        if (postModeDetailParams != null) {
            exploreToFullPageAnimationParam = postModeDetailParams.exploreToFullPageAnimationParam;
        } else {
            exploreToFullPageAnimationParam = null;
        }
        if (exploreToFullPageAnimationParam == null || !C1ER1.LIZIZ.LJJJJLL() || postModeDetailParams.postModeEntranceMechanism != PostModeEntranceMechanism.SEARCH_TAB_CARD) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(PostModeDetailParams postModeDetailParams) {
        String str;
        String str2 = null;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.tabName;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "photos")) {
            if (postModeDetailParams != null) {
                str2 = postModeDetailParams.eventType;
            }
            if (Intrinsics.LJFF(str2, "search_result")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(ViewGroup viewGroup, C0SRL c0srl) {
        String str;
        Aweme aweme = c0srl.LIZJ;
        if (aweme != null) {
            FullPageParam fullPageParam = new FullPageParam(aweme, c0srl.LJII, new ArrayList(), false);
            fullPageParam.setIsEnterGraphicDetail(c0srl.LJIIL.NR());
            C0SPA c0spa = LIZ;
            Context contextLIZLLL = c0srl.LIZLLL();
            c0spa.getClass();
            C2189821An6 c2189821An6LIZ = C0SUC.LIZ(contextLIZLLL);
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Aweme aweme2 = fullPageParam.getAweme();
            String strLIZIZ = LIZIZ(fullPageParam.getPostModeDetailParams());
            PostModeDetailParams postModeDetailParams = fullPageParam.getPostModeDetailParams();
            if (postModeDetailParams != null) {
                str = postModeDetailParams.tabName;
            } else {
                str = null;
            }
            c1er1.LLJI(viewGroup, contextLIZLLL, aweme2, strLIZIZ, str, false, c2189821An6LIZ.getSessionId(), false, Integer.valueOf(c2189821An6LIZ.getPageType()));
        }
    }

    public static void LJ(Context context, FullPageParam fullPageParam, String str) {
        String aid;
        String string;
        String strLIZIZ = LIZIZ(null);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//search");
        smartRouteBuildRoute.withParam("set_hint_by_sug_word", true);
        smartRouteBuildRoute.withParam("is_from_video", "1");
        smartRouteBuildRoute.withParam("in_single_stack", true);
        Aweme aweme = fullPageParam.getAweme();
        String str2 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        smartRouteBuildRoute.withParam("group_id", aid);
        smartRouteBuildRoute.withParam("blankpage_enter_from", strLIZIZ);
        smartRouteBuildRoute.withParam("is_from_video", "1");
        smartRouteBuildRoute.withParam("is_from_photo", "1");
        smartRouteBuildRoute.withParam("blankpage_enter_method", "enter");
        smartRouteBuildRoute.withParam("enter_from", strLIZIZ);
        smartRouteBuildRoute.withParam("enter_blank_page", "1");
        if (C1EE2.LIZIZ.LIZLLL()) {
            String string2 = Integer.valueOf(fullPageParam.isEnterGraphicDetail()).toString();
            if (string2 == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            smartRouteBuildRoute.withParam("is_enter_graphic_detail", string2);
        }
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null) {
            str2 = string;
        }
        if (str2.length() > 0) {
            smartRouteBuildRoute.withParam("keyword", str2);
            smartRouteBuildRoute.withParam("display_keyword", str2);
        }
        smartRouteBuildRoute.open();
    }
}
