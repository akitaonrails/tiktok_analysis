package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseProductListRequest;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcasePrefetchEntity$tryPrefetchData$1$3", f = "ShowcaseNativePrefetchManager.kt", l = {131}, m = "invokeSuspend")
public final class C597820Nca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C597870Ncf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ShowcaseProductListRequest LLILZ;
    public final /* synthetic */ C597870Ncf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597820Nca(ShowcaseProductListRequest showcaseProductListRequest, C597870Ncf c597870Ncf, InterfaceC1364105Vn<? super C597820Nca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = showcaseProductListRequest;
        this.LLILZIL = c597870Ncf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597820Nca c597820Nca = new C597820Nca(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c597820Nca.LLILLL = obj;
        return c597820Nca;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C597870Ncf c597870Ncf;
        n nVarLJIILIIL;
        C1C7U.LIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Unit unit = null;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 0) {
            if (i == 1) {
                c597870Ncf = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            ShowcaseProductListRequest showcaseProductListRequest = this.LLILZ;
            c597870Ncf = this.LLILZIL;
            try {
                C1227904rF.LIZ.getClass();
                nVarLJIILIIL = C1227904rF.LIZLLL().LJIJJLI(showcaseProductListRequest).LJIILIIL();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                nVarLJIILIIL = null;
            }
            if (nVarLJIILIIL != null) {
                C1957807lg.LIZ("showcase", nVarLJIILIIL, c597870Ncf.LIZ);
                ShowcaseApi showcaseApi = (ShowcaseApi) C0NSL.LIZ().create(ShowcaseApi.class);
                this.LLILLL = interfaceC497601wk;
                this.LL = c597870Ncf;
                this.LLILLJJLI = 1;
                obj = showcaseApi.getProductList(nVarLJIILIIL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3");
                    return objLJFF;
                }
            }
            unit = Unit.LIZ;
            C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3");
            return unit;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C597810NcZ(c597870Ncf, (Response) obj, null), 2);
        unit = Unit.LIZ;
        C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
