package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215005d implements InterfaceC1891350zJl {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0215005d)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupTitleItem(title=");
        sbLIZ.append((String) null);
        sbLIZ.append(", subTitle=");
        sbLIZ.append((String) null);
        sbLIZ.append(", cellMargin=");
        sbLIZ.append(0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }
}
