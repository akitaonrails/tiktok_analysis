package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxDialogKt$TuxDialog$1$1", f = "TuxDialog.kt", l = {82}, m = "invokeSuspend")
public final class C1324705Gj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324705Gj(C05P0 c05p0, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1324705Gj(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxDialogKt@679.TuxDialog$1$1");
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
            if (!this.LLILLL.getValue().booleanValue()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(150L, this) == objLJFF) {
                    C1C7U.LIZIZ("TuxDialogKt@679.TuxDialog$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TuxDialogKt@679.TuxDialog$1$1");
            return unit;
        }
        this.LLILLJJLI.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TuxDialogKt@679.TuxDialog$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
