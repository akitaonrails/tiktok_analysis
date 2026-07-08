package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0NpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ListNetworkLoadTask", f = "ListNetworkLoadTask.kt", l = {47, 60}, m = "execute")
public final class C605690NpH extends AbstractC23140094w {
    public C605550Np3 LL;
    public BulletinListResponse LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C605670NpF LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605690NpH(C605670NpF c605670NpF, InterfaceC1364105Vn<? super C605690NpH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c605670NpF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListNetworkLoadTask@cec.execute$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this);
        C1C7U.LIZIZ("ListNetworkLoadTask@cec.execute$1");
        return objLIZIZ;
    }
}
