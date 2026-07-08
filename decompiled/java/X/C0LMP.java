package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LMP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadTask", f = "CreationDownloadTask.kt", l = {41, 42, BaseNotice.RECOMMEND_LIVE, 67, 81, 82, 100, 110, 111}, m = "run")
public final class C0LMP extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0LMO LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMP(C0LMO c0lmo, InterfaceC1364105Vn<? super C0LMP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0lmo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadTask@d5c2.run$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLIZ.LJFF(null, this);
        C1C7U.LIZIZ("CreationDownloadTask@d5c2.run$1");
        return objLJFF;
    }
}
