package X;

import com.tencent.wcdb.database.SQLiteCustomFunction;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Zk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908220Zk4 {
    public final String LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public Locale LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final ArrayList<SQLiteCustomFunction> LJIIJJI = new ArrayList<>();

    public C908220Zk4(C908220Zk4 c908220Zk4) {
        if (c908220Zk4 != null) {
            this.LIZ = c908220Zk4.LIZ;
            this.LIZIZ = c908220Zk4.LIZIZ;
            LIZ(c908220Zk4);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public final void LIZ(C908220Zk4 c908220Zk4) {
        if (c908220Zk4 != null) {
            if (this.LIZ.equals(c908220Zk4.LIZ)) {
                this.LIZLLL = c908220Zk4.LIZLLL;
                this.LJ = c908220Zk4.LJ;
                this.LJFF = c908220Zk4.LJFF;
                this.LJI = c908220Zk4.LJI;
                this.LJII = c908220Zk4.LJII;
                this.LJIIIZ = c908220Zk4.LJIIIZ;
                this.LJIIJ = c908220Zk4.LJIIJ;
                this.LJIIIIZZ = c908220Zk4.LJIIIIZZ;
                this.LIZJ = c908220Zk4.LIZJ;
                this.LJIIJJI.clear();
                this.LJIIJJI.addAll(c908220Zk4.LJIIJJI);
                return;
            }
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        throw new IllegalArgumentException("other must not be null.");
    }

    public C908220Zk4(String str, int i) {
        String str2;
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = str;
            this.LIZLLL = i;
            this.LJIIIIZZ = 2;
            this.LJ = 25;
            this.LJFF = Locale.getDefault();
            if ((i & 256) != 0) {
                str2 = "vfslog";
            } else {
                str2 = null;
            }
            this.LIZJ = str2;
            return;
        }
        throw new IllegalArgumentException("path must not be null.");
    }
}
