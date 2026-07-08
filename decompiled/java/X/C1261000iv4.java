package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261000iv4 extends AbstractC1261010iv5 {
    public final String LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    public final C1261000iv4 copy(String str, int i, boolean z, int i2, boolean z2) {
        return new C1261000iv4(str, i, z, i2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1261000iv4)) {
            return false;
        }
        C1261000iv4 c1261000iv4 = (C1261000iv4) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1261000iv4.LLILLJJLI) && this.LLILLL == c1261000iv4.LLILLL && this.LLILZ == c1261000iv4.LLILZ && this.LLILZIL == c1261000iv4.LLILZIL && this.LLILZLL == c1261000iv4.LLILZLL;
    }

    public int hashCode() {
        return (((((((this.LLILLJJLI.hashCode() * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelatedApi(uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", iterateCnt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fromNewMaf=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", indexOfRecMore=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isLastRecMore=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getFromNewMaf() {
        return this.LLILZ;
    }

    public final int getIndexOfRecMore() {
        return this.LLILZIL;
    }

    public final int getIterateCnt() {
        return this.LLILLL;
    }

    public final String getUid() {
        return this.LLILLJJLI;
    }

    public final boolean isLastRecMore() {
        return this.LLILZLL;
    }

    public final void setIndexOfRecMore(int i) {
        this.LLILZIL = i;
    }

    public final void setLastRecMore(boolean z) {
        this.LLILZLL = z;
    }

    public C1261000iv4(String str, int i, boolean z, int i2, boolean z2) {
        super("RelatedApi", null);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = z2;
    }
}
