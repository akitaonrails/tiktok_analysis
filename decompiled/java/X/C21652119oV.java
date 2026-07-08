package X;

import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.19oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21652119oV {
    public final long LIZ = 300;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final Pair<Integer, Integer> LJII;
    public final Pair<Integer, Integer> LJIIIIZZ;
    public final Pair<Integer, Integer> LJIIIZ;
    public final Pair<Integer, Integer> LJIIJ;
    public final Pair<Integer, Integer> LJIIJJI;
    public final Pair<Integer, Integer> LJIIL;
    public boolean LJIILIIL;

    public C21652119oV(View view, View view2, View view3) {
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = view3;
        this.LJ = view.getWidth();
        this.LJFF = view2.getWidth();
        this.LJI = this.LIZLLL.getRight() - this.LIZJ.getRight();
        this.LJII = new Pair<>(Integer.valueOf(view.getLeft()), Integer.valueOf(view.getTop()));
        this.LJIIIIZZ = new Pair<>(Integer.valueOf(view2.getLeft()), Integer.valueOf(view2.getTop()));
        this.LJIIIZ = new Pair<>(Integer.valueOf(view3.getLeft()), Integer.valueOf(view3.getTop()));
        this.LJIIJ = new Pair<>(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        this.LJIIJJI = new Pair<>(Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()));
        this.LJIIL = new Pair<>(Integer.valueOf(view3.getWidth()), Integer.valueOf(view3.getHeight()));
    }
}
