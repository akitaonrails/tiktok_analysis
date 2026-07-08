package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$startFallbackReplaceJob$1", f = "StreakPetWidget.kt", l = {225, 230}, m = "invokeSuspend")
public final class C06HL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06HD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HL(C06HD c06hd, InterfaceC1364105Vn<? super C06HL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06hd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06HL c06hl = new C06HL(this.LLILLL, interfaceC1364105Vn);
        c06hl.LLILLJJLI = obj;
        return c06hl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.LJIIIIZZ(false, true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL.LLJ) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
                return unit2;
            }
            long j = C1583306Hv.LIZ().fallbackDetectDuration;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
                return objLJFF;
            }
        }
        C1590806Ks.LIZ("SPWidget startFallbackReplaceJob delay finish");
        C2296808zG.LJFF(interfaceC497601wk);
        if (this.LLILLL.LLJ) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
            return unit3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPWidget startFallbackReplaceJob ");
        sbLIZ.append(this.LLILLL.LLJI);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AbstractC2252651DEx abstractC2252651DEx = this.LLILLL.LIZLLL().LIZIZ;
        C06HM c06hm = new C06HM(this.LLILLL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2252651DEx, c06hm) == objLJFF) {
            C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
            return objLJFF;
        }
        this.LLILLL.LJIIIIZZ(false, true);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
