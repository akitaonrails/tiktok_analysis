package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634770sdv {
    public final C1634770sdv LIZ;
    public final List<Effect> LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final boolean LJ;

    public C1634770sdv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634770sdv)) {
            return false;
        }
        C1634770sdv c1634770sdv = (C1634770sdv) obj;
        return Intrinsics.LJFF(this.LIZ, c1634770sdv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1634770sdv.LIZIZ) && this.LIZJ == c1634770sdv.LIZJ && this.LIZLLL == c1634770sdv.LIZLLL && this.LJ == c1634770sdv.LJ;
    }

    public C1634770sdv(int i) {
        this(null, C13BV.INSTANCE, 0, 0L, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1634770sdv(C1634770sdv c1634770sdv, List<? extends Effect> list, int i, long j, boolean z) {
        this.LIZ = c1634770sdv;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJ = z;
    }
}
