package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812670xGr implements InterfaceC775640Ubi {
    public final AbstractC1812590xGj LIZ;
    public final EnumC1812620xGm LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812670xGr)) {
            return false;
        }
        C1812670xGr c1812670xGr = (C1812670xGr) obj;
        return Intrinsics.LJFF(this.LIZ, c1812670xGr.LIZ) && this.LIZIZ == c1812670xGr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSummaryState(cellItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812670xGr(AbstractC1812590xGj abstractC1812590xGj, EnumC1812620xGm enumC1812620xGm) {
        this.LIZ = abstractC1812590xGj;
        this.LIZIZ = enumC1812620xGm;
    }

    public static C1812670xGr LIZ(C1812670xGr c1812670xGr, EnumC1812620xGm enumC1812620xGm) {
        AbstractC1812590xGj abstractC1812590xGj = c1812670xGr.LIZ;
        c1812670xGr.getClass();
        return new C1812670xGr(abstractC1812590xGj, enumC1812620xGm);
    }
}
