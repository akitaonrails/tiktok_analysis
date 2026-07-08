package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$beginColorFetch$2", f = "EffectRecommendationCarouselViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2470609mC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super int[]>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470609mC(Bitmap bitmap, EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC1364105Vn<? super C2470609mC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = effectRecommendationCarouselViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2470609mC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectRecommendationCarouselViewModel@7d94.beginColorFetch$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int width = this.LL.getWidth();
        int height = (int) (this.LL.getHeight() * 0.1f);
        if (height < 1) {
            height = 1;
        }
        Rect rect = new Rect(0, 0, width, height);
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = this.LLILLJJLI;
        FlyMainColor flyMainColor = FlyMainColor.LIZ;
        C204674156y c204674156yLIZ = flyMainColor.LIZ(new C2439109h7(this.LL, rect));
        effectRecommendationCarouselViewModel.getClass();
        Integer numZQ2 = EffectRecommendationCarouselViewModel.zQ2(c204674156yLIZ);
        int height2 = this.LL.getHeight();
        int height3 = (int) (this.LL.getHeight() * 0.1f);
        if (height3 < 1) {
            height3 = 1;
        }
        rect.set(0, height2 - height3, this.LL.getWidth(), this.LL.getHeight());
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel2 = this.LLILLJJLI;
        C204674156y c204674156yLIZ2 = flyMainColor.LIZ(new C2439109h7(this.LL, rect));
        effectRecommendationCarouselViewModel2.getClass();
        Integer numZQ22 = EffectRecommendationCarouselViewModel.zQ2(c204674156yLIZ2);
        if (numZQ2 != null && numZQ22 != null) {
            int[] iArr = {numZQ2.intValue(), numZQ22.intValue()};
            C1C7U.LIZIZ("EffectRecommendationCarouselViewModel@7d94.beginColorFetch$2");
            return iArr;
        }
        C1C7U.LIZIZ("EffectRecommendationCarouselViewModel@7d94.beginColorFetch$2");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super int[]> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
