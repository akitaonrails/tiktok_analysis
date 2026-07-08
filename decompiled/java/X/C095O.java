package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.095O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$execute$2", f = "SmartMovieNLEPipeline.kt", l = {}, m = "invokeSuspend")
public final class C095O extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096H>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C095O(InterfaceC1364105Vn<? super C095O> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LJIIIZ(C1398350mUb.LIZIZ, "SmartMovieNLEPipeline", "execute error", (Throwable) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096H> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C095O c095o = new C095O(interfaceC1364105Vn);
        c095o.LL = th;
        return c095o.invokeSuspend(Unit.LIZ);
    }
}
