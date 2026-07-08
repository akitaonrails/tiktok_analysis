package X;

import android.os.SystemClock;
import com.bef.effectsdk.RequirementResourceMapper;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0jXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284770jXP {
    public static final C1284770jXP LIZ = new C1284770jXP();

    public static final String[] LIZ(String[] strArr) {
        Object c098200Yq;
        if (strArr == null) {
            return null;
        }
        try {
            return RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not load effect so, ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("RequirementResourceMapper", strLIZIZ, null);
            try {
                C13SS.LIZ.getClass();
                C13SS.LIZIZ("RequirementResourceMapper", "effect so hasn't been loaded, load here", null);
                LoadSoLancet.LIZJ("effect");
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF("effect");
                LoadSoLancet.LJ(jUptimeMillis, "effect");
                LoadSoLancet.LIZLLL(jUptimeMillis, "effect");
                LoadSoLancet.LIZIZ("effect");
                c098200Yq = RequirementResourceMapper.nativePeekResourcesNeededByRequirements(strArr);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fallback error ");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LIZIZ("RequirementResourceMapper", strLIZIZ2, null);
            }
            String[] strArr2 = new String[0];
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = strArr2;
            }
            return (String[]) c098200Yq;
        }
    }
}
