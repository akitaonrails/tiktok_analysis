package X;

import com.ss.android.ugc.aweme.cache.FollowingCacheConfigModel;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import com.ss.android.ugc.aweme.cache.FollowingFeedCacheService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingFeedAssem$listener$2$1$onStateChange$1", f = "FollowingFeedAssem.kt", l = {60}, m = "invokeSuspend")
public final class C1588790rRl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowingFeedAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588790rRl(FollowingFeedAssem followingFeedAssem, InterfaceC1364105Vn<? super C1588790rRl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followingFeedAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1588790rRl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AwemeStatistics statistics;
        AwemeStatus statusSafety;
        String aid;
        String authorUid;
        C1C7U.LIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((FollowingCacheConfigModel) C1588820rRo.LIZIZ.getValue()).feedReadyDelay * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$1");
                return objLJFF;
            }
        }
        FollowingFeedAssem followingFeedAssem = this.LLILLJJLI;
        followingFeedAssem.getClass();
        if (C1588800rRm.LIZ.get()) {
            C1588800rRm.LIZIZ = "has_enter_tab";
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("FollowingFeedAssem", "already enter following tab, no need to check");
        } else {
            FollowingFeedCacheService.FollowingCache followingCacheLIZ = FollowingFeedCacheService.LIZ();
            if (followingCacheLIZ == null) {
                followingFeedAssem.LLILLJJLI.invoke("no_cache_following_feed");
            } else {
                if (System.currentTimeMillis() - followingCacheLIZ.updateTime > ((FollowingCacheConfigModel) C1588820rRo.LIZIZ.getValue()).expiredTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    FollowingFeedCacheService.LIZIZ = null;
                    followingFeedAssem.LLILLJJLI.invoke("expired");
                } else {
                    List<FollowFeed> items = followingCacheLIZ.data.getItems();
                    if (items != null && !items.isEmpty()) {
                        List<FollowFeed> items2 = followingCacheLIZ.data.getItems();
                        ArrayList<FollowFeed> arrayList = new ArrayList();
                        for (FollowFeed followFeed : items2) {
                            FollowFeed followFeed2 = followFeed;
                            if (followFeed2 != null && followFeed2.getAweme() != null && followFeed2.getAweme().getAwemeType() != 101 && !followFeed2.getAweme().isAd()) {
                                arrayList.add(followFeed);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            FollowingFeedCacheService.LIZIZ = null;
                            followingFeedAssem.LLILLJJLI.invoke("no_cache_feed_items_filter");
                        } else {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            for (FollowFeed followFeed3 : arrayList) {
                                Aweme aweme = followFeed3.getAweme();
                                if (aweme != null) {
                                    statistics = aweme.getStatistics();
                                } else {
                                    statistics = null;
                                }
                                Aweme aweme2 = followFeed3.getAweme();
                                if (aweme2 != null) {
                                    statusSafety = AwemeExtKt.getStatusSafety(aweme2);
                                } else {
                                    statusSafety = null;
                                }
                                FollowFeedApiV2.FollowingFeedCheckModelItemInfo followingFeedCheckModelItemInfo = new FollowFeedApiV2.FollowingFeedCheckModelItemInfo(statistics, statusSafety);
                                Aweme aweme3 = followFeed3.getAweme();
                                if (aweme3 != null) {
                                    aid = aweme3.getAid();
                                } else {
                                    aid = null;
                                }
                                Aweme aweme4 = followFeed3.getAweme();
                                if (aweme4 != null) {
                                    authorUid = AwemeExtKt.getAuthorUid(aweme4);
                                } else {
                                    authorUid = null;
                                }
                                FollowFeedApiV2.FollowingFeedCheckModel followingFeedCheckModel = new FollowFeedApiV2.FollowingFeedCheckModel(aid, authorUid);
                                C1227904rF.LIZ.getClass();
                                followingFeedCheckModel.setItemInfo(C1227904rF.LJI(followingFeedCheckModelItemInfo));
                                followingFeedCheckModel.setScore(Double.valueOf(followFeed3.getScore()));
                                arrayList2.add(followingFeedCheckModel);
                            }
                            int i3 = C2187451AjH.LIZ;
                            C23250099c.LIZLLL((InterfaceC497601wk) C805300ViS.LIZIZ.getValue(), null, null, new C607660NsS(arrayList2, true, new C1588780rRk(followingFeedAssem, arrayList, followingCacheLIZ), null), 3);
                        }
                    } else {
                        FollowingFeedCacheService.LIZIZ = null;
                        followingFeedAssem.LLILLJJLI.invoke("no_cache_feed_items");
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedAssem@e42c.listener$2$1$onStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
