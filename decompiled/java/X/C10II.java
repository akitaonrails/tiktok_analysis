package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork;

/* JADX INFO: renamed from: X.10II, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork", f = "BaseOfflinePushWork.kt", l = {BaseNotice.CREATOR}, m = "doWork")
public final class C10II extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseOfflinePushWork LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10II(BaseOfflinePushWork baseOfflinePushWork, InterfaceC1364105Vn<? super C10II> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = baseOfflinePushWork;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseOfflinePushWork@c3a9.doWork$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(this);
        C1C7U.LIZIZ("BaseOfflinePushWork@c3a9.doWork$1");
        return objLJII;
    }
}
