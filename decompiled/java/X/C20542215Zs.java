package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20542215Zs implements InterfaceC0148002o {
    public final C291001Au<EnumC20542015Zq> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<C1488140opQ> LLILLL;

    public C20542215Zs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20542215Zs)) {
            return false;
        }
        C20542215Zs c20542215Zs = (C20542215Zs) obj;
        return Intrinsics.LJFF(this.LL, c20542215Zs.LL) && this.LLILLJJLI == c20542215Zs.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20542215Zs.LLILLL);
    }

    public final int hashCode() {
        C291001Au<EnumC20542015Zq> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<C1488140opQ> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("STMMeditationViewState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEntering=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", playConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20542215Zs(int i) {
        this(null, null, true);
    }

    public C20542215Zs(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
    }

    public static C20542215Zs LIZ(C20542215Zs c20542215Zs, C291001Au c291001Au, boolean z, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c20542215Zs.LL;
        }
        if ((i & 2) != 0) {
            z = c20542215Zs.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c20542215Zs.LLILLL;
        }
        c20542215Zs.getClass();
        return new C20542215Zs(c291001Au, c291001Au2, z);
    }
}
