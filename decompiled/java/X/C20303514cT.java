package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.14cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20303514cT extends AbstractC20303614cU {
    public final String LIZ;
    public final String LIZIZ;
    public final C20303314cR LIZJ;
    public final C20303314cR LIZLLL;
    public final int LJ;
    public final int LJFF;

    @Override // X.AbstractC20303614cU
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC20303614cU
    public final String LIZIZ() {
        return this.LIZ;
    }

    public C20303514cT(String str, C20303314cR c20303314cR, C20303314cR c20303314cR2, int i, int i2) {
        String strLJJIFFI;
        if ((i2 & 2) != 0) {
            strLJJIFFI = u.LJJIFFI(str, "_light_", "_dark_", false);
        } else {
            strLJJIFFI = null;
        }
        c20303314cR = (i2 & 4) != 0 ? null : c20303314cR;
        c20303314cR2 = (i2 & 8) != 0 ? null : c20303314cR2;
        i = (i2 & 64) != 0 ? 100 : i;
        this.LIZ = str;
        this.LIZIZ = strLJJIFFI;
        this.LIZJ = c20303314cR;
        this.LIZLLL = c20303314cR2;
        this.LJ = 0;
        this.LJFF = i;
    }
}
