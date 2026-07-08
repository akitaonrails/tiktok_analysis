package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.network.NetworkHelper$request$1", f = "NetworkHelper.kt", l = {}, m = "invokeSuspend")
public final class C598300NdM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X9S<BaseResponse<Object>> LL;
    public final /* synthetic */ DispersionInfo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC594300NSq<BaseResponse<Object>> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<Boolean, Pair<C0X9S<BaseResponse<Object>>, String>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598300NdM(C0X9S<BaseResponse<Object>> c0x9s, DispersionInfo dispersionInfo, String str, InterfaceC594300NSq<BaseResponse<Object>> interfaceC594300NSq, int i, String str2, boolean z, Function1<? super Boolean, ? extends Pair<? extends C0X9S<BaseResponse<Object>>, String>> function1, InterfaceC1364105Vn<? super C598300NdM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x9s;
        this.LLILLJJLI = dispersionInfo;
        this.LLILLL = str;
        this.LLILZ = interfaceC594300NSq;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598300NdM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkHelper@106c.request$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0X9S<BaseResponse<Object>> c0x9s = this.LL;
        if (c0x9s != null) {
            final DispersionInfo dispersionInfo = this.LLILLJJLI;
            final String str = this.LLILLL;
            final InterfaceC594300NSq<BaseResponse<Object>> interfaceC594300NSq = this.LLILZ;
            final int i = this.LLILZIL;
            final String str2 = this.LLILZLL;
            final boolean z = this.LLIZ;
            final Function1<Boolean, Pair<C0X9S<BaseResponse<Object>>, String>> function1 = this.LLIZLLLIL;
            c0x9s.enqueue(new InterfaceC594300NSq<BaseResponse<Object>>() { // from class: X.0NdN
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse<Object>> c0x9s2, Throwable th) {
                    interfaceC594300NSq.onFailure(c0x9s2, th);
                    C598360NdS.LJ(i, C2177208fy.LIZ(th), str2, th.getMessage(), z);
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<BaseResponse<Object>> c0x9s2, C0X52<BaseResponse<Object>> c0x52) {
                    DispersionInfo dispersionInfo2 = dispersionInfo;
                    if (dispersionInfo2 != null && C598400NdW.LIZ(dispersionInfo2) && c0x52.LIZIZ.getCode() == 1604) {
                        C598360NdS.LIZIZ(dispersionInfo.dispersionPath, str);
                        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C598320NdO(dispersionInfo, str, i, function1, interfaceC594300NSq, null), 3);
                        if (!C598360NdS.LIZLLL().containsKey(str)) {
                            C598360NdS.LIZLLL().put(str, new ConcurrentHashMap());
                        }
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C598360NdS.LIZLLL().get(str);
                        if (concurrentHashMap != null) {
                            concurrentHashMap.put(Integer.valueOf(dispersionInfo.dispersionPath), anonymousClass0956LIZLLL);
                        }
                    } else {
                        interfaceC594300NSq.onResponse(c0x9s2, c0x52);
                    }
                    C598360NdS.LJ(i, c0x52.LIZIZ.getCode(), str2, c0x52.LIZIZ.getMessage(), z);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetworkHelper@106c.request$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
