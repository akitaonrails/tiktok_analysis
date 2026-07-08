package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0qHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544050qHb {
    public static final C1544050qHb LIZ = new C1544050qHb();

    public static C443120HZe LIZ(String str, String str2) {
        boolean z;
        Object c098200Yq;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1544240qHu c1544240qHu = C1543230qGH.LIZ;
            if (!c1544240qHu.LIZ || ((arrayList2 = c1544240qHu.LIZIZ) != null && arrayList2.contains(str2))) {
                z2 = true;
            }
            return new C443120HZe(Boolean.valueOf(z2), null, "dataflowId is empty!");
        }
        try {
            c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            C1544240qHu c1544240qHu2 = C1543230qGH.LIZ;
            if (!c1544240qHu2.LIZ || ((arrayList = c1544240qHu2.LIZIZ) != null && arrayList.contains(str2))) {
                z2 = true;
            }
            return new C443120HZe(Boolean.valueOf(z2), null, "dataflowId is invalid!");
        }
        return new C443120HZe(Boolean.FALSE, c098200Yq, "dataflowId is invalid!");
    }
}
