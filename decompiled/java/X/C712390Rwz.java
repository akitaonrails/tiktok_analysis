package X;

import Y.ACallableS63S1100000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Rwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712390Rwz {
    public static final C712390Rwz LIZ = new C712390Rwz();
    public static final C01GW LIZIZ = C1935107i1.LIZ(AFwS198S0000000_11.get$arr$(475));

    public static void LIZ(String str, Function1 function1) {
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject();
        try {
            function1.invoke(jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LIZ.getClass();
            if (((Boolean) LIZIZ.getValue()).booleanValue()) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("StoryGuideCardTracker", "error occurs when assembling mob params", thM5exceptionOrNullimpl);
                throw thM5exceptionOrNullimpl;
            }
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C15O7.LIZJ(new ACallableS63S1100000_11(str, jSONObject, 2));
        }
    }
}
