package X;

import Y.ARunnableS14S1200000_9;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ogv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625990Ogv extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends C0R9E>, Unit> {
    public C625990Ogv() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends C0R9E> c291001Au) {
        C0P0T c0p0t;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        if (c291001Au != null) {
            videoFavoriteAssem2.LLLFZ = false;
            videoFavoriteAssem2.LLLI = true;
            ARunnableS14S1200000_9 aRunnableS14S1200000_9 = videoFavoriteAssem2.LLLII;
            if (aRunnableS14S1200000_9 != null) {
                aRunnableS14S1200000_9.run();
            }
            WeakReference<C0P0T> weakReference = videoFavoriteAssem2.LLLIIL;
            if (weakReference != null && (c0p0t = weakReference.get()) != null) {
                c0p0t.LJIIL(new C731670Smz());
            }
            ARunnableS14S1200000_9 aRunnableS14S1200000_92 = videoFavoriteAssem2.LLLII;
            if (aRunnableS14S1200000_92 != null) {
                videoFavoriteAssem2.Fp().removeCallbacks(aRunnableS14S1200000_92);
            }
        }
        return Unit.LIZ;
    }
}
