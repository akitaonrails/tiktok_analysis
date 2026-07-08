package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ao1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.tiktok.kmp.live.socialgamebusiness.internal.DefaultStateMachine$addListener$job$1", f = "DefaultStateMachine.kt", l = {}, m = "invokeSuspend")
public final class C949110ao1 extends C09AX implements Function2<C949290aoJ<Object, Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC949340aoO<Object, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949110ao1(InterfaceC949340aoO<Object, Object> interfaceC949340aoO, InterfaceC1364105Vn<? super C949110ao1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC949340aoO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C949110ao1 c949110ao1 = new C949110ao1(this.LLILLJJLI, interfaceC1364105Vn);
        c949110ao1.LL = obj;
        return c949110ao1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStateMachine@d252.addListener$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C949290aoJ c949290aoJ = (C949290aoJ) this.LL;
        try {
            C949100ao0.LIZ(c949290aoJ.LIZ, c949290aoJ.LIZIZ, c949290aoJ.LIZJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStateMachine@d252.addListener$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C949290aoJ<Object, Object> c949290aoJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c949290aoJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
