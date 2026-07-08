package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$cleanCache$job$1", f = "PCSBoardEffectService.kt", l = {745}, m = "invokeSuspend")
public final class C334201Rk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C394101g3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334201Rk(C394101g3 c394101g3, InterfaceC1364105Vn<? super C334201Rk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c394101g3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334201Rk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectService@8a7a.cleanCache$job$1");
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
            C394101g3 c394101g3 = this.LLILLJJLI;
            if (!c394101g3.LIZLLL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.cleanCache$job$1");
                return unit;
            }
            c394101g3.LIZLLL = false;
            C1DFB c1dfb = C0PEM.LIZJ;
            C360201aa c360201aa = new C360201aa(null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c360201aa) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.cleanCache$job$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZLLL = true;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.cleanCache$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
