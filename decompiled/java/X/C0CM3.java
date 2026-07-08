package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CM3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CM3 {
    public C0CME LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;
    public String LJFF;
    public Function0<Unit> LJI;

    public C0CM3() {
        this.LIZ = C0CME.FIRST_VIDEO_SHOW;
        this.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        this.LJ = C0CM4.DEFAULT.getType();
        this.LJFF = "";
    }

    public C0CM3(C0CME c0cme, int i, long j, C1797720wsk c1797720wsk) {
        this.LIZ = C0CME.FIRST_VIDEO_SHOW;
        this.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        this.LJ = C0CM4.DEFAULT.getType();
        this.LIZ = c0cme;
        this.LIZIZ = true;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJFF = "";
        this.LJI = c1797720wsk;
    }

    public C0CM3(int i, C0CME c0cme, String str, Function0 function0, boolean z) {
        this.LIZ = C0CME.FIRST_VIDEO_SHOW;
        this.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        this.LJ = C0CM4.DEFAULT.getType();
        this.LIZ = c0cme;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = 0L;
        this.LJFF = str;
        this.LJI = function0;
    }

    public C0CM3(C0CME c0cme, boolean z, int i, long j, int i2, String str, C312220CLs c312220CLs) {
        this.LIZ = C0CME.FIRST_VIDEO_SHOW;
        this.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        C0CM4.DEFAULT.getType();
        this.LIZ = c0cme;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = j;
        this.LJFF = str;
        this.LJI = c312220CLs;
        this.LJ = i2;
    }
}
