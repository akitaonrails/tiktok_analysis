package X;

import com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl$updateAigcLabelStatus$2$3", f = "AIGCLabelServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05MU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCLabelServiceImpl LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ IOException LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05MU(AIGCLabelServiceImpl aIGCLabelServiceImpl, Function1<? super String, Unit> function1, IOException iOException, InterfaceC1364105Vn<? super C05MU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCLabelServiceImpl;
        this.LLILLJJLI = function1;
        this.LLILLL = iOException;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2296808zG.LJI(this.LL.LIZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$3");
            return unit;
        }
        Function1<String, Unit> function1 = this.LLILLJJLI;
        String message = this.LLILLL.getMessage();
        if (message == null) {
            message = "Network error";
        }
        function1.invoke(message);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
