package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.GetTryOnResultRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.GetTryOnResultResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.TryOnNativePrefetchApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.TryOnNativePrefetchKt$prefetchTryOnResultInternal$1", f = "TryOnNativePrefetch.kt", l = {158}, m = "invokeSuspend")
public final class C314901Jz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GetTryOnResultRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314901Jz(String str, GetTryOnResultRequest getTryOnResultRequest, InterfaceC1364105Vn<? super C314901Jz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = getTryOnResultRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314901Jz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TryOnNativePrefetchKt@448a.prefetchTryOnResultInternal$1");
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
                TryOnNativePrefetchApi.LIZ.getClass();
                TryOnNativePrefetchApi value = C01K0.LIZIZ.getValue();
                String str = this.LLILLJJLI;
                GetTryOnResultRequest getTryOnResultRequest = this.LLILLL;
                this.LL = 1;
                obj = value.getTryOnResult(str, getTryOnResultRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TryOnNativePrefetchKt@448a.prefetchTryOnResultInternal$1");
                    return objLJFF;
                }
            }
            C1326490kch c1326490kch = C1326490kch.LIZ;
            C020Q c020q = new C020Q(this.LLILLJJLI, (GetTryOnResultResponse) obj, 4);
            c1326490kch.getClass();
            C1326490kch.LIZIZ(c020q);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, e, null);
            C1326490kch c1326490kch2 = C1326490kch.LIZ;
            AnonymousClass0058 anonymousClass0058 = new AnonymousClass0058(this.LLILLJJLI);
            c1326490kch2.getClass();
            C1326490kch.LIZIZ(anonymousClass0058);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, e2, null);
            C1326490kch c1326490kch3 = C1326490kch.LIZ;
            C020Q c020q2 = new C020Q(this.LLILLJJLI, e2, 5);
            c1326490kch3.getClass();
            C1326490kch.LIZIZ(c020q2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TryOnNativePrefetchKt@448a.prefetchTryOnResultInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
