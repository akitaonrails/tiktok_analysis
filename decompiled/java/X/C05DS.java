package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImp.task.ug.AppstoreRegionInfoReportTask$tryReportAppStoreRegionInfo$1$1", f = "AppstoreRegionInfoReportTask.kt", l = {}, m = "invokeSuspend")
public final class C05DS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C844150X9p LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DS(C844150X9p c844150X9p, InterfaceC1364105Vn<? super C05DS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c844150X9p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AppstoreRegionInfoReportTask@103.tryReportAppStoreRegionInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.getClass();
            C844150X9p.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AppstoreRegionInfoReportTask@103.tryReportAppStoreRegionInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
