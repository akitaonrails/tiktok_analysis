package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08YC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08YC)) {
            return false;
        }
        C08YC c08yc = (C08YC) obj;
        return Intrinsics.LJFF(this.LIZ, c08yc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c08yc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c08yc.LIZJ) && this.LIZLLL == c08yc.LIZLLL;
    }

    public C08YC(String str, String str2, String str3, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
    }
}
