package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShowcaseApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.showcase.ShowcasePrefetchEntity$tryPrefetchData$1$2", f = "ShowcaseNativePrefetchManager.kt", l = {116}, m = "invokeSuspend")
public final class C597780NcW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public C597870Ncf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C597870Ncf LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597780NcW(C597870Ncf c597870Ncf, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c597870Ncf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597780NcW c597780NcW = new C597780NcW(this.LLILZLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c597780NcW.LLILLL = obj;
        return c597780NcW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C597870Ncf c597870Ncf;
        C1C7U.LIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        try {
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
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                c597870Ncf = this.LLILZLL;
                ShowcaseApi showcaseApi = (ShowcaseApi) C0NSL.LIZ().create(ShowcaseApi.class);
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                this.LLILLL = interfaceC497601wk;
                this.LL = c597870Ncf;
                this.LLILLJJLI = 1;
                obj = showcaseApi.getProductTab(str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$2");
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C597790NcX(c597870Ncf, (Response) obj, null), 2);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("ShowcasePrefetchEntity@b8f7.tryPrefetchData$1$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
