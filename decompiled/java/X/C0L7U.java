package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0L7U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler", f = "CutOptimizedVideoChosenHandler.kt", l = {2846, 3869}, m = "downloadStickPointRes")
public final class C0L7U extends AbstractC23140094w {
    public Object LL;
    public VideoPublishEditModel LLILLJJLI;
    public ShortVideoContext LLILLL;
    public AVMusic LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0L7R LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L7U(C0L7R c0l7r, InterfaceC1364105Vn<? super C0L7U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0l7r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.downloadStickPointRes$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZLL.LJIIL(null, null, null, false, null, this);
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.downloadStickPointRes$1");
        return objLJIIL;
    }
}
