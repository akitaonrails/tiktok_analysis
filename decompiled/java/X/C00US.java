package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00US, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00US implements InterfaceC951240arS<Object> {
    public final List<C1868320yic> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00US) && Intrinsics.LJFF(this.LIZ, ((C00US) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorAddTagContainerItem(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00US(List<C1868320yic> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C00US) || !Intrinsics.LJFF(((C00US) obj).LIZ, this.LIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C00US;
    }
}
