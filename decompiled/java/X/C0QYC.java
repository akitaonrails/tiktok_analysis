package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QYC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.service.EcomSearchServiceImpl$doEcSearchPreloadTaskInMall$2", f = "EcomSearchServiceImpl.kt", l = {846, 847}, m = "invokeSuspend")
public final class C0QYC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QYC(Context context, InterfaceC1364105Vn<? super C0QYC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QYC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C673030Qab.LIZ.getClass();
            long j = ((MiddleSnapShotConfig) C673030Qab.LIZJ.getValue()).timeStartLoad;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$2");
                return objLJFF;
            }
        }
        C683900Qs8 c683900Qs8 = C683900Qs8.LIZ;
        Context context = C1383370m6R.LIZ;
        boolean zLIZ = C467860IWi.LIZ(this.LLILLJJLI);
        this.LL = 2;
        if (c683900Qs8.LIZIZ(context, zLIZ, this) == objLJFF) {
            C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcomSearchServiceImpl@2921.doEcSearchPreloadTaskInMall$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
