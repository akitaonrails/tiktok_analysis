package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$applyEffect$1$1$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C01PS extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC2329309At<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PS(InterfaceC2329309At<Boolean> interfaceC2329309At, InterfaceC1364105Vn<? super C01PS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01PS c01ps = new C01PS(this.LLILLJJLI, interfaceC1364105Vn);
        c01ps.LL = ((Number) obj).intValue();
        return c01ps;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.applyEffect$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectAppliedStateFlow -> appliedState= ");
        sbLIZ.append(i);
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i == 2) {
            this.LLILLJJLI.onSuccess(true);
            C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1$1");
            return true;
        }
        this.LLILLJJLI.onSuccess(false);
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1$1");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
