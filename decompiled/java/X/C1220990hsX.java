package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220990hsX implements InterfaceC1891350zJl {
    public final C1221030hsb LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1220990hsX) && Intrinsics.LJFF(this.LL, ((C1220990hsX) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarPowerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1220990hsX(C1221030hsb c1221030hsb) {
        this.LL = c1221030hsb;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1220990hsX)) {
            return false;
        }
        return Intrinsics.LJFF(((C1220990hsX) interfaceC1891350zJl).LL.LIZIZ, this.LL.LIZIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
