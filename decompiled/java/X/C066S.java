package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakUpdateTrigger$updateStreakBadge$1", f = "StreakUpdateTrigger.kt", l = {}, m = "invokeSuspend")
public final class C066S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HashSet<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066S(HashSet<String> hashSet, InterfaceC1364105Vn<? super C066S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hashSet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066S(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakUpdateTrigger@7b15.updateStreakBadge$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (String str : this.LL) {
            C1575806Ey.LIZJ.getClass();
            StreakData streakDataLIZIZ = C1575806Ey.LIZIZ(str);
            if (streakDataLIZIZ != null) {
                C1575806Ey.LJIIIZ(streakDataLIZIZ, str);
            } else {
                StreakData streakDataLIZJ = C1575806Ey.LIZJ(str);
                if (streakDataLIZJ != null) {
                    C1575806Ey.LJIIIZ(streakDataLIZJ, str);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakUpdateTrigger@7b15.updateStreakBadge$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
