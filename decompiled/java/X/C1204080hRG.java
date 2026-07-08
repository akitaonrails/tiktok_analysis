package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.nearby.settings.NearbyDoubleColumnCacheOptExperiment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204080hRG {
    public final List<InterfaceC1204490hRv> LIZ;
    public final Boolean LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;
    public final Boolean LJ;
    public final String LJFF;
    public final Integer LJI;
    public Boolean LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204080hRG)) {
            return false;
        }
        C1204080hRG c1204080hRG = (C1204080hRG) obj;
        return Intrinsics.LJFF(this.LIZ, c1204080hRG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1204080hRG.LIZIZ) && this.LIZJ == c1204080hRG.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1204080hRG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1204080hRG.LJ) && Intrinsics.LJFF(this.LJFF, c1204080hRG.LJFF) && Intrinsics.LJFF(this.LJI, c1204080hRG.LJI) && Intrinsics.LJFF(this.LJII, c1204080hRG.LJII) && this.LJIIIIZZ == c1204080hRG.LJIIIIZZ;
    }

    public final boolean LIZIZ() {
        Long l = this.LIZLLL;
        if (l == null) {
            return false;
        }
        l.longValue();
        return System.currentTimeMillis() >= (((NearbyDoubleColumnCacheOptExperiment.NearbyFirstLoadByCache) NearbyDoubleColumnCacheOptExperiment.LIZIZ.getValue()).validSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + this.LIZLLL.longValue();
    }

    public static C1204080hRG LIZ(C1204080hRG c1204080hRG, List list) {
        return new C1204080hRG((List<? extends InterfaceC1204490hRv>) list, c1204080hRG.LIZIZ, c1204080hRG.LIZJ, c1204080hRG.LIZLLL, c1204080hRG.LJ, c1204080hRG.LJFF, c1204080hRG.LJI, c1204080hRG.LJII, c1204080hRG.LJIIIIZZ);
    }

    public /* synthetic */ C1204080hRG(List list, Boolean bool, boolean z, Long l, Boolean bool2, String str, Integer num, boolean z2, int i) {
        this((List<? extends InterfaceC1204490hRv>) list, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num, (i & 128) != 0 ? Boolean.FALSE : null, (i & 256) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1204080hRG(List<? extends InterfaceC1204490hRv> list, Boolean bool, boolean z, Long l, Boolean bool2, String str, Integer num, Boolean bool3, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = bool;
        this.LIZJ = z;
        this.LIZLLL = l;
        this.LJ = bool2;
        this.LJFF = str;
        this.LJI = num;
        this.LJII = bool3;
        this.LJIIIIZZ = z2;
    }
}
