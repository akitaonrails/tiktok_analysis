package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.monitor.StreakPetErrorMonitor$monitorIllegalStreakPetAccept$1", f = "StreakPetErrorMonitor.kt", l = {}, m = "invokeSuspend")
public final class C066F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066F(String str, InterfaceC1364105Vn<? super C066F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066F(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetErrorMonitor@155e.monitorIllegalStreakPetAccept$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0I0B.LJFF.LIZIZ();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", this.LL), new Pair("conversation_type", String.valueOf(C1567806Bw.LIZIZ(this.LL))));
        String str = this.LL;
        C06C6.LIZIZ.getClass();
        mapLJIIJ.put("pet_type", C1567906Bx.LIZJ(C06C6.LIZIZ(str)));
        C20684815ws.LJIILLIIL("illegal_streak_pet_accept", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetErrorMonitor@155e.monitorIllegalStreakPetAccept$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
