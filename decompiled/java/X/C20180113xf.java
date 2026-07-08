package X;

/* JADX INFO: renamed from: X.13xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskDeduplicationManager", f = "TaskDeduplicationManager.kt", l = {153}, m = "checkCache")
public final class C20180113xf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20179113xV LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20180113xf(C20179113xV c20179113xV, InterfaceC1364105Vn<? super C20180113xf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20179113xV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskDeduplicationManager@cfac.checkCache$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, this);
        C1C7U.LIZIZ("TaskDeduplicationManager@cfac.checkCache$1");
        return objLIZIZ;
    }
}
