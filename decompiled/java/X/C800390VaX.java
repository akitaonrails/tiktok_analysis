package X;

import java.util.List;

/* JADX INFO: renamed from: X.0VaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800390VaX {
    public boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC800410VaZ LJ;
    public final InterfaceC800420Vaa LJFF;
    public final String LJI;
    public List<? extends C0VYZ> LJII;

    public C800390VaX() {
        this(false, false, false, false, null, null, null, 255);
    }

    public C800390VaX(boolean z, boolean z2, boolean z3, boolean z4, C0WOS c0wos, String str, List list, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? true : z3;
        z4 = (i & 8) != 0 ? true : z4;
        c0wos = (i & 16) != 0 ? null : c0wos;
        str = (i & 64) != 0 ? null : str;
        list = (i & 128) != 0 ? null : list;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = c0wos;
        this.LJFF = null;
        this.LJI = str;
        this.LJII = list;
    }
}
