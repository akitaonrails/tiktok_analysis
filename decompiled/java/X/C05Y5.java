package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1078}, m = "invokeSuspend")
public final class C05Y5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1369205Xm LLILLJJLI;
    public final /* synthetic */ C05ZY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Y5(InterfaceC1369205Xm interfaceC1369205Xm, C05ZY c05zy, InterfaceC1364105Vn<? super C05Y5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1369205Xm;
        this.LLILLL = c05zy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Y5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            C05ZY c05zy = this.LLILLL;
            this.LL = 1;
            Object objLJ = C2296808zG.LJ(new C05Y4(interfaceC1369205Xm, c05zy, null), this);
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
