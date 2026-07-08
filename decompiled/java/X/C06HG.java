package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$onStreakPetDataUpdate$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C06HD LLILLJJLI;
    public StreakPetData LLILLL;
    public StreakPetData LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C06HD LLIZ;
    public final /* synthetic */ StreakPetData LLIZLLLIL;
    public final /* synthetic */ StreakPetData LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HG(C06HD c06hd, StreakPetData streakPetData, StreakPetData streakPetData2, String str, InterfaceC1364105Vn<? super C06HG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c06hd;
        this.LLIZLLLIL = streakPetData;
        this.LLJ = streakPetData2;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HG(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06HD c06hd;
        C1DEV c1dev;
        StreakPetData streakPetData;
        StreakPetData streakPetData2;
        String str;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ2;
        StreakPetData streakPetDataLIZ;
        C1C7U.LIZ("StreakPetWidget@92f0.onStreakPetDataUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILZIL;
                streakPetData2 = this.LLILZ;
                streakPetData = this.LLILLL;
                c06hd = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c06hd = this.LLIZ;
            c1dev = c06hd.LLJJIJI;
            streakPetData = this.LLIZLLLIL;
            streakPetData2 = this.LLJ;
            str = this.LLJI;
            this.LL = c1dev;
            this.LLILLJJLI = c06hd;
            this.LLILLL = streakPetData;
            this.LLILZ = streakPetData2;
            this.LLILZIL = str;
            this.LLILZLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.onStreakPetDataUpdate$1");
                return objLJFF;
            }
        }
        try {
            if (!C06HD.LJ(c06hd.LLIZLLLIL, streakPetData)) {
                boolean z = C1590806Ks.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SPWidget onStreakPetDataUpdate data duplicate ");
                sbLIZ.append(streakPetData2);
                sbLIZ.append(' ');
                sbLIZ.append(streakPetData);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                StreakPetData streakPetData3 = c06hd.LLIZLLLIL;
                if (streakPetData3 != null) {
                    streakPetDataLIZ = StreakPetData.LIZ(streakPetData3, false, streakPetData.streakPetAnimState, false, null, null, 523775);
                } else {
                    streakPetDataLIZ = null;
                }
                c06hd.LLIZLLLIL = streakPetDataLIZ;
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onStreakPetDataUpdate$1");
                return unit;
            }
            if (c06hd.LLJJIJIL != null) {
                c06hd.LJIIL(streakPetData);
                StreakData streakData = c06hd.LLILZLL;
                if (streakData != null && (enumC1579606GkLJIIIIZZ2 = C1567806Bw.LJIIIIZZ(streakData, false)) != null) {
                    c06hd.LJIIJ(enumC1579606GkLJIIIIZZ2, streakPetData);
                }
                Unit unit2 = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onStreakPetDataUpdate$1");
                return unit2;
            }
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SPWidget onStreakPetDataUpdate new data ");
            sbLIZ2.append(streakPetData);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c06hd.LJII();
            StreakData streakData2 = c06hd.LLILZLL;
            if (streakData2 != null) {
                enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData2, false);
            } else {
                enumC1579606GkLJIIIIZZ = null;
            }
            C1580106Gp c1580106GpLIZJ = c06hd.LIZJ(streakPetData, enumC1579606GkLJIIIIZZ, c06hd.LLILZLL);
            if (c06hd.LLJ && c06hd.LLJILJILJ) {
                C1590806Ks.LIZ("SPWidget onStreakPetDataUpdate post event");
                if (C06BV.LIZIZ(c06hd.LLILZLL, streakPetData, str)) {
                    c06hd.LJI(true);
                }
                c1580106GpLIZJ.LIZ();
                c06hd.LJIIL(streakPetData);
            } else if (c06hd.LLJI.get()) {
                C1590806Ks.LIZ("SPWidget onStreakPetDataUpdate hold event");
                c06hd.LLJILJIL = c1580106GpLIZJ;
                C06BV.LIZIZ(c06hd.LLILZLL, streakPetData, str);
                c06hd.LJIIL(streakPetData);
            } else {
                c06hd.LJIIIZ();
            }
            c1dev.LIZIZ(null);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.onStreakPetDataUpdate$1");
            return unit3;
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
