package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0lGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351190lGX {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Set<String> LIZJ;

    public C1351190lGX() {
        this(0);
    }

    public C1351190lGX(int i) {
        this(false, false, C08CX.INSTANCE);
    }

    public C1351190lGX(boolean z, boolean z2, Set<String> set) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = set;
    }

    public static C1351190lGX LIZ(C1351190lGX c1351190lGX, boolean z, boolean z2, Set set, int i) {
        if ((i & 1) != 0) {
            z = c1351190lGX.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1351190lGX.LIZIZ;
        }
        if ((i & 4) != 0) {
            set = c1351190lGX.LIZJ;
        }
        c1351190lGX.getClass();
        return new C1351190lGX(z, z2, set);
    }
}
