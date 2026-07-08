package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D0X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpPreloadManager$preloadRecommendations$6$2$finalSlots$1", f = "PdpPreloadManager.kt", l = {229}, m = "invokeSuspend")
public final class C0D0X extends C09AX implements Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D2Y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0X(C0D2Y c0d2y, InterfaceC1364105Vn<? super C0D0X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0d2y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D0X c0d0x = new C0D0X(this.LLILLL, interfaceC1364105Vn);
        c0d0x.LLILLJJLI = obj;
        return c0d0x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UcpRecommendationItem ucpRecommendationItem = (UcpRecommendationItem) this.LLILLJJLI;
            C331730CzT c331730CzT = this.LLILLL.LIZ;
            this.LL = 1;
            objLIZIZ = c331730CzT.LIZIZ(ucpRecommendationItem, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("PdpPreloadManager@1b72.preloadRecommendations$6$2$finalSlots$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UcpRecommendationItem ucpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>> interfaceC1364105Vn) {
        return ((a) create(ucpRecommendationItem, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
