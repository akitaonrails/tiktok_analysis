package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$notifyWidgetAttachStatus$1", f = "StreakPetWidget.kt", l = {937}, m = "invokeSuspend")
public final class C06HK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C06HD LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final /* synthetic */ C06HD LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HK(C06HD c06hd, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c06hd;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HK(this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06HD c06hd;
        C1DEV c1dev;
        boolean z;
        int iOrdinal;
        long j;
        int i;
        boolean z2;
        int i2;
        C1C7U.LIZ("StreakPetWidget@92f0.notifyWidgetAttachStatus$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LLILZ;
        if (i3 != 0) {
            if (i3 == 1) {
                z = this.LLILLL;
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
            z = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c06hd;
            this.LLILLL = z;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.notifyWidgetAttachStatus$1");
                return objLJFF;
            }
        }
        try {
            c06hd.LJII();
            if (c06hd.LLJILJIL != null) {
                C1580106Gp c1580106Gp = c06hd.LLJILJIL;
                if (c1580106Gp != null) {
                    c1580106Gp.LJI = z;
                    c1580106Gp.LIZ();
                } else {
                    c1580106Gp = null;
                }
                c06hd.LLJILJIL = c1580106Gp;
                c06hd.LLJILJIL = null;
            } else if (c06hd.LLJ) {
                StreakPetData streakPetData = c06hd.LLIZLLLIL;
                EnumC1579606Gk enumC1579606Gk = c06hd.LLIZ;
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
                Integer numLJ = C2286608xc.LJ(1);
                String str = c06hd.LLILLL;
                if (z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int andIncrement = c06hd.LLJIJIL.getAndIncrement();
                StreakData streakData3 = c06hd.LLILZLL;
                if (streakData3 != null) {
                    i2 = streakData3.streak;
                } else {
                    i2 = 0;
                }
                new C1580106Gp(streakPetData, iOrdinal, j, i, numLJ, str, z2, andIncrement, i2).LIZ();
            }
            if (c06hd.LLJ && C06BV.LIZIZ(c06hd.LLILZLL, c06hd.LLIZLLLIL, c06hd.LLILLL)) {
                c06hd.LJI(true);
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.notifyWidgetAttachStatus$1");
            return unit;
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
