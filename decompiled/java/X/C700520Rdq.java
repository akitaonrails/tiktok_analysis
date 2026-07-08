package X;

import Y.ARunnableS111S0100000_11;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: renamed from: X.0Rdq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700520Rdq extends AbstractC700550Rdt implements InterfaceC698970RbL {
    public final Function0<Rect> LJ;
    public Rect LJFF;
    public Rect LJI;
    public Rect LJII;

    @Override // X.AbstractC700550Rdt
    public final Rect LIZJ() {
        Rect rect;
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
    public final void LIZLLL(MotionEvent motionEvent) {
        super.LIZLLL(motionEvent);
        C20684815ws.LJFF().submit(new ARunnableS111S0100000_11(this, 78));
    }

    public C700520Rdq(View view, View view2, AwS410S0200000_9 awS410S0200000_9) {
        super(view, view2);
        this.LJ = awS410S0200000_9;
    }
}
