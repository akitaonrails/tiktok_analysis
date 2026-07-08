package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", l = {675}, m = "invokeSuspend")
public final class C1382605b6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1382705b7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382605b6(C1382705b7 c1382705b7, InterfaceC1364105Vn<? super C1382605b6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1382705b7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1382605b6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
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
            C1382705b7 c1382705b7 = this.LLILLJJLI;
            this.LL = 1;
            C1381605aw<EnumC1382405b4> c1381605aw = c1382705b7.LIZJ;
            EnumC1382405b4 enumC1382405b4 = EnumC1382405b4.HalfExpanded;
            if (!c1381605aw.LIZIZ().containsKey(enumC1382405b4) || (objLIZIZ = C1382705b7.LIZIZ(c1382705b7, enumC1382405b4, this)) != C099R.LJFF()) {
                objLIZIZ = Unit.LIZ;
            }
            if (objLIZIZ == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
