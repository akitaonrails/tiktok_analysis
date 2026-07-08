package X;

import android.util.Pair;
import com.ttnet.org.chromium.net.impl.d;
import com.ttnet.org.chromium.net.impl.w0;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.TTCronetRequestFinishedInfoListener;

/* JADX INFO: renamed from: X.0p4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497640p4k extends AbstractC1497300p4C {
    public final d LIZ;
    public final String LIZIZ;
    public final AbstractC1497700p4q LIZJ;
    public final Executor LIZLLL;
    public String LJ;
    public boolean LJI;
    public AbstractC1498040p5O LJIIIIZZ;
    public Executor LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public AbstractC1495350p13 LJIILJJIL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final ArrayList<Pair<String, String>> LJFF = new ArrayList<>();
    public int LJII = 3;
    public final long LJIILL = -1;

    @Override // X.AbstractC1497300p4C
    public final C1497640p4k LJI() {
        this.LJI = true;
        return this;
    }

    @Override // X.AbstractC1497300p4C
    public final w0 LJFF() {
        w0 w0VarLJJJJLI = this.LIZ.LJJJJLI(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJII, this.LJI, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL);
        String str = this.LJ;
        if (str != null) {
            w0VarLJJJJLI.LJIILLIIL(str);
        }
        for (Pair<String, String> pair : this.LJFF) {
            w0VarLJJJJLI.LJIILL((String) pair.first, (String) pair.second);
        }
        AbstractC1498040p5O abstractC1498040p5O = this.LJIIIIZZ;
        if (abstractC1498040p5O != null) {
            w0VarLJJJJLI.LJIJJLI(abstractC1498040p5O, this.LJIIIZ);
        }
        w0VarLJJJJLI.LJIJ(this.LJIILLIIL);
        w0VarLJJJJLI.LJIJI(this.LJIIZILJ);
        w0VarLJJJJLI.LJIJJ(this.LJIJ);
        w0VarLJJJJLI.LJIIZILJ(this.LJIJI);
        return w0VarLJJJJLI;
    }

    @Override // X.AbstractC1497340p4G
    public final C1497640p4k LIZ(int i) {
        this.LJIJI = i;
        return this;
    }

    @Override // X.AbstractC1497340p4G
    public final C1497640p4k LIZIZ(int i) {
        this.LJIILLIIL = i;
        return this;
    }

    @Override // X.AbstractC1497340p4G
    public final C1497640p4k LIZJ(int i) {
        this.LJIIZILJ = i;
        return this;
    }

    @Override // X.AbstractC1497340p4G
    public final C1497640p4k LIZLLL(int i) {
        this.LJIJ = i;
        return this;
    }

    @Override // X.AbstractC1497300p4C
    public final C1497640p4k LJII(String str) {
        if (str != null) {
            this.LJ = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // X.AbstractC1497300p4C
    public final C1497640p4k LJIIIIZZ(int i) {
        this.LJII = i;
        return this;
    }

    @Override // X.AbstractC1497300p4C
    public final void LJIIIZ(TTCronetRequestFinishedInfoListener tTCronetRequestFinishedInfoListener) {
        this.LJIILJJIL = tTCronetRequestFinishedInfoListener;
    }

    @Override // X.AbstractC1497300p4C
    public final void LJIIJ(int i) {
        this.LJIIJ = true;
        this.LJIIJJI = i;
    }

    @Override // X.AbstractC1497300p4C
    public final void LJIIJJI(int i) {
        this.LJIIL = true;
        this.LJIILIIL = i;
    }

    @Override // X.AbstractC1497300p4C
    public final C1497640p4k LJ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                this.LJFF.add(Pair.create(str, str2));
                if ("Accept-Encoding".equalsIgnoreCase(str)) {
                    this.LJFF.add(Pair.create(str, str2));
                }
                return this;
            }
            throw new NullPointerException("Invalid header value.");
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // X.AbstractC1497300p4C
    public final C1497640p4k LJIIL(AbstractC1498040p5O abstractC1498040p5O, ExecutorC1497250p47 executorC1497250p47) {
        if (abstractC1498040p5O != null) {
            if (executorC1497250p47 != null) {
                if (this.LJ == null) {
                    this.LJ = "POST";
                }
                this.LJIIIIZZ = abstractC1498040p5O;
                this.LJIIIZ = executorC1497250p47;
                return this;
            }
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    public C1497640p4k(String str, C1497210p43 c1497210p43, ExecutorC1497250p47 executorC1497250p47, d dVar) {
        if (str != null) {
            if (executorC1497250p47 != null) {
                if (dVar != null) {
                    this.LIZIZ = str;
                    this.LIZJ = c1497210p43;
                    this.LIZLLL = executorC1497250p47;
                    this.LIZ = dVar;
                    return;
                }
                throw new NullPointerException("CronetEngine is required.");
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }
}
