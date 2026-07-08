package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438980HJg implements InterfaceC439080HJq {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C438980HJg)) {
            return false;
        }
        C438980HJg c438980HJg = (C438980HJg) obj;
        return Intrinsics.LJFF(this.LIZ, c438980HJg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c438980HJg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MissingSelfie(expressionUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generationUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C438980HJg(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
