package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {844}, m = "invokeSuspend")
public final class C1363605Vi extends C09AX implements Function2<InterfaceC1369205Xm, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363605Vi(Function0<Unit> function0, InterfaceC1364105Vn<? super C1363605Vi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363605Vi c1363605Vi = new C1363605Vi(this.LLILLL, interfaceC1364105Vn);
        c1363605Vi.LLILLJJLI = obj;
        return c1363605Vi;
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
            InterfaceC1369205Xm interfaceC1369205Xm = (InterfaceC1369205Xm) this.LLILLJJLI;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Function0) this.LLILLL, (Function0<Unit>) 42);
            this.LL = 1;
            if (C1374405Zm.LJ(interfaceC1369205Xm, this, null, null, awS581S0100000_2, C1374405Zm.LIZ) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1369205Xm, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
