package Y;

import X.C09JN;
import X.C0XIR;
import X.C1440005kM;
import X.C1577320r9G;
import X.C1595010rbn;
import X.C1597740rgC;
import X.C15UV;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23112093u;
import X.C2344809Gs;
import X.EnumC1577400r9O;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightRefreshOptSetting;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;

/* JADX INFO: loaded from: classes25.dex */
public class AfS7S0000100_24 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS7S0000100_24(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS7S0000100_24 afS7S0000100_24, Object obj) {
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryRelatedExploreAwemeList$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("explore related success, rid ");
        sbLIZ.append(((ExploreRelatedAwemeList) obj).getRequestId());
        C2344809Gs.LIZLLL(4, "exploreFeed", C2188811AlT.LIZIZ(sbLIZ));
        C15UV c15uv = C15UV.LIZ;
        long j = afS7S0000100_24.j0;
        c15uv.getClass();
        C15UV.LJFF(j, "", true);
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryRelatedExploreAwemeList$3");
    }

    public static final void accept$1(AfS7S0000100_24 afS7S0000100_24, Object obj) {
        String strValueOf;
        String message;
        C1C7U.LIZ("DramaNUJDataLoader@be57.doCheckConfig$2");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS7S0000100_24.j0;
        boolean z = th instanceof C0XIR;
        if (z) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
        } else {
            strValueOf = "-1";
        }
        if (z) {
            message = ((C0XIR) th).getErrorMsg();
        } else {
            message = th.getMessage();
        }
        C1577320r9G.LIZIZ(C1577320r9G.LIZ, EnumC1577400r9O.TAB_CONFIG_RESPONSE, null, null, null, null, null, Long.valueOf(jCurrentTimeMillis), strValueOf, message, null, null, null, null, null, null, null, null, null, 523390);
        C1C7U.LIZIZ("DramaNUJDataLoader@be57.doCheckConfig$2");
    }

    public static final void accept$2(AfS7S0000100_24 afS7S0000100_24, Object obj) {
        C1C7U.LIZ("FollowFeedLoadUtil@6877.startAutoRefreshTimer$1");
        if (System.currentTimeMillis() - C1597740rgC.LJ >= afS7S0000100_24.j0 && C1597740rgC.LJFF && C1597740rgC.LIZJ == 0) {
            float fNextFloat = C1597740rgC.LJIILJJIL.nextFloat();
            float f = LiveSkylightRefreshOptSetting.INSTANCE.config().followRefreshSamplingRate;
            double d = f;
            if (0.0d > d || d > 1.0d) {
                f = 0.0f;
            }
            if (fNextFloat <= f) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("FollowFeedLoadUtil", "startAutoRefreshTimer: refresh event");
                C1440005kM.LIZ(new C1595010rbn(false, true, true, null, 8));
            }
        }
        C1C7U.LIZIZ("FollowFeedLoadUtil@6877.startAutoRefreshTimer$1");
    }
}
