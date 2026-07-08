package X;

import com.ss.android.ugc.aweme.detail.component.biz.DetailPerfMonitorComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.component.biz.DetailPerfMonitorComponent$onCreate$1", f = "DetailPerfMonitorComponent.kt", l = {65}, m = "invokeSuspend")
public final class C465001rU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DetailPerfMonitorComponent LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C465001rU(DetailPerfMonitorComponent detailPerfMonitorComponent, String str, InterfaceC1364105Vn<? super C465001rU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = detailPerfMonitorComponent;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C465001rU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DetailPerfMonitorComponent@a873.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("DetailPerfMonitorComponent@a873.onCreate$1");
                return objLJFF;
            }
        }
        DetailPerfMonitorComponent detailPerfMonitorComponent = this.LLILLJJLI;
        if (detailPerfMonitorComponent.LLILLJJLI) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DetailPerfMonitorComponent@a873.onCreate$1");
            return unit;
        }
        detailPerfMonitorComponent.LLILLJJLI = true;
        detailPerfMonitorComponent.fo(this.LLILLL, "timeout");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DetailPerfMonitorComponent@a873.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
