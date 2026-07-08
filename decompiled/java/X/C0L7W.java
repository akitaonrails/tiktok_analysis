package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0L7W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {2445, 2454, 2467}, m = "resizeImage$suspendImpl")
public final class C0L7W extends AbstractC23140094w {
    public C0L7R LL;
    public CreativeInfo LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0L7R LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L7W(C0L7R c0l7r, InterfaceC1364105Vn<? super C0L7W> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0l7r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resizeImage$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJJJI = C0L7R.LJJJI(this.LLIZ, null, null, false, false, false, false, false, false, this);
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resizeImage$1");
        return objLJJJI;
    }
}
