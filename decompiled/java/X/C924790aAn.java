package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0aAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924790aAn extends C0IMU<Integer> {
    public static C924790aAn LJIILLIIL;
    public long LIZLLL;
    public int LJ = 2;
    public LiveEffect LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public LiveEffect LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Integer] */
    public final void LJIIIIZZ() {
        this.LIZIZ = 0;
        this.LIZLLL = 0L;
        this.LJ = 2;
        this.LJFF = null;
        this.LJIIIZ = "";
        this.LJIIJ = false;
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIILIIL = null;
        this.LJIILJJIL = false;
        this.LJIILL = false;
    }

    public static C924790aAn LIZLLL() {
        if (LJIILLIIL == null) {
            LJIILLIIL = new C924790aAn();
        }
        return LJIILLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJ() {
        return ((Integer) this.LIZIZ).intValue() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJFF() {
        return ((Integer) this.LIZIZ).intValue() == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJI() {
        return ((Integer) this.LIZIZ).intValue() == 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    public C924790aAn() {
        this.LIZIZ = 0;
    }

    public final void LJII(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 2) {
            num.intValue();
            LIZIZ(num);
        }
    }

    public final void LJIIIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C924790aAn.class.getSimpleName());
        sbLIZ.append("_setCurrentTicket currentTicket:");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
        if (j > this.LIZLLL) {
            this.LIZLLL = j;
        }
    }
}
