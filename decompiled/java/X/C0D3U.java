package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D3U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpSkuCoordinator$scheduleVariantRetry$1$variantDeferred$1", f = "PdpSkuCoordinator.kt", l = {397}, m = "invokeSuspend")
public final class C0D3U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public int LL;
    public final /* synthetic */ C0D3P LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D3U(C0D3P c0d3p, String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C0D3U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0d3p;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D3U(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0D3X c0d3x = new C0D3X(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
                this.LL = 1;
                obj = C099A.LIZIZ(12000L, c0d3x, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1");
                    return objLJFF;
                }
            }
            c098200Yq = ((C189200o6) obj).m10unboximpl();
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            c098200Yq = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            c098200Yq = new C098200Yq(e2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("PdpSkuCoordinator@f3df.scheduleVariantRetry$1$variantDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
