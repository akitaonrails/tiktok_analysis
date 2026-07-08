package X;

/* JADX INFO: renamed from: X.0EI1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI1 {
    public static C0EI2 LIZ() {
        return new C0EI2("dot", null, false, 30);
    }

    public static C0EI2 LIZIZ(boolean z, int i) {
        boolean z2 = z;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z2 = false;
        }
        if ((i & 2) != 0) {
            z3 = true;
        }
        return new C0EI2(null, "icon_selected_icon", z2, z3, false);
    }

    public static C0EI2 LIZJ(int i, boolean z) {
        return new C0EI2("icon_switch", Integer.valueOf(i), z, 8);
    }
}
