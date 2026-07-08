package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;

/* JADX INFO: renamed from: X.0L4O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl", f = "AutoCutAnchorMediaProcessImpl.kt", l = {594}, m = "submitMockPostTask")
public final class C0L4O extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public ICreationAsyncTaskManager LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0L4P LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4O(C0L4P c0l4p, InterfaceC1364105Vn<? super C0L4O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0l4p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.submitMockPostTask$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZLL.LJFF(null, null, null, this);
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.submitMockPostTask$1");
        return objLJFF;
    }
}
