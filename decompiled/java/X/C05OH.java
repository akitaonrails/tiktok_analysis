package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.touchpoint.ui.popup.IncentivePopupSession$scheduleTimeout$1", f = "IncentivePopupSession.kt", l = {45}, m = "invokeSuspend")
public final class C05OH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1899950zXd LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OH(C1899950zXd c1899950zXd, Function0<Unit> function0, InterfaceC1364105Vn<? super C05OH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1899950zXd;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jIntValue;
        C1C7U.LIZ("IncentivePopupSession@a91c.scheduleTimeout$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C01GW c01gw = C05OI.LIZ;
            if (((Number) c01gw.getValue()).intValue() < 0) {
                jIntValue = Mp4ScreenVideoLoadTimeout.CONTROL;
            } else {
                jIntValue = ((Number) c01gw.getValue()).intValue();
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("IncentivePopupSession@a91c.scheduleTimeout$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJIILJJIL = null;
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentivePopupSession@a91c.scheduleTimeout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
