package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311290kEB {
    public AbstractC1311330kEF LJ;
    public C1536600q5a LJI;
    public boolean LIZ = true;
    public final List<InterfaceC1535920q4U> LIZIZ = new ArrayList();
    public final List<C1311670kEn> LIZJ = new ArrayList();
    public final Map<String, C1311220kE4> LIZLLL = new LinkedHashMap();
    public final C1311230kE5 LJFF = new C1311230kE5();
    public int LJII = 2;

    public final C1311190kE1 LIZLLL() {
        return new C1311190kE1(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII);
    }

    public C1311290kEB(Application application) {
    }

    public static void LJFF(boolean z) {
        C1202420hOa.LIZ = z;
    }

    public static void LJI(boolean z) {
        C1202420hOa.LIZIZ = z;
    }

    public final void LIZ(List<? extends C1311670kEn> list) {
        ((ArrayList) this.LIZJ).addAll(list);
    }

    public final void LIZIZ(C1535800q4I c1535800q4I) {
        ((ArrayList) this.LIZIZ).add(c1535800q4I);
    }

    public final void LIZJ(Map<String, C1311220kE4> map) {
        this.LIZLLL.putAll(map);
    }

    public final void LJ(C1311320kEE c1311320kEE) {
        this.LJ = c1311320kEE;
    }
}
