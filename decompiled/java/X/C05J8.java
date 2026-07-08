package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05J8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$3", f = "ToolsFluencyEventReport.kt", l = {}, m = "invokeSuspend")
public final class C05J8 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Unit>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C05J8(InterfaceC1364105Vn<? super C05J8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolsFluencyEventReport@cfeb.start$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = (Throwable) this.LL;
        C201955140j.LJIIJ(C20102213l6.LIZIZ, "fluency event report error", th);
        C1AF0.LJ(th);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolsFluencyEventReport@cfeb.start$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Unit> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C05J8 c05j8 = new C05J8(interfaceC1364105Vn);
        c05j8.LL = th;
        return c05j8.invokeSuspend(Unit.LIZ);
    }
}
