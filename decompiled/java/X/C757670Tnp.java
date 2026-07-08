package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0Tnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.view.BottomNotificationObserver$requirePermissionPopUp$1", f = "BottomNotificationObserver.kt", l = {275}, m = "invokeSuspend")
public final class C757670Tnp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ViewOnClickListenerC1600510rkf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757670Tnp(ViewOnClickListenerC1600510rkf viewOnClickListenerC1600510rkf, InterfaceC1364105Vn<? super C757670Tnp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = viewOnClickListenerC1600510rkf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757670Tnp c757670Tnp = new C757670Tnp(this.LLILLL, interfaceC1364105Vn);
        c757670Tnp.LLILLJJLI = obj;
        return c757670Tnp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("BottomNotificationObserver@3cda.requirePermissionPopUp$1");
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
            InterfaceC1264610j0t interfaceC1264610j0tLIZ = C1072350e0n.LIZ(this.LLILLL.LL, new AwS595S0100000_16((InterfaceC497601wk) this.LLILLJJLI, 428));
            if (interfaceC1264610j0tLIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("BottomNotificationObserver@3cda.requirePermissionPopUp$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomNotificationObserver@3cda.requirePermissionPopUp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
