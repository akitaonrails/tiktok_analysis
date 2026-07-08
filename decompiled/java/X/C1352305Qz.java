package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteFlowRouter$flowStreakInviteOnInbox$followDialogData$1$1$1$1$1$1", f = "StreakInviteFlowRouter.kt", l = {}, m = "invokeSuspend")
public final class C1352305Qz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1397510mTF LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352305Qz(C1397510mTF c1397510mTF, InterfaceC1364105Vn<? super C1352305Qz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1397510mTF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352305Qz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
