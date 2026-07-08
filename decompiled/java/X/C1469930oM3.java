package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1469930oM3 {
    public String LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public int LJFF;
    public List<C1474520oTS> LJI;
    public boolean LJIIJ;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJJI = "";

    public final C1469920oM2 LIZIZ() {
        C1469920oM2 c1469920oM2 = new C1469920oM2();
        c1469920oM2.LIZ = this.LIZ;
        c1469920oM2.LJII = this.LJII;
        c1469920oM2.LIZIZ = this.LIZIZ;
        c1469920oM2.LJI = this.LIZJ;
        c1469920oM2.LIZJ = this.LIZLLL;
        c1469920oM2.LIZLLL = this.LJ;
        c1469920oM2.LJFF = this.LJFF;
        if (this.LJI == null) {
            this.LJI = new ArrayList();
        }
        c1469920oM2.LJ = this.LJI;
        c1469920oM2.LJIIIIZZ = this.LJIIIIZZ;
        c1469920oM2.LJIIIZ = this.LJIIIZ;
        if (C1474810oTv.LLJL()) {
            c1469920oM2.LJIIJ = this.LJIIJ;
        }
        c1469920oM2.LJIIJJI = this.LJIIJJI;
        return c1469920oM2;
    }

    public final void LIZ(C1474540oTU c1474540oTU) {
        if (this.LJI == null) {
            this.LJI = new ArrayList();
        }
        ((ArrayList) this.LJI).add(c1474540oTU);
    }

    public final void LIZJ(String str) {
        this.LIZ = str;
        if (TextUtils.isEmpty(this.LJII)) {
            this.LJII = str;
        }
    }
}
