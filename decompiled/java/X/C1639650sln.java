package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639650sln {
    public final String LIZ;
    public final EnumC1641340soW LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639650sln)) {
            return false;
        }
        C1639650sln c1639650sln = (C1639650sln) obj;
        return Intrinsics.LJFF(this.LIZ, c1639650sln.LIZ) && this.LIZIZ == c1639650sln.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1639650sln.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1639650sln.LIZLLL);
    }

    public C1639650sln(String str, EnumC1641340soW enumC1641340soW, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC1641340soW;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
