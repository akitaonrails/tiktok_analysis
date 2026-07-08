package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700540Rds extends AbstractC700550Rdt implements InterfaceC698970RbL {
    public final Function0<Rect> LJ;
    public Rect LJFF;
    public Rect LJI;
    public Rect LJII;

    @Override // X.AbstractC700550Rdt
    public final boolean LIZIZ() {
        return this.LIZ.isShown() && this.LIZ.getHeight() > 0;
    }

    @Override // X.InterfaceC698970RbL
    public final Rect LIZ() {
        Rect rect;
        Rect rectLIZJ = LIZJ();
        if (rectLIZJ == null || (rect = this.LJI) == null) {
            return null;
        }
        Rect rect2 = new Rect();
        rect2.left = rect.left + rectLIZJ.left;
        rect2.right = rect.left + rectLIZJ.right;
        rect2.top = rect.top + rectLIZJ.top;
        rect2.bottom = rect.top + rectLIZJ.bottom;
        return rect2;
    }

    @Override // X.AbstractC700550Rdt
    public final Rect LIZJ() {
        Rect rect;
        if (!LIZIZ()) {
            return null;
        }
        Rect rect2 = new Rect();
        this.LIZ.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        this.LIZIZ.getGlobalVisibleRect(rect3);
        Rect rect4 = this.LJFF;
        if (rect4 == null || !rect4.equals(rect2) || (rect = this.LJI) == null || !rect.equals(rect3)) {
            Function0<Rect> function0 = this.LJ;
            this.LJII = function0 != null ? function0.invoke() : null;
            this.LJFF = rect2;
            this.LJI = rect3;
        }
        return this.LJII;
    }

    @Override // X.AbstractC700550Rdt, android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rectLIZJ;
        if (!LIZIZ() || (rectLIZJ = LIZJ()) == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5 && actionMasked != 6) {
                            return false;
                        }
                    }
                }
                return this.LIZLLL;
            }
            boolean z = this.LIZLLL;
            this.LIZLLL = false;
            return z;
        }
        boolean zContains = rectLIZJ.contains(x, y);
        this.LIZLLL = zContains;
        return zContains;
    }

    public C700540Rds(View view, View view2, C632810Orv c632810Orv) {
        super(view, view2);
        this.LJ = c632810Orv;
    }
}
