package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607310rvd implements InterfaceC426680GoE {
    public final EnumC1606090rtf LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final C0ZE7 LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final InterfaceC897330ZId LJII;

    public C1607310rvd() {
        this(null, null, false, false, null, 255);
    }

    public C1607310rvd(EnumC1606090rtf enumC1606090rtf, C0ZE7 c0ze7, boolean z, boolean z2, InterfaceC897330ZId interfaceC897330ZId, int i) {
        int i2;
        int i3;
        enumC1606090rtf = (i & 1) != 0 ? null : enumC1606090rtf;
        if ((i & 2) != 0) {
            i2 = R.color.ei;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = R.attr.a1p;
        } else {
            i3 = 0;
        }
        c0ze7 = (i & 16) != 0 ? null : c0ze7;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        interfaceC897330ZId = (i & 128) != 0 ? null : interfaceC897330ZId;
        this.LIZ = enumC1606090rtf;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = false;
        this.LJ = c0ze7;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = interfaceC897330ZId;
    }
}
