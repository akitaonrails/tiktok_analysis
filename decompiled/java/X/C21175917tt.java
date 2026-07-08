package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.17tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21175917tt implements C0NOB {
    public final /* synthetic */ C21176317tx LIZ;
    public final /* synthetic */ C21176017tu LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C21175817ts LIZLLL;
    public final /* synthetic */ C0NOB LJ;

    @Override // X.C0NOB
    public final void LIZ(int i, String str, Map<String, ? extends Object> map) {
        this.LIZ.LJIILL = Long.valueOf(System.currentTimeMillis());
        ConcurrentHashMap<String, C21175817ts> concurrentHashMapLJIILIIL = this.LIZIZ.LJIILIIL();
        String str2 = this.LIZJ;
        C21175817ts c21175817ts = this.LIZLLL;
        concurrentHashMapLJIILIIL.put(str2, new C21175817ts(c21175817ts.LIZ, c21175817ts.LIZIZ, true));
        this.LIZ.LJIJ = Long.valueOf(System.currentTimeMillis());
        this.LJ.LIZ(i, str, map);
        this.LIZ.LJII = Integer.valueOf(i);
        C21176317tx c21176317tx = this.LIZ;
        c21176317tx.LJIIIIZZ = str;
        c21176317tx.LJIJI = Long.valueOf(System.currentTimeMillis());
        C21176317tx c21176317tx2 = this.LIZ;
        c21176317tx2.LJI = EnumC21166117sJ.NA;
        C21176117tv c21176117tv = C21176117tv.LIZ;
        EnumC21165817sG enumC21165817sG = EnumC21165817sG.METHOD;
        c21176117tv.getClass();
        C21176117tv.LIZ(c21176317tx2, enumC21165817sG);
    }

    public C21175917tt(C21176317tx c21176317tx, C21176017tu c21176017tu, String str, C21175817ts c21175817ts, C0NOB c0nob) {
        this.LIZ = c21176317tx;
        this.LIZIZ = c21176017tu;
        this.LIZJ = str;
        this.LIZLLL = c21175817ts;
        this.LJ = c0nob;
    }
}
