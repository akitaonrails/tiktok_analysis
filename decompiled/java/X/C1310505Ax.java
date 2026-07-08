package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.EcommerceBystander$sendStreamMonitorLoseEvent$1", f = "EcommerceBystander.kt", l = {}, m = "invokeSuspend")
public final class C1310505Ax extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310505Ax(String str, String str2, String str3, InterfaceC1364105Vn<? super C1310505Ax> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1310505Ax(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcommerceBystander@a442.sendStreamMonitorLoseEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1018703yb.LIZLLL("rd_tiktokec_stream_monitor_lose", new C1489205sI(this.LL, this.LLILLJJLI, this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceBystander@a442.sendStreamMonitorLoseEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
