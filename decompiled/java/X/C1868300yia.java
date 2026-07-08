package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868300yia implements InterfaceC951240arS<Object> {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868300yia)) {
            return false;
        }
        C1868300yia c1868300yia = (C1868300yia) obj;
        return this.LIZ == c1868300yia.LIZ && Intrinsics.LJFF(this.LIZIZ, c1868300yia.LIZIZ) && this.LIZJ == c1868300yia.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorTagItem(tagType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPrimary=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C1868300yia) {
            return Intrinsics.LJFF(obj, this);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868300yia;
    }

    public C1868300yia(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
