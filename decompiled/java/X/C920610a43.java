package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920610a43 extends C920640a46 {
    public final int LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;

    public C920610a43() {
        this(0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920610a43)) {
            return false;
        }
        C920610a43 c920610a43 = (C920610a43) obj;
        return this.LIZIZ == c920610a43.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920610a43.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920610a43.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MHJoinReplyResult(joinType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourceTrace=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C920610a43(int i, String str, int i2) {
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
