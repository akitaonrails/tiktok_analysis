package X;

/* JADX INFO: renamed from: X.0LW9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {320, 325}, m = "setTaskFailAttempt")
public final class C0LW9 extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543980LVc LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LW9(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C0LW9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.setTaskFailAttempt$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZ.LJJJJZI(0, null, null, this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.setTaskFailAttempt$1");
        return objLJJJJZI;
    }
}
