package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
public final class C321201Mk extends C09AX implements Function2<Throwable, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C321201Mk(InterfaceC1364105Vn<? super C321201Mk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321201Mk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C321201Mk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
