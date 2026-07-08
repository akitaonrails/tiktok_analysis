package X;

import java.util.List;

/* JADX INFO: renamed from: X.0jkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292880jkU {
    public final List<C1292560jjy> LIZ;
    public final char LIZIZ;
    public final double LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final int hashCode() {
        return (((this.LIZIZ * 31) + this.LJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public C1292880jkU(List list, char c, double d, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = c;
        this.LIZJ = d;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
