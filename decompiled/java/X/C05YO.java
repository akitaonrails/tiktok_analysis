package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05YO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {708}, m = "invokeSuspend")
public final class C05YO extends C09AX implements Function2<InterfaceC1369205Xm, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YO(Function0<Unit> function0, InterfaceC1364105Vn<? super C05YO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05YO c05yo = new C05YO(this.LLILLL, interfaceC1364105Vn);
        c05yo.LLILLJJLI = obj;
        return c05yo;
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
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Function0) this.LLILLL, (Function0<Unit>) 41);
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
