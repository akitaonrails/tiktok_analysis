package X;

import Y.ARunnableS72S0200000_3;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.07wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2027907wz {
    public static final /* synthetic */ int LJFF = 0;
    public List<String> LIZIZ;
    public Map<String, C1533510q0b> LIZJ;
    public int LJ;
    public C1983007pk<String, C1533510q0b> LIZ = new C1983007pk<>();
    public final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();

    public final void LIZIZ(List<String> list) {
        this.LIZLLL.writeLock().lock();
        this.LJ++;
        List<String> list2 = this.LIZIZ;
        if (list2 == null) {
            this.LIZIZ = list;
        } else {
            list2.addAll(list);
        }
        this.LIZLLL.writeLock().unlock();
        C086F c086f = C086F.LIZ;
        ARunnableS72S0200000_3 aRunnableS72S0200000_3 = new ARunnableS72S0200000_3(this, list, 34);
        c086f.getClass();
        C086F.LIZLLL(aRunnableS72S0200000_3);
    }

    public final void LIZJ(Map<String, C1533510q0b> map) {
        this.LIZLLL.writeLock().lock();
        this.LJ++;
        Map<String, C1533510q0b> map2 = this.LIZJ;
        if (map2 == null) {
            this.LIZJ = map;
        } else {
            map2.putAll(map);
        }
        this.LIZLLL.writeLock().unlock();
        C086F c086f = C086F.LIZ;
        ARunnableS72S0200000_3 aRunnableS72S0200000_3 = new ARunnableS72S0200000_3(this, map, 33);
        c086f.getClass();
        C086F.LIZLLL(aRunnableS72S0200000_3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.07jb, X.07jb<Content>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r16, X.C1533510q0b r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2027907wz.LIZ(java.lang.String, X.0q0b, boolean):boolean");
    }
}
