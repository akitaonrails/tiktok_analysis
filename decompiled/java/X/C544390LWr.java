package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;

/* JADX INFO: renamed from: X.0LWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl", f = "CreationAsyncTaskManagerImpl.kt", l = {94}, m = "getTaskIdsForCreationRestore")
public final class C544390LWr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544390LWr(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C544390LWr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.getTaskIdsForCreationRestore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.getTaskIdsForCreationRestore$1");
        return objLIZLLL;
    }
}
