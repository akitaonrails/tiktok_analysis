package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$onConvLevelDataChanged$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C06HD LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C06HD LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HI(C06HD c06hd, String str, InterfaceC1364105Vn<? super C06HI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c06hd;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HI(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06HD c06hd;
        C1DEV c1dev;
        String str;
        int iOrdinal;
        long j;
        int i;
        C1C7U.LIZ("StreakPetWidget@92f0.onConvLevelDataChanged$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) this.LLILLL;
                c06hd = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c06hd = this.LLILZIL;
            c1dev = c06hd.LLJJIJI;
            str = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c06hd;
            this.LLILLL = str;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.onConvLevelDataChanged$1");
                return objLJFF;
            }
        }
        try {
            if (c06hd.LLJJIJIL != null) {
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakPetWidget@92f0.onConvLevelDataChanged$1");
                return unit;
            }
            c06hd.LJII();
            StreakPetData streakPetData = c06hd.LLIZLLLIL;
            EnumC1579606Gk enumC1579606Gk = c06hd.LLIZ;
            int i3 = 0;
            if (enumC1579606Gk != null) {
                iOrdinal = enumC1579606Gk.ordinal();
            } else {
                iOrdinal = 0;
            }
            StreakData streakData = c06hd.LLILZLL;
            if (streakData != null) {
                j = streakData.restoreAvailableTime;
            } else {
                j = 0;
            }
            StreakData streakData2 = c06hd.LLILZLL;
            if (streakData2 != null) {
                i = streakData2.remainRestoreCnt;
            } else {
                i = 0;
            }
            boolean z = c06hd.LLJILLL;
            int andIncrement = c06hd.LLJIJIL.getAndIncrement();
            StreakData streakData3 = c06hd.LLILZLL;
            if (streakData3 != null) {
                i3 = streakData3.streak;
            }
            C1580106Gp c1580106Gp = new C1580106Gp(streakPetData, iOrdinal, j, i, null, str, z, andIncrement, i3);
            if (c06hd.LLJ && c06hd.LLJILJILJ) {
                c1580106Gp.LIZ();
            } else if (c06hd.LLJI.get()) {
                C1590806Ks.LIZ("SPWidget onStreakPetDataUpdate hold event");
                c06hd.LLJILJIL = c1580106Gp;
            } else {
                c06hd.LJIIIZ();
            }
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.onConvLevelDataChanged$1");
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
