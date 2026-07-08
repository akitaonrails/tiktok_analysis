package X;

import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Jbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageForSubMethod$onActivityResult$1$1$1$2$3$1", f = "ChooseImageForSubMethod.kt", l = {}, m = "invokeSuspend")
public final class C495410Jbn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C495440Jbq LL;
    public final /* synthetic */ IHostSubscription.Result LLILLJJLI;
    public final /* synthetic */ IHostSubscription.Params LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495410Jbn(C495440Jbq c495440Jbq, IHostSubscription.Result result, IHostSubscription.Params params, InterfaceC1364105Vn<? super C495410Jbn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c495440Jbq;
        this.LLILLJJLI = result;
        this.LLILLL = params;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495410Jbn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseImageForSubMethod@6da.onActivityResult$1$1$1$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJ(this.LLILLJJLI, this.LLILLL.emotesShowStyle);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseImageForSubMethod@6da.onActivityResult$1$1$1$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
