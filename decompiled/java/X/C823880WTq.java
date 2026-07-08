package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0WTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823880WTq {
    public static final C0WSV[] LJIIIIZZ = new C0WSV[0];
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public String[] LJFF;
    public C0WSV[] LJI = LJIIIIZZ;
    public final String LJII;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ), this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C823880WTq.class != obj.getClass()) {
            return false;
        }
        C823880WTq c823880WTq = (C823880WTq) obj;
        if (this.LIZ == c823880WTq.LIZ && Objects.equals(this.LIZIZ, c823880WTq.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C823880WTq(int i, String str, String str2, String str3, String[] strArr, String[] strArr2, String str4) {
        this.LIZ = -1;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = strArr;
        this.LJFF = strArr2;
        this.LJII = str4;
    }
}
