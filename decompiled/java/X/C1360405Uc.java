package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.report.compose.ReportListFragmentCompose$onCreateView$1$1$1$2$1", f = "ReportListFragmentCompose.kt", l = {}, m = "invokeSuspend")
public final class C1360405Uc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<C326260Cqe> LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360405Uc(C05P1<C326260Cqe> c05p1, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1360405Uc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360405Uc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportListFragmentCompose@7dca.onCreateView$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolLIZ = this.LL.getValue().LLILLL.LIZ();
        if (boolLIZ != null) {
            C05P0<Boolean> c05p0 = this.LLILLJJLI;
            if (boolLIZ.booleanValue()) {
                c05p0.setValue(Boolean.TRUE);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReportListFragmentCompose@7dca.onCreateView$1$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
