package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0sZ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631810sZ9 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final Map<String, String> LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1631810sZ9(String str, int i, int i2, int i3, boolean z, int i4, Map map, int i5) {
        String str2;
        int i6 = i4;
        boolean z2 = z;
        int i7 = i3;
        int i8 = i2;
        int i9 = (i5 & 2) != 0 ? 0 : i;
        i8 = (i5 & 4) != 0 ? 0 : i8;
        i7 = (i5 & 8) != 0 ? 0 : i7;
        if ((i5 & 16) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str, i9, i8, i7, str2, false, 0, (i5 & 128) != 0 ? false : z2, (i5 & 256) != 0 ? -1 : i6, (i5 & 512) == 0 ? map : null);
    }

    public C1631810sZ9(String str, int i, int i2, int i3, String str2, boolean z, int i4, boolean z2, int i5, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = i4;
        this.LJII = z2;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = map;
    }
}
