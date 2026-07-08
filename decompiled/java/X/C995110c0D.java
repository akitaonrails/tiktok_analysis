package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995110c0D implements InterfaceC1627880sSo {
    public final EnumC995090c0B LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995110c0D)) {
            return false;
        }
        C995110c0D c995110c0D = (C995110c0D) obj;
        return this.LIZIZ == c995110c0D.LIZIZ && Intrinsics.LJFF(this.LIZJ, c995110c0D.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColoredPlaceHolder(color=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1627880sSo
    public final String getId() {
        return this.LIZJ;
    }

    public C995110c0D(EnumC995090c0B enumC995090c0B, String str) {
        this.LIZIZ = enumC995090c0B;
        this.LIZJ = str;
    }
}
