package X;

import android.os.Debug;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0WS7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WS7 implements C0WSC {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public String LJ;
    public C0WSF LJFF;
    public C0WSF LJI;
    public final C0WS6 LIZLLL = new C0WS6();
    public final List<C0WSC> LJII = Collections.synchronizedList(new ArrayList());

    public final void LJIIIZ() {
        C0WS6 c0ws6 = this.LIZLLL;
        c0ws6.getClass();
        c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
        c0ws6.LIZJ = Debug.threadCpuTimeNanos();
    }

    @Override // X.C0WSC
    public final void stop() {
        this.LIZLLL.LIZ();
    }

    @Override // X.C0WSC
    public final boolean LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.C0WSC
    public final C0WSF LJI() {
        return this.LJFF;
    }

    @Override // X.C0WSC
    public final C0WSF LJII() {
        return this.LJI;
    }

    @Override // X.C0WSC
    public final int getLevel() {
        return this.LIZIZ;
    }

    @Override // X.C0WSC
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.C0WSC
    public final String getStatus() {
        return this.LJ;
    }

    @Override // X.C0WSC
    public final C0WS6 getTimeStamp() {
        return this.LIZLLL;
    }

    @Override // X.C0WSC
    public final void LIZ(C0WS7 c0ws7) {
        this.LJII.add(c0ws7);
    }

    @Override // X.C0WSC
    public final void LIZJ(C0WSF c0wsf) {
        this.LJI = c0wsf;
        Iterator<C0WSC> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c0wsf);
        }
    }

    @Override // X.C0WSC
    public final void LJ(C0WSF c0wsf) {
        this.LJFF = c0wsf;
    }

    @Override // X.C0WSC
    public final C0WS7 LJFF(String str) {
        C0WS7 c0ws7 = new C0WS7(str, this.LIZIZ + 1, this.LIZJ);
        c0ws7.LIZJ(this.LJI);
        c0ws7.LJIIIZ();
        this.LJII.add(c0ws7);
        return c0ws7;
    }

    public final void LJIIJ(C0WS6 c0ws6) {
        C0WS6 c0ws62 = this.LIZLLL;
        c0ws62.getClass();
        c0ws62.LIZ = c0ws6.LIZ;
        c0ws62.LIZJ = c0ws6.LIZJ;
    }

    @Override // X.C0WSC
    public final void setStatus(String str) {
        this.LJ = str;
    }

    public final C0WS7 LJIIIIZZ(String str, C0WS6 c0ws6) {
        C0WS7 c0ws7 = new C0WS7(str, this.LIZIZ + 1, this.LIZJ);
        C0WS6 c0ws62 = c0ws7.LIZLLL;
        long j = c0ws6.LIZIZ;
        long j2 = c0ws6.LIZLLL;
        c0ws62.LIZIZ = j;
        c0ws62.LIZLLL = j2;
        c0ws62.LIZ = 0L;
        c0ws62.LIZJ = 0L;
        this.LJII.add(c0ws7);
        return c0ws7;
    }

    public C0WS7(String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
    }

    @Override // X.C0WSC
    public final C0WS7 LIZIZ(long j, long j2, String str) {
        C0WS7 c0ws7 = new C0WS7(str, this.LIZIZ + 1, this.LIZJ);
        C0WS6 c0ws6 = c0ws7.LIZLLL;
        c0ws6.LIZIZ = j;
        c0ws6.LIZLLL = j2;
        c0ws6.LIZ = 0L;
        c0ws6.LIZJ = 0L;
        this.LJII.add(c0ws7);
        return c0ws7;
    }
}
