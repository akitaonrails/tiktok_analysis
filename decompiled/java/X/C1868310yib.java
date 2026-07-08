package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868310yib implements InterfaceC951240arS<Object> {
    public final C1868300yia LIZ;
    public final List<C1868300yia> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868310yib)) {
            return false;
        }
        C1868310yib c1868310yib = (C1868310yib) obj;
        return Intrinsics.LJFF(this.LIZ, c1868310yib.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868310yib.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorTagContainerItem(firstLevelTagItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secondLevelTagItems=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C1868310yib)) {
            return false;
        }
        C1868310yib c1868310yib = (C1868310yib) obj;
        if (!Intrinsics.LJFF(c1868310yib.LIZ, this.LIZ) || !Intrinsics.LJFF(c1868310yib.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868310yib;
    }

    public C1868310yib(C1868300yia c1868300yia, List<C1868300yia> list) {
        this.LIZ = c1868300yia;
        this.LIZIZ = list;
    }
}
