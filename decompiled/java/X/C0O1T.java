package X;

import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O1T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1T extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends String>, Unit> {
    public C0O1T() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends String> c291001Au) {
        C19EG c19egLIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        Boolean boolIsLSContent = null;
        if (c291001Au2 != null && c291001Au2.LIZ() != null && (c19egLIZ = C724240Sb0.LIZ(videoFavoriteAssem2)) != null) {
            AbstractC1604130rqV abstractC1604130rqVGp = videoFavoriteAssem2.Gp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoFavoriteAssem showCollectionManageToast aid: ");
            C724270Sb3 c724270Sb3 = videoFavoriteAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            sbLIZ.append(((VideoItemParams) obj).getAweme().getAid());
            sbLIZ.append(" eventType: ");
            C724270Sb3 c724270Sb32 = videoFavoriteAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            sbLIZ.append(((VideoItemParams) obj2).mEventType);
            abstractC1604130rqVGp.LJ(C2188811AlT.LIZIZ(sbLIZ));
            IFavoriteService iFavoriteService = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
            C724270Sb3 c724270Sb33 = videoFavoriteAssem2.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            String aid = ((VideoItemParams) obj3).getAweme().getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            C724270Sb3 c724270Sb34 = videoFavoriteAssem2.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            } else {
                obj4 = null;
            }
            String str2 = ((VideoItemParams) obj4).mEventType;
            if (str2 != null) {
                str = str2;
            }
            C724270Sb3 c724270Sb35 = videoFavoriteAssem2.LLJI;
            if (c724270Sb35 != null) {
                obj5 = c724270Sb35.LL;
            } else {
                obj5 = null;
            }
            LocalServiceInfo localServiceInfo = ((VideoItemParams) obj5).getAweme().getLocalServiceInfo();
            if (localServiceInfo != null) {
                boolIsLSContent = localServiceInfo.isLSContent();
            }
            iFavoriteService.LJJJJI(c19egLIZ, aid, str, boolIsLSContent);
        }
        return Unit.LIZ;
    }
}
