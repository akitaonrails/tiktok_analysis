package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1AZR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZR {
    public final C1AZO LIZ;
    public final C1AZL LIZIZ;
    public final long LIZJ;
    public final List<String> LIZLLL;
    public final Map<String, String> LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final boolean LJIIIZ;
    public final EnumC2232491CZj LJIIJ;
    public final List<C1283230jUv> LJIIJJI;
    public final List<String> LJIIL;
    public final boolean LJIILIIL;

    public final C1D0V LIZ() {
        EnumC2182911Abx enumC2182911AbxInto = this.LIZ.into();
        EnumC2182371Ab5 enumC2182371Ab5Into = this.LIZIZ.into();
        Long lValueOf = Long.valueOf(this.LIZJ);
        List<String> list = this.LIZLLL;
        Map<String, String> map = this.LJ;
        String str = this.LJFF;
        String str2 = this.LJI;
        String str3 = this.LJII;
        Long lValueOf2 = Long.valueOf(this.LJIIIIZZ);
        Boolean boolValueOf = Boolean.valueOf(this.LJIIIZ);
        C1CXG c1cxgInto = this.LJIIJ.into();
        List<C1283230jUv> list2 = this.LJIIJJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C1283230jUv> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ());
        }
        return new C1D0V(enumC2182911AbxInto, enumC2182371Ab5Into, 0L, lValueOf, list, map, str, str2, str3, lValueOf2, "", "", boolValueOf, c1cxgInto, arrayList, this.LJIIL, Boolean.valueOf(this.LJIILIIL));
    }

    public C1AZR(C1AZO c1azo, C1AZL c1azl, long j, List list, Map map, String str, String str2, String str3, long j2, boolean z, EnumC2232491CZj enumC2232491CZj, List list2, List list3, boolean z2) {
        this.LIZ = c1azo;
        this.LIZIZ = c1azl;
        this.LIZJ = j;
        this.LIZLLL = list;
        this.LJ = map;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = z;
        this.LJIIJ = enumC2232491CZj;
        this.LJIIJJI = list2;
        this.LJIIL = list3;
        this.LJIILIIL = z2;
    }
}
