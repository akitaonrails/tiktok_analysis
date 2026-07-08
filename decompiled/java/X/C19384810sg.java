package X;

/* JADX INFO: renamed from: X.10sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19384810sg {
    public static int LIZ() {
        return C19384910sh.LJFF.getValue().intValue();
    }

    public static C19384910sh LIZIZ(EnumC19384410sc enumC19384410sc) {
        int i = C19384610se.LIZ[enumC19384410sc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (C07HE.LIZIZ()) {
                    return new C19384910sh(EnumC19384410sc.SMALL, Integer.valueOf(Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(352)), (int) (LIZ() * 0.6f))), Integer.valueOf(Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)), (int) (LIZ() * 0.6f))), 18);
                }
                return new C19384910sh(EnumC19384410sc.SMALL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220))), 18);
            }
            throw new C1954807lC();
        }
        if (C07HE.LIZIZ()) {
            return new C19384910sh(EnumC19384410sc.DEFAULT, Integer.valueOf(Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(598)), LIZ())), Integer.valueOf(Math.min(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(588)), LIZ())), 18);
        }
        return new C19384910sh(EnumC19384410sc.DEFAULT, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(352))), null, 26);
    }
}
