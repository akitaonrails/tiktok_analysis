package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.191F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191F extends C191C {
    public static final C19LL LLIZLLLIL = new C19LL(Rect.class, 8);
    public final boolean LLILZIL;
    public Rect LLILZLL;
    public Rect LLIZ;

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
    }

    public C191F(boolean z) {
        this.LLILZIL = z;
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        if (this.LLILZLL.equals(this.LLIZ)) {
            return C191E.LIZJ;
        }
        return new C191M(new C191N(this.LLILLL, LLIZLLLIL, new C191O(), this.LLILZLL, this.LLIZ, null));
    }

    @Override // X.C191C
    public final void LJ(View view) {
        if (this.LLILZIL && (view.getParent() instanceof ViewGroup)) {
            C214696190k.LIZ((ViewGroup) view.getParent(), false);
        }
    }

    @Override // X.C191C
    public final void LJFF(View view) {
        if (this.LLILZIL && (view.getParent() instanceof ViewGroup)) {
            C214696190k.LIZ((ViewGroup) view.getParent(), true);
        }
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        int width = view.getWidth();
        int height = view.getHeight();
        int width2 = view2.getWidth();
        int height2 = view2.getHeight();
        if (view == view3) {
            this.LLILZLL = new Rect(view.getLeft(), view.getTop(), view.getLeft() + width, view.getTop() + height);
            this.LLIZ = new Rect(view.getLeft(), view.getTop(), view.getLeft() + width2, view.getTop() + height2);
        } else {
            this.LLILZLL = new Rect(view2.getLeft(), view2.getTop(), view2.getLeft() + width, view2.getTop() + height);
            this.LLIZ = new Rect(view2.getLeft(), view2.getTop(), view2.getLeft() + width2, view2.getTop() + height2);
        }
    }
}
