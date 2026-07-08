package X;

/* JADX INFO: renamed from: X.17sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.core.record.IMRecorder", f = "IMRecorder.kt", l = {100}, m = "startRecording")
public final class C21166517sN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1DJ2 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21166517sN(C1DJ2 c1dj2, InterfaceC1364105Vn<? super C21166517sN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1dj2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMRecorder@5865.startRecording$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("IMRecorder@5865.startRecording$1");
        return objLJ;
    }
}
