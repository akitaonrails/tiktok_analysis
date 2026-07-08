package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03nQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.TTSProbeIntegration$setupIfEnabled$1", f = "TTSProbeIntegration.kt", l = {}, m = "invokeSuspend")
public final class C949403nQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949403nQ(String str, String str2, InterfaceC1364105Vn<? super C949403nQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C949403nQ c949403nQ = new C949403nQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c949403nQ.LL = obj;
        return c949403nQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str = "";
        C1C7U.LIZ("TTSProbeIntegration@5338.setupIfEnabled$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        Object obj2 = null;
        try {
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                c098200Yq = iProbeService.LJIIJ(new C1724990uzR("tts_cashier", str2, str3));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        String str4 = (String) obj2;
        if (str4 != null) {
            str = str4;
        }
        if (str.length() == 0) {
            C994103ud.LIZIZ.set(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSProbeIntegration@5338.setupIfEnabled$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
