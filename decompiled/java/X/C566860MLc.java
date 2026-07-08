package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import nv7.c0;

/* JADX INFO: renamed from: X.0MLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566860MLc {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.onThisDayData.isFromOnThisDay() && C566870MLd.LIZ(creativeModel.onThisDayData)) {
            c0 c0Var = c0.LIZ;
            if (c0Var.o2() == -1) {
                C844470XAv.LIZ.getClass();
                c0Var.s2(ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C844470XAv.LIZ()));
            }
            AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
            abstractC1437870nWLLIZ.LJ(true, true);
            FrameLayout.LayoutParams layoutParamsT2 = c0Var.t2(abstractC1437870nWLLIZ.LJFF(), abstractC1437870nWLLIZ.LIZJ());
            C0MOG c0mog = C576250Mit.LLJJIJIIJIL;
            int i = layoutParamsT2.width;
            int i2 = layoutParamsT2.height;
            c0mog.getClass();
            C0MOG.LIZIZ(creativeModel, i, i2);
        }
    }
}
