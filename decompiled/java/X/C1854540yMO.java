package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854540yMO {
    public final EnumC1854550yMP LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<Integer> LJ;
    public final List<ConvertStyleItem> LJFF;
    public final List<TakoStandardRatio> LJI;
    public final TakoSug LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<String> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1854540yMO)) {
            return false;
        }
        C1854540yMO c1854540yMO = (C1854540yMO) obj;
        return this.LIZ == c1854540yMO.LIZ && Intrinsics.LJFF(this.LIZIZ, c1854540yMO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1854540yMO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1854540yMO.LIZLLL) && Intrinsics.LJFF(this.LJ, c1854540yMO.LJ) && Intrinsics.LJFF(this.LJFF, c1854540yMO.LJFF) && Intrinsics.LJFF(this.LJI, c1854540yMO.LJI) && Intrinsics.LJFF(this.LJII, c1854540yMO.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1854540yMO.LJIIIIZZ) && this.LJIIIZ == c1854540yMO.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1854540yMO.LJIIJ);
    }

    public C1854540yMO(EnumC1854550yMP enumC1854550yMP, String str, String str2, String str3, List list, List list2, List list3, TakoSug takoSug, String str4, List list4, int i) {
        this(enumC1854550yMP, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (List<Integer>) ((i & 16) != 0 ? null : list), (List<ConvertStyleItem>) ((i & 32) != 0 ? C13BV.INSTANCE : list2), (List<TakoStandardRatio>) ((i & 64) != 0 ? C13BV.INSTANCE : list3), (i & 128) != 0 ? null : takoSug, (i & 256) != 0 ? null : str4, false, (List<String>) ((i & 1024) == 0 ? list4 : null));
    }

    public C1854540yMO(EnumC1854550yMP enumC1854550yMP, String str, String str2, String str3, List<Integer> list, List<ConvertStyleItem> list2, List<TakoStandardRatio> list3, TakoSug takoSug, String str4, boolean z, List<String> list4) {
        this.LIZ = enumC1854550yMP;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = list3;
        this.LJII = takoSug;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = z;
        this.LJIIJ = list4;
    }
}
