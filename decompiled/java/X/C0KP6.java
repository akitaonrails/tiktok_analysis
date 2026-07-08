package X;

import android.os.SystemClock;
import com.bytedance.android.live.wallet.IWalletService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.fans.PolingSuperFanContractStatusResult;

/* JADX INFO: renamed from: X.0KP6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.pay.FanQueryOrderRepo$pollingCheckOrder$3", f = "FanQueryOrderRepo.kt", l = {}, m = "invokeSuspend")
public final class C0KP6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KPC>, Object> {
    public final /* synthetic */ C0KPC LL;
    public final /* synthetic */ C0KP7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C0KP3 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ HashMap<String, Object> LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0KP6(C0KPC c0kpc, C0KP7 c0kp7, String str, C118300cf c118300cf, C0KP3 c0kp3, String str2, HashMap<String, Object> map, long j, C118300cf c118300cf2, Function2<? super Integer, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C0KP6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0kpc;
        this.LLILLJJLI = c0kp7;
        this.LLILLL = str;
        this.LLILZ = c118300cf;
        this.LLILZIL = c0kp3;
        this.LLILZLL = str2;
        this.LLIZ = map;
        this.LLIZLLLIL = j;
        this.LLJ = c118300cf2;
        this.LLJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KP6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        String strLJ;
        C0KP5 c0kp5;
        C1C7U.LIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0KPC c0kpc = this.LL;
        if (c0kpc.LIZ) {
            C0KP7 c0kp7 = this.LLILLJJLI;
            PolingSuperFanContractStatusResult polingSuperFanContractStatusResult = c0kpc.LIZIZ;
            String str = this.LLILLL;
            int i = this.LLILZ.element;
            C0KP3 c0kp3 = this.LLILZIL;
            String str2 = this.LLILZLL;
            HashMap<String, Object> map = this.LLIZ;
            long j = this.LLIZLLLIL;
            c0kp7.getClass();
            C516010KLn c516010KLn = C516010KLn.LIZ;
            long jUptimeMillis = SystemClock.uptimeMillis();
            c516010KLn.getClass();
            C516010KLn.LIZJ = jUptimeMillis;
            C0KP3 c0kp32 = c0kp7.LIZ;
            if (c0kp32 != null && (c0kp5 = c0kp32.LJIILJJIL) != null) {
                c0kp5.LIZJ(polingSuperFanContractStatusResult);
            }
            long jLIZIZ = C516010KLn.LIZIZ();
            c0kp7.LIZIZ.LIZJ(C0KP7.LIZ(c0kp7, c0kp3, str, jLIZIZ, i, str2, null, true, null, 352));
            Map mapLIZIZ = C0KSH.LIZIZ(c0kp3);
            mapLIZIZ.put("orderId", str);
            mapLIZIZ.put("query_type", "polling");
            C0KSH.LIZLLL((int) jLIZIZ, true, mapLIZIZ);
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
        } else {
            C0KP7 c0kp72 = this.LLILLJJLI;
            C0KP3 c0kp33 = this.LLILZIL;
            int i2 = this.LLJ.element;
            Throwable th = c0kpc.LIZJ;
            Function2<Integer, Throwable, Unit> function2 = this.LLJI;
            long j2 = this.LLIZLLLIL;
            String str3 = this.LLILLL;
            int i3 = this.LLILZ.element;
            c0kp72.getClass();
            C516470KNh c516470KNhLIZ = C0KP7.LIZ(c0kp72, c0kp33, str3, System.currentTimeMillis() - j2, i3, null, null, true, null, 368);
            c0kp72.LIZIZ.getClass();
            AbstractC516390KMz.LIZ(c516470KNhLIZ);
            c0kp33.LJIILJJIL.LIZLLL(th);
            Map mapLIZIZ2 = C0KSH.LIZIZ(c0kp33);
            mapLIZIZ2.put("orderId", str3);
            mapLIZIZ2.put("query_type", "polling");
            mapLIZIZ2.put("error_code", String.valueOf(i2));
            mapLIZIZ2.put("detail_error_code", String.valueOf(i2));
            String str4 = "";
            if (th == null || ((strLIZLLL = C512300K7g.LIZLLL(th)) == null && (strLIZLLL = th.getMessage()) == null)) {
                strLIZLLL = "";
            }
            mapLIZIZ2.put("detail_error_msg", strLIZLLL);
            if (th != null && (strLJ = C512300K7g.LJ(th)) != null) {
                str4 = strLJ;
            }
            mapLIZIZ2.put("log_id", str4);
            C0KSH.LIZLLL((int) (System.currentTimeMillis() - j2), false, mapLIZIZ2);
            function2.invoke(Integer.valueOf(i2), th);
        }
        C0KPC c0kpc2 = this.LL;
        C1C7U.LIZIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$3");
        return c0kpc2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KPC> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
