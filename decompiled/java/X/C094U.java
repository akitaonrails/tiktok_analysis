package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.094U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class C094U extends C09AX implements Function1<InterfaceC1364105Vn<?>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C094U(long j, InterfaceC1364105Vn<? super C094U> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C094U(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        throw null;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timed out waiting for ");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LL));
        throw new C094W(C2188811AlT.LIZIZ(sbLIZ));
    }
}
