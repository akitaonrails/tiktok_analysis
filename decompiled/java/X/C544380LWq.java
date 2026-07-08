package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;

/* JADX INFO: renamed from: X.0LWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl", f = "CreationAsyncTaskManagerImpl.kt", l = {563}, m = "getTask")
public final class C544380LWq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544380LWq(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C544380LWq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.getTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIL = this.LLILLJJLI.LJIL(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.getTask$1");
        return objLJIL;
    }
}
