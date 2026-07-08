package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857530yRD {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Message LIZLLL;
    public final Long LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1857530yRD() {
        boolean z = false;
        this(z, z, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1857530yRD)) {
            return false;
        }
        C1857530yRD c1857530yRD = (C1857530yRD) obj;
        return Intrinsics.LJFF(this.LIZ, c1857530yRD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1857530yRD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1857530yRD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1857530yRD.LIZLLL) && Intrinsics.LJFF(this.LJ, c1857530yRD.LJ) && Intrinsics.LJFF(this.LJFF, c1857530yRD.LJFF) && this.LJI == c1857530yRD.LJI && this.LJII == c1857530yRD.LJII;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1857530yRD(boolean z, boolean z2, int i) {
        String str;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(str, (i & 2) == 0 ? null : "", (i & 4) != 0 ? 0 : null, null, null, null, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z3);
    }

    public C1857530yRD(String str, String str2, Integer num, Message message, Long l, String str3, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = message;
        this.LJ = l;
        this.LJFF = str3;
        this.LJI = z;
        this.LJII = z2;
    }
}
