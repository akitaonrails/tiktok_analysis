package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637040sha {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1637040sha)) {
            return false;
        }
        C1637040sha c1637040sha = (C1637040sha) obj;
        return Intrinsics.LJFF(this.LIZ, c1637040sha.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1637040sha.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1637040sha.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public C1637040sha(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
