package X;

import java.util.List;

/* JADX INFO: renamed from: X.101l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191791101l {
    public final String LIZ;
    public final List<C191795101p> LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C191791101l(String str, int i) {
        C13BV c13bv;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(str, c13bv);
    }

    public C191791101l(String str, List<C191795101p> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
