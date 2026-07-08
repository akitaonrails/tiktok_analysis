package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;

/* JADX INFO: renamed from: X.0LWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl", f = "CreationAsyncTaskManagerImpl.kt", l = {555}, m = "getTasks")
public final class C544310LWj extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544310LWj(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C544310LWj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.getTasks$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILZ.LJJJJLL(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.getTasks$1");
        return objLJJJJLL;
    }
}
