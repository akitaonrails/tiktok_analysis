package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2", f = "ModalBottomSheet.kt", l = {823}, m = "invokeSuspend")
public final class C1382005b0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1382705b7 LLILLJJLI;
    public final /* synthetic */ EnumC1382405b4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1382005b0(C1382705b7 c1382705b7, EnumC1382405b4 enumC1382405b4, InterfaceC1364105Vn<? super C1382005b0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1382705b7;
        this.LLILLL = enumC1382405b4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1382005b0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            EnumC1382405b4 enumC1382405b4 = this.LLILLL;
            this.LL = 1;
            C1381605aw<EnumC1382405b4> c1381605aw = c1382705b7.LIZJ;
            C05RF c05rf = new C05RF(enumC1382405b4, null);
            EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
            c1381605aw.getClass();
            Object objLJ = C2296808zG.LJ(new C1381505av(enumC1382405b4, c1381605aw, enumC1384205bM, c05rf, null), this);
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ != C099R.LJFF()) {
                objLJ = Unit.LIZ;
            }
            if (objLJ == objLJFF) {
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
