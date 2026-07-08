package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0plv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524410plv {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C1502140pC0 LJ;
    public final C1524430plx LJFF;
    public final long LJI;
    public C1502060pBs LJII;
    public int LJIIIIZZ = 0;

    public C1524410plv(int i, String str, String str2, String str3, C1502140pC0 c1502140pC0, C1524430plx c1524430plx, long j) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = c1502140pC0;
        this.LJFF = c1524430plx;
        this.LJI = j;
        if (c1502140pC0 == null) {
            this.LJ = new C1502140pC0(new JSONObject(), null, 2);
        }
    }
}
