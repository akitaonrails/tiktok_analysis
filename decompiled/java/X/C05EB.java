package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.record.BaseRecordBottomTabConfigure$reportLiveTabExpose$1", f = "RecordBottomTabConfigure.kt", l = {}, m = "invokeSuspend")
public final class C05EB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1653300t7o LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EB(int i, C1653300t7o c1653300t7o, InterfaceC1364105Vn<? super C05EB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c1653300t7o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseRecordBottomTabConfigure@b04f.reportLiveTabExpose$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1653300t7o.LJ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseRecordBottomTabConfigure@b04f.reportLiveTabExpose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
