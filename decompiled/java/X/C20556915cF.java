package X;

import android.view.View;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import java.util.Arrays;

/* JADX INFO: renamed from: X.15cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556915cF {
    public static void LIZ(String str, Integer num, Integer num2, View... viewArr) {
        Integer numValueOf;
        Integer numValueOf2;
        ScreenAdaptionResult screenAdaptionResult;
        View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
        C1604450rr1 c1604450rr1 = C1604450rr1.LLJ;
        if (c1604450rr1 != null && (screenAdaptionResult = (ScreenAdaptionResult) c1604450rr1.LLILZ) != null) {
            numValueOf = Integer.valueOf(screenAdaptionResult.getScreenHeight());
            numValueOf2 = Integer.valueOf(screenAdaptionResult.getScreenWidth());
        } else {
            AbstractC1879030yzt.LIZ(new C20321014fI());
            numValueOf = null;
            numValueOf2 = null;
        }
        View[] viewArr3 = (View[]) Arrays.copyOf(viewArr2, viewArr2.length);
        if (str != null && num != null && num2 != null && numValueOf != null && numValueOf2 != null) {
            C20561315cx c20561315cx = new C20561315cx("feed_cell_init", new VideoAdaptionManagerContext(str, new C20564615dU() { // from class: X.15ce
                @Override // X.C20564615dU, X.InterfaceC20561915d3
                public final AbstractC20561415cy getAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext, VideoAdaptionParams videoAdaptionParams) {
                    return getDefaultAdaptionStrategy(videoAdaptionManagerContext);
                }
            }));
            VideoAdaptionParams videoAdaptionParams = new VideoAdaptionParams(numValueOf2.intValue(), numValueOf.intValue(), num2.intValue(), num.intValue(), null, false, 0.0f, null, EnumC584530MwF.NONE, false, null, false);
            if (C20559315cd.LIZ(videoAdaptionParams)) {
                c20561315cx.LJI(videoAdaptionParams);
            }
            VideoAdaptionResult videoAdaptionResult = (VideoAdaptionResult) c20561315cx.LLILZ;
            if (videoAdaptionResult != null) {
                for (View view : viewArr3) {
                    videoAdaptionResult.saveResultInner(view);
                }
            }
        }
    }
}
