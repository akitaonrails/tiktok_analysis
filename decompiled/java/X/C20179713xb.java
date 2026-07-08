package X;

/* JADX INFO: renamed from: X.13xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskScheduler", f = "TaskScheduler.kt", l = {406, 135, 156, 163}, m = "submitTaskGraph")
public final class C20179713xb extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1457070o1J LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C20179013xU LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20179713xb(C20179013xU c20179013xU, InterfaceC1364105Vn<? super C20179713xb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c20179013xU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TaskScheduler@23c5.submitTaskGraph$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLIZ.LJ(null, this);
        C1C7U.LIZIZ("TaskScheduler@23c5.submitTaskGraph$1");
        return objLJ;
    }
}
