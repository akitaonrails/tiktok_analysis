package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchThroughCache$2", f = "PDPDataRepository.kt", l = {95}, m = "invokeSuspend")
public final class C331590CzF extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>>, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331590CzF(Function1<? super InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>>, ? extends Object> function1, InterfaceC1364105Vn<? super C331590CzF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331590CzF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPDataRepository@79c7.fetchThroughCache$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Function1<InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>>, Object> function1 = this.LLILLJJLI;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchThroughCache$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchThroughCache$2");
        return obj;
    }
}
