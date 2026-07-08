package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636520sgk {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final Function1<? super ViewGroup, ? extends View> LIZLLL;
    public final Function1<? super ViewGroup, ? extends View> LJ;
    public final Function1<? super ViewGroup, ? extends View> LJFF;
    public final Function1<? super ViewGroup, ? extends Pair<? extends View, ? extends View>> LJI;
    public final C1641120soA LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final Function1<? super ViewGroup, ? extends View> LJIIJJI;
    public final Function1<? super ViewGroup, ? extends View> LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final RecyclerView.RecycledViewPool LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final float LJJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1636520sgk(int i, Function1 function1, C1641120soA c1641120soA, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, float f, int i2) {
        int i3;
        float f2;
        boolean z8 = z7;
        boolean z9 = z5;
        boolean z10 = z4;
        boolean z11 = z;
        boolean z12 = z6;
        C1641120soA c1641120soA2 = c1641120soA;
        Function1 function12 = function1;
        boolean z13 = z2;
        float f3 = f;
        boolean z14 = z3;
        int i4 = (i2 & 1) != 0 ? 4 : i;
        if ((i2 & 2) != 0) {
            i3 = 5;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        this(i4, i3, f2, null, null, null, (i2 & 64) != 0 ? null : function12, (i2 & 128) != 0 ? new C1641120soA(0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, -1) : c1641120soA2, false, (i2 & 512) != 0 ? false : z11, (i2 & 1024) != 0 ? true : z13, null, null, false, false, false, false, (131072 & i2) != 0 ? false : z14, (262144 & i2) != 0 ? false : z10, (524288 & i2) != 0 ? new RecyclerView.RecycledViewPool() : null, (1048576 & i2) != 0 ? false : z9, (2097152 & i2) != 0 ? false : z12, (4194304 & i2) != 0 ? false : z8, (i2 & 8388608) != 0 ? 0.0f : f3);
    }

    public C1636520sgk(int i, int i2, float f, Function1<? super ViewGroup, ? extends View> function1, Function1<? super ViewGroup, ? extends View> function12, Function1<? super ViewGroup, ? extends View> function13, Function1<? super ViewGroup, ? extends Pair<? extends View, ? extends View>> function14, C1641120soA c1641120soA, boolean z, boolean z2, boolean z3, Function1<? super ViewGroup, ? extends View> function15, Function1<? super ViewGroup, ? extends View> function16, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, RecyclerView.RecycledViewPool recycledViewPool, boolean z10, boolean z11, boolean z12, float f2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJFF = function13;
        this.LJI = function14;
        this.LJII = c1641120soA;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = function15;
        this.LJIIL = function16;
        this.LJIILIIL = z4;
        this.LJIILJJIL = z5;
        this.LJIILL = z6;
        this.LJIILLIIL = z7;
        this.LJIIZILJ = z8;
        this.LJIJ = z9;
        this.LJIJI = recycledViewPool;
        this.LJIJJ = z10;
        this.LJIJJLI = z11;
        this.LJIL = z12;
        this.LJJ = f2;
    }
}
