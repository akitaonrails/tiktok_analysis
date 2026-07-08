package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

/* JADX INFO: renamed from: X.0eTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1090370eTr<T extends ViewGroup.MarginLayoutParams> extends C1090390eTt<T> {
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    @Override // X.C1090390eTt
    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return ViewGroup.MarginLayoutParams.class;
    }

    public C1090370eTr(T t) {
        super(t);
    }

    @Override // X.C1090390eTt
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(T t) {
        super.LIZIZ(t);
        this.LIZLLL = ((ViewGroup.MarginLayoutParams) t).leftMargin;
        this.LJ = ((ViewGroup.MarginLayoutParams) t).rightMargin;
        this.LJFF = ((ViewGroup.MarginLayoutParams) t).topMargin;
        this.LJI = ((ViewGroup.MarginLayoutParams) t).bottomMargin;
        this.LJII = t.getMarginStart();
        this.LJIIIIZZ = t.getMarginEnd();
        int layoutDirection = t.getLayoutDirection();
        if (layoutDirection != 0 && layoutDirection != 1) {
            layoutDirection = 0;
        }
        this.LJIIIZ = layoutDirection;
        this.LJIIJ = t.isMarginRelative();
    }

    @Override // X.C1090390eTt
    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (!super.LIZ(view, marginLayoutParams) || this.LIZLLL != marginLayoutParams.leftMargin || this.LJ != marginLayoutParams.rightMargin || this.LJFF != marginLayoutParams.topMargin || this.LJI != marginLayoutParams.bottomMargin || this.LJII != marginLayoutParams.getMarginStart() || this.LJIIIIZZ != marginLayoutParams.getMarginEnd()) {
            return false;
        }
        int i = this.LJIIIZ;
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection != 0 && layoutDirection != 1) {
            layoutDirection = 0;
        }
        if (i != layoutDirection || this.LJIIJ != marginLayoutParams.isMarginRelative()) {
            return false;
        }
        return true;
    }
}
