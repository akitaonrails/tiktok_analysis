package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820630xTh {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final List<InterfaceC1891350zJl> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1820630xTh)) {
            return false;
        }
        C1820630xTh c1820630xTh = (C1820630xTh) obj;
        return this.LIZ == c1820630xTh.LIZ && this.LIZIZ == c1820630xTh.LIZIZ && this.LIZJ == c1820630xTh.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1820630xTh.LIZLLL) && Intrinsics.LJFF(this.LJ, c1820630xTh.LJ);
    }

    public C1820630xTh(int i, int i2, String str, boolean z, List list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = list;
        this.LJ = str;
    }
}
