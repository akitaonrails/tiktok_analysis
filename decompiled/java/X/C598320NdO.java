package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.network.NetworkHelper$request$1$1$onResponse$job$1", f = "NetworkHelper.kt", l = {209}, m = "invokeSuspend")
public final class C598320NdO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DispersionInfo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function1<Boolean, Pair<C0X9S<BaseResponse<Object>>, String>> LLILZLL;
    public final /* synthetic */ InterfaceC594300NSq<BaseResponse<Object>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598320NdO(DispersionInfo dispersionInfo, String str, int i, Function1<? super Boolean, ? extends Pair<? extends C0X9S<BaseResponse<Object>>, String>> function1, InterfaceC594300NSq<BaseResponse<Object>> interfaceC594300NSq, InterfaceC1364105Vn<? super C598320NdO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = dispersionInfo;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = function1;
        this.LLIZ = interfaceC594300NSq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C598320NdO c598320NdO = new C598320NdO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c598320NdO.LLILLJJLI = obj;
        return c598320NdO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        long jLIZIZ;
        C1C7U.LIZ("NetworkHelper@106c.request$1$1$onResponse$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
                C1C7U.LIZIZ("NetworkHelper@106c.request$1$1$onResponse$job$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            C598360NdS.LJFF(this.LLILZ, this.LLILZIL, true, null, this.LLILZLL, this.LLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkHelper@106c.request$1$1$onResponse$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
