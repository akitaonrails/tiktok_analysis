package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.activitystatus.SkylightActivityStatusModule$activityStatusClient$2$1$1$onActivityStatusUpdate$2$1", f = "SkylightActivityStatusModule.kt", l = {}, m = "invokeSuspend")
public final class C641620PEq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1598850rhz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641620PEq(C1598850rhz c1598850rhz, InterfaceC1364105Vn<? super C641620PEq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1598850rhz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641620PEq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightActivityStatusModule@7da9.activityStatusClient$2$1$1$onActivityStatusUpdate$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL.LJFF.LLJJIJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightActivityStatusModule@7da9.activityStatusClient$2$1$1$onActivityStatusUpdate$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
