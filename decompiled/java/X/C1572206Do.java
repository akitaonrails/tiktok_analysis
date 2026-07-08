package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetAssem$onCreate$1$curStreakPetData$1", f = "StreakPetAssem.kt", l = {}, m = "invokeSuspend")
public final class C1572206Do extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StreakPetData>, Object> {
    public final /* synthetic */ StreakPetAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572206Do(StreakPetAssem streakPetAssem, InterfaceC1364105Vn<? super C1572206Do> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakPetAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1572206Do(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetAssem@a8a3.onCreate$1$curStreakPetData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06C6 c06c6 = C06C6.LIZIZ;
        String strBo = this.LL.bo();
        c06c6.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(strBo);
        C1C7U.LIZIZ("StreakPetAssem@a8a3.onCreate$1$curStreakPetData$1");
        return streakPetDataLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StreakPetData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
