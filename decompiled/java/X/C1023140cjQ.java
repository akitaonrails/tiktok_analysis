package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023140cjQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1023140cjQ)) {
            return false;
        }
        C1023140cjQ c1023140cjQ = (C1023140cjQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1023140cjQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1023140cjQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1023140cjQ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C1023140cjQ(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
