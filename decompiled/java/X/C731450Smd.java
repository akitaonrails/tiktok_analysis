package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Smd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731450Smd extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends VideoItemParams>, Unit> {
    public C731450Smd() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends VideoItemParams> c291001Au) {
        videoFavoriteAssem.Ip(c291001Au);
        return Unit.LIZ;
    }
}
