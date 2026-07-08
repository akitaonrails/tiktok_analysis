package Y;

import X.AbstractC20550515bD;
import X.C0XIR;
import X.C1150504el;
import X.C11NZ;
import X.C13LE;
import X.C1494690ozz;
import X.C1498560p6E;
import X.C1586650rOJ;
import X.C1586730rOR;
import X.C1587740rQ4;
import X.C1587790rQ9;
import X.C1588840rRq;
import X.C1AF0;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23112093u;
import X.C844470XAv;
import X.EnumC1586970rOp;
import X.EnumC586680Mzi;
import X.InterfaceC20550615bE;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.api.MultiRedDotRequest;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedListApi;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedPreload;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public class ACallableS252S0200000_24 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS252S0200000_24 aCallableS252S0200000_24) {
        C1588840rRq c1588840rRq = (C1588840rRq) aCallableS252S0200000_24.l0;
        Message message = (Message) aCallableS252S0200000_24.l1;
        c1588840rRq.getClass();
        C1C7U.LIZ("FollowFeedModel@b274.handleMsg$1L");
        c1588840rRq.handleData((FollowFeedList) HandlerHook.getMessageObj(message.obj));
        C1C7U.LIZIZ("FollowFeedModel@b274.handleMsg$1L");
        return null;
    }

    public static final Object call$1(ACallableS252S0200000_24 aCallableS252S0200000_24) {
        long j;
        Throwable cause;
        int errorCode;
        String strLIZIZ;
        C1494690ozz c1494690ozz;
        C0XIR c0xir;
        C23112093u c23112093u;
        String string;
        String string2;
        C1C7U.LIZ("FriendsFeedPreload@aa5.handleException$1");
        Bundle bundle = ((FriendsFeedPreload) aCallableS252S0200000_24.l1).preloadBundle;
        String str = "";
        if (bundle != null && (string2 = bundle.getString(Scene.SCENE_SERVICE, "")) != null) {
            str = string2;
        }
        Bundle bundle2 = ((FriendsFeedPreload) aCallableS252S0200000_24.l1).preloadBundle;
        long j2 = 0;
        if (bundle2 != null) {
            j = bundle2.getLong("start_time", 0L);
        } else {
            j = 0;
        }
        Bundle bundle3 = ((FriendsFeedPreload) aCallableS252S0200000_24.l1).preloadBundle;
        String str2 = "unknown";
        if (bundle3 != null && (string = bundle3.getString("red_dot_source", "unknown")) != null) {
            str2 = string;
        }
        long j3 = j - C1150504el.LIZ().LJJIII;
        Exception exc = (Exception) aCallableS252S0200000_24.l0;
        if ((exc instanceof ExecutionException) && exc != null) {
            cause = exc.getCause();
        } else {
            cause = null;
        }
        Throwable th = (Exception) aCallableS252S0200000_24.l0;
        while (true) {
            if (th != null) {
                if (th instanceof UnknownHostException) {
                    break;
                }
                th = th.getCause();
            } else {
                th = new Throwable("cause null fallback");
                break;
            }
        }
        boolean z = cause instanceof C0XIR;
        if (z && (c23112093u = (C23112093u) cause) != null) {
            errorCode = c23112093u.getErrorCode();
        } else {
            errorCode = -3;
        }
        if (!z || (c0xir = (C0XIR) cause) == null || (strLIZIZ = c0xir.getErrorMsg()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleException ");
            sbLIZ.append(C13LE.LIZ(((Exception) aCallableS252S0200000_24.l0).getClass()).LJI());
            sbLIZ.append(" cause simpleName: ");
            sbLIZ.append(C13LE.LIZ(th.getClass()).LJI());
            sbLIZ.append(" cause_http_request_status_code: ");
            sbLIZ.append(C1498560p6E.LIZIZ(th, null));
            sbLIZ.append(" cause_sub_status_code: ");
            sbLIZ.append(C1498560p6E.LIZJ(th));
            sbLIZ.append(" cause_api_exception_status_code: ");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        long j4 = FriendsFeedListApi.LIZJ;
        if (j4 > 0) {
            j2 = j - j4;
        }
        C1587790rQ9 c1587790rQ9 = new C1587790rQ9(str, j3, j2, jElapsedRealtime2, false, errorCode, strLIZIZ, 0, str2, 384);
        C1587740rQ4.LIZ.getClass();
        C1587740rQ4.LIZLLL(c1587790rQ9);
        FriendsFeedListApi.LIZJ = j;
        Pair[] pairArr = new Pair[10];
        int cronetInternalErrorCode = 0;
        pairArr[0] = new Pair("statusCode", String.valueOf(errorCode));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" stackTrace: ");
        sbLIZ2.append(Log.getStackTraceString((Exception) aCallableS252S0200000_24.l0));
        pairArr[1] = new Pair("statusMsg", C2188811AlT.LIZIZ(sbLIZ2));
        pairArr[2] = new Pair("duration", String.valueOf(jElapsedRealtime));
        pairArr[3] = new Pair("http_request_status_code", String.valueOf(C1498560p6E.LIZIZ((Exception) aCallableS252S0200000_24.l0, null)));
        pairArr[4] = new Pair("sub_status_code", String.valueOf(C1498560p6E.LIZJ((Exception) aCallableS252S0200000_24.l0)));
        C844470XAv.LIZ.getClass();
        pairArr[5] = new Pair("api_exception_status_code", String.valueOf(C1498560p6E.LIZ(C844470XAv.LIZ(), (Exception) aCallableS252S0200000_24.l0)));
        Exception exc2 = (Exception) aCallableS252S0200000_24.l0;
        if ((exc2 instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) exc2) != null) {
            cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
        }
        pairArr[6] = new Pair("cronet_internal_error_code", String.valueOf(cronetInternalErrorCode));
        pairArr[7] = new Pair("cause_http_request_status_code", String.valueOf(C1498560p6E.LIZIZ(th, null)));
        pairArr[8] = new Pair("cause_sub_status_code", String.valueOf(C1498560p6E.LIZJ(th)));
        pairArr[9] = new Pair("cause_api_exception_status_code", String.valueOf(C1498560p6E.LIZ(C844470XAv.LIZ(), th)));
        C1AF0.LJI(th, "friends_feed_preload_error", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsFeedPreload@aa5.handleException$1");
        return unit;
    }

    public static final Object call$2(ACallableS252S0200000_24 aCallableS252S0200000_24) {
        C1C7U.LIZ("FeedCardInsertExecutor@3d0b.increaseRequestCount$2$1");
        ((AbstractC20550515bD) aCallableS252S0200000_24.l0).LJI((InterfaceC20550615bE) aCallableS252S0200000_24.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedCardInsertExecutor@3d0b.increaseRequestCount$2$1");
        return unit;
    }

    public static final Object call$3(ACallableS252S0200000_24 aCallableS252S0200000_24) {
        int i;
        C1C7U.LIZ("FriendsTabApi@4678.requestRedDot$1");
        MultiRedDotRequest multiRedDotRequestLIZ = C1586650rOJ.LIZ((EnumC1586970rOp) aCallableS252S0200000_24.l0, (EnumC586680Mzi) aCallableS252S0200000_24.l1);
        if (((EnumC1586970rOp) aCallableS252S0200000_24.l0) == EnumC1586970rOp.COLD_START) {
            i = 1;
        } else {
            i = 0;
        }
        C11NZ<NewContentResponse> c11nzRequestRedDotEnhanceQuery = C1586730rOR.LIZIZ.requestRedDotEnhanceQuery(i, Integer.valueOf(C1586650rOJ.LIZIZ()), multiRedDotRequestLIZ);
        C1C7U.LIZIZ("FriendsTabApi@4678.requestRedDot$1");
        return c11nzRequestRedDotEnhanceQuery;
    }

    public ACallableS252S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
