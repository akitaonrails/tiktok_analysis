package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AAA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AAA {
    public final EnumC21668319r7 LIZ;
    public final List<C1AFZ> LIZIZ;
    public final C1AFY LIZJ;
    public final C1AFX LIZLLL;
    public final String LJ;
    public boolean LJFF;

    public C1AAA() {
        this(null, null, null, null, null, 63);
    }

    public C1AAA(EnumC21668319r7 enumC21668319r7, List list, C1AFY c1afy, C1AFX c1afx, String str, int i) {
        enumC21668319r7 = (i & 1) != 0 ? EnumC21668319r7.UNKNOWN : enumC21668319r7;
        list = (i & 2) != 0 ? new ArrayList() : list;
        c1afy = (i & 4) != 0 ? null : c1afy;
        c1afx = (i & 8) != 0 ? null : c1afx;
        str = (i & 16) != 0 ? null : str;
        this.LIZ = enumC21668319r7;
        this.LIZIZ = list;
        this.LIZJ = c1afy;
        this.LIZLLL = c1afx;
        this.LJ = str;
        this.LJFF = false;
    }
}
