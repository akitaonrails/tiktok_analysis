package X;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595650NXv implements InterfaceC595880NYs {
    public final C595680NXy LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1805));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1804));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1803));

    @Override // X.InterfaceC595880NYs
    public final long LIZ() {
        return ((C0NXF) this.LIZIZ.getValue()).LIZ();
    }

    public final C595330NWp LIZLLL() {
        return (C595330NWp) this.LIZJ.getValue();
    }

    public C595650NXv(C595680NXy c595680NXy) {
        this.LIZ = c595680NXy;
    }

    @Override // X.InterfaceC595880NYs
    public final boolean LIZIZ(C0NXK c0nxk) {
        long j;
        if (c0nxk == null) {
            return false;
        }
        long jLIZ = LIZ();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(c0nxk.LIZJ);
        long millis2 = timeUnit.toMillis(c0nxk.LIZIZ);
        if (C595320NWo.LIZ(LIZLLL()).LJIIIIZZ && millis > millis2) {
            j = C595320NWo.LIZ(LIZLLL()).LJII;
        } else {
            millis = millis2;
            j = C595320NWo.LIZ(LIZLLL()).LJI;
        }
        if (millis > jLIZ || jLIZ > millis + j) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC595880NYs
    public final boolean LIZJ(C595660NXw c595660NXw) {
        List<C0NXK> list;
        long jLIZ = ((C0NXF) this.LIZIZ.getValue()).LIZ();
        C0NXK c0nxk = c595660NXw.LIZIZ;
        if (c0nxk != null) {
            return LJ(jLIZ, c0nxk);
        }
        List<C0NXK> list2 = c595660NXw.LIZJ;
        if (list2 != null && !list2.isEmpty() && (list = c595660NXw.LIZJ) != null && !list.isEmpty()) {
            for (C0NXK c0nxk2 : list) {
                if (!((InterfaceC595670NXx) this.LIZLLL.getValue()).LIZJ(c0nxk2.LIZ) && LJ(jLIZ, c0nxk2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean LJ(long j, C0NXK c0nxk) {
        long j2;
        if (c0nxk == null) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(c0nxk.LIZJ);
        long millis2 = timeUnit.toMillis(c0nxk.LIZIZ);
        if (C595320NWo.LIZ(LIZLLL()).LJIIIIZZ && millis > millis2) {
            j2 = C595320NWo.LIZ(LIZLLL()).LJII;
        } else {
            millis = millis2;
            j2 = C595320NWo.LIZ(LIZLLL()).LJI;
        }
        if (millis > j || j > millis + j2) {
            return false;
        }
        return true;
    }
}
