package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383920m7K {
    public long LIZ;
    public long LIZIZ;
    public final List<C1383960m7O> LIZJ;
    public EnumC1384040m7W LIZLLL;
    public int LJ;

    public C1383920m7K() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383920m7K)) {
            return false;
        }
        C1383920m7K c1383920m7K = (C1383920m7K) obj;
        return this.LIZ == c1383920m7K.LIZ && this.LIZIZ == c1383920m7K.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1383920m7K.LIZJ) && this.LIZLLL == c1383920m7K.LIZLLL && this.LJ == c1383920m7K.LJ;
    }

    public C1383920m7K(List list, EnumC1384040m7W enumC1384040m7W) {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = list;
        this.LIZLLL = enumC1384040m7W;
        this.LJ = 0;
    }
}
