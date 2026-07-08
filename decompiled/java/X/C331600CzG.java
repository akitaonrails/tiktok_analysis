package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchProductWithColorFallback$fallbackResult$1", f = "PDPDataRepository.kt", l = {137}, m = "invokeSuspend")
public final class C331600CzG extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC331650CzL LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331600CzG(InterfaceC331650CzL interfaceC331650CzL, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C331600CzG> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC331650CzL;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331600CzG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$fallbackResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC331650CzL interfaceC331650CzL = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            this.LL = 1;
            objLIZJ = interfaceC331650CzL.LIZJ(str, str2, map, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$fallbackResult$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchProductWithColorFallback$fallbackResult$1");
        return c189200o6M1boximpl;
    }
}
