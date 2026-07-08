package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Pair;
import nv7.c0;

/* JADX INFO: renamed from: X.0MUO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUO {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(Context context) {
        c0 c0Var = c0.LIZ;
        IVideoConfigService iVideoConfigServiceLJJJJLI = C0CHQ.LIZ().LJJJJLI();
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
        if (iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight != c0Var.o2()) {
            c0Var.s2(iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParamsT2 = c0Var.t2(iVideoConfigServiceLJJJJLI.getVideoWidth(), iVideoConfigServiceLJJJJLI.getVideoHeight());
        return new Pair(Integer.valueOf(layoutParamsT2.width), Integer.valueOf(layoutParamsT2.height));
    }
}
