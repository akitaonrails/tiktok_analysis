package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedResponse;
import com.ss.android.ugc.aweme.repostfeed.preload.RepostFeedPreload;
import com.ss.android.ugc.aweme.repostfeed.repo.RepostFeedApi;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603650rpj implements InterfaceC736910SvR<InterfaceC1603680rpm> {
    public boolean LL = true;
    public final C1603550rpZ LLILLJJLI = new InterfaceC1603680rpm() { // from class: X.0rpZ
        @Override // X.InterfaceC1603680rpm
        public final RepostFeedResponse g0(int i, int i2, String str, String str2, List list, List list2, List list3, List list4, String str3) throws ExecutionException, InterruptedException {
            int i3;
            boolean z;
            String requestId;
            if (ComplianceServiceProvider.LJI().LJIIJ(false) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            C1583220rIm.LJ = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C080U("check_preload", "true"));
            ComposePbAndJson<C5418029g, RepostFeedResponse> composePbAndJson = RepostFeedApi.LIZJ.getRepostFeedList(i3, i, 6, i2, str, str2, C08JS.LIZLLL(list), C08JS.LIZLLL(list2), C08JS.LIZLLL(list3), C08JS.LIZLLL(list4), str3, arrayList, null).get();
            if (EnumC1603630rph.REFRESH.getType() == i2 && this.LL.LL) {
                if (composePbAndJson != null) {
                    requestId = composePbAndJson.getRequestId();
                } else {
                    requestId = null;
                }
                RepostFeedPreload.Companion.getClass();
                boolean zLJFF = Intrinsics.LJFF(requestId, RepostFeedPreload.preloadRequestId);
                C1593850rZv.LIZ.getClass();
                z = false;
                C20684815ws.LJIJI("hit_repost_feed_preload", new Pair(Integer.valueOf(zLJFF ? 1 : 0), "is_preload"));
            } else {
                z = false;
            }
            C1583220rIm.LJFF = System.currentTimeMillis();
            C1603650rpj c1603650rpj = this.LL;
            if (c1603650rpj.LL) {
                c1603650rpj.LL = z;
            }
            String str4 = C1605000rru.LIZ;
            RepostFeedResponse repostFeedResponseLIZJ = composePbAndJson.LIZJ(new InterfaceC1487280oo2() { // from class: X.0sGi
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    C5418029g c5418029g = (C5418029g) obj;
                    SystemClock.elapsedRealtime();
                    try {
                        RepostFeedResponse repostFeedResponseCom$ss$ugc$tiktok$proto$tiktok_v2_share_feed_response$$com$ss$android$ugc$aweme$repostfeed$model$RepostFeedResponse = ConvertHelper.com$ss$ugc$tiktok$proto$tiktok_v2_share_feed_response$$com$ss$android$ugc$aweme$repostfeed$model$RepostFeedResponse(c5418029g, null);
                        SystemClock.elapsedRealtime();
                        return repostFeedResponseCom$ss$ugc$tiktok$proto$tiktok_v2_share_feed_response$$com$ss$android$ugc$aweme$repostfeed$model$RepostFeedResponse;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("errMsg", Log.getStackTraceString(th));
                        C794420VEi.LIZIZ("service_monitor", "log_bean_copy_convert_error", c2241008qG.LJ());
                        C1516320pYs c1516320pYs = new C1516320pYs(th);
                        C2276411E8h.LIZIZ.LIZLLL("common_feed", c1516320pYs);
                        C1AF0.LJ(c1516320pYs);
                        C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C1605000rru.LIZ, true).commit();
                        return new RepostFeedResponse();
                    }
                }
            });
            if (repostFeedResponseLIZJ != null) {
                return repostFeedResponseLIZJ;
            }
            throw new RuntimeException("get repost feed error");
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
