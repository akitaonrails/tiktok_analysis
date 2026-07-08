package X;

import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631530sYh {
    public static final C1631530sYh LIZ = new C1631530sYh();
    public static final String LIZIZ = C0CHQ.LIZ.getString(2131845845);
    public static final String LIZJ = C0CHQ.LIZ.getString(2131845848);
    public static final String LIZLLL = C0CHQ.LIZ.getString(2131845846);
    public static final String LJ = C0CHQ.LIZ.getString(2131845847);
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(177));

    public static String LIZ() {
        return (String) LJFF.getValue();
    }

    public static int LIZIZ(String str) {
        if (Intrinsics.LJFF(str, LIZIZ)) {
            return 10;
        }
        if (Intrinsics.LJFF(str, LIZLLL)) {
            return 14;
        }
        if (Intrinsics.LJFF(str, LIZJ)) {
            return 11;
        }
        if (Intrinsics.LJFF(str, LJ)) {
            return 18;
        }
        if (Intrinsics.LJFF(str, EnumC1647570syZ.RECORD_NOW.getTag())) {
            return 16;
        }
        return 8;
    }

    public static boolean LIZJ(String str) {
        if (!Intrinsics.LJFF(str, LIZJ) && !Intrinsics.LJFF(str, LIZLLL) && !Intrinsics.LJFF(str, LJ)) {
            return false;
        }
        return true;
    }
}
