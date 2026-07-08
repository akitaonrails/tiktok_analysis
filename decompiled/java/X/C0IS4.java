package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0IS4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IS4 extends C0IKU<Integer> {
    public final int LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0IS4(int i, int i2, Map map, Map map2, boolean z, int i3) {
        map2 = (i3 & 16) != 0 ? null : map2;
        z = (i3 & 32) != 0 ? false : z;
        super(Integer.valueOf(i), map, map2);
        this.LIZLLL = i2;
        this.LJ = z;
    }
}
