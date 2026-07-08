package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C501001xI implements InterfaceC951240arS<Object> {
    public final String LIZ = "Add tag";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C501001xI) && Intrinsics.LJFF(this.LIZ, ((C501001xI) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorAddTagItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C501001xI) {
            return Intrinsics.LJFF(((C501001xI) obj).LIZ, this.LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C501001xI;
    }
}
