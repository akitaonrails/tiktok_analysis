package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0tPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664150tPJ {
    public final Effect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public final int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    public C1664150tPJ(Effect effect, int i, int i2) {
        boolean z;
        int i3;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i2 & 32) != 0 ? 0 : i;
        if ((i2 & 256) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i4 = (i2 & 512) == 0 ? 0 : -1;
        this.LIZ = effect;
        this.LIZIZ = z;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = 0;
        this.LJFF = i;
        this.LJI = 0;
        this.LJII = false;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = false;
    }
}
