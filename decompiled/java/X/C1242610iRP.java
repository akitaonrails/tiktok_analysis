package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0iRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242610iRP {
    public static final /* synthetic */ int LJII = 0;
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public C1242610iRP() {
        this(false, 8191);
    }

    public C1242610iRP(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & 1) != 0) {
            new Pair(-1, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240))));
        }
        if ((i & 2) != 0) {
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        z = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            i2 = 2131836227;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = 2131836230;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            if (C0ZHF.LIZ()) {
                i4 = 2131835444;
            } else {
                i4 = 2131836226;
            }
        } else {
            i4 = 0;
        }
        int i6 = (i & 128) == 0 ? 0 : 2131836226;
        if ((i & 256) != 0) {
            if (C0ZHF.LIZ()) {
                i5 = 2131847900;
            } else {
                i5 = 2131836229;
            }
        } else {
            i5 = 0;
        }
        int i7 = (i & 512) != 0 ? 2131836229 : 0;
        if ((i & 1024) != 0) {
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        this.LIZ = z;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i6;
        this.LJFF = i5;
        this.LJI = i7;
    }
}
