package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2256608sm {
    public final int LIZ;
    public final boolean LIZIZ;
    public final InterfaceC2255308sZ LIZJ;
    public final InterfaceC2256308sj LIZLLL;

    public C2256608sm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2256608sm)) {
            return false;
        }
        C2256608sm c2256608sm = (C2256608sm) obj;
        return this.LIZ == c2256608sm.LIZ && this.LIZIZ == c2256608sm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2256608sm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2256608sm.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        InterfaceC2255308sZ interfaceC2255308sZ = this.LIZJ;
        return ((iZ2 + (interfaceC2255308sZ == null ? 0 : interfaceC2255308sZ.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThumbConfig(bizType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useMultiSlotThumb=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", frameCacheProvider=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", frameStrategy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2256608sm(int i) {
        this(3, false, null, new C2255608sc());
    }

    public C2256608sm(int i, boolean z, InterfaceC2255308sZ interfaceC2255308sZ, InterfaceC2256308sj interfaceC2256308sj) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = interfaceC2255308sZ;
        this.LIZLLL = interfaceC2256308sj;
    }
}
