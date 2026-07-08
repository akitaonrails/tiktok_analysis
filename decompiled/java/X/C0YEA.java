package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YEA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.UnreadCountModelImpl$reportUnreadCount$1", f = "UnreadCountModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C0YEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C871610YHf LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YEA(C871610YHf c871610YHf, String str, int i, Integer num, InterfaceC1364105Vn<? super C0YEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c871610YHf;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YEA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnreadCountModelImpl@674b.reportUnreadCount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C871610YHf c871610YHf = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        Integer num = this.LLILZ;
        c871610YHf.getClass();
        boolean zLJI = MethodIDManager.LJI(137694);
        c871610YHf.LIZIZ.LJIJ().LJJLIIIJJI(i, new C0YEB(c871610YHf, str, i, num));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnreadCountModelImpl@674b.reportUnreadCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
