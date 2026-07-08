package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845730XFr extends AbstractC845740XFs {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C845730XFr)) {
            return false;
        }
        C845730XFr c845730XFr = (C845730XFr) obj;
        return this.LIZ == c845730XFr.LIZ && Intrinsics.LJFF(this.LIZIZ, c845730XFr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoginError(messageRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C845730XFr() {
        this(2131824521, "");
    }

    public C845730XFr(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
