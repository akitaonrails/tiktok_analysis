package X;

import java.util.List;

/* JADX INFO: renamed from: X.0sBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617170sBX {
    public final String LIZ;
    public List<String> LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1617170sBX(String str, String str2, int i) {
        C13BV c13bv;
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(str, c13bv, (i & 4) != 0 ? "inapp" : str2);
    }

    public C1617170sBX(String str, List<String> list, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
    }
}
