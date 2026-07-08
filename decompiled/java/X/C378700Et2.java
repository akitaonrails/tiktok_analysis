package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Et2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378700Et2 {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C378700Et2() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378700Et2)) {
            return false;
        }
        C378700Et2 c378700Et2 = (C378700Et2) obj;
        return Intrinsics.LJFF(this.LIZ, c378700Et2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378700Et2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378700Et2.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAIPromptItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C378700Et2(Integer num, int i) {
        String str;
        num = (i & 1) != 0 ? -1 : num;
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(num, str, (i & 4) != 0 ? "" : null);
    }

    public C378700Et2(Integer num, String str, String str2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
