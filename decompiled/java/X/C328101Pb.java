package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$checkBoardConflicts$1$1", f = "PCSBoardEffectService.kt", l = {854}, m = "invokeSuspend")
public final class C328101Pb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ EnumC389301fH LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ InterfaceC2329309At<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328101Pb(Context context, EnumC389301fH enumC389301fH, C394101g3 c394101g3, InterfaceC2329309At interfaceC2329309At, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = enumC389301fH;
        this.LLILZ = context;
        this.LLILZIL = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C394101g3 c394101g3 = this.LLILLJJLI;
        return new C328101Pb(this.LLILZ, this.LLILLL, c394101g3, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.checkBoardConflicts$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLIZ = this.LLILLJJLI.LJIJ().LIZ(this.LLILZ, this.LLILLL);
            this.LL = 1;
            obj = C09IC.LJIIZILJ(interfaceC346201WaLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.checkBoardConflicts$1$1");
                return objLJFF;
            }
        }
        this.LLILZIL.onSuccess(Boolean.valueOf(((Boolean) obj).booleanValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.checkBoardConflicts$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
