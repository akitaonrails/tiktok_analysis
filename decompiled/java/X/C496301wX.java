package X;

/* JADX INFO: renamed from: X.01wX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsService", f = "RecordingJsApi.kt", l = {52}, m = "fetchJsRules")
public final class C496301wX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C496201wW LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496301wX(C496201wW c496201wW, InterfaceC1364105Vn<? super C496301wX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c496201wW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingJsService@f76e.fetchJsRules$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        C1C7U.LIZIZ("RecordingJsService@f76e.fetchJsRules$1");
        return objLIZ;
    }
}
