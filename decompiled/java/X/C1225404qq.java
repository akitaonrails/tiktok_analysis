package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1225404qq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(998));

    public static final boolean LIZ() {
        Object c098200Yq;
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = Boolean.valueOf(C08Q0.LJ(C844470XAv.LIZ(), "load_so_fallback_ab", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        System.err.printf("LoadSoExperiment,load_so_fallback_ab: " + zBooleanValue + ' ', new Object[0]);
        return zBooleanValue;
    }
}
