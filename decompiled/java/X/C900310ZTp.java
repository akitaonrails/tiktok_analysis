package X;

/* JADX INFO: renamed from: X.0ZTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.groupshot.task.AIGroupShotPublishStatusManager", f = "AIGroupShotPublishStatusManager.kt", l = {179}, m = "onStartPublish")
public final class C900310ZTp extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public EnumC900350ZTt LLILLL;
    public Object LLILZ;
    public C1DEV LLILZIL;
    public boolean LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C900300ZTo LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C900310ZTp(C900300ZTo c900300ZTo, InterfaceC1364105Vn<? super C900310ZTp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c900300ZTo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotPublishStatusManager@e4df.onStartPublish$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJ = this.LLIZLLLIL.LJ(null, null, null, null, false, this);
        C1C7U.LIZIZ("AIGroupShotPublishStatusManager@e4df.onStartPublish$1");
        return objLJ;
    }
}
