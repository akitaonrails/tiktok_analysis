package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973540bRQ {
    public final CharSequence LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C973540bRQ() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C973540bRQ)) {
            return false;
        }
        C973540bRQ c973540bRQ = (C973540bRQ) obj;
        return Intrinsics.LJFF(this.LIZ, c973540bRQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c973540bRQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c973540bRQ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Appearance(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C973540bRQ(CharSequence charSequence, int i) {
        String str;
        charSequence = (i & 1) != 0 ? "" : charSequence;
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(charSequence, str, (i & 4) == 0 ? null : "");
    }

    public C973540bRQ(CharSequence charSequence, String str, String str2) {
        this.LIZ = charSequence;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
