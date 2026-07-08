package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1AZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZQ {
    public final C1AZO LIZ;
    public final C1AZL LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final long LJI;
    public final double LJII;
    public final List<String> LJIIIIZZ;
    public final Map<String, C1AZE> LJIIIZ;
    public final Map<String, C1AZE> LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final long LJIILL;
    public final boolean LJIILLIIL;
    public final EnumC2232491CZj LJIIZILJ;
    public final List<C1283230jUv> LJIJ;

    public final C1D0T LIZ() {
        EnumC2182911Abx enumC2182911AbxInto = this.LIZ.into();
        EnumC2182371Ab5 enumC2182371Ab5Into = this.LIZIZ.into();
        Long lValueOf = Long.valueOf(this.LIZJ);
        String str = this.LIZLLL;
        Double dValueOf = Double.valueOf(this.LJ);
        Double dValueOf2 = Double.valueOf(this.LJFF);
        Long lValueOf2 = Long.valueOf(this.LJI);
        Double dValueOf3 = Double.valueOf(this.LJII);
        List<String> list = this.LJIIIIZZ;
        Map<String, C1AZE> map = this.LJIIIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((C1AZE) entry.getValue()).LIZ());
        }
        Map<String, C1AZE> map2 = this.LJIIJ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        Iterator<T> it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(entry2.getKey(), ((C1AZE) entry2.getValue()).LIZ());
        }
        String str2 = this.LJIIJJI;
        String str3 = this.LJIIL;
        String str4 = this.LJIILIIL;
        String str5 = this.LJIILJJIL;
        Long lValueOf3 = Long.valueOf(this.LJIILL);
        Boolean boolValueOf = Boolean.valueOf(this.LJIILLIIL);
        C1CXG c1cxgInto = this.LJIIZILJ.into();
        List<C1283230jUv> list2 = this.LJIJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C1283230jUv> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList.add(it4.next().LIZ());
        }
        return new C1D0T(enumC2182911AbxInto, enumC2182371Ab5Into, 0L, lValueOf, str, dValueOf, dValueOf2, lValueOf2, dValueOf3, list, linkedHashMap, linkedHashMap2, str2, str3, str4, str5, lValueOf3, "", "", boolValueOf, c1cxgInto, arrayList);
    }

    public C1AZQ(C1AZO c1azo, C1AZL c1azl, long j, String str, double d, double d2, long j2, double d3, List list, Map map, Map map2, String str2, String str3, String str4, String str5, long j3, boolean z, EnumC2232491CZj enumC2232491CZj, List list2) {
        this.LIZ = c1azo;
        this.LIZIZ = c1azl;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = d;
        this.LJFF = d2;
        this.LJI = j2;
        this.LJII = d3;
        this.LJIIIIZZ = list;
        this.LJIIIZ = map;
        this.LJIIJ = map2;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
        this.LJIILIIL = str4;
        this.LJIILJJIL = str5;
        this.LJIILL = j3;
        this.LJIILLIIL = z;
        this.LJIIZILJ = enumC2232491CZj;
        this.LJIJ = list2;
    }
}
