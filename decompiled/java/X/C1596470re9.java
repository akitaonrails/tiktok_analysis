package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.ISkylightApi;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0re9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596470re9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(626));

    public static ISkylightApi LIZ() {
        return (ISkylightApi) LIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.base.api.ISkylightApi] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static FollowingInterestUsersResponse LIZIZ(Integer num, boolean z, boolean z2, int i) {
        int i2;
        boolean z3 = z2;
        ?? r5 = z;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            r5 = 0;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if (num == null) {
            return LIZ().LIZIZ(i2, 0L, 2, r5 == true ? 1 : 0, z3).execute().LIZIZ;
        }
        return LIZ().LJ(i2, 0L, 2, r5, num.intValue(), z3).execute().LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZJ(long j, long j2, String str, long j3, int i, int i2, int i3, int i4, List list, boolean z, String str2, Long l, Long l2, String str3, int i5, C1596440re6 c1596440re6) {
        boolean z2;
        long jIntValue;
        String jsonString;
        Object c098200Yq;
        if (j3 == EnumC1596540reG.INBOX_TAB.getValue() && C298520Bn0.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            jIntValue = ((Number) C1596630reP.LIZ.getValue()).intValue();
        } else {
            jIntValue = 0;
        }
        Object obj = null;
        if (!C1203304nH.LIZIZ() && !z2) {
            jsonString = null;
        } else {
            jsonString = new ClientControlParams(false, Boolean.valueOf(C1203304nH.LIZIZ()), Boolean.valueOf(z2), null).toJsonString();
        }
        if (list != null) {
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = C1227904rF.LJI(list);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            obj = (String) obj;
        }
        return LIZ().getStorySkylightData(j, j2, str, j3, i, z, i2, i3, i4, obj, str2, l, C2286608xc.LJFF(jIntValue), l2, str3, i5, jsonString, c1596440re6);
    }
}
