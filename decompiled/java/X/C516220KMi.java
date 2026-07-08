package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.pay.QueryOrderRepo$pollingCheckOrder$3", f = "QueryOrderRepo.kt", l = {}, m = "invokeSuspend")
public final class C516220KMi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KO2>, Object> {
    public final /* synthetic */ C0KO2 LL;
    public final /* synthetic */ C516190KMf LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C0KJK LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ HashMap<String, Object> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C516220KMi(C0KO2 c0ko2, C516190KMf c516190KMf, String str, C118300cf c118300cf, C0KJK c0kjk, String str2, HashMap<String, Object> map, long j, C118300cf c118300cf2, Function2<? super Integer, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C516220KMi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ko2;
        this.LLILLJJLI = c516190KMf;
        this.LLILLL = str;
        this.LLILZ = c118300cf;
        this.LLILZIL = c0kjk;
        this.LLILZLL = str2;
        this.LLIZ = map;
        this.LLIZLLLIL = j;
        this.LLJ = c118300cf2;
        this.LLJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516220KMi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String message;
        C1C7U.LIZ("QueryOrderRepo@6ab2.pollingCheckOrder$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0KO2 c0ko2 = this.LL;
        if (c0ko2.LIZ) {
            C516190KMf c516190KMf = this.LLILLJJLI;
            CheckSubOrderResultStruct checkSubOrderResultStruct = c0ko2.LIZIZ;
            String str = this.LLILLL;
            int i = this.LLILZ.element;
            C0KJK c0kjk = this.LLILZIL;
            String strLIZ = this.LLILZLL;
            HashMap<String, Object> map = this.LLIZ;
            long j = this.LLIZLLLIL;
            c516190KMf.getClass();
            if (checkSubOrderResultStruct != null) {
                checkSubOrderResultStruct.orderID = str;
                checkSubOrderResultStruct.retryCount = i;
            }
            if (!((ArrayList) c516190KMf.LLILLL).contains(str)) {
                c516190KMf.LIZIZ(checkSubOrderResultStruct, c0kjk);
                C516010KLn.LIZ.getClass();
                long jLIZIZ = C516010KLn.LIZIZ();
                if (strLIZ == null) {
                    C0KMK c0kmk = C0KMK.LIZ;
                    Integer numValueOf = Integer.valueOf(c0kjk.LJIILL);
                    c0kmk.getClass();
                    C0KML c0kmlLIZIZ = C0KMK.LIZIZ(numValueOf, str);
                    if (c0kmlLIZIZ == null || (strLIZ = c0kmlLIZIZ.LIZ()) == null) {
                        strLIZ = "unknown";
                    }
                }
                c516190KMf.LLILZIL.LIZJ(C516190KMf.LIZJ(c516190KMf, c0kjk, str, jLIZIZ, i, strLIZ, null, true, 96));
                C20441214yg.LIZIZ("SubscribePaymentV2", "on subscribe query order success");
                C1796590wqv.LIZ("ttlive_check_subscription", map);
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put("duration", Long.valueOf(System.currentTimeMillis() - j));
                map2.put("orderId", str);
                map2.put("is_subscription", 1);
                C0K8M rechargeMonitor = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
                if (rechargeMonitor != null) {
                    rechargeMonitor.LIZLLL(map2);
                }
            }
        } else {
            C516190KMf c516190KMf2 = this.LLILLJJLI;
            C0KJK c0kjk2 = this.LLILZIL;
            int i2 = this.LLJ.element;
            Throwable th = c0ko2.LIZJ;
            HashMap<String, Object> map3 = this.LLIZ;
            Function2<Integer, Throwable, Unit> function2 = this.LLJI;
            long j2 = this.LLIZLLLIL;
            String str2 = this.LLILLL;
            int i3 = this.LLILZ.element;
            if (!((ArrayList) c516190KMf2.LLILLL).contains(str2)) {
                C20441214yg.LIZIZ("SubscribePaymentV2", "oncheck error");
                C516470KNh c516470KNhLIZJ = C516190KMf.LIZJ(c516190KMf2, c0kjk2, str2, System.currentTimeMillis() - j2, i3, null, null, true, 112);
                c516190KMf2.LLILZIL.getClass();
                AbstractC516390KMz.LIZ(c516470KNhLIZJ);
                C0KMQ c0kmq = c0kjk2.LJJI;
                if (c0kmq != null) {
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "unknown error in polling";
                    }
                    c0kmq.onFail(i2, message);
                }
                C1796590wqv.LIZJ("ttlive_check_subscription", 41, i2, "check order fail", map3);
                function2.invoke(Integer.valueOf(i2), th);
                C0K8M rechargeMonitor2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeMonitor();
                if (rechargeMonitor2 != null) {
                    rechargeMonitor2.LJFF(i2, "", System.currentTimeMillis() - j2, str2, String.valueOf(th), true);
                }
                C0KMK c0kmk2 = C0KMK.LIZ;
                Integer numValueOf2 = Integer.valueOf(c0kjk2.LJIILL);
                C0KMJ c0kmj = C0KMJ.QUERY_ORDER_FAILED;
                c0kmk2.getClass();
                C0KMK.LIZJ(str2, numValueOf2, c0kmj);
            }
        }
        C0KO2 c0ko22 = this.LL;
        C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$3");
        return c0ko22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KO2> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
