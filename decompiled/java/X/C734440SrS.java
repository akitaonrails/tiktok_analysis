package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734440SrS {
    public static final C734440SrS LIZ = new C734440SrS();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(461));
    public static final ConcurrentHashMap<String, C734460SrU> LIZJ = new ConcurrentHashMap<>();
    public static JSONObject LIZLLL;

    public static void LJ(C734460SrU c734460SrU) {
        if (c734460SrU.LIZJ.containsKey("digg_type") && c734460SrU.LIZJ.containsKey("digg_stage") && c734460SrU.LIZJ.containsKey("enter_method")) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, Object> entry : c734460SrU.LIZJ.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) c734460SrU.LIZLLL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report: ");
            sbLIZ.append(jSONObject);
            abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJIJ(c734460SrU.LIZIZ, jSONObject);
        }
        if (!Intrinsics.LJFF(c734460SrU.LIZ("error_code"), 3012)) {
            LIZJ.remove(c734460SrU.LIZ);
        }
    }

    public static void LIZJ(Aweme aweme, C325170Cot c325170Cot) {
        String aid;
        int i;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (aweme != null && aweme.isLike()) {
            i = 1;
        } else {
            i = 0;
        }
        LIZIZ(i ^ 1, aid, c325170Cot);
    }

    public static void LIZ(int i, String str, Throwable th) {
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", diggType: ");
        sbLIZ.append(i);
        sbLIZ.append(", monitorError: ");
        sbLIZ.append(th);
        abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
        LJFF(i, 2, str);
        LIZIZ(i, str, th);
    }

    public static void LIZIZ(int i, String str, Throwable th) {
        if (!C283810BAl.LIZ()) {
            return;
        }
        ConcurrentHashMap<String, C734460SrU> concurrentHashMap = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('|');
        sbLIZ.append(i);
        C734460SrU c734460SrU = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c734460SrU == null) {
            return;
        }
        Pair pairLIZIZ = C325160Cos.LIZIZ(th);
        int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
        Object second = pairLIZIZ.getSecond();
        c734460SrU.LIZIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        if (th instanceof C0XIR) {
            c734460SrU.LIZIZ("status_code", Integer.valueOf(iIntValue));
        } else {
            c734460SrU.LIZIZ("status_code", -1);
        }
        c734460SrU.LIZIZ("error_code", Integer.valueOf(iIntValue));
        c734460SrU.LIZIZ("error_msg", second);
        c734460SrU.LIZIZ("net_status", Integer.valueOf(C325160Cos.LIZ()));
        c734460SrU.LIZIZ("digg_type", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gid", c734460SrU.LIZ("gid"));
            jSONObject.put("aweme_type", c734460SrU.LIZ("aweme_type"));
            jSONObject.put("digg_stage", c734460SrU.LIZ("digg_stage"));
            jSONObject.put("error_code", c734460SrU.LIZ("error_code"));
            jSONObject.put("error_msg", c734460SrU.LIZ("error_msg"));
            jSONObject.put("log_id", c734460SrU.LIZ("log_id"));
            jSONObject.put("net_status", c734460SrU.LIZ("net_status"));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        ((AbstractC1604130rqV) LIZIZ.getValue()).LJ("toErrorInfo: " + jSONObject);
        LIZLLL = jSONObject;
        LJ(c734460SrU);
    }

    public static void LIZLLL(int i, BaseResponse baseResponse, String str) {
        String str2;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (str == null) {
            return;
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", diggType: ");
        sbLIZ.append(i);
        sbLIZ.append(", response: ");
        sbLIZ.append(baseResponse);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJFF(i, 2, str);
        if (baseResponse == null || (serverTimeExtra = baseResponse.extra) == null || (str2 = serverTimeExtra.logid) == null) {
            str2 = "";
        }
        if (C283810BAl.LIZ()) {
            ConcurrentHashMap<String, C734460SrU> concurrentHashMap = LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('|');
            sbLIZ2.append(i);
            C734460SrU c734460SrU = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ2));
            if (c734460SrU != null) {
                c734460SrU.LIZIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
                c734460SrU.LIZIZ("status_code", 0);
                c734460SrU.LIZIZ("error_code", 0);
                c734460SrU.LIZIZ("log_id", str2);
                c734460SrU.LIZIZ("net_status", Integer.valueOf(C325160Cos.LIZ()));
                c734460SrU.LIZIZ("digg_type", Integer.valueOf(i));
                LJ(c734460SrU);
            }
        }
    }

    public static void LJFF(int i, int i2, String str) {
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", diggType: ");
        sbLIZ.append(i);
        sbLIZ.append(", digg_stage: ");
        sbLIZ.append(i2);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        ConcurrentHashMap<String, C734460SrU> concurrentHashMap = LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('|');
        sbLIZ2.append(i);
        C734460SrU c734460SrU = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ2));
        if (c734460SrU == null) {
            return;
        }
        c734460SrU.LIZIZ("digg_stage", Integer.valueOf(i2));
    }

    public static void LJI(Aweme aweme, String str, String str2) {
        String aid;
        int i;
        C734460SrU c734460SrU;
        int awemeType;
        String aid2;
        String str3 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (aweme != null && aweme.isLike()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = 1 ^ i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aid);
        sbLIZ.append('|');
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C734460SrU> concurrentHashMap = LIZJ;
        if (concurrentHashMap.containsKey(strLIZIZ)) {
            c734460SrU = concurrentHashMap.get(strLIZIZ);
            if (c734460SrU == null) {
                return;
            }
        } else {
            c734460SrU = new C734460SrU(strLIZIZ);
            concurrentHashMap.put(strLIZIZ, c734460SrU);
        }
        if (aweme != null && (aid2 = aweme.getAid()) != null) {
            str3 = aid2;
        }
        c734460SrU.LIZIZ("gid", str3);
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = 0;
        }
        c734460SrU.LIZIZ("aweme_type", Integer.valueOf(awemeType));
        c734460SrU.LIZIZ("enter_from", str);
        c734460SrU.LIZIZ("enter_method", str2);
        c734460SrU.LIZIZ("digg_stage", 0);
        c734460SrU.LIZIZ("digg_type", Integer.valueOf(i2));
    }
}
