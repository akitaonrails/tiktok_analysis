package X;

import Y.AObjectS78S0000000_28;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10VJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC1841100y0i
public final class C10VJ extends C10UO {
    public static final C10VK Companion = new C10VK();
    public static final C01GW<C13HG<Object>>[] LIZJ = {null, C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AObjectS78S0000000_28(9))};
    public final String LIZ;
    public final List<C13K4> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10VJ)) {
            return false;
        }
        C10VJ c10vj = (C10VJ) obj;
        return Intrinsics.LJFF(this.LIZ, c10vj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10vj.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUJConfig(exposeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10VJ() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = "";
        this.LIZIZ = c13bv;
    }

    public C10VJ(int i, String str, List list) {
        if (0 == 0) {
            this.LIZ = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.LIZIZ = C13BV.INSTANCE;
                return;
            } else {
                this.LIZIZ = list;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C13JV.LIZ.getDescriptor());
        throw null;
    }
}
