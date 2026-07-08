package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC1294060jmO
public final class C1667290tUN {
    public final long LIZ;
    public final InterfaceC1679150tnV LIZIZ;

    public final int hashCode() {
        return (C1685910tyP.LJIIJ(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OverscrollConfiguration(glowColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(", drawPadding=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1667290tUN() {
        long jLIZLLL = C1685850tyJ.LIZLLL(4284900966L);
        C1682530tsx c1682530tsxLIZIZ = C1682520tsw.LIZIZ(0.0f, 0.0f, 3);
        this.LIZ = jLIZLLL;
        this.LIZIZ = c1682530tsxLIZIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1667290tUN.class, cls)) {
            return false;
        }
        C1667290tUN c1667290tUN = (C1667290tUN) obj;
        if (C1685910tyP.LJ(this.LIZ, c1667290tUN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1667290tUN.LIZIZ)) {
            return true;
        }
        return false;
    }
}
