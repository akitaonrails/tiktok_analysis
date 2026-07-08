package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetFeDataRepository$recordConvLevelStreakPetFeData$1", f = "StreakPetFeDataRepository.kt", l = {}, m = "invokeSuspend")
public final class C1571906Dl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1571106Dd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1571906Dl(C1571106Dd c1571106Dd, String str, String str2, InterfaceC1364105Vn<? super C1571906Dl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1571106Dd;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1571906Dl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetFeDataRepository@23f4.recordConvLevelStreakPetFeData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.storeString(this.LLILLJJLI, this.LLILLL);
        Iterator<InterfaceC1572006Dm> it2 = this.LL.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetFeDataRepository@23f4.recordConvLevelStreakPetFeData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
