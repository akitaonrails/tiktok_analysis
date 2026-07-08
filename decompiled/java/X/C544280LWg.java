package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;

/* JADX INFO: renamed from: X.0LWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl", f = "CreationAsyncTaskManagerImpl.kt", l = {734, 759}, m = "getSuggestPromptsWithImage")
public final class C544280LWg extends AbstractC23140094w {
    public int LL;
    public long LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544280LWg(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC1364105Vn<? super C544280LWg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = creationAsyncTaskManagerImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.getSuggestPromptsWithImage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(0, null, this);
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.getSuggestPromptsWithImage$1");
        return objLJ;
    }
}
