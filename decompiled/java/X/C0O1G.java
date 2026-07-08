package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O1G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1G extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends String>, Unit> {
    public C0O1G() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends String> c291001Au) {
        Fragment fragmentLJI;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ() != null && (fragmentLJI = C724240Sb0.LJI(videoFavoriteAssem2)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIJ((CharSequence) c291001Au2.LIZ);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
