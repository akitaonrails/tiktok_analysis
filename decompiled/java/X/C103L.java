package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.103L, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103L {
    public String LIZ;
    public C103N LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final List<? extends C104A> LJ;
    public final Map<String, ? extends Object> LJFF;

    public C103L() {
        throw null;
    }

    public C103L(String str, C103N c103n, int i, String str2, List list, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? "page" : str2;
        list = (i2 & 16) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = str;
        this.LIZIZ = c103n;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = list;
        this.LJFF = null;
    }
}
