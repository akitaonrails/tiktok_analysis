package X;

import java.util.List;

/* JADX INFO: renamed from: X.0rcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595260rcC<T extends List<? extends InterfaceC1891350zJl>> {
    public EnumC1595320rcI LIZ;
    public final T LIZIZ;
    public String LIZJ;
    public Exception LIZLLL;
    public Boolean LJ;
    public int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public int LJIIIIZZ;

    public C1595260rcC() {
        throw null;
    }

    public final AbstractC316870CbV<String> LIZ() {
        int i = C1595310rcH.LIZ[this.LIZ.ordinal()];
        if (i == 1) {
            return new C323380Cm0(null, this.LIZJ, this.LIZIZ);
        }
        if (i == 2) {
            return new C316640Cb8(this.LIZIZ);
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        Exception exc = this.LIZLLL;
        if (exc == null) {
            exc = new Exception("req sky light data failed");
        }
        return new C316650Cb9(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1595260rcC(EnumC1595320rcI enumC1595320rcI, List list, String str, Exception exc, Boolean bool, int i, boolean z, boolean z2, int i2, int i3) {
        bool = (i3 & 16) != 0 ? null : bool;
        i = (i3 & 32) != 0 ? 0 : i;
        z = (i3 & 64) != 0 ? false : z;
        z2 = (i3 & 128) != 0 ? false : z2;
        i2 = (i3 & 256) != 0 ? 0 : i2;
        this.LIZ = enumC1595320rcI;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = exc;
        this.LJ = bool;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = i2;
    }
}
