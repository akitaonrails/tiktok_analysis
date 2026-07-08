package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository$doFetch$2", f = "RecommendRepository.kt", l = {223}, m = "invokeSuspend")
public final class C332040Czy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public final /* synthetic */ RecommendApiRequestDto LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332040Czy(C0D0E c0d0e, RecommendApiRequestDto recommendApiRequestDto, InterfaceC1364105Vn<? super C332040Czy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
        this.LLILLL = recommendApiRequestDto;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332040Czy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("RecommendRepository@cb16.doFetch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC332020Czw interfaceC332020Czw = this.LLILLJJLI.LIZ;
            RecommendApiRequestDto recommendApiRequestDto = this.LLILLL;
            this.LL = 1;
            objLIZ = interfaceC332020Czw.LIZ(recommendApiRequestDto, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("RecommendRepository@cb16.doFetch$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.doFetch$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
