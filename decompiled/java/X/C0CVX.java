package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.PreScheduleRequest$requestAsync$2", f = "PreScheduleRequest.kt", l = {}, m = "invokeSuspend")
public final class C0CVX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C328040CtW>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C327950CtN LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVX(C327950CtN c327950CtN, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c327950CtN;
        this.LLILZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CVX c0cvx = new C0CVX(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILZ);
        c0cvx.LL = obj;
        return c0cvx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreScheduleRequest@d280.requestAsync$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C328020CtU(this.LLILLL, null, this.LLILLJJLI, this.LLILZ), 3);
        C1C7U.LIZIZ("PreScheduleRequest@d280.requestAsync$2");
        return c099gLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AnonymousClass0957<? extends C328040CtW>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
