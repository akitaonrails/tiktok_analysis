package X;

import java.util.List;

/* JADX INFO: renamed from: X.0wgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789940wgC {
    public final long LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final String LJFF;

    public C1789940wgC(long j, String str, List list, String str2, long j2, int i) {
        String str3;
        list = (i & 4) != 0 ? C13BV.INSTANCE : list;
        str2 = (i & 8) != 0 ? "" : str2;
        j2 = (i & 16) != 0 ? 0L : j2;
        if ((i & 32) != 0) {
            str3 = "subs";
        } else {
            str3 = null;
        }
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = j2;
        this.LJFF = str3;
    }
}
