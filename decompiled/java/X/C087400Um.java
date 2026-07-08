package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C087400Um implements InterfaceC951240arS<Object> {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C087400Um) && Intrinsics.LJFF(this.LIZ, ((C087400Um) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleData(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C087400Um(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        C087400Um c087400Um;
        String str = null;
        if ((obj instanceof C087400Um) && (c087400Um = (C087400Um) obj) != null) {
            str = c087400Um.LIZ;
        }
        return Intrinsics.LJFF(str, this.LIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C087400Um;
    }
}
