package X;

import Y.AgS296S0100000_15;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0awN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.core.linkmic.LinkMicEventDispatcher$observeBattleMessageFlow$1", f = "ILinkMicEventDispatcher.kt", l = {64}, m = "invokeSuspend")
public final class C954290awN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C954270awL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954290awN(C954270awL c954270awL, InterfaceC1364105Vn<? super C954290awN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c954270awL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C954290awN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LinkMicEventDispatcher@67fe.observeBattleMessageFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                final AnonymousClass0950 anonymousClass0950LIZJ = this.LLILLJJLI.LIZIZ.LIZJ();
                final C954270awL c954270awL = this.LLILLJJLI;
                InterfaceC346201Wa<Function1<? super InterfaceC964770bDH, ? extends Unit>> interfaceC346201Wa = new InterfaceC346201Wa<Function1<? super InterfaceC964770bDH, ? extends Unit>>() { // from class: X.0awO
                    @Override // X.InterfaceC346201Wa
                    public final Object collect(InterfaceC346701Wf<? super Function1<? super InterfaceC964770bDH, ? extends Unit>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                        Object objCollect = anonymousClass0950LIZJ.collect(new C955560ayQ(interfaceC346701Wf, c954270awL), interfaceC1364105Vn);
                        if (objCollect == C099R.LJFF()) {
                            return objCollect;
                        }
                        return Unit.LIZ;
                    }
                };
                AgS296S0100000_15 agS296S0100000_15 = new AgS296S0100000_15(c954270awL, 7);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS296S0100000_15, this) == objLJFF) {
                    C1C7U.LIZIZ("LinkMicEventDispatcher@67fe.observeBattleMessageFlow$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC954310awP interfaceC954310awP = this.LLILLJJLI.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("e=");
            sbLIZ.append(e);
            interfaceC954310awP.e(C2188811AlT.LIZIZ(sbLIZ), e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkMicEventDispatcher@67fe.observeBattleMessageFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
