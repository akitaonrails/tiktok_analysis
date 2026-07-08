package X;

/* JADX INFO: renamed from: X.0NpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskScheduler", f = "TaskScheduler.kt", l = {356}, m = "checkResultCache")
public final class C605780NpQ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20179013xU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605780NpQ(C20179013xU c20179013xU, InterfaceC1364105Vn<? super C605780NpQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20179013xU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@23c5.checkResultCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("TaskScheduler@23c5.checkResultCache$1");
        return objLIZ;
    }
}
