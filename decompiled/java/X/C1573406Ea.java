package X;

import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem$storeWidgetPosition$1", f = "StreakPetWidgetAssem.kt", l = {}, m = "invokeSuspend")
public final class C1573406Ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakPetWidgetAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573406Ea(StreakPetWidgetAssem streakPetWidgetAssem, int i, int i2, InterfaceC1364105Vn<? super C1573406Ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakPetWidgetAssem;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1573406Ea(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetWidgetAssem@8027.storeWidgetPosition$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06E0 c06e0 = C06E0.LIZ;
        String strHp = this.LL.hp();
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        c06e0.getClass();
        C0YNP.LJIIIIZZ(strHp, "streak_widget_margin_top", String.valueOf(i));
        C0YNP.LJIIIIZZ(strHp, "streak_widget_margin_left", String.valueOf(i2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidgetAssem@8027.storeWidgetPosition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
