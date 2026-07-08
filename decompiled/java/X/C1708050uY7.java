package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1708050uY7 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1708050uY7)) {
            return false;
        }
        C1708050uY7 c1708050uY7 = (C1708050uY7) obj;
        if (Intrinsics.LJFF(this.LIZ, c1708050uY7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1708050uY7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1708050uY7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1708050uY7.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C1708050uY7(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
