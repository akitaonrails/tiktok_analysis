package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.06us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1760006us {
    public final InterfaceC1631620sYq<String, String, String, String> LIZ;
    public final InterfaceC1685420txc<String, String, String, String, String, Unit> LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC1631620sYq<String, String, Boolean, Unit> LIZLLL;
    public final InterfaceC1631630sYr<String, String, C163T, Integer, Unit> LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C1760006us() {
        this(null, null, false, null, null, 127);
    }

    public C1760006us(C1759706up c1759706up, C1759506un c1759506un, boolean z, C1759906ur c1759906ur, C1760306uv c1760306uv, int i) {
        boolean z2;
        c1759706up = (i & 1) != 0 ? null : c1759706up;
        c1759506un = (i & 2) != 0 ? null : c1759506un;
        z = (i & 4) != 0 ? false : z;
        c1759906ur = (i & 8) != 0 ? null : c1759906ur;
        c1760306uv = (i & 16) != 0 ? null : c1760306uv;
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZ = c1759706up;
        this.LIZIZ = c1759506un;
        this.LIZJ = z;
        this.LIZLLL = c1759906ur;
        this.LJ = c1760306uv;
        this.LJFF = z2;
        this.LJI = false;
    }
}
