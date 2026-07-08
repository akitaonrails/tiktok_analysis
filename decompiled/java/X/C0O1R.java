package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O1R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1R extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends Unit>, Unit> {
    public C0O1R() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends Unit> c291001Au) {
        C19EG c19egLIZ;
        IFavoriteService iFavoriteService;
        boolean z;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C291001Au<? extends Unit> c291001Au2 = c291001Au;
        Boolean boolIsLSContent = null;
        if (c291001Au2 != null && c291001Au2.LIZ() != null && (c19egLIZ = C724240Sb0.LIZ(videoFavoriteAssem2)) != null && (iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null)) != null) {
            String aid = ((VideoItemParams) C631370Opb.LIZ(videoFavoriteAssem2)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            String str = ((VideoItemParams) C631370Opb.LIZ(videoFavoriteAssem2)).mEventType;
            if (str == null) {
                str = "";
            }
            String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) C631370Opb.LIZ(videoFavoriteAssem2)).getAweme());
            LocalServiceInfo localServiceInfo = ((VideoItemParams) C631370Opb.LIZ(videoFavoriteAssem2)).getAweme().getLocalServiceInfo();
            if (localServiceInfo != null) {
                boolIsLSContent = localServiceInfo.isLSContent();
            }
            Fragment fragmentLJI = C724240Sb0.LJI(videoFavoriteAssem2);
            if (fragmentLJI != null && C1389300mG0.LJI(fragmentLJI)) {
                z = true;
            } else {
                z = false;
            }
            iFavoriteService.LJIILLIIL(c19egLIZ, aid, str, authorUid, boolIsLSContent, z);
        }
        return Unit.LIZ;
    }
}
