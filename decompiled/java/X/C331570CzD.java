package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0CzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchPDPData$2$1$productResult$1$1", f = "PDPDataRepository.kt", l = {181}, m = "invokeSuspend")
public final class C331570CzD extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC331650CzL LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331570CzD(int i, String str, InterfaceC331650CzL interfaceC331650CzL, String str2, InterfaceC1364105Vn<? super C331570CzD> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = interfaceC331650CzL;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331570CzD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                c098200Yq = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = this.LLILLJJLI;
            if ((i2 == 0 || i2 == 2) && a0.LJJJIL(this.LLILLL)) {
                c098200Yq = new C098200Yq(new Exception("shopDomain is blank, cannot fetch PDP data"));
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                InterfaceC331650CzL interfaceC331650CzL = this.LLILZ;
                String str = this.LLILLL;
                String str2 = this.LLILZIL;
                this.LL = 1;
                c098200Yq = interfaceC331650CzL.LIZIZ(str, str2, C2097608Jq.LJ(), this);
                if (c098200Yq == objLJFF) {
                    C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1$1");
                    return objLJFF;
                }
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PDPDataRepository@79c7.fetchPDPData$2$1$productResult$1$1");
        return c189200o6M1boximpl;
    }
}
