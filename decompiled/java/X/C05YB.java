package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
public final class C05YB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1692140u8S LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YB(C1692140u8S c1692140u8S, InterfaceC1364105Vn<? super C05YB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1692140u8S;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05YB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIILJJIL();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
