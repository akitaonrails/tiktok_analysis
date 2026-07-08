package X;

/* JADX INFO: renamed from: X.13xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskDeduplicationManager", f = "TaskDeduplicationManager.kt", l = {219}, m = "waitForActiveRequest")
public final class C20180213xg extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20179113xV LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20180213xg(C20179113xV c20179113xV, InterfaceC1364105Vn<? super C20180213xg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20179113xV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskDeduplicationManager@cfac.waitForActiveRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(0L, null, this);
        C1C7U.LIZIZ("TaskDeduplicationManager@cfac.waitForActiveRequest$1");
        return objLIZLLL;
    }
}
