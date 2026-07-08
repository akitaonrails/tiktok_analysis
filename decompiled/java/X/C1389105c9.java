package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {559}, m = "invokeSuspend")
public final class C1389105c9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1678560tmY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389105c9(C1678560tmY c1678560tmY, InterfaceC1364105Vn<? super C1389105c9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1678560tmY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1389105c9(this.LLILLJJLI, interfaceC1364105Vn);
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
            C1678560tmY c1678560tmY = this.LLILLJJLI;
            this.LL = 1;
            C1381605aw<EnumC1678550tmX> c1381605aw = c1678560tmY.LIZ;
            Object objLIZJ = C1381205as.LIZJ(((C13FI) c1381605aw.LJIIJ).LIZIZ(), c1381605aw, EnumC1678550tmX.Closed, this);
            if (objLIZJ != C099R.LJFF()) {
                objLIZJ = Unit.LIZ;
            }
            if (objLIZJ == objLJFF) {
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
