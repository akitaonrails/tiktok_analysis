package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502330pCJ {
    public final String LIZ;
    public Integer LIZIZ;
    public C1529350ptt LIZJ;
    public LinkedHashMap<String, C1502330pCJ> LIZLLL;
    public final /* synthetic */ C1502320pCI LJ;

    public C1502330pCJ() {
        throw null;
    }

    public final C1502330pCJ LIZIZ(String str) {
        C1502330pCJ c098200Yq;
        Object obj = null;
        try {
            LinkedHashMap<String, C1502330pCJ> linkedHashMap = this.LIZLLL;
            if (linkedHashMap != null) {
                c098200Yq = linkedHashMap.get(str);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C1502330pCJ) obj;
    }

    public final C1502330pCJ LIZ(String str, C1529350ptt c1529350ptt, Integer num) {
        C1502330pCJ c1502330pCJLIZIZ;
        int iIntValue;
        LinkedHashMap<String, C1502330pCJ> linkedHashMap = this.LIZLLL;
        if (linkedHashMap == null) {
            C1502330pCJ c1502330pCJ = new C1502330pCJ(this.LJ, str, num, c1529350ptt);
            LinkedHashMap<String, C1502330pCJ> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put(str, c1502330pCJ);
            this.LIZLLL = linkedHashMap2;
            return c1502330pCJ;
        }
        while (true) {
            try {
                c1502330pCJLIZIZ = LIZIZ(str);
                break;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1532920pze.LIZJ.LIZIZ("PrefixMatchTree", "addSubNode", "failed to add sub node");
            }
        }
        if (c1502330pCJLIZIZ != null) {
            if (c1529350ptt != null) {
                C1529350ptt c1529350ptt2 = c1502330pCJLIZIZ.LIZJ;
                if (c1529350ptt2 == null || Intrinsics.LJFF(c1529350ptt2, c1529350ptt)) {
                    c1502330pCJLIZIZ.LIZJ = c1529350ptt;
                } else {
                    return null;
                }
            }
            if (num != null) {
                Integer num2 = c1502330pCJLIZIZ.LIZIZ;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = Integer.MAX_VALUE;
                }
                c1502330pCJLIZIZ.LIZIZ = Integer.valueOf(Math.min(iIntValue, num.intValue()));
                return c1502330pCJLIZIZ;
            }
            return c1502330pCJLIZIZ;
        }
        C1502330pCJ c1502330pCJ2 = new C1502330pCJ(this.LJ, str, num, c1529350ptt);
        linkedHashMap.put(str, c1502330pCJ2);
        return c1502330pCJ2;
    }

    public C1502330pCJ(C1502320pCI c1502320pCI, String str, Integer num, C1529350ptt c1529350ptt) {
        this.LJ = c1502320pCI;
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = c1529350ptt;
        this.LIZLLL = null;
    }
}
