package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ByJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305530ByJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C303250Bud());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C305540ByK());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C305520ByI());

    public static boolean LIZ(String str) {
        if (((Boolean) C0VF3.LIZIZ.getValue()).booleanValue() || !((Boolean) LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if (((Boolean) LIZJ.getValue()).booleanValue() && !Intrinsics.LJFF(str, "homepage_hot") && !Intrinsics.LJFF(str, "system_launch")) {
            return false;
        }
        return true;
    }
}
