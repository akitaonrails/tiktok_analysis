package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.core.StreakDataManager$getStreakDataFromCacheInner$1", f = "StreakDataManager.kt", l = {}, m = "invokeSuspend")
public final class C066R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066R(String str, InterfaceC1364105Vn<? super C066R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066R(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakDataManager@6dfc.getStreakDataFromCacheInner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str = this.LL;
        c1575806Ey.getClass();
        StreakData streakDataLIZJ = C1575806Ey.LIZJ(str);
        if (streakDataLIZJ != null) {
            C1575806Ey.LJIIIZ(streakDataLIZJ, this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakDataManager@6dfc.getStreakDataFromCacheInner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
