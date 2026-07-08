package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C094800Xi implements InterfaceC951240arS<Object> {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C094800Xi) && Intrinsics.LJFF(this.LIZ, ((C094800Xi) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorAddExtraItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C094800Xi(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C094800Xi) {
            return Intrinsics.LJFF(((C094800Xi) obj).LIZ, this.LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C094800Xi;
    }
}
