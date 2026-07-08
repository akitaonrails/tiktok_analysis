package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$onCountdownTimerEnd$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C06HD LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C06HD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HN(C06HD c06hd, InterfaceC1364105Vn<? super C06HN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c06hd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HN(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06HD c06hd;
        C1DEV c1dev;
        C1C7U.LIZ("StreakPetWidget@92f0.onCountdownTimerEnd$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c06hd = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c06hd = this.LLILZ;
            c1dev = c06hd.LLJJIJI;
            this.LL = c1dev;
            this.LLILLJJLI = c06hd;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.onCountdownTimerEnd$1");
                return objLJFF;
            }
        }
        try {
            if (c06hd.LLJJIJIL != null) {
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onCountdownTimerEnd$1");
                return unit;
            }
            if (c06hd.LLJ && c06hd.LLJILJILJ) {
                C1590806Ks.LIZ("SPWidget receive CountdownTimerEnd Start to refresh widget visibility");
                c06hd.LJI(C06BV.LIZIZ(c06hd.LLILZLL, c06hd.LLIZLLLIL, c06hd.LLILLL));
            }
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.onCountdownTimerEnd$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
