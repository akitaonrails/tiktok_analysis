package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.158c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel$startUnifiedProcessing$1", f = "MatchHammerViewModel.kt", l = {465, 476}, m = "invokeSuspend")
public final class C204704158c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MatchHammerViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204704158c(MatchHammerViewModel matchHammerViewModel, InterfaceC1364105Vn<? super C204704158c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = matchHammerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C204704158c c204704158c = new C204704158c(this.LLILLL, interfaceC1364105Vn);
        c204704158c.LLILLJJLI = obj;
        return c204704158c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("MatchHammerViewModel@6ded.startUnifiedProcessing$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LIZIZ("MatchItemHammerVM", "cancel unified processing Job");
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk) && this.LLILLL.LLJJL) {
            if (this.LLILLL.LLJLLIL) {
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                    C1C7U.LIZIZ("MatchHammerViewModel@6ded.startUnifiedProcessing$1");
                    return objLJFF;
                }
            } else {
                if (C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                    this.LLILLL.KQ2();
                } else {
                    this.LLILLL.LQ2(true);
                    this.LLILLL.LQ2(false);
                }
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("MatchHammerViewModel@6ded.startUnifiedProcessing$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchHammerViewModel@6ded.startUnifiedProcessing$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
