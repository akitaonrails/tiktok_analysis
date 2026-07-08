package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0F76, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F76 implements C0TVI {
    public final C0F77 LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    public C0F76(C0F77 c0f77) {
        this.LL = c0f77;
    }

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
        this.LLILLL = zLJIIIIZZ;
        if (zLJIIIIZZ) {
            int i = c20246014Ju.LIZ(8).LIZLLL;
            int i2 = 0;
            if (Build.VERSION.SDK_INT >= 35) {
                Context context = view.getContext();
                if (context == null) {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = 0;
                } else {
                    iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
                }
                i -= iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
            }
            if (i > 1) {
                i2 = i;
            }
            this.LLILLJJLI = i2;
        }
        boolean z = this.LLILLL;
        if (z && this.LLILLJJLI == 0) {
            return c20246014Ju;
        }
        this.LL.El(this.LLILLJJLI, z);
        return c20246014Ju;
    }
}
