package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import com.ss.android.ugc.aweme.cache.FollowingFeedCacheService;
import com.ss.android.ugc.aweme.cache.FollowingPreloadConfigModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588740rRg extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ FollowingFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588740rRg(FollowingFeedAssem followingFeedAssem) {
        super(1);
        this.LL = followingFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Aweme aweme;
        String str2 = str;
        C1588800rRm.LIZIZ = str2;
        FollowingFeedAssem followingFeedAssem = this.LL;
        followingFeedAssem.getClass();
        C01GW c01gw = C805310ViT.LIZIZ;
        if (!((FollowingPreloadConfigModel) c01gw.getValue()).enable) {
            C1588800rRm.LIZIZ(str2, "not_hit_exp", false, false);
        } else if (((FollowingPreloadConfigModel) c01gw.getValue()).userScopeType == 1 && (C1392380mKy.LIZ("1") || (!C1392380mKy.LIZ("3") && !C1392380mKy.LIZ("2") && !C1392380mKy.LIZ("1")))) {
            C1588800rRm.LIZIZ(str2, "not_in_user_scope", false, false);
        } else if (((FollowingPreloadConfigModel) c01gw.getValue()).userScopeType == 2 && !C1392380mKy.LIZ("3") && !C1392380mKy.LIZ("2") && !C1392380mKy.LIZ("1")) {
            C1588800rRm.LIZIZ(str2, "not_in_user_scope", false, false);
        } else if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            C1588800rRm.LIZIZ(str2, "", false, true);
            int i = C2187451AjH.LIZ;
            C1588750rRh c1588750rRh = C1588750rRh.LIZ;
            EnumC1588720rRe enumC1588720rRe = EnumC1588720rRe.COLD_LAUNCH;
            EnumC1588650rRX enumC1588650rRX = EnumC1588650rRX.NONE;
            c1588750rRh.getClass();
            FollowFeedList followFeedListLIZ = C1588750rRh.LIZ(enumC1588720rRe, enumC1588650rRX);
            if (followFeedListLIZ != null) {
                FollowingFeedCacheService.LIZIZ = new FollowingFeedCacheService.FollowingCache(followFeedListLIZ, System.currentTimeMillis());
                C0PLT c0plt = (C0PLT) C13LP.LJJJLL(followFeedListLIZ.getItems());
                if (c0plt != null && (aweme = c0plt.getAweme()) != null) {
                    C1483340ohg.LJIL(0, aweme);
                    C20673215v0.LJI(R.layout.c7v, C724240Sb0.LIZ(followingFeedAssem));
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(followingFeedAssem), C0PEM.LIZJ, null, new C607640NsQ(followFeedListLIZ, null), 2);
            }
        } else {
            C1588800rRm.LIZIZ(str2, "not_login or children mode", false, false);
        }
        return Unit.LIZ;
    }
}
