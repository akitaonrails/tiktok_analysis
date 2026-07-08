package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteFlowRouter$flowStreakInviteOnInbox$followDialogData$1$1$1$1$1", f = "StreakInviteFlowRouter.kt", l = {226}, m = "invokeSuspend")
public final class C1458505nL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15496064w LLILLJJLI;
    public final /* synthetic */ C1397510mTF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458505nL(C15496064w c15496064w, C1397510mTF c1397510mTF, InterfaceC1364105Vn<? super C1458505nL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15496064w;
        this.LLILLL = c1397510mTF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458505nL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1$1$1");
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
            C15493064t c15493064t = C15493064t.LIZIZ;
            C1598406Nq c1598406Nq = c15493064t.LIZ;
            if (c1598406Nq == null) {
                synchronized (c15493064t) {
                    c1598406Nq = c15493064t.LIZ;
                    if (c1598406Nq == null) {
                        c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                        c15493064t.LIZ = c1598406Nq;
                    }
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZIZ), null, null, new C1352305Qz(this.LLILLL, null), 3);
            C15491064r c15491064r = C15491064r.LIZIZ;
            C15496064w c15496064w = this.LLILLJJLI;
            String str = c15496064w.LIZ;
            String str2 = c15496064w.LIZIZ;
            this.LL = 1;
            if (c15491064r.LIZ(str, str2, this) == objLJFF) {
                C1C7U.LIZIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakInviteFlowRouter@4643.flowStreakInviteOnInbox$followDialogData$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
