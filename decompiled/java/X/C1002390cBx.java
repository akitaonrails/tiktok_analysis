package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.home.repo.network.WalletHomeApi;
import com.ss.android.ugc.aweme.home.repo.network.data.HomeSchemaResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.HomepageSchemaRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetSchemaUseCase$internalInvoke$2", f = "GetSchemaUseCase.kt", l = {47}, m = "invokeSuspend")
public final class C1002390cBx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC989720brW<? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002390cBx(String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn<? super C1002390cBx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002390cBx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                WalletHomeApi walletHomeApiLIZ = WalletHomeApi.LIZ.LIZ(this.LLILLJJLI);
                String str2 = this.LLILLL;
                String str3 = this.LLILZ;
                if (str3 == null) {
                    str3 = "";
                }
                HomepageSchemaRequest homepageSchemaRequest = new HomepageSchemaRequest(str3, C2222691Bz1.LIZ(), this.LLILZIL, this.LLILZLL);
                this.LL = 1;
                obj = walletHomeApiLIZ.consultHomepageSchema(str2, homepageSchemaRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
                    return objLJFF;
                }
            }
            AbstractC989720brW abstractC989720brWLIZ = C1002410cBz.LIZ((C0X52) obj);
            if (abstractC989720brWLIZ instanceof C989710brV) {
                String str4 = ((HomeSchemaResponse) ((C989710brV) abstractC989720brWLIZ).LIZIZ).schema;
                if (str4 != null) {
                    str = str4;
                }
                if (C123100dR.LIZ(str)) {
                    C989710brV c989710brV = new C989710brV(str);
                    C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
                    return c989710brV;
                }
                C991340bu8 c991340bu8 = new C991340bu8(null, 7);
                C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
                return c991340bu8;
            }
            if (abstractC989720brWLIZ instanceof C991340bu8) {
                C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
                return abstractC989720brWLIZ;
            }
            if (abstractC989720brWLIZ instanceof C989700brU) {
                C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
                return abstractC989720brWLIZ;
            }
            throw new C1954807lC();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C989700brU c989700brU = new C989700brU(th);
            C1C7U.LIZIZ("GetSchemaUseCase@5ec9.internalInvoke$2");
            return c989700brU;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC989720brW<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
