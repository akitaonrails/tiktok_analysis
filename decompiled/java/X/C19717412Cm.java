package X;

import com.ss.android.ugc.aweme.image.progressbar.ImagesProgressState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19717412Cm extends C09AY implements Function1<ImagesProgressState, ImagesProgressState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19717412Cm(int i, float f) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ImagesProgressState invoke(ImagesProgressState imagesProgressState) {
        ImagesProgressState imagesProgressState2 = imagesProgressState;
        return imagesProgressState2.copy(imagesProgressState2.ui, new Pair<>(Integer.valueOf(this.LL), Float.valueOf(this.LLILLJJLI)), imagesProgressState2.updateCount, imagesProgressState2.pause, imagesProgressState2.stopAutoPlay, imagesProgressState2.liveModeChanged, imagesProgressState2.resume, imagesProgressState2.viewState, imagesProgressState2.animViewState, imagesProgressState2.bottomMargin);
    }
}
