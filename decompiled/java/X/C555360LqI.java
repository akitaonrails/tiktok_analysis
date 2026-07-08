package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555360LqI {
    public final CharSequence LIZ;
    public final boolean LIZIZ;
    public final C555350LqH LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C555360LqI() {
        this((CharSequence) null, (C555350LqH) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555360LqI)) {
            return false;
        }
        C555360LqI c555360LqI = (C555360LqI) obj;
        return Intrinsics.LJFF(this.LIZ, c555360LqI.LIZ) && this.LIZIZ == c555360LqI.LIZIZ && Intrinsics.LJFF(this.LIZJ, c555360LqI.LIZJ);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (((charSequence == null ? 0 : charSequence.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        C555350LqH c555350LqH = this.LIZJ;
        return iHashCode + (c555350LqH != null ? c555350LqH.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarState(titleContent=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", isShowingRetentionDialog=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retentionDialogTextConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C555360LqI LIZ(C555360LqI c555360LqI, boolean z) {
        CharSequence charSequence = c555360LqI.LIZ;
        C555350LqH c555350LqH = c555360LqI.LIZJ;
        c555360LqI.getClass();
        return new C555360LqI(charSequence, z, c555350LqH);
    }

    public /* synthetic */ C555360LqI(CharSequence charSequence, C555350LqH c555350LqH, int i) {
        this((i & 1) != 0 ? null : charSequence, false, (i & 4) != 0 ? null : c555350LqH);
    }

    public C555360LqI(CharSequence charSequence, boolean z, C555350LqH c555350LqH) {
        this.LIZ = charSequence;
        this.LIZIZ = z;
        this.LIZJ = c555350LqH;
    }
}
