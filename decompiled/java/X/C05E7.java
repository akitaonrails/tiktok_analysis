package X;

import com.ss.android.ugc.aweme.im.streak.impl.pet.StreakPetEventService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05E7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.StreakPetEventService$postEvent$1", f = "StreakPetEventService.kt", l = {29}, m = "invokeSuspend")
public final class C05E7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StreakPetEventService LLILLJJLI;
    public final /* synthetic */ C15531066f LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05E7(StreakPetEventService streakPetEventService, C15531066f c15531066f, InterfaceC1364105Vn<? super C05E7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = streakPetEventService;
        this.LLILLL = c15531066f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05E7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetEventService@a6c3.postEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LIZ;
            C15531066f c15531066f = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c15531066f, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetEventService@a6c3.postEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetEventService@a6c3.postEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
