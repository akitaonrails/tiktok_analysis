package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.048v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10503048v extends LinearLayout {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final float LLIZ = C418440Gaw.LIZIZ(200);
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final LinkedList<View> LLILLL;
    public int LLILZ;
    public boolean LLILZIL;

    public C10503048v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean LIZIZ() {
        return C1757010vp5.LIZ(this.LL) || C1757010vp5.LIZ(this.LLILLJJLI);
    }

    public final boolean getSupportClickWhenDisable() {
        return this.LLILZIL;
    }

    public final void LIZLLL(int i) {
        if (i != this.LLILZ) {
            this.LLILZ = i;
            setBackground(C10504048w.LIZ(i, getContext()));
            C427690Gpr.LJ(this, LLIZ);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    public final void setSupportClickWhenDisable(boolean z) {
        this.LLILZIL = z;
    }

    public final void LIZJ(C10501048t c10501048t, String str) {
        boolean z;
        LinearLayout linearLayout = this.LL;
        LinkedList<View> linkedList = this.LLILLL;
        while (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt, linearLayout);
            if (childAt instanceof View) {
                linkedList.add(childAt);
            }
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        LinkedList<View> linkedList2 = this.LLILLL;
        while (linearLayout2.getChildCount() > 0) {
            View childAt2 = linearLayout2.getChildAt(0);
            C786410Ut5.LJJJLZIJ(childAt2, linearLayout2);
            if (childAt2 instanceof View) {
                linkedList2.add(childAt2);
            }
        }
        if (c10501048t.LIZ.size() == 1 && c10501048t.LIZIZ.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        Iterator<AbstractC10502048u> it2 = c10501048t.LIZ.iterator();
        while (it2.hasNext()) {
            this.LL.addView(LIZ(it2.next(), z, false, str));
        }
        Iterator<AbstractC10502048u> it3 = c10501048t.LIZIZ.iterator();
        while (it3.hasNext()) {
            this.LLILLJJLI.addView(LIZ(it3.next(), false, true, str));
        }
    }

    public C10503048v(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLL = new LinkedList<>();
        int i2 = LLILZLL;
        setPadding(i2, 0, i2, 0);
        setOrientation(1);
        setGravity(17);
        LIZLLL(C04CU.LIZ());
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.LL = linearLayout;
        addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.LLILLJJLI = linearLayout2;
        addView(linearLayout2);
    }

    public final View LIZ(AbstractC10502048u abstractC10502048u, boolean z, boolean z2, String str) {
        View next;
        String str2;
        C10497048p c10497048p;
        View next2;
        int i = C10499048r.LIZ[abstractC10502048u.LIZ.ordinal()];
        String str3 = null;
        if (i != 1) {
            if (i == 2) {
                Iterator<View> it2 = this.LLILLL.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (next2 instanceof C049U) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                View view = next2;
                if (view != null) {
                    this.LLILLL.remove(view);
                }
                if (!(view instanceof C049U) || view == null) {
                    return new C049U(getContext());
                }
                return view;
            }
            throw new C1954807lC();
        }
        Iterator<View> it3 = this.LLILLL.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (next instanceof C10505048x) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        View view2 = next;
        if (view2 != null) {
            this.LLILLL.remove(view2);
        }
        if (!(view2 instanceof C10505048x)) {
            view2 = null;
        }
        C10505048x c10505048x = (C10505048x) view2;
        if (c10505048x == null) {
            c10505048x = new C10505048x(getContext());
        }
        c10505048x.LJJJJJ(null, null, z2, z);
        if ((abstractC10502048u instanceof C10497048p) && (c10497048p = (C10497048p) abstractC10502048u) != null) {
            str3 = c10497048p.LIZIZ;
        }
        c10505048x.setText(str3);
        if (z2) {
            str2 = "buy_button_sub_desc";
        } else {
            str2 = "buy_button_desc";
        }
        C1757010vp5.LIZJ(c10505048x, str, str2);
        return c10505048x;
    }
}
