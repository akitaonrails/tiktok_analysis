package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$insertOrUpdateMessageOpt$1", f = "MessageOperatorHandler.kt", l = {}, m = "invokeSuspend")
public final class C320260Cgy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1863280yaU LL;
    public final /* synthetic */ Message LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320260Cgy(C1863280yaU c1863280yaU, Message message, InterfaceC1364105Vn<? super C320260Cgy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1863280yaU;
        this.LLILLJJLI = message;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320260Cgy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.insertOrUpdateMessageOpt$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJJLIIL(this.LLILLJJLI, false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.insertOrUpdateMessageOpt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
