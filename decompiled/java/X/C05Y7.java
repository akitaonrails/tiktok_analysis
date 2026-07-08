package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1081}, m = "invokeSuspend")
public final class C05Y7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1369205Xm LLILLJJLI;
    public final /* synthetic */ C1692140u8S LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Y7(InterfaceC1369205Xm interfaceC1369205Xm, C1692140u8S c1692140u8S, InterfaceC1364105Vn<? super C05Y7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1369205Xm;
        this.LLILLL = c1692140u8S;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Y7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            InterfaceC1369205Xm interfaceC1369205Xm = this.LLILLJJLI;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(this.LLILLL, 689);
            this.LL = 1;
            if (C1374405Zm.LJ(interfaceC1369205Xm, this, null, null, awS581S0100000_2, C1374405Zm.LIZ) == objLJFF) {
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
