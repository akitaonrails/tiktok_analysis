package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0SmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731410SmZ extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends Boolean>, Unit> {
    public C731410SmZ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 == null) {
            videoFavoriteAssem2.getClass();
        } else {
            AbstractC1604130rqV abstractC1604130rqVGp = videoFavoriteAssem2.Gp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoFavoriteAssem handleClickEvent: ");
            sbLIZ.append(((Boolean) c291001Au2.LIZ).booleanValue());
            abstractC1604130rqVGp.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (((Boolean) c291001Au2.LIZ).booleanValue()) {
                if (C0CBR.LIZLLL) {
                    C730950Slp.LIZ(videoFavoriteAssem2.getContentView().findViewById(R.id.hpp));
                } else {
                    C731860SnI c731860SnI = (C731860SnI) videoFavoriteAssem2.getContentView().findViewById(R.id.hpp);
                    c731860SnI.setAnimation("tt_feed_favorite_old_tux_lottie.json");
                    if (c731860SnI.isSelected()) {
                        c731860SnI.LJI();
                    } else {
                        c731860SnI.LJII();
                    }
                }
            }
            VideoFavoriteVM videoFavoriteVMBp = videoFavoriteAssem2.Bp();
            videoFavoriteVMBp.getClass();
            videoFavoriteVMBp.setState(AFwS240S0000000_9.get$arr$(1001));
        }
        return Unit.LIZ;
    }
}
