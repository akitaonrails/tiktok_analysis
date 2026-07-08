package X;

import java.security.SecureRandom;
import java.util.Map;

/* JADX INFO: renamed from: X.0fDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1118700fDY implements InterfaceC1113260f4m {
    public final double LIZ;
    public final C1118740fDc LIZIZ = new C1118740fDc();
    public float LIZJ;
    public int LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC1113260f4m
    public final void start() {
        this.LJ = new SecureRandom().nextDouble() > this.LIZ;
    }

    public AbstractC1118700fDY(double d) {
        this.LIZ = d;
    }

    @Override // X.InterfaceC1113260f4m
    public final void LIZ(Map<String, String> map) {
        float f;
        if (this.LJ) {
            return;
        }
        C1118740fDc c1118740fDc = this.LIZIZ;
        float f2 = this.LIZJ;
        if (f2 == 0.0f) {
            f = 0.0f;
        } else {
            f = this.LIZLLL / f2;
        }
        c1118740fDc.LIZ = f;
        LIZIZ(map);
        this.LIZLLL = 0;
        this.LIZJ = 0.0f;
        C1118740fDc c1118740fDc2 = this.LIZIZ;
        c1118740fDc2.LIZ = 0.0f;
        c1118740fDc2.LIZIZ = 0;
        c1118740fDc2.LIZJ = Integer.MAX_VALUE;
        this.LJ = false;
    }

    public final void LIZJ(int i) {
        if (this.LJ) {
            return;
        }
        this.LIZJ += 1.0f;
        this.LIZLLL += i;
        C1118740fDc c1118740fDc = this.LIZIZ;
        c1118740fDc.LIZJ = Math.min(i, c1118740fDc.LIZJ);
        C1118740fDc c1118740fDc2 = this.LIZIZ;
        c1118740fDc2.LIZIZ = Math.max(i, c1118740fDc2.LIZIZ);
    }
}
