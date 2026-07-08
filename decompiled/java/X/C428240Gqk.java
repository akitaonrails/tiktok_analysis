package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428240Gqk {
    public final String LIZ;
    public final String LIZIZ;

    public C428240Gqk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C428240Gqk)) {
            return false;
        }
        C428240Gqk c428240Gqk = (C428240Gqk) obj;
        return Intrinsics.LJFF(this.LIZ, c428240Gqk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c428240Gqk.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleState(mainText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secondaryText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C428240Gqk(int i) {
        this("", "");
    }

    public C428240Gqk(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public static C428240Gqk LIZ(C428240Gqk c428240Gqk, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = c428240Gqk.LIZ;
        }
        if ((i & 2) != 0) {
            str2 = c428240Gqk.LIZIZ;
        }
        c428240Gqk.getClass();
        return new C428240Gqk(str, str2);
    }
}
