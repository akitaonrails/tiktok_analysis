package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NO9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.jsb.EcMixMallBridgeCenterExtKt$registerMethod$subscriber$1$onMethodInvoked$2", f = "EcMixMallBridgeCenterExt.kt", l = {}, m = "invokeSuspend")
public final class C0NO9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC21159017rA, JSONObject, C0NOA, Unit> LLILLJJLI;
    public final /* synthetic */ InterfaceC21159017rA LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ C0NOA LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NO9(InterfaceC1631620sYq<? super InterfaceC21159017rA, ? super JSONObject, ? super C0NOA, Unit> interfaceC1631620sYq, InterfaceC21159017rA interfaceC21159017rA, JSONObject jSONObject, C0NOA c0noa, InterfaceC1364105Vn<? super C0NO9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = interfaceC21159017rA;
        this.LLILZ = jSONObject;
        this.LLILZIL = c0noa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NO9 c0no9 = new C0NO9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0no9.LL = obj;
        return c0no9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("EcMixMallBridgeCenterExtKt@a54c.registerMethod$subscriber$1$onMethodInvoked$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<InterfaceC21159017rA, JSONObject, C0NOA, Unit> interfaceC1631620sYq = this.LLILLJJLI;
        InterfaceC21159017rA interfaceC21159017rA = this.LLILLL;
        JSONObject jSONObject = this.LLILZ;
        C0NOA c0noa = this.LLILZIL;
        if (C7879035x.LIZLLL()) {
            interfaceC1631620sYq.invoke(interfaceC21159017rA, jSONObject, c0noa);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            try {
                interfaceC1631620sYq.invoke(interfaceC21159017rA, jSONObject, c0noa);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            this.LLILZIL.LIZ(C21155317qZ.LIZLLL.getSecond(), null, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallBridgeCenterExtKt@a54c.registerMethod$subscriber$1$onMethodInvoked$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
