package X;

import com.bytedance.assem.arch.reused.ReusedAssem;

/* JADX INFO: renamed from: X.0SvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736820SvI {
    public static final <R> C1770850wBP<R> LIZJ() {
        C1770850wBP<R> c1770850wBP = new C1770850wBP<>();
        c1770850wBP.LIZ(true);
        return c1770850wBP;
    }

    public static final <R> C1770850wBP<R> LIZLLL() {
        C1770850wBP<R> c1770850wBP = new C1770850wBP<>();
        c1770850wBP.LIZ = true;
        return c1770850wBP;
    }

    public static final <R> C1770850wBP<R> LJ() {
        C1770850wBP<R> c1770850wBP = new C1770850wBP<>();
        c1770850wBP.LIZ(true);
        c1770850wBP.LIZ = true;
        return c1770850wBP;
    }

    public static final <R> C1770850wBP<R> LIZIZ(boolean z) {
        C1770850wBP<R> c1770850wBP = new C1770850wBP<>();
        c1770850wBP.LIZ(!z);
        return c1770850wBP;
    }

    public static final void LIZ(InterfaceC725030ScH interfaceC725030ScH, C1770850wBP c1770850wBP, boolean z, boolean z2) {
        ReusedAssem reusedAssem;
        C724270Sb3 c724270Sb3;
        boolean uniqueOnlyDefault;
        if (!c1770850wBP.LIZLLL) {
            if (z) {
                uniqueOnlyDefault = false;
            } else {
                uniqueOnlyDefault = interfaceC725030ScH.getUniqueOnlyDefault();
            }
            c1770850wBP.LIZ(uniqueOnlyDefault);
        }
        if (z2) {
            c1770850wBP.LIZ = false;
        }
        C724270Sb3 c724270Sb32 = null;
        if ((interfaceC725030ScH instanceof ReusedAssem) && (reusedAssem = (ReusedAssem) interfaceC725030ScH) != null) {
            if (z) {
                c724270Sb3 = reusedAssem.LLJI;
            } else {
                c724270Sb3 = null;
            }
            if (c724270Sb3 instanceof C11HA) {
                c724270Sb32 = c724270Sb3;
            }
            c1770850wBP.LJI = c724270Sb32;
        }
    }
}
