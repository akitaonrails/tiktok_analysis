package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C093400Wu implements InterfaceC951240arS<Object> {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C093400Wu) && Intrinsics.LJFF(this.LIZ, ((C093400Wu) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorAddTagTitleItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C093400Wu(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C093400Wu) {
            return Intrinsics.LJFF(((C093400Wu) obj).LIZ, this.LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C093400Wu;
    }
}
