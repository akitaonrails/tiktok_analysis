package X;

/* JADX INFO: renamed from: X.0ODJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.api.report.SubmitReportMutation", f = "SubmitReportMutation.kt", l = {15}, m = "operate")
public final class C0ODJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0ODI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ODJ(C0ODI c0odi, InterfaceC1364105Vn<? super C0ODJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0odi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubmitReportMutation@ea7f.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("SubmitReportMutation@ea7f.operate$1");
        return objLIZIZ;
    }
}
