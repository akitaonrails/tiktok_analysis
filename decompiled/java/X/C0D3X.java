package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D3X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpSkuCoordinator$scheduleVariantRetry$1$variantDeferred$1$1", f = "PdpSkuCoordinator.kt", l = {398}, m = "invokeSuspend")
public final class C0D3X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D3P LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D3X(C0D3P c0d3p, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C0D3X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d3p;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D3X(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZJ;
        C1C7U.LIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1$1");
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
            C0D3P c0d3p = this.LLILLJJLI;
            C331730CzT c331730CzT = c0d3p.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            int i2 = c0d3p.LJIIZILJ;
            this.LL = 1;
            objLIZJ = c331730CzT.LIZJ(i2, str, str2, map, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
