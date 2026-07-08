package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316780CbM {
    public final String LIZ;
    public final int LIZIZ;

    public C316780CbM() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316780CbM)) {
            return false;
        }
        C316780CbM c316780CbM = (C316780CbM) obj;
        return Intrinsics.LJFF(this.LIZ, c316780CbM.LIZ) && this.LIZIZ == c316780CbM.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionUserDisplayHint(searchSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchBy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C316780CbM(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    public /* synthetic */ C316780CbM(String str, int i, int i2) {
        this((i & 1) != 0 ? "" : str, 0);
    }
}
