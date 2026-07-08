package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203150hPl implements InterfaceC1203220hPs {
    public final InterfaceC1183704k7 LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203150hPl)) {
            return false;
        }
        C1203150hPl c1203150hPl = (C1203150hPl) obj;
        return Intrinsics.LJFF(this.LIZ, c1203150hPl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1203150hPl.LIZIZ) && this.LIZJ == c1203150hPl.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconChip(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconDescription=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1203150hPl(C1183604k6 c1183604k6, CharSequence charSequence) {
        this.LIZ = c1183604k6;
        this.LIZIZ = charSequence;
    }
}
