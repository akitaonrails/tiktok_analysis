package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;

/* JADX INFO: renamed from: X.12Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737112Kb extends TouchDelegate {
    public final ViewGroup LIZ;
    public View LIZIZ;

    public C19737112Kb(ViewGroup viewGroup) {
        super(new Rect(), viewGroup);
        this.LIZ = viewGroup;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object next;
        int x = (int) motionEvent.getX();
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked != 0) {
            if (actionMasked == 3) {
                this.LIZIZ = null;
            }
        } else {
            C08LX c08lx = new C08LX(new C08LY(C09RB.LJIIIZ(new C09RD(this.LIZ), AFwS273S0000000_29.get$arr$(16)), new AwS135S0101000_29(x, new Rect(), 0)));
            if (!c08lx.hasNext()) {
                next = null;
            } else {
                next = c08lx.next();
                if (c08lx.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).getFirst()).intValue();
                    do {
                        Object next2 = c08lx.next();
                        int iIntValue2 = ((Number) ((Pair) next2).getFirst()).intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (c08lx.hasNext());
                }
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                view = (View) pair.getSecond();
            }
            this.LIZIZ = view;
        }
        View view2 = this.LIZIZ;
        if (view2 != null) {
            motionEvent.offsetLocation((view2.getWidth() / 2.0f) - x, 0.0f);
            return view2.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
