package X;

import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0ya1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C07QN("tako_onboarding_style")
public final class C1862990ya1 {
    public static final C1862990ya1 LIZ = new C1862990ya1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(260));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(261));

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static EnumC1863020ya4 LIZ(boolean z) {
        int iIntValue = ((Number) LIZJ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue != 4) {
                        return EnumC1863020ya4.VERTICAL;
                    }
                    return EnumC1863020ya4.QUERY_RECOMMEND;
                }
                return EnumC1863020ya4.HORIZONTAL;
            }
            if (z) {
                return EnumC1863020ya4.GRID;
            }
            return EnumC1863020ya4.VERTICAL;
        }
        return EnumC1863020ya4.VERTICAL;
    }
}
