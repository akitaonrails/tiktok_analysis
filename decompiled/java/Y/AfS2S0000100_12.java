package Y;

import X.C09JN;
import X.C0UBZ;
import X.C11PQ;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2686012e;
import X.C751900TeW;
import X.C768190UBl;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.live.effect.music.entity.AccompanimentsResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class AfS2S0000100_12 implements C09JN {
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
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public AfS2S0000100_12(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                this.j0 = j;
                break;
            default:
                this.j0 = j;
                break;
        }
    }

    public static final void accept$0(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        long j = afS2S0000100_12.j0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleGameCaptchaTimeout callback done, captchaId=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void accept$1(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        long j = afS2S0000100_12.j0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleGameCaptchaTimeout callback failed, captchaId=");
        sbLIZ.append(j);
        C20441214yg.LJFF("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
    }

    public static final void accept$2(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        long j = afS2S0000100_12.j0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onShowSuccessfully callback done, captchaId=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void accept$3(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        long j = afS2S0000100_12.j0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popCaptchaDialog onShowSuccessfully callback failed, captchaId=");
        sbLIZ.append(j);
        C20441214yg.LJFF("BroadcastMessagePresenter", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        C1C7U.LIZ("AccompanimentManager@5ec3.requestAccompanimentListByAlbumId$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLongValue = 0;
        if (((AccompanimentsResponse) baseResponse.data).hasMore) {
            C0UBZ c0ubz = C0UBZ.LL;
            ConcurrentHashMap concurrentHashMapLJI = C0UBZ.LJI();
            Long lValueOf = Long.valueOf(afS2S0000100_12.j0);
            Long l = (Long) C0UBZ.LJI().get(Long.valueOf(afS2S0000100_12.j0));
            if (l != null) {
                jLongValue = l.longValue();
            }
            concurrentHashMapLJI.put(lValueOf, Long.valueOf(jLongValue + ((long) ((AccompanimentsResponse) baseResponse.data).accompaniments.size())));
        } else {
            C0UBZ c0ubz2 = C0UBZ.LL;
            C0UBZ.LJI().put(Long.valueOf(afS2S0000100_12.j0), 0L);
        }
        List<Accompaniment> list = ((AccompanimentsResponse) baseResponse.data).accompaniments;
        ArrayList arrayList = new ArrayList();
        for (Accompaniment accompaniment : list) {
            if (accompaniment.url.length() > 0) {
                arrayList.add(accompaniment);
            }
        }
        long j = afS2S0000100_12.j0;
        C0UBZ c0ubz3 = C0UBZ.LL;
        if (C0UBZ.LLJJIII == j && arrayList.isEmpty()) {
            C0UBZ.LJIILIIL(j);
        } else {
            C2686012e.LIZ(C0UBZ.LLJILLL, Long.valueOf(j), arrayList);
            CopyOnWriteArrayList<C768190UBl> copyOnWriteArrayList = C0UBZ.LLJJI.get(Long.valueOf(afS2S0000100_12.j0));
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                C0UBZ.LIZ(Long.valueOf(afS2S0000100_12.j0));
            }
        }
        C1C7U.LIZIZ("AccompanimentManager@5ec3.requestAccompanimentListByAlbumId$1");
    }

    public static final void accept$5(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        C1C7U.LIZ("MultiGuestFollowStatusObserverV2@8748.queryFollowStatus$disposable$1");
        C20441214yg.LJIIIZ("MultiGuestFollowStatusObserverV2", "queryUserWithId success.");
        FollowInfo followInfo = ((User) obj).getFollowInfo();
        if (followInfo != null) {
            long followStatus = followInfo.getFollowStatus();
            C11PQ<Long> c11pq = C751900TeW.LJFF.get(Long.valueOf(afS2S0000100_12.j0));
            if (c11pq != null) {
                c11pq.onNext(Long.valueOf(followStatus));
            }
        }
        C1C7U.LIZIZ("MultiGuestFollowStatusObserverV2@8748.queryFollowStatus$disposable$1");
    }

    public static final void accept$6(AfS2S0000100_12 afS2S0000100_12, Object obj) {
        C1C7U.LIZ("MultiCoHostTimeOutManager@6eb6.startCountDown$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountDown, uid = ");
        sbLIZ.append(afS2S0000100_12.j0);
        sbLIZ.append(", throwable = ");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("MultiCoHostTimeOut", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiCoHostTimeOutManager@6eb6.startCountDown$3");
    }
}
