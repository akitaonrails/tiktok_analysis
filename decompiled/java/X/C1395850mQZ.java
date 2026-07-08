package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395850mQZ {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395850mQZ)) {
            return false;
        }
        C1395850mQZ c1395850mQZ = (C1395850mQZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1395850mQZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1395850mQZ.LIZIZ) && this.LIZJ == c1395850mQZ.LIZJ && this.LIZLLL == c1395850mQZ.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabletBottomControlBarOption(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", label=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1395850mQZ(String str, CharSequence charSequence, boolean z) {
        this.LIZ = str;
        this.LIZIZ = charSequence;
        this.LIZJ = z;
    }
}
