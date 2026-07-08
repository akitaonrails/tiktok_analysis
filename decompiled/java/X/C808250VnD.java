package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import kotlin.jvm.internal.AwS98S1000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808250VnD implements InterfaceC808260VnE {
    @Override // X.InterfaceC808260VnE
    public final RuleHitState LIZ(String str) {
        C20654315rx c20654315rx = C20653815rs.LJI;
        new AwS98S1000000_13(str, 21);
        c20654315rx.getClass();
        C20653815rs.LIZ.getClass();
        C807940Vmi c807940VmiLIZIZ = C20653815rs.LIZIZ();
        if (c807940VmiLIZIZ == null || str == null) {
            return null;
        }
        return (RuleHitState) c807940VmiLIZIZ.LJ.get(str);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static boolean LIZIZ(String str, RuleHitState ruleHitState) {
        if (ruleHitState == null) {
            return false;
        }
        C20653815rs.LIZ.getClass();
        C807940Vmi c807940VmiLIZIZ = C20653815rs.LIZIZ();
        Object obj = null;
        if (c807940VmiLIZIZ != null && str != null) {
            obj = c807940VmiLIZIZ.LJ.get(str);
        }
        if (Intrinsics.LJFF(obj, ruleHitState)) {
            return false;
        }
        C20654315rx c20654315rx = C20653815rs.LJI;
        new AwS98S1000000_13(str, 22);
        c20654315rx.getClass();
        C807940Vmi c807940VmiLIZIZ2 = C20653815rs.LIZIZ();
        if (c807940VmiLIZIZ2 != null && str != null) {
            c807940VmiLIZIZ2.LJ.put((K) str, (V) ruleHitState);
            if (!c807940VmiLIZIZ2.LJIIIZ) {
                c807940VmiLIZIZ2.LIZIZ(str, ruleHitState);
                return true;
            }
            return true;
        }
        return true;
    }
}
