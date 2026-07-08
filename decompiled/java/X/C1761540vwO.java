package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761540vwO extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1761470vwH LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1761430vwD LLILZ;
    public final /* synthetic */ C1761290vvz LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761540vwO(C1761470vwH c1761470vwH, String str, int i, C1761430vwD c1761430vwD, C1761290vvz c1761290vvz) {
        super(1);
        this.LL = c1761470vwH;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = c1761430vwD;
        this.LLILZIL = c1761290vvz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C1761470vwH.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, 2, true, 16);
        GalleryViewerViewModel galleryViewerViewModel = this.LLILZ.LLILLJJLI;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.yQ2(this.LL, false, this.LLILZIL.LIZ);
        }
        return Unit.LIZ;
    }
}
