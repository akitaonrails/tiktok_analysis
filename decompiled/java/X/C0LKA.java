package X;

/* JADX INFO: renamed from: X.0LKA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.childtask.WaitFrameUploadTask", f = "NormalChildTaskWaitFrameUpload.kt", l = {87}, m = "run")
public final class C0LKA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LK9 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKA(C0LK9 c0lk9, InterfaceC1364105Vn<? super C0LKA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lk9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WaitFrameUploadTask@b99d.run$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = LJFF(null, this);
        C1C7U.LIZIZ("WaitFrameUploadTask@b99d.run$1");
        return objLJFF;
    }
}
