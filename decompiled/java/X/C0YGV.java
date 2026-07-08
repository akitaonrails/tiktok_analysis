package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YGV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.GetMsgByUserWithBufferUseCase$onPullMsgEndWithError$2", f = "GetMsgByUserWithBufferUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0YGV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C0YGW LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0YE0 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YGV(int i, C0YGW c0ygw, int i2, C0YE0 c0ye0, InterfaceC1364105Vn<? super C0YGV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c0ygw;
        this.LLILLL = i2;
        this.LLILZ = c0ye0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YGV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByUserWithBufferUseCase@994c.onPullMsgEndWithError$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 0) {
            this.LLILLJJLI.LIZIZ.LJIIZILJ().getDomain().LIZ.LJIILLIIL(this.LLILLL, false);
        }
        this.LLILLJJLI.LIZIZ.LJIIZILJ().getDomain().LIZ.LJIJJLI(this.LLILZ.LJIILL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetMsgByUserWithBufferUseCase@994c.onPullMsgEndWithError$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
