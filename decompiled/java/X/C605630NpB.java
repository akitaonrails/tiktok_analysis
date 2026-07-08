package X;

import Y.AgS290S0100000_9;

/* JADX INFO: renamed from: X.0NpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler$submit$1$job$1$cancelMonitor$1$invokeSuspend$$inlined$filter$1$2", f = "TaskScheduler.kt", l = {223}, m = "emit")
public final class C605630NpB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS290S0100000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605630NpB(AgS290S0100000_9 agS290S0100000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS290S0100000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@5940.submit$1$job$1$cancelMonitor$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("TaskScheduler@5940.submit$1$job$1$cancelMonitor$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
