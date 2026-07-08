package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.19EW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EW {
    public int LIZ;
    public Fragment LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public Lifecycle.State LJII;
    public Lifecycle.State LJIIIIZZ;

    public C19EW() {
    }

    public C19EW(Fragment fragment, Lifecycle.State state) {
        this.LIZ = 10;
        this.LIZIZ = fragment;
        this.LJII = fragment.mMaxState;
        this.LJIIIIZZ = state;
    }

    public C19EW(int i, Fragment fragment) {
        this.LIZ = i;
        this.LIZIZ = fragment;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.LJII = state;
        this.LJIIIIZZ = state;
    }

    public C19EW(int i, Fragment fragment, int i2) {
        this.LIZ = i;
        this.LIZIZ = fragment;
        this.LIZJ = true;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.LJII = state;
        this.LJIIIIZZ = state;
    }
}
