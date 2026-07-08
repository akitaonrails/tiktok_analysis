package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05J7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsBaseInfoEventReport$start$reportingFlow$3", f = "ToolsBaseInfoEventReport.kt", l = {}, m = "invokeSuspend")
public final class C05J7 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Unit>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C05J7(InterfaceC1364105Vn<? super C05J7> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolsBaseInfoEventReport@b402.start$reportingFlow$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C201955140j.LJIIJ(C20102213l6.LIZIZ, "ToolsBaseInfoEventReport.start error", th);
        C1AF0.LJ(th);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolsBaseInfoEventReport@b402.start$reportingFlow$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Unit> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C05J7 c05j7 = new C05J7(interfaceC1364105Vn);
        c05j7.LL = th;
        return c05j7.invokeSuspend(Unit.LIZ);
    }
}
