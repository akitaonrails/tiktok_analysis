package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$updateStreakPetAnimState$1", f = "StreakPetDataSource.kt", l = {}, m = "invokeSuspend")
public final class C15526066a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1569106Cj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<StreakPetData, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15526066a(C1569106Cj c1569106Cj, String str, Function1<? super StreakPetData, String> function1, InterfaceC1364105Vn<? super C15526066a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1569106Cj;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15526066a(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetDataSource@55af.updateStreakPetAnimState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569106Cj c1569106Cj = this.LL;
        Object obj2 = c1569106Cj.LIZIZ;
        String str = this.LLILLJJLI;
        Function1<StreakPetData, String> function1 = this.LLILLL;
        synchronized (obj2) {
            try {
                StreakPetData streakPetDataLIZLLL = C1569106Cj.LIZLLL(str);
                if (streakPetDataLIZLLL == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreakPetAnimState$1");
                    return unit;
                }
                StreakPetData streakPetDataLIZ = StreakPetData.LIZ(streakPetDataLIZLLL, false, function1.invoke(streakPetDataLIZLLL), false, null, null, 523775);
                boolean z = C1590806Ks.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateStreakPetAnimState ");
                sbLIZ.append(str);
                sbLIZ.append(" old ");
                sbLIZ.append(streakPetDataLIZLLL);
                sbLIZ.append(" new ");
                sbLIZ.append(streakPetDataLIZ);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c1569106Cj.LJII(streakPetDataLIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreakPetAnimState$1");
                return unit2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
