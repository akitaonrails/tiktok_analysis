package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestConfigProvider;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.09ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2448409ic implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ FollowingSuggestConfigProvider LL;
    public final /* synthetic */ WeakReference<C704830Rkn> LLILLJJLI;

    public C2448409ic(FollowingSuggestConfigProvider followingSuggestConfigProvider, WeakReference<C704830Rkn> weakReference) {
        this.LL = followingSuggestConfigProvider;
        this.LLILLJJLI = weakReference;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 != null) {
            FollowingSuggestConfigProvider followingSuggestConfigProvider = this.LL;
            WeakReference<C704830Rkn> weakReference = this.LLILLJJLI;
            followingSuggestConfigProvider.getClass();
            Aweme aweme = videoItemParams2.getAweme();
            BaseFeedPageParams baseFeedPageParams = videoItemParams2.baseFeedPageParams;
            if (baseFeedPageParams == null || (str = baseFeedPageParams.eventType) == null) {
                str = "homepage_hot";
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2130108Wd(aweme, str, null), 3);
            FollowingSuggestConfigProvider.LIZ(videoItemParams2, weakReference);
        }
        return C1387305br.LIZIZ;
    }
}
