package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;

/* JADX INFO: renamed from: X.0LX0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl", f = "CreationAsyncTaskManagerImpl.kt", l = {128}, m = "restoreTaskFromCrashByTask")
public final class C0LX0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LX0(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C0LX0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.restoreTaskFromCrashByTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLJJLI.LJIIJJI(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.restoreTaskFromCrashByTask$1");
        return objLJIIJJI;
    }
}
