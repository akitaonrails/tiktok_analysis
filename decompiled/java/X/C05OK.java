package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updaterefmsg.UpdateReferencedMsgUseCase$updateRefMsgListStatus$2", f = "UpdateReferencedMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C05OK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YEM LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05OK(C0YEM c0yem, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C05OK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yem;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05OK c05ok = new C05OK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05ok.LL = obj;
        return c05ok;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatus$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1522705xh(this.LLILLJJLI, this.LLILLL, null), 2);
        C1C7U.LIZIZ("UpdateReferencedMsgUseCase@5fad.updateRefMsgListStatus$2");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
