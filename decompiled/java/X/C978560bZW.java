package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978560bZW {
    public final List<GiftMode> LIZ;
    public final List<AbstractC1557520qdK> LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;

    public C978560bZW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C978560bZW)) {
            return false;
        }
        C978560bZW c978560bZW = (C978560bZW) obj;
        return Intrinsics.LJFF(this.LIZ, c978560bZW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c978560bZW.LIZIZ) && this.LIZJ == c978560bZW.LIZJ && this.LIZLLL == c978560bZW.LIZLLL && this.LJ == c978560bZW.LJ && this.LJFF == c978560bZW.LJFF;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C978560bZW(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, 0L, 0, false, 0);
    }

    public static C978560bZW LIZ(C978560bZW c978560bZW, long j) {
        List<GiftMode> list = c978560bZW.LIZ;
        List<AbstractC1557520qdK> list2 = c978560bZW.LIZIZ;
        int i = c978560bZW.LIZLLL;
        boolean z = c978560bZW.LJ;
        int i2 = c978560bZW.LJFF;
        c978560bZW.getClass();
        return new C978560bZW(list, list2, j, i, z, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C978560bZW(List<GiftMode> list, List<? extends AbstractC1557520qdK> list2, long j, int i, boolean z, int i2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = i2;
    }
}
