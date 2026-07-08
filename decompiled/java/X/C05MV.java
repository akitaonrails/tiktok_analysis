package X;

import com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl;
import com.ss.android.ugc.aweme.aigc.label.AIGCLabelStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl$updateAigcLabelStatus$2$1", f = "AIGCLabelServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05MV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCLabelServiceImpl LL;
    public final /* synthetic */ Function1<AIGCLabelStatusResponse, Unit> LLILLJJLI;
    public final /* synthetic */ AIGCLabelStatusResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05MV(AIGCLabelServiceImpl aIGCLabelServiceImpl, Function1<? super AIGCLabelStatusResponse, Unit> function1, AIGCLabelStatusResponse aIGCLabelStatusResponse, InterfaceC1364105Vn<? super C05MV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCLabelServiceImpl;
        this.LLILLJJLI = function1;
        this.LLILLL = aIGCLabelStatusResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2296808zG.LJI(this.LL.LIZ)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$1");
            return unit;
        }
        this.LLILLJJLI.invoke(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
