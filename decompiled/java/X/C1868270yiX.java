package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868270yiX implements InterfaceC951240arS<Object> {
    public final C20368314mv LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1868270yiX) && Intrinsics.LJFF(this.LIZ, ((C1868270yiX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookConditionSelectNumItem(conditionEditData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868270yiX(C20368314mv c20368314mv) {
        this.LIZ = c20368314mv;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868270yiX;
    }
}
