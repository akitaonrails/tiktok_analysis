package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Czz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository$fetchSeedsWithCache$cacheResult$1", f = "RecommendRepository.kt", l = {189}, m = "invokeSuspend")
public final class C332050Czz extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public final /* synthetic */ RecommendApiRequestDto LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332050Czz(C0D0E c0d0e, RecommendApiRequestDto recommendApiRequestDto, InterfaceC1364105Vn<? super C332050Czz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
        this.LLILLL = recommendApiRequestDto;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C332050Czz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends RecommendApiResponseDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("RecommendRepository@cb16.fetchSeedsWithCache$cacheResult$1");
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
            C0D0E c0d0e = this.LLILLJJLI;
            RecommendApiRequestDto recommendApiRequestDto = this.LLILLL;
            this.LL = 1;
            objLIZIZ = c0d0e.LIZIZ(recommendApiRequestDto, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("RecommendRepository@cb16.fetchSeedsWithCache$cacheResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.fetchSeedsWithCache$cacheResult$1");
        return c189200o6M1boximpl;
    }
}
