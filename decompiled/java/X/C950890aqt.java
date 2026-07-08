package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950890aqt implements InterfaceC951240arS<Object> {
    public final InterfaceC950700aqa LIZ;

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C950890aqt) && Intrinsics.LJFF(this.LIZ, ((C950890aqt) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextHeaderItem(contextProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C950890aqt(C951060arA c951060arA) {
        this.LIZ = c951060arA;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C950890aqt;
    }
}
