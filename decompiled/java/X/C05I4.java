package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05I4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager$onChanged$1", f = "PNSUserStateManager.kt", l = {}, m = "invokeSuspend")
public final class C05I4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PNSUserStateManager LL;
    public final /* synthetic */ User LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05I4(PNSUserStateManager pNSUserStateManager, User user, InterfaceC1364105Vn<? super C05I4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pNSUserStateManager;
        this.LLILLJJLI = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05I4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSUserStateManager@f27e.onChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PNSUserStateManager pNSUserStateManager = this.LL;
        User user = this.LLILLJJLI;
        synchronized (PNSUserStateManager.class) {
            try {
                pNSUserStateManager.LJ(user);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSUserStateManager@f27e.onChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
