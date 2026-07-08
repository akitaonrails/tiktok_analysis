package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920620a44 extends C920640a46 {
    public final int LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;

    public C920620a44() {
        this(0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920620a44)) {
            return false;
        }
        C920620a44 c920620a44 = (C920620a44) obj;
        return this.LIZIZ == c920620a44.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920620a44.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920620a44.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinResult(joinType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920620a44(int i, String str, int i2) {
        C13BV c13bv;
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? "" : str;
        if ((i2 & 4) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        super(c13bv);
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = c13bv;
    }
}
