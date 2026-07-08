package X;

/* JADX INFO: renamed from: X.0ZTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.groupshot.task.AIGroupShotPublishStatusManager", f = "AIGroupShotPublishStatusManager.kt", l = {179}, m = "onPublishFinish")
public final class C900320ZTq extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public EnumC900350ZTt LLILLL;
    public C1DEV LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C900300ZTo LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C900320ZTq(C900300ZTo c900300ZTo, InterfaceC1364105Vn<? super C900320ZTq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c900300ZTo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotPublishStatusManager@e4df.onPublishFinish$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("AIGroupShotPublishStatusManager@e4df.onPublishFinish$1");
        return objLIZLLL;
    }
}
