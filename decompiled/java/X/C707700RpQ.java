package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.commercialize.promote.ui.PostBottomButtonConfigProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707700RpQ implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ PostBottomButtonConfigProvider LL;

    public C707700RpQ(PostBottomButtonConfigProvider postBottomButtonConfigProvider) {
        this.LL = postBottomButtonConfigProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        String uid;
        String str;
        C1911640zqU c1911640zqULIZ;
        User currentUser;
        VideoItemParams videoItemParams2 = videoItemParams;
        PostBottomButtonConfigProvider postBottomButtonConfigProvider = this.LL;
        postBottomButtonConfigProvider.getClass();
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            String str2 = videoItemParams2.mEventType;
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
                uid = currentUser.getUid();
            } else {
                uid = null;
            }
            if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
                str = "myself";
            } else {
                str = "others";
            }
            C0SCM c0scm = postBottomButtonConfigProvider.LL;
            if (c0scm != null) {
                c0scm.open();
            }
            IPromoteReplaceMusicService iPromoteReplaceMusicService = (IPromoteReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IPromoteReplaceMusicService.class, false, false, false, 14, null);
            if (iPromoteReplaceMusicService != null && (c1911640zqULIZ = iPromoteReplaceMusicService.LIZ()) != null) {
                c1911640zqULIZ.LIZ(aweme.getAid());
            }
            C666390QBx.LIZ = aweme;
            ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
            if (iCommercePromoteLogger != null) {
                iCommercePromoteLogger.LJIIIZ(aweme, "video", str, "bottom_button", str2, null, null);
            }
        }
        return new C1387205bq(null);
    }
}
