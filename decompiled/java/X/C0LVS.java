package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LVS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {61, BaseNotice.CREATOR, 65, 66, 67, 68}, m = "run")
public final class C0LVS extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LVQ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVS(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.run$1");
        return objLJFF;
    }
}
