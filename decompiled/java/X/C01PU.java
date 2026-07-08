package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$applyEffect$1$1", f = "PCSBoardEffectService.kt", l = {828, 834}, m = "invokeSuspend")
public final class C01PU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ EnumC389301fH LLILZ;
    public final /* synthetic */ InterfaceC2329309At<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PU(Context context, EnumC389301fH enumC389301fH, C394101g3 c394101g3, InterfaceC2329309At interfaceC2329309At, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
        this.LLILLL = context;
        this.LLILZ = enumC389301fH;
        this.LLILZIL = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PU(this.LLILLL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C394101g3 c394101g3 = this.LLILLJJLI;
            Context context = this.LLILLL;
            EnumC389301fH enumC389301fH = this.LLILZ;
            this.LL = 1;
            obj = c394101g3.LJIIIZ(context, enumC389301fH, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            this.LLILZIL.onSuccess(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
            return unit2;
        }
        AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.LJIJ().LIZLLL;
        C01PS c01ps = new C01PS(this.LLILZIL, null);
        this.LL = 2;
        if (C09IC.LJIJ(anonymousClass0950, this, c01ps) == objLJFF) {
            C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.applyEffect$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
