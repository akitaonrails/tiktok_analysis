package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978110bYn {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C978110bYn)) {
            return false;
        }
        C978110bYn c978110bYn = (C978110bYn) obj;
        return this.LIZ == c978110bYn.LIZ && Intrinsics.LJFF(this.LIZIZ, c978110bYn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c978110bYn.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivePlaybookInfo(playbookId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverImageUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C978110bYn(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
