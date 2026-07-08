package X;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.feed.preloadfeed.FeedLiveTopLivePrefetchModel;
import com.bytedance.android.livesdk.feed.preloadfeed.FeedLiveTopLivePrefetchStrategy;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0IUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467450IUt implements C0IV0 {
    public static final C01GW<C467450IUt> LJIIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS193S0000000_7.get$arr$(406));
    public static String LJIILIIL;
    public FeedLiveTopLivePrefetchModel LIZ;
    public C0ITP LIZIZ;
    public long LIZLLL;
    public boolean LJ;
    public long LJI;
    public C11JF LJII;
    public boolean LJIIJ;
    public int LIZJ = -1;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(407));
    public int LJIIIIZZ = 2;
    public final C467490IUx LJIIIZ = new C0IUF() { // from class: X.0IUx
        @Override // X.C0IUF
        public final C0IV2 LIZ() {
            return C0IV2.TOPLIVE_PRELOAD;
        }
    };
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 833));

    public final void LJ() {
        List<FeedLiveTopLivePrefetchStrategy> list;
        this.LJIIJ = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel = this.LIZ;
        if (feedLiveTopLivePrefetchModel != null && (list = feedLiveTopLivePrefetchModel.phasesStrategy) != null) {
            Iterator<FeedLiveTopLivePrefetchStrategy> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FeedLiveTopLivePrefetchStrategy next = it2.next();
                if (jUptimeMillis - this.LJI <= next.totalDuration) {
                    long j = next.refreshInterval;
                    if (j > 0) {
                        C786410Ut5.LJLIIL(j, (Handler) this.LJFF.getValue(), (Runnable) this.LJIIJJI.getValue());
                        return;
                    }
                }
            }
        }
        LJ();
    }

    public final C0ITP LIZ() {
        FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel;
        List<FeedLiveTopLivePrefetchStrategy> list;
        List<FeedItem> list2;
        C0ITP c0itp = this.LIZIZ;
        if (((c0itp == null || (list2 = c0itp.LIZ) == null) ? 0 : list2.size()) > 0 && ((feedLiveTopLivePrefetchModel = this.LIZ) == null || !feedLiveTopLivePrefetchModel.onlyForSkylight)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = jUptimeMillis - this.LIZLLL;
            FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel2 = this.LIZ;
            if (feedLiveTopLivePrefetchModel2 != null && (list = feedLiveTopLivePrefetchModel2.phasesStrategy) != null) {
                for (FeedLiveTopLivePrefetchStrategy feedLiveTopLivePrefetchStrategy : list) {
                    if (jUptimeMillis - this.LJI <= feedLiveTopLivePrefetchStrategy.totalDuration) {
                        if (j > feedLiveTopLivePrefetchStrategy.expireInterval) {
                            return null;
                        }
                        return this.LIZIZ;
                    }
                }
            }
        }
        return null;
    }

    public final void LIZIZ() {
        if (this.LJIIIIZZ == 5 || this.LJ || !this.LJIIJ) {
            return;
        }
        this.LJ = true;
        C467490IUx c467490IUx = this.LJIIIZ;
        c467490IUx.getClass();
        c467490IUx.LIZ = C0IUH.PAUSE;
        ((Handler) this.LJFF.getValue()).removeCallbacks((Runnable) this.LJIIJJI.getValue());
        this.LJIIJ = false;
    }

    public final void LIZJ() {
        String str;
        Map<String, Object> mapUx;
        if (this.LJIIIZ.LIZIZ) {
            return;
        }
        LIZJ(true);
        if (LJIILIIL == null) {
            ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
            Object obj = (iLiveFeedApiService == null || (mapUx = iLiveFeedApiService.ux(-1L)) == null) ? null : mapUx.get("feed_url");
            String str2 = obj instanceof String ? (String) obj : null;
            if (C2093608Ic.LJ(str2)) {
                LIZJ(false);
                return;
            }
            LJIILIIL = C0IUV.LIZ(str2);
        }
        HashMap map = new HashMap();
        if (C469460Ib2.LIZJ()) {
            map.put("is_non_personalized", "1");
        }
        String str3 = LJIILIIL;
        FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel = this.LIZ;
        if (feedLiveTopLivePrefetchModel == null || (str = feedLiveTopLivePrefetchModel.reqFrom) == null) {
            str = "enter_auto_foru_feed_draw_refresh";
        }
        this.LJII = C467110ITl.LIZIZ(str3, str, new InterfaceC466760ISc() { // from class: X.0IUv
            @Override // X.InterfaceC466760ISc
            public final void LIZ(Throwable th) {
                C11JF c11jf;
                LIZJ(false);
                C20441214yg.LJI("NewFeedStyleEntranceUtils_prefetch", th);
                C467450IUt c467450IUt = this.LIZ;
                C11JF c11jf2 = c467450IUt.LJII;
                if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = c467450IUt.LJII) != null) {
                    c11jf.dispose();
                }
                c467450IUt.LJII = null;
            }

            @Override // X.InterfaceC466760ISc
            public final void LIZIZ(C0ITP c0itp) {
                C11JF c11jf;
                FeedExtra feedExtra;
                this.LIZ.LIZLLL = SystemClock.uptimeMillis();
                LIZJ(false);
                LIZIZ(c0itp);
                if (c0itp != null && (feedExtra = c0itp.LIZIZ) != null) {
                    feedExtra.hasMore = true;
                }
                C467450IUt c467450IUt = this.LIZ;
                c467450IUt.LIZIZ = c0itp;
                if (c0itp == null) {
                    c467450IUt.LJIIIIZZ = 4;
                }
                C11JF c11jf2 = c467450IUt.LJII;
                if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = c467450IUt.LJII) != null) {
                    c11jf.dispose();
                }
                c467450IUt.LJII = null;
            }
        }, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_prefetch_request");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LIZJ), "live_label");
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL() {
        FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel;
        if (this.LJIIJ || this.LJIIIIZZ == 5 || !this.LJ || (feedLiveTopLivePrefetchModel = this.LIZ) == null || !feedLiveTopLivePrefetchModel.enabled) {
            return;
        }
        this.LJ = false;
        C467490IUx c467490IUx = this.LJIIIZ;
        c467490IUx.getClass();
        c467490IUx.LIZ = C0IUH.RUNNING;
        LJ();
    }
}
