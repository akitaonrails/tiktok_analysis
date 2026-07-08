package X;

import com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05I5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.statemachine.PNSUserStateManager$onAccountResult$2", f = "PNSUserStateManager.kt", l = {}, m = "invokeSuspend")
public final class C05I5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PNSUserStateManager LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05I5(PNSUserStateManager pNSUserStateManager, InterfaceC1364105Vn<? super C05I5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pNSUserStateManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05I5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSUserStateManager@f27e.onAccountResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PNSUserStateManager pNSUserStateManager = this.LL;
        User user = pNSUserStateManager.LL;
        if (user == null) {
            user = null;
        }
        pNSUserStateManager.LJFF(user);
        this.LL.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSUserStateManager@f27e.onAccountResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
