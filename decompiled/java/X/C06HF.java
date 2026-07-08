package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$onUpdate$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public StreakData LLILLJJLI;
    public C06HD LLILLL;
    public int LLILZ;
    public final /* synthetic */ C06HD LLILZIL;
    public final /* synthetic */ StreakData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HF(C06HD c06hd, StreakData streakData, InterfaceC1364105Vn<? super C06HF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c06hd;
        this.LLILZLL = streakData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HF(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06HD c06hd;
        C1DEV c1dev;
        StreakData streakData;
        boolean zLIZ;
        C1C7U.LIZ("StreakPetWidget@92f0.onUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                c06hd = this.LLILLL;
                streakData = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c06hd = this.LLILZIL;
            c1dev = c06hd.LLJJIJI;
            streakData = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = streakData;
            this.LLILLL = c06hd;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.onUpdate$1");
                return objLJFF;
            }
        }
        try {
            EnumC1579606Gk enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SPWidget onUpdate ");
            sbLIZ.append(enumC1579606GkLJIIIIZZ);
            sbLIZ.append(' ');
            sbLIZ.append(streakData);
            sbLIZ.append(' ');
            sbLIZ.append(c06hd.LLIZ);
            sbLIZ.append(' ');
            sbLIZ.append(c06hd.LLILZLL);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c06hd.LLIZ == enumC1579606GkLJIIIIZZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SPWidget onUpdate skip same data update ");
                sbLIZ2.append(enumC1579606GkLJIIIIZZ);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onUpdate$1");
                return unit;
            }
            StreakPetData streakPetData = c06hd.LLIZLLLIL;
            if (streakPetData == null) {
                Unit unit2 = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onUpdate$1");
                return unit2;
            }
            if (c06hd.LLJJIJIL != null) {
                C1590806Ks.LIZ("SPWidget onUpdate fallbackView != null");
                c06hd.LJIIJJI(streakData);
                c06hd.LJIIJ(enumC1579606GkLJIIIIZZ, streakPetData);
                Unit unit3 = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onUpdate$1");
                return unit3;
            }
            c06hd.LJII();
            C1580106Gp c1580106GpLIZJ = c06hd.LIZJ(streakPetData, c06hd.LLIZ, streakData);
            if (c06hd.LLJ && c06hd.LLJILJILJ) {
                C1590806Ks.LIZ("SPWidget onUpdate post event");
                if (C06BV.LIZIZ(streakData, c06hd.LLIZLLLIL, c06hd.LLILLL)) {
                    c06hd.LJI(true);
                } else {
                    if (streakPetData.conversationType != AbstractC1711506n3.LIZIZ) {
                        z = false;
                    }
                    if (z) {
                        zLIZ = C296670Bk1.LIZ();
                    } else {
                        zLIZ = C06D3.LIZ();
                    }
                    if (zLIZ) {
                        c06hd.LJI(false);
                    }
                }
                c1580106GpLIZJ.LIZ();
                c06hd.LJIIJJI(streakData);
            } else if (c06hd.LLJI.get()) {
                C1590806Ks.LIZ("SPWidget onUpdate hold event");
                c06hd.LLJILJIL = c1580106GpLIZJ;
                C06BV.LIZIZ(streakData, streakPetData, c06hd.LLILLL);
                c06hd.LJIIJJI(streakData);
            } else {
                c06hd.LJIIIZ();
            }
            c1dev.LIZIZ(null);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.onUpdate$1");
            return unit4;
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
