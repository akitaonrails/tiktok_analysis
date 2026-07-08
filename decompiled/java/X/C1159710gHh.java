package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;

/* JADX INFO: renamed from: X.0gHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159710gHh {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(827));

    public static Object LIZ(String str, Function0 function0) {
        Object c098200Yq;
        new AwS102S1000000_18(str, 40);
        try {
            c098200Yq = function0.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        new AwS167S1100000_18(str, c098200Yq, 39);
        return c098200Yq;
    }
}
