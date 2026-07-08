package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchReviews$2", f = "PDPDataRepository.kt", l = {291}, m = "invokeSuspend")
public final class C331550CzB extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>>, Object> {
    public int LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331550CzB(C331730CzT c331730CzT, String str, String str2, InterfaceC1364105Vn<? super C331550CzB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331550CzB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchReviews$2");
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
            InterfaceC331560CzC interfaceC331560CzC = this.LLILLJJLI.LIZLLL;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            objLIZ = interfaceC331560CzC.LIZ(str, str2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchReviews$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchReviews$2");
        return c189200o6M1boximpl;
    }
}
