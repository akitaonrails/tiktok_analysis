package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewFragment;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;

/* JADX INFO: renamed from: X.0DS4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewFragment", f = "TakoMultiImagePreviewFragment.kt", l = {230, 240, 250, 256, 279}, m = "saveImage")
public final class C0DS4 extends AbstractC23140094w {
    public TakoContentPreviewItem.Image LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ TakoMultiImagePreviewFragment LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DS4(TakoMultiImagePreviewFragment takoMultiImagePreviewFragment, InterfaceC1364105Vn<? super C0DS4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = takoMultiImagePreviewFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMultiImagePreviewFragment@d819.saveImage$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objQf = this.LLIZ.qf(null, this);
        C1C7U.LIZIZ("TakoMultiImagePreviewFragment@d819.saveImage$1");
        return objQf;
    }
}
