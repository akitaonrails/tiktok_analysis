package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.191P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191P extends C191C {
    public static final C191O LLIZ = new C191O(new Rect());
    public Rect LLILZIL;
    public Rect LLILZLL;

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        this.LLILLL.setClipBounds(null);
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        Rect rect;
        Rect rect2 = this.LLILZIL;
        if (rect2 != null && (rect = this.LLILZLL) != null && !rect2.equals(rect)) {
            return new C191E() { // from class: X.191Q
                @Override // X.C191E
                public final void LIZIZ(float f) {
                    C19LL c19ll = C21462518z1.LIZ;
                    C191P c191p = this.LJ;
                    c19ll.set(c191p.LLILLL, C191P.LLIZ.evaluate(f, c191p.LLILZIL, c191p.LLILZLL));
                }
            };
        }
        return C191E.LIZJ;
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        Rect clipBounds;
        super.LIZ(view, view2, view3);
        Rect clipBounds2 = null;
        if (view.getVisibility() == 8) {
            clipBounds = null;
        } else {
            clipBounds = view.getClipBounds();
        }
        this.LLILZIL = clipBounds;
        if (view2.getVisibility() != 8) {
            clipBounds2 = view2.getClipBounds();
        }
        this.LLILZLL = clipBounds2;
    }
}
