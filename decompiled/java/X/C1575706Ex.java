package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$updateStreakPetData$1", f = "StreakPetWidget.kt", l = {}, m = "invokeSuspend")
public final class C1575706Ex extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakPetData LL;
    public final /* synthetic */ C06HD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575706Ex(StreakPetData streakPetData, C06HD c06hd, InterfaceC1364105Vn<? super C1575706Ex> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakPetData;
        this.LLILLJJLI = c06hd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1575706Ex(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetWidget@92f0.updateStreakPetData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StreakPetData streakPetData = this.LL;
        if (streakPetData != null && streakPetData.status == C06G0.StreakPetStatus_Active.getValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetWidget@92f0.updateStreakPetData$1");
            return unit;
        }
        this.LLILLJJLI.LLILZ.LIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.updateStreakPetData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
