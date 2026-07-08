package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.mediator.InboxSessionMediator$onTabChangeEvent$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
public final class C883600YlS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0R6M LL;
    public final /* synthetic */ C883610YlT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883600YlS(C0R6M c0r6m, C883610YlT c883610YlT, InterfaceC1364105Vn<? super C883600YlS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0r6m;
        this.LLILLJJLI = c883610YlT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883600YlS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSessionMediator@f2ca.onTabChangeEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL.LIZIZ, "NOTIFICATION")) {
            if (this.LLILLJJLI.LIZ) {
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
                if (abstractC883730YlfLJ != null) {
                    abstractC883730YlfLJ.LJIL();
                }
                this.LLILLJJLI.LIZ = false;
            }
        } else {
            this.LLILLJJLI.LIZ = true;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_im_sdk_init_opt", true) == 2) {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_SESSION_LIST);
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
            if (abstractC883730YlfLJ2 != null) {
                abstractC883730YlfLJ2.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSessionMediator@f2ca.onTabChangeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
