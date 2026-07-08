package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0noI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449000noI {
    public final Effect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public /* synthetic */ C1449000noI(Effect effect, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i3) {
        this((i3 & 1) != 0 ? null : effect, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? "other" : str, str2, str3, (String) null);
    }

    public C1449000noI(Effect effect, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        this.LIZ = effect;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = str;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
    }
}
