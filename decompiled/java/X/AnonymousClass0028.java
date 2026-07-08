package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0028, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0028 implements InterfaceC0143002j {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0028) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0028) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumViewCustomTabTitleTextEvent(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0028() {
        this("");
    }

    public AnonymousClass0028(String str) {
        this.LIZ = str;
    }
}
