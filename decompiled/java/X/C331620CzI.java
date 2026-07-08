package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchDynamicVariant$2$result$1", f = "PDPDataRepository.kt", l = {254}, m = "invokeSuspend")
public final class C331620CzI extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public final /* synthetic */ InterfaceC331650CzL LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331620CzI(C331730CzT c331730CzT, InterfaceC331650CzL interfaceC331650CzL, String str, String str2, Map<String, String> map, int i, InterfaceC1364105Vn<? super C331620CzI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
        this.LLILLL = interfaceC331650CzL;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331620CzI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchDynamicVariant$2$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIIIIZZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C331730CzT c331730CzT = this.LLILLJJLI;
            InterfaceC331650CzL interfaceC331650CzL = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            int i2 = this.LLIZ;
            c331730CzT.getClass();
            Map<String, String> mapLIZ = C331730CzT.LIZ(i2, str, str2, map);
            C331610CzH c331610CzH = new C331610CzH(this.LLILLL, this.LLILZIL, this.LLILZ, this.LLILZLL, null);
            this.LL = 1;
            objLJIIIIZZ = c331730CzT.LJIIIIZZ(interfaceC331650CzL, "/api/v1/ucp/product", mapLIZ, c331610CzH, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("PDPDataRepository@79c7.fetchDynamicVariant$2$result$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchDynamicVariant$2$result$1");
        return c189200o6M1boximpl;
    }
}
