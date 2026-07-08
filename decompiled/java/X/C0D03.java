package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0D03, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository$enrichAcpItem$acpResult$1", f = "RecommendRepository.kt", l = {343}, m = "invokeSuspend")
public final class C0D03 extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public final /* synthetic */ UcpRecommendationItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D03(C0D0E c0d0e, UcpRecommendationItem ucpRecommendationItem, InterfaceC1364105Vn<? super C0D03> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
        this.LLILLL = ucpRecommendationItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D03(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("RecommendRepository@cb16.enrichAcpItem$acpResult$1");
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
            InterfaceC331650CzL interfaceC331650CzL = this.LLILLJJLI.LIZLLL;
            UcpRecommendationItem ucpRecommendationItem = this.LLILLL;
            String str = ucpRecommendationItem.shopDomain;
            if (str == null) {
                str = "";
            }
            String productId = ucpRecommendationItem.getProductId();
            this.LL = 1;
            objLIZIZ = interfaceC331650CzL.LIZIZ(str, productId, C2097608Jq.LJ(), this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("RecommendRepository@cb16.enrichAcpItem$acpResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.enrichAcpItem$acpResult$1");
        return c189200o6M1boximpl;
    }
}
