package X;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Mkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577460Mkq {
    public final int LIZ;
    public final C375830EoP<Pair<View, Boolean>> LIZIZ;
    public final C375830EoP<Unit> LIZJ;
    public final C375830EoP<AbstractC577050MkB> LIZLLL;
    public final boolean LJ;

    public C577460Mkq(int i, C375830EoP<Pair<View, Boolean>> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<AbstractC577050MkB> c375830EoP3, boolean z) {
        this.LIZ = i;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = c375830EoP3;
        this.LJ = z;
    }

    public static C577460Mkq LIZ(C577460Mkq c577460Mkq, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, boolean z, int i) {
        int i2;
        boolean z2 = z;
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        if ((i & 1) != 0) {
            i2 = c577460Mkq.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            c375830EoP6 = c577460Mkq.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP5 = c577460Mkq.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP4 = c577460Mkq.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c577460Mkq.LJ;
        }
        c577460Mkq.getClass();
        return new C577460Mkq(i2, c375830EoP6, c375830EoP5, c375830EoP4, z2);
    }
}
