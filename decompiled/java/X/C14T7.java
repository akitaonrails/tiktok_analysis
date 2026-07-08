package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.router.ITakoRouterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14T7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C14T7 extends C2217421BqW implements Function1<String, Unit> {
    public C14T7(Object obj) {
        super(1, obj, TakoAssem.class, "onScreenShotFloatingClick", "onScreenShotFloatingClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Object obj;
        Object obj2;
        String str2 = str;
        TakoAssem takoAssem = (TakoAssem) this.receiver;
        if (takoAssem.LLLF) {
            takoAssem.Ip();
            ITakoRouterService iTakoRouterService = (ITakoRouterService) takoAssem.LLJLLL.getValue();
            if (iTakoRouterService != null) {
                Context context = takoAssem.getContext();
                C724270Sb3 c724270Sb3 = takoAssem.LLJI;
                C2189821An6 c2189821An6 = null;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                C724270Sb3 c724270Sb32 = takoAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj2).baseFeedPageParams;
                if (baseFeedPageParams != null) {
                    c2189821An6 = baseFeedPageParams.param;
                }
                iTakoRouterService.LIZIZ(context, aweme, c2189821An6, "click_screenshot_popup", takoAssem.Fp(), null, str2, EnumC1864410ycJ.SEVEN_SPLIT_SCREEN, new C14TC(new C14T9(takoAssem)), new C14TB(new C14T8(takoAssem)), null, null, null);
            }
        }
        return Unit.LIZ;
    }
}
