package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Orr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632770Orr extends TouchDelegate {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public final View LIZJ;
    public final Function2<View, Rect, Unit> LIZLLL;
    public boolean LJ;
    public final Rect LJFF;
    public final int LJI;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (8 == this.LIZJ.getVisibility() || !this.LIZJ.isEnabled()) {
            return false;
        }
        Function2<View, Rect, Unit> function2 = this.LIZLLL;
        if (function2 != null) {
            function2.invoke(this.LIZJ, this.LIZ);
        } else {
            this.LIZJ.getHitRect(this.LIZ);
        }
        Rect rect = this.LIZ;
        int i = rect.left;
        Rect rect2 = this.LIZIZ;
        rect.left = i - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        this.LJFF.set(rect);
        Rect rect3 = this.LJFF;
        int i2 = this.LJI;
        rect3.inset(-i2, -i2);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action != 3) {
                    return false;
                }
                z2 = this.LJ;
                this.LJ = false;
                z = true;
            } else {
                z2 = this.LJ;
                if (!z2) {
                    return false;
                }
                if (!this.LJFF.contains(x, y)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (!z2) {
                return false;
            }
        } else {
            if (!this.LIZ.contains(x, y)) {
                return false;
            }
            this.LJ = true;
            z = true;
        }
        View view = this.LIZJ;
        if (z) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.LJI * 2);
            motionEvent.setLocation(f, f);
        }
        return view.dispatchTouchEvent(motionEvent);
    }

    public C632770Orr(Rect rect, View view) {
        this(new Rect(), rect, view, null);
    }

    public C632770Orr(TuxIconView tuxIconView, Rect rect, Function2 function2) {
        this(new Rect(), rect, tuxIconView, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C632770Orr(Rect rect, Rect rect2, View view, Function2<? super View, ? super Rect, Unit> function2) {
        super(rect, view);
        this.LIZ = rect;
        this.LIZIZ = rect2;
        this.LIZJ = view;
        this.LIZLLL = function2;
        this.LJFF = new Rect(rect);
        this.LJI = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
