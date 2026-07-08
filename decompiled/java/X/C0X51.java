package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X51, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X51 {
    public static final C0X51 LIZ = new C0X51();

    public static void LIZ(String str, String str2, String str3, int i, long j, String str4, String str5, int i2) {
        Object c098200Yq;
        String str6;
        try {
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("operation", str);
            pairArr[1] = new Pair("result", str2);
            if (Intrinsics.LJFF(str2, "success")) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[2] = new Pair("success", str6);
            pairArr[3] = new Pair("duration", String.valueOf(j));
            pairArr[4] = new Pair("caller_type", str3);
            pairArr[5] = new Pair("check_type", str4);
            pairArr[6] = new Pair("signature_hit", String.valueOf(i));
            pairArr[7] = new Pair("has_data", String.valueOf(i2));
            HashMap mapLJI = C2097608Jq.LJI(pairArr);
            if (str5 != null) {
                mapLJI.put("exception_name", str5);
            }
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("drama_tt_referrer_provider_perf", mapLJI);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
