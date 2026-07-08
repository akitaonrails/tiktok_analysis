package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0a4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920810a4N {
    public final C920820a4O LIZ;
    public final C967180bHA LIZIZ;
    public final EnumC919140a1g LIZJ;
    public final List<C918740a12> LIZLLL;
    public final Map<String, String> LJ;
    public final long LJFF;
    public final long LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final boolean LJIIIZ;
    public final List<Long> LJIIJ;

    public final C2235851Cf9 LIZ() {
        C920820a4O c920820a4O = this.LIZ;
        C1CEH c1cehLIZ = c920820a4O != null ? c920820a4O.LIZ() : null;
        C967180bHA c967180bHA = this.LIZIZ;
        C2232021CXo c2232021CXoLIZ = c967180bHA != null ? c967180bHA.LIZ() : null;
        EnumC2232111CXx enumC2232111CXxInto = this.LIZJ.into();
        List<C918740a12> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C918740a12 c918740a12 : list) {
            c918740a12.getClass();
            C2232021CXo c2232021CXoLIZ2 = c918740a12.LIZ.LIZ();
            C920820a4O c920820a4O2 = c918740a12.LIZIZ;
            arrayList.add(new C2227361CFq(c2232021CXoLIZ2, c920820a4O2 != null ? c920820a4O2.LIZ() : null));
        }
        return new C2235851Cf9("", c1cehLIZ, c2232021CXoLIZ, enumC2232111CXxInto, arrayList, this.LJ, Long.valueOf(this.LJFF), Long.valueOf(this.LJI), this.LJII, Long.valueOf(this.LJIIIIZZ), Boolean.valueOf(this.LJIIIZ), this.LJIIJ);
    }

    public C920810a4N(C920820a4O c920820a4O, C967180bHA c967180bHA, EnumC919140a1g enumC919140a1g, List list, Map map, long j, long j2, String str, long j3, boolean z, List list2) {
        this.LIZ = c920820a4O;
        this.LIZIZ = c967180bHA;
        this.LIZJ = enumC919140a1g;
        this.LIZLLL = list;
        this.LJ = map;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = str;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = z;
        this.LJIIJ = list2;
    }
}
