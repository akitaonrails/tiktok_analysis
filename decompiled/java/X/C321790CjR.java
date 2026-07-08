package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.core.MessageJob$CommerceAgentActionQueue$internalQueue$2", f = "MessageJob.kt", l = {133}, m = "invokeSuspend")
public final class C321790CjR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C321790CjR(InterfaceC1364105Vn<? super C321790CjR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321790CjR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageJob$CommerceAgentActionQueue@fc14.internalQueue$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        while (true) {
            AbstractC321800CjS abstractC321800CjSPoll = AbstractC321800CjS.LIZIZ.poll();
            if (abstractC321800CjSPoll == null) {
                AbstractC321800CjS abstractC321800CjSPoll2 = AbstractC321800CjS.LIZJ.poll();
                if (abstractC321800CjSPoll2 == null) {
                    AbstractC321800CjS.LJFF = false;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageJob$CommerceAgentActionQueue@fc14.internalQueue$2");
                    return unit;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(AbstractC321800CjS.LJ), null, null, new C321810CjT(abstractC321800CjSPoll2, null), 3);
            } else {
                this.LL = 1;
                if (abstractC321800CjSPoll.LIZIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("MessageJob$CommerceAgentActionQueue@fc14.internalQueue$2");
                    return objLJFF;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C321790CjR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
