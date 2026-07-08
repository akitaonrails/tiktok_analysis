package Y;

import X.C09JN;
import X.C0T80;
import X.C1161920gLG;
import X.C1494690ozz;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C386801es;
import X.C470590Icr;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C741810T7z;
import X.C783820Uou;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.ss.android.ugc.aweme.experiment.LivePodcastApiPreRequestExperiment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AfS1S1000100_12 implements C09JN {
    public final int $t;
    public long j1;
    public String s0;

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
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public AfS1S1000100_12(long j, int i) {
        this.$t = i;
        this.s0 = "force_refresh";
        this.j1 = j;
    }

    public static final void accept$0(AfS1S1000100_12 afS1S1000100_12, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("CoHostUserInfoQueryHelper@ddcd.queryUserWithId$1");
        User user = (User) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS1S1000100_12.s0);
        sbLIZ.append(" queryUserWithId ");
        sbLIZ.append(afS1S1000100_12.j1);
        sbLIZ.append(" success, displayId = ");
        sbLIZ.append(user.getDisplayId());
        sbLIZ.append(", nickName = ");
        sbLIZ.append(user.getNickName());
        sbLIZ.append(", callBackSize:");
        LinkedHashMap linkedHashMap = (LinkedHashMap) C741810T7z.LIZ;
        Set set = (Set) linkedHashMap.get(Long.valueOf(user.getId()));
        if (set != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("CoHostUserInfoQueryHelper", C2188811AlT.LIZIZ(sbLIZ));
        Set set2 = (Set) linkedHashMap.get(Long.valueOf(user.getId()));
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((C0T80) it2.next()).LIZ(user);
            }
        }
        C741810T7z.LIZ.remove(Long.valueOf(user.getId()));
        C1C7U.LIZIZ("CoHostUserInfoQueryHelper@ddcd.queryUserWithId$1");
    }

    public static final void accept$1(AfS1S1000100_12 afS1S1000100_12, Object obj) {
        C1C7U.LIZ("CoHostUserInfoQueryHelper@ddcd.queryUserWithId$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS1S1000100_12.s0);
        sbLIZ.append(" queryUserWithId ");
        sbLIZ.append(afS1S1000100_12.j1);
        sbLIZ.append(" failed");
        C20441214yg.LJ("CoHostUserInfoQueryHelper", C2188811AlT.LIZIZ(sbLIZ));
        Set set = (Set) ((LinkedHashMap) C741810T7z.LIZ).get(Long.valueOf(afS1S1000100_12.j1));
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((C0T80) it2.next()).onFailed();
            }
        }
        C741810T7z.LIZ.remove(Long.valueOf(afS1S1000100_12.j1));
        C1C7U.LIZIZ("CoHostUserInfoQueryHelper@ddcd.queryUserWithId$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS1S1000100_12 afS1S1000100_12, Object obj) {
        LivePodcastResponse.ResponseData responseData;
        C1C7U.LIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C783820Uou.LIZ.getClass();
        C783820Uou.LJIIJ(c470590Icr);
        C20441214yg.LIZIZ("LivePodcastDataManager", "getApiData success");
        if (c470590Icr != null && (responseData = (LivePodcastResponse.ResponseData) c470590Icr.data) != null) {
            String str = afS1S1000100_12.s0;
            long j = afS1S1000100_12.j1;
            C783820Uou.LJI(str, 1, C500260Jjc.LJJJI(Boolean.valueOf(responseData.canBeLivePodcast)) ? 1 : 0, SystemClock.elapsedRealtime() - j, null);
        } else {
            C783820Uou.LJI(afS1S1000100_12.s0, 0, 0, SystemClock.elapsedRealtime() - afS1S1000100_12.j1, 1001);
        }
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$1");
    }

    public static final void accept$3(AfS1S1000100_12 afS1S1000100_12, Object obj) {
        String message;
        int iIntValue;
        C1C7U.LIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$3");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getApiData error,source: ");
        sbLIZ.append(afS1S1000100_12.s0);
        sbLIZ.append(", ");
        Throwable cause = th.getCause();
        if (cause != null) {
            message = cause.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("LivePodcastDataManager", C2188811AlT.LIZIZ(sbLIZ));
        C783820Uou c783820Uou = C783820Uou.LIZ;
        String str = afS1S1000100_12.s0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - afS1S1000100_12.j1;
        c783820Uou.getClass();
        Integer numLJFF = C783820Uou.LJFF(th);
        if (numLJFF != null) {
            iIntValue = numLJFF.intValue();
        } else {
            iIntValue = C386801es.DEFAULT;
        }
        C783820Uou.LJI(str, 0, 0, jElapsedRealtime, Integer.valueOf(iIntValue));
        if (LivePodcastApiPreRequestExperiment.isV2() && !(th instanceof C501470JlZ) && !(th instanceof C1494690ozz)) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(c783820Uou);
        }
        C1C7U.LIZIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$3");
    }

    public AfS1S1000100_12(String str, long j, int i) {
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
