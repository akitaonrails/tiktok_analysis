package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868290yiZ implements InterfaceC951240arS<Object> {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868290yiZ)) {
            return false;
        }
        C1868290yiZ c1868290yiZ = (C1868290yiZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1868290yiZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868290yiZ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorExtraItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C1868290yiZ) {
            C1868290yiZ c1868290yiZ = (C1868290yiZ) obj;
            if (Intrinsics.LJFF(c1868290yiZ.LIZ, this.LIZ) && Intrinsics.LJFF(c1868290yiZ.LIZIZ, this.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868290yiZ;
    }

    public C1868290yiZ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
