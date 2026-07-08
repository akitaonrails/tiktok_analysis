package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataManager$getStreakPetDataFromCache$1", f = "StreakPetDataManager.kt", l = {}, m = "invokeSuspend")
public final class C066O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066O(String str, InterfaceC1364105Vn<? super C066O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066O(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetDataManager@be88.getStreakPetDataFromCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569106Cj.LJ.getClass();
        C1569106Cj c1569106Cj = C1569106Cj.LJI;
        String str = this.LL;
        c1569106Cj.getClass();
        StreakPetData streakPetDataLIZLLL = C1569106Cj.LIZLLL(str);
        if (streakPetDataLIZLLL != null) {
            String str2 = this.LL;
            C06C6.LIZIZ.getClass();
            C06C6.LJFF(str2, null, streakPetDataLIZLLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetDataManager@be88.getStreakPetDataFromCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
