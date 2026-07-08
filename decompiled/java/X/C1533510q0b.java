package X;

import com.bytedance.forest.model.GeckoSource;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533510q0b {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public GeckoSource LJIIIIZZ;

    public final boolean LIZ() {
        return a0.LJJJIL(this.LIZIZ) || a0.LJJJIL(this.LIZJ);
    }

    public final String toString() {
        return C1533500q0a.LIZ(C1533500q0a.LIZIZ(this));
    }

    public C1533510q0b(String str, String str2, String str3) {
        GeckoSource geckoSource = GeckoSource.CLIENT_CONFIG;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = true;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = geckoSource;
    }
}
