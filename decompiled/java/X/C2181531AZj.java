package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181531AZj {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;
    public Map<String, C2181761Aa6> LIZLLL;
    public double LJ;
    public C2182211Aap LJFF;
    public List<Long> LJI;
    public C2182111Aaf LJII;
    public C1AZ2 LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2181531AZj)) {
            return false;
        }
        C2181531AZj c2181531AZj = (C2181531AZj) obj;
        return Intrinsics.LJFF(this.LIZ, c2181531AZj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2181531AZj.LIZIZ) && this.LIZJ == c2181531AZj.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2181531AZj.LIZLLL) && Double.compare(this.LJ, c2181531AZj.LJ) == 0 && Intrinsics.LJFF(this.LJFF, c2181531AZj.LJFF) && Intrinsics.LJFF(this.LJI, c2181531AZj.LJI) && Intrinsics.LJFF(this.LJII, c2181531AZj.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c2181531AZj.LJIIIIZZ);
    }

    public final C2232721Ca6 LIZ() {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        Long lValueOf = Long.valueOf(this.LIZJ);
        Map<String, C2181761Aa6> map = this.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            C2181761Aa6 c2181761Aa6 = (C2181761Aa6) entry.getValue();
            c2181761Aa6.getClass();
            String str3 = c2181761Aa6.LIZ;
            Double dValueOf = Double.valueOf(c2181761Aa6.LIZIZ);
            Double dValueOf2 = Double.valueOf(c2181761Aa6.LIZJ);
            Double dValueOf3 = Double.valueOf(c2181761Aa6.LIZLLL);
            Double dValueOf4 = Double.valueOf(c2181761Aa6.LJ);
            Long lValueOf2 = Long.valueOf(c2181761Aa6.LJFF);
            Double dValueOf5 = Double.valueOf(c2181761Aa6.LJI);
            String str4 = c2181761Aa6.LJII;
            String str5 = c2181761Aa6.LJIIIIZZ;
            C1283230jUv c1283230jUv = c2181761Aa6.LJIIIZ;
            C1CW4 c1cw4LIZ = c1283230jUv != null ? c1283230jUv.LIZ() : null;
            C2182121Aag c2182121Aag = c2181761Aa6.LJIIJ;
            c2182121Aag.getClass();
            linkedHashMap.put(key, new C2232531CZn(str3, dValueOf, dValueOf2, dValueOf3, dValueOf4, lValueOf2, dValueOf5, str4, str5, c1cw4LIZ, new C2233181Caq(c2182121Aag.LIZ, c2182121Aag.LIZIZ, c2182121Aag.LIZJ, c2182121Aag.LIZLLL), c2181761Aa6.LJIIJJI, Long.valueOf(c2181761Aa6.LJIIL)));
        }
        Double dValueOf6 = Double.valueOf(this.LJ);
        C2182211Aap c2182211Aap = this.LJFF;
        c2182211Aap.getClass();
        C2232731Ca7 c2232731Ca7 = new C2232731Ca7(c2182211Aap.LIZ, Boolean.valueOf(c2182211Aap.LIZIZ));
        List<Long> list = this.LJI;
        C2182111Aaf c2182111Aaf = this.LJII;
        c2182111Aaf.getClass();
        C2233351Cb7 c2233351Cb7 = new C2233351Cb7(c2182111Aaf.LIZ, c2182111Aaf.LIZIZ, c2182111Aaf.LIZJ, c2182111Aaf.LIZLLL);
        C1AZ2 c1az2 = this.LJIIIIZZ;
        return new C2232721Ca6(str, str2, lValueOf, linkedHashMap, dValueOf6, c2232731Ca7, list, c2233351Cb7, c1az2 != null ? c1az2.LIZ() : null);
    }

    public C2181531AZj(String str, String str2, long j, Map<String, C2181761Aa6> map, double d, C2182211Aap c2182211Aap, List<Long> list, C2182111Aaf c2182111Aaf, C1AZ2 c1az2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = map;
        this.LJ = d;
        this.LJFF = c2182211Aap;
        this.LJI = list;
        this.LJII = c2182111Aaf;
        this.LJIIIIZZ = c1az2;
    }
}
