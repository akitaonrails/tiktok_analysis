package X;

import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0ay1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955310ay1 {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Map<String, C957780b20> LIZLLL;
    public final double LJ;
    public final List<Long> LJFF;
    public final C942140acm LJI;
    public C955220axs LJII;
    public final MultiGuestLayoutExtra LJIIIIZZ;
    public final String LJIIIZ;
    public final MultiGuestLayoutNonSeiExtra LJIIJ;
    public final String LJIIJJI;

    public final String toString() {
        return "ExternalWillStartLinkMicLayoutModel(layoutId=" + this.LIZ + ", layoutKey=" + this.LIZIZ + ", dslVersion=" + this.LIZJ + ", windows=" + this.LIZLLL + ", ratio=" + this.LJ + ", consumerList=" + this.LJFF + ", linkLayoutContainer=" + this.LJI + ", customInsets=" + this.LJII + ", multiGuestLayoutExtra=" + this.LJIIIIZZ + ", cohostLayoutExtra=" + this.LJIIIZ + ", multiGuestLayoutNonSeiExtra=" + this.LJIIJ + ", cohostLayoutNonSeiExtra=" + this.LJIIJJI + ')';
    }

    public C955310ay1(String str, String str2, long j, Map<String, C957780b20> map, double d, List<Long> list, C942140acm c942140acm, C955220axs c955220axs, MultiGuestLayoutExtra multiGuestLayoutExtra, String str3, MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = map;
        this.LJ = d;
        this.LJFF = list;
        this.LJI = c942140acm;
        this.LJII = c955220axs;
        this.LJIIIIZZ = multiGuestLayoutExtra;
        this.LJIIIZ = str3;
        this.LJIIJ = multiGuestLayoutNonSeiExtra;
        this.LJIIJJI = str4;
    }
}
