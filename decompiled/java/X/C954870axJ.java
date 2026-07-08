package X;

/* JADX INFO: renamed from: X.0axJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954870axJ {
    public static final int LIZ(C954780axA c954780axA) {
        boolean z;
        EnumC969200bKQ enumC969200bKQ = c954780axA.LIZIZ;
        EnumC969200bKQ enumC969200bKQ2 = c954780axA.LIZJ;
        if (enumC969200bKQ == EnumC969200bKQ.Idle && enumC969200bKQ2 != EnumC969200bKQ.Close) {
            z = true;
        } else {
            z = false;
        }
        return LIZIZ(c954780axA.LIZ, z);
    }

    public static final int LIZIZ(C914780Zue c914780Zue, boolean z) {
        if (z) {
            return 6;
        }
        EnumC969200bKQ enumC969200bKQ = c914780Zue.LIZ;
        if (enumC969200bKQ == EnumC969200bKQ.Linked) {
            return 5;
        }
        C954960axS c954960axS = c914780Zue.LIZIZ;
        if (c954960axS.LIZIZ) {
            return 4;
        }
        if (c954960axS.LIZ) {
            return 3;
        }
        if (enumC969200bKQ == EnumC969200bKQ.Wait) {
            return 2;
        }
        return 0;
    }
}
