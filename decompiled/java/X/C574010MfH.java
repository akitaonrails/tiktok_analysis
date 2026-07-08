package X;

import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1$2", f = "RecordServiceBaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C574010MfH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UIServiceCallback LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574010MfH(UIServiceCallback uIServiceCallback, InterfaceC1364105Vn<? super C574010MfH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uIServiceCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574010MfH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordServiceBaseImpl@d40c.startChangeBanMusic$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.postFail();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordServiceBaseImpl@d40c.startChangeBanMusic$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
