package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131001x implements InterfaceC1891350zJl {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0131001x)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null);
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
        sbLIZ.append("TextItem(str=");
        sbLIZ.append((String) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0131001x)) {
            return false;
        }
        interfaceC1891350zJl.getClass();
        return Intrinsics.LJFF(null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0131001x)) {
            return false;
        }
        return true;
    }
}
