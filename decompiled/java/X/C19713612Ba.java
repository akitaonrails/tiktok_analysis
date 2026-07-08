package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713612Ba extends TouchDelegate {
    public final int LIZ;
    public final int LIZIZ;
    public final ViewGroup LIZJ;
    public final View LIZLLL;
    public final Rect LJ;
    public boolean LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    public final Rect LIZ() {
        return (Rect) this.LJI.getValue();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        if (!this.LIZLLL.isShown() || !this.LIZLLL.isEnabled()) {
            return false;
        }
        ViewGroup viewGroup = this.LIZJ;
        View view = this.LIZLLL;
        Rect rectLIZ = LIZ();
        rectLIZ.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal = C1292470jjp.LIZ;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        C1292470jjp.LIZ(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = C1292470jjp.LIZIZ;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rectLIZ);
        matrix.mapRect(rectF);
        rectLIZ.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
        Rect rectLIZ2 = LIZ();
        int i3 = this.LIZ;
        int i4 = this.LIZIZ;
        int i5 = rectLIZ2.right;
        int i6 = rectLIZ2.left;
        int i7 = i5 - i6;
        int i8 = rectLIZ2.bottom;
        int i9 = rectLIZ2.top;
        int i10 = i8 - i9;
        if (i7 < i3) {
            i = i3 - i7;
        } else {
            i = 0;
        }
        if (i10 < i4) {
            i2 = i4 - i10;
        } else {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            Rect rect = this.LJ;
            if (rect == null) {
                int i11 = i / 2;
                rectLIZ2.left = i6 - i11;
                int i12 = i2 / 2;
                rectLIZ2.top = i9 - i12;
                rectLIZ2.right = i5 + i11;
                rectLIZ2.bottom = i8 + i12;
            } else {
                rectLIZ2.left = i6 - rect.left;
                rectLIZ2.top = i9 - rect.top;
                rectLIZ2.right = i5 + rect.right;
                rectLIZ2.bottom = i8 + rect.bottom;
            }
        }
        ((Rect) this.LJII.getValue()).set(LIZ());
        ((Rect) this.LJII.getValue()).inset(-((Number) this.LJIIIIZZ.getValue()).intValue(), -((Number) this.LJIIIIZZ.getValue()).intValue());
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z = this.LJFF;
                this.LJFF = false;
                z2 = true;
            } else {
                z = this.LJFF;
                if (!z) {
                    return false;
                }
                if (!((Rect) this.LJII.getValue()).contains(x, y)) {
                    z2 = false;
                }
            }
            if (!z) {
                return false;
            }
        } else {
            Rect rectLIZ3 = LIZ();
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bounds: ");
            sbLIZ.append(LIZ());
            sbLIZ.append(", event: ");
            sbLIZ.append(motionEvent);
            interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
            if (!rectLIZ3.contains(x, y)) {
                return false;
            }
            this.LJFF = true;
            z2 = true;
        }
        View view2 = this.LIZLLL;
        if (z2) {
            motionEvent.setLocation(view2.getWidth() / 2.0f, view2.getHeight() / 2.0f);
        } else {
            float f = -(((Number) this.LJIIIIZZ.getValue()).intValue() * 2);
            motionEvent.setLocation(f, f);
        }
        return view2.dispatchTouchEvent(motionEvent);
    }

    public C19713612Ba(int i, int i2, Rect rect, View view, ViewGroup viewGroup) {
        super(new Rect(), view);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = viewGroup;
        this.LIZLLL = view;
        this.LJ = rect;
        this.LJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(435));
        this.LJII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1058));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1057));
    }
}
