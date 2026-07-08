package X;

import Y.AgS292S0100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocaption.refactor.CaptionDisplayStateController$3", f = "CaptionDisplayStateController.kt", l = {90}, m = "invokeSuspend")
public final class C710700RuG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C710670RuD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710700RuG(C710670RuD c710670RuD, InterfaceC1364105Vn<? super C710700RuG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c710670RuD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710700RuG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0RuI] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionDisplayStateController@662c.<init>$3");
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
            final C05YD<C710770RuN> c05ydLJJLJ = C161N.LIZIZ.LJJLJ();
            final C710670RuD c710670RuD = this.LLILLJJLI;
            final ?? r0 = new InterfaceC346201Wa<C710770RuN>() { // from class: X.0RuI
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C710770RuN> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c05ydLJJLJ.collect(new C710730RuJ(interfaceC346701Wf, c710670RuD), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            InterfaceC346201Wa<EnumC715680S5m> interfaceC346201Wa = new InterfaceC346201Wa<EnumC715680S5m>() { // from class: X.0RuH
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super EnumC715680S5m> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = r0.collect(new C710750RuL(interfaceC346701Wf), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(c710670RuD, 2);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS292S0100000_11, this) == objLJFF) {
                C1C7U.LIZIZ("CaptionDisplayStateController@662c.<init>$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionDisplayStateController@662c.<init>$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
