package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975380bUO {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C975380bUO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C975380bUO)) {
            return false;
        }
        C975380bUO c975380bUO = (C975380bUO) obj;
        return this.LIZ == c975380bUO.LIZ && Intrinsics.LJFF(this.LIZIZ, c975380bUO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c975380bUO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c975380bUO.LIZLLL);
    }

    public /* synthetic */ C975380bUO(int i) {
        this(0, "", "", "");
    }

    public C975380bUO(int i, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
