package X;

import java.util.List;
import webcast.api.partnership.EsportsHighlightVideosResponse;

/* JADX INFO: renamed from: X.0zAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1885490zAJ {
    public final List<C1104220eqC> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final EsportsHighlightVideosResponse.EsportsInfo LJ;

    public C1885490zAJ() {
        this(null, false, false, false, false, null, 63);
    }

    public C1885490zAJ(List<C1104220eqC> list, boolean z, boolean z2, boolean z3, boolean z4, EsportsHighlightVideosResponse.EsportsInfo esportsInfo) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = esportsInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1885490zAJ(List list, boolean z, boolean z2, boolean z3, boolean z4, EsportsHighlightVideosResponse.EsportsInfo esportsInfo, int i) {
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        this(list, (i & 2) != 0 ? list.isEmpty() : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : esportsInfo);
    }
}
