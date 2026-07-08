package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05F7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.addyours.PublishRecommendAddYoursComponent$requestRecommend$1$1", f = "PublishRecommendAddYoursComponent.kt", l = {}, m = "invokeSuspend")
public final class C05F7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<AddYoursStickerTopicRepoApi.RecommendTopicsResult, Unit> LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05F7(Object obj, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05F7(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishRecommendAddYoursComponent@aebb.requestRecommend$1$1");
        boolean zLJI = MethodIDManager.LJI(202129);
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<AddYoursStickerTopicRepoApi.RecommendTopicsResult, Unit> function1 = this.LL;
        Object obj2 = this.LLILLJJLI;
        C155000ia.LIZIZ(obj2);
        function1.invoke((AddYoursStickerTopicRepoApi.RecommendTopicsResult) obj2);
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("PublishRecommendAddYoursComponent@aebb.requestRecommend$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
