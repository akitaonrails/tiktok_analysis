package X;

import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.profile.IProfileService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0sGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620340sGe {
    public static final C1620340sGe LIZ = new C1620340sGe();
    public static boolean LIZIZ;

    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "discover_speed_detail", true) == 1;
    }

    public static final void LIZIZ(AbstractC1255880imo<Aweme, ?> abstractC1255880imo, List<? extends Aweme> list) {
        if (!LIZ()) {
            return;
        }
        for (Aweme aweme : list) {
            if (aweme == null || aweme.getAuthor() == null || aweme.getStatistics() == null) {
                return;
            }
        }
        if (abstractC1255880imo instanceof C1401320mZO) {
            abstractC1255880imo.getClass();
            abstractC1255880imo.setItems(new ArrayList(list));
            ((MusicAwemeList) abstractC1255880imo.mData).setCursor(list.size());
        }
        ChallengeDetailServiceImpl.LJFF().LIZ(abstractC1255880imo, list);
        if (abstractC1255880imo != null) {
            ((IProfileService) ServiceManager.get().getService(IProfileService.class)).mobRefreshInProfileAweme(abstractC1255880imo, list);
        }
    }
}
