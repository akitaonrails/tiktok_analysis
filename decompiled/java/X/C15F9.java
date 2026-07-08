package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15F9, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15F9 implements InterfaceC0148002o {
    public final String LL;
    public final C15F6 LLILLJJLI;
    public final C15FE LLILLL;

    public C15F9() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15F9)) {
            return false;
        }
        C15F9 c15f9 = (C15F9) obj;
        return Intrinsics.LJFF(this.LL, c15f9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15f9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15f9.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C15F6 c15f6 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c15f6 == null ? 0 : c15f6.hashCode())) * 31;
        C15FE c15fe = this.LLILLL;
        return iHashCode2 + (c15fe != null ? c15fe.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionTitleState(currentContent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", switchAnimConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C15F9(C15F4 c15f4, int i) {
        this(null, (i & 2) != 0 ? null : c15f4, null);
    }

    public C15F9(String str, C15F6 c15f6, C15FE c15fe) {
        this.LL = str;
        this.LLILLJJLI = c15f6;
        this.LLILLL = c15fe;
    }

    public static C15F9 LIZ(C15F9 c15f9, C15F6 c15f6, C15FE c15fe) {
        String str = c15f9.LL;
        c15f9.getClass();
        return new C15F9(str, c15f6, c15fe);
    }
}
