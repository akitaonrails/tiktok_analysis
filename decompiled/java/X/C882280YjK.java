package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.mediator.InboxSessionMediator$onNodeVisibilityChange$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
public final class C882280YjK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C883610YlT LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882280YjK(C883610YlT c883610YlT, boolean z, InterfaceC1364105Vn<? super C882280YjK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c883610YlT;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C882280YjK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSessionMediator@f2ca.onNodeVisibilityChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C883610YlT c883610YlT = this.LL;
        boolean z = this.LLILLJJLI;
        c883610YlT.LJFF = z;
        c883610YlT.LIZJ(z, c883610YlT.LJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSessionMediator@f2ca.onNodeVisibilityChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
