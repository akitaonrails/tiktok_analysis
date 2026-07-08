package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.network.NetworkHelper$requestBR$job$1", f = "NetworkHelper.kt", l = {65, 67}, m = "invokeSuspend")
public final class C598330NdP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<Object>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DispersionInfo LLILLL;
    public final /* synthetic */ Function2<Boolean, InterfaceC1364105Vn<? super Pair<BaseResponse<Object>, String>>, Object> LLILZ;
    public final /* synthetic */ BaseResponse<Object> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<Exception, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598330NdP(DispersionInfo dispersionInfo, Function2<? super Boolean, ? super InterfaceC1364105Vn<? super Pair<BaseResponse<Object>, String>>, ? extends Object> function2, BaseResponse<Object> baseResponse, String str, Function1<? super Exception, Unit> function1, InterfaceC1364105Vn<? super C598330NdP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = dispersionInfo;
        this.LLILZ = function2;
        this.LLILZIL = baseResponse;
        this.LLILZLL = str;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C598330NdP c598330NdP = new C598330NdP(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c598330NdP.LLILLJJLI = obj;
        return c598330NdP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse<Object> baseResponse;
        InterfaceC497601wk interfaceC497601wk;
        long jLIZIZ;
        C1C7U.LIZ("NetworkHelper@106c.requestBR$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Function1<Exception, Unit> function1 = this.LLIZ;
            if (function1 != null) {
                function1.invoke(e);
            }
            baseResponse = this.LLILZIL;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                baseResponse = (BaseResponse) ((Pair) obj).getFirst();
                C598360NdS.LJ(this.LLILLL.dispersionPath, baseResponse.getCode(), this.LLILZLL, baseResponse.getMessage(), true);
                C1C7U.LIZIZ("NetworkHelper@106c.requestBR$job$1");
                return baseResponse;
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            DelayParam delayParam = this.LLILLL.delayParam;
            if (delayParam != null) {
                jLIZIZ = C598400NdW.LIZIZ(delayParam);
            } else {
                jLIZIZ = 0;
            }
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZIZ, this) == objLJFF) {
                C1C7U.LIZIZ("NetworkHelper@106c.requestBR$job$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            Function2<Boolean, InterfaceC1364105Vn<? super Pair<BaseResponse<Object>, String>>, Object> function2 = this.LLILZ;
            this.LLILLJJLI = null;
            this.LL = 2;
            obj = function2.invoke(true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NetworkHelper@106c.requestBR$job$1");
                return objLJFF;
            }
            baseResponse = (BaseResponse) ((Pair) obj).getFirst();
            C598360NdS.LJ(this.LLILLL.dispersionPath, baseResponse.getCode(), this.LLILZLL, baseResponse.getMessage(), true);
            C1C7U.LIZIZ("NetworkHelper@106c.requestBR$job$1");
            return baseResponse;
        }
        baseResponse = this.LLILZIL;
        C598360NdS.LJ(this.LLILLL.dispersionPath, baseResponse.getCode(), this.LLILZLL, baseResponse.getMessage(), true);
        C1C7U.LIZIZ("NetworkHelper@106c.requestBR$job$1");
        return baseResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
