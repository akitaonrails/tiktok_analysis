package X;

import Y.ARunnableS111S0100000_11;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Rdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700530Rdr extends AbstractC700550Rdt {
    public final Rect LJ;
    public final InterfaceC698960RbK LJFF;
    public final int[] LJI;
    public final int[] LJII;

    @Override // X.AbstractC700550Rdt
    public final Rect LIZJ() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC700550Rdt
    public final void LIZLLL(MotionEvent motionEvent) {
        View view;
        super.LIZLLL(motionEvent);
        C700410Rdf c700410Rdf = C700410Rdf.LIZ;
        C700410Rdf.LIZLLL(this.LIZ);
        C704180Rjk c704180Rjk = C704180Rjk.LIZ;
        View view2 = this.LIZ;
        c704180Rjk.getClass();
        c700410Rdf.getClass();
        for (ViewParent parent = view2.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof InterfaceC703980RjQ) {
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                    HandlerHook.viewPostDelay(view, new ARunnableS111S0100000_11(view, 153), 100L);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC700550Rdt, android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        if (!this.LIZ.isShown() || !this.LIZ.isEnabled()) {
            return false;
        }
        Rect rectLIZ = this.LJFF.LIZ();
        if (C426750GoL.LJ(this.LIZ)) {
            i = rectLIZ.right;
        } else {
            i = rectLIZ.left;
        }
        if (C426750GoL.LJ(this.LIZ)) {
            i2 = rectLIZ.left;
        } else {
            i2 = rectLIZ.right;
        }
        this.LIZIZ.getLocationInWindow(this.LJI);
        this.LIZ.getLocationInWindow(this.LJII);
        int[] iArr = this.LJII;
        int i3 = iArr[0];
        int[] iArr2 = this.LJI;
        int i4 = i3 - iArr2[0];
        int i5 = iArr[1] - iArr2[1];
        Rect rect = this.LJ;
        rect.left = i4 - i;
        rect.top = i5 - rectLIZ.top;
        rect.right = i4 + this.LIZ.getWidth() + i2;
        this.LJ.bottom = i5 + this.LIZ.getHeight() + rectLIZ.bottom;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z = this.LIZLLL;
                this.LIZLLL = false;
            } else {
                z = this.LIZLLL;
            }
            if (!z) {
                return false;
            }
        } else {
            if (!this.LJ.contains(x, y)) {
                return false;
            }
            this.LIZLLL = true;
        }
        View view = this.LIZ;
        motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        return view.dispatchTouchEvent(motionEvent);
    }

    public C700530Rdr(View view, InterfaceC698960RbK interfaceC698960RbK, View view2) {
        Rect rect = new Rect();
        super(view, view2);
        this.LJ = rect;
        this.LJFF = interfaceC698960RbK;
        this.LJI = new int[2];
        this.LJII = new int[2];
    }
}
