package X;

import kotlin.Pair;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0pZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1516820pZg {
    public static final C1516840pZi LJIIIIZZ = new C1516840pZi();
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final Pair<C1516860pZk, C1516870pZl> LJFF;
    public C1516850pZj LJI;
    public final byte[] LJII;

    public C1516820pZg() {
        throw null;
    }

    public C1516820pZg(String str, int i, int i2, boolean z, String str2, Pair pair, boolean z2, int i3) {
        z = (i3 & 8) != 0 ? false : z;
        byte[] bArr = null;
        str2 = (i3 & 16) != 0 ? null : str2;
        pair = (i3 & 32) != 0 ? null : pair;
        z2 = (i3 & 128) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = pair;
        this.LJI = null;
        if (z2) {
            LJIIIIZZ.getClass();
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            int length = bytes.length + 2;
            bArr = new byte[length];
            bArr[0] = 34;
            System.arraycopy(bytes, 0, bArr, 1, bytes.length);
            bArr[length - 1] = 34;
        }
        this.LJII = bArr;
    }
}
