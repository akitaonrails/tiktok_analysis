package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0t8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653860t8i {
    public final C1647120sxq LIZ;
    public final C2252321DDq LIZIZ;
    public final AnonymousClass0951 LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public final C2252321DDq LJ;
    public final AnonymousClass0951 LJFF;
    public final AnonymousClass0951 LJI;
    public final List<Integer> LJII;

    public C1653860t8i(C1647120sxq c1647120sxq) {
        this.LIZ = c1647120sxq;
        c1647120sxq.LIZ.LIZ.getClass();
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZIZ = c2252321DDqLIZ;
        AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LIZJ = anonymousClass0951LIZIZ;
        C1698260uIK c1698260uIK = new C1698260uIK(anonymousClass0951LIZIZ, this, 13);
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(c1dfh);
        C05YW.LIZ.getClass();
        C05YZ c05yz = C1370905Yd.LIZIZ;
        this.LIZLLL = C09IC.LJJIJIL(c1698260uIK, c054gLIZ, c05yz, c1647120sxq.LIZ.LIZ.LIZJ.getValue());
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(Integer.valueOf(((C1654080t94) c1647120sxq.LIZ.LIZ.LIZJ.getValue()).LIZ));
        this.LJ = c2252321DDqLIZ2;
        AnonymousClass0951 anonymousClass0951LIZIZ2 = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LJFF = anonymousClass0951LIZIZ2;
        this.LJI = C09IC.LJJIJIL(new C414301jJ(anonymousClass0951LIZIZ, anonymousClass0951LIZIZ2, new C1653840t8g(this, null)), C2296808zG.LIZ(c1dfh), c05yz, ((C1657380tEO) ((C1654080t94) c1647120sxq.LIZ.LIZ.LIZJ.getValue()).LJ.getValue()).LIZIZ);
        C09IC.LIZIZ(C1BNE.LIZ(Integer.valueOf(((Number) c1647120sxq.LIZ.LIZ.LIZIZ.getValue()).intValue())));
        List<C1654080t94> list = c1647120sxq.LIZ.LIZ.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1654080t94> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().LIZJ.size()));
        }
        this.LJII = arrayList;
    }
}
