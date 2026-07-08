package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updaterefmsg.UpdateReferencedMsgUseCase$updateRefMsgListStatus$2$1", f = "UpdateReferencedMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C1522705xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YEM LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1522705xh(C0YEM c0yem, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1522705xh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yem;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1522705xh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatus$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIZILJ().getDomain().LIZ.LJJIIJZLJL(new C0Y3I("Update ref list status"), this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatus$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
