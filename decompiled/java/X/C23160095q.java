package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.095q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieTemplateListPipeline$execute$3", f = "SmartMovieTemplateListPipeline.kt", l = {81}, m = "invokeSuspend")
public final class C23160095q extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096D>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C23187096r LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23160095q(C23187096r c23187096r, InterfaceC1364105Vn<? super C23160095q> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c23187096r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieTemplateListPipeline@97ee.execute$3");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Throwable th = (Throwable) this.LLILLL;
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute error execId=");
            sbLIZ.append(this.LLILZ.LJIIJJI);
            C201955140j.LJIIIZ(c1398350mUb, "SmartMovieTemplateListPipeline", C2188811AlT.LIZIZ(sbLIZ), th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C096C c096c = new C096C(9, message, this.LLILZ.LJIILIIL);
            this.LLILLJJLI = null;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c096c, this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieTemplateListPipeline@97ee.execute$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieTemplateListPipeline@97ee.execute$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096D> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C23160095q c23160095q = new C23160095q(this.LLILZ, interfaceC1364105Vn);
        c23160095q.LLILLJJLI = interfaceC346701Wf;
        c23160095q.LLILLL = th;
        return c23160095q.invokeSuspend(Unit.LIZ);
    }
}
