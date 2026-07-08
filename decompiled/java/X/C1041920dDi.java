package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041920dDi extends LinearLayout {
    public Space LL;
    public int LLILLJJLI;
    public C1041540dD6 LLILLL;
    public boolean LLILZ;
    public int LLILZIL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Space space = (Space) findViewById(R.id.p1c);
        this.LL = space;
        if (space == null) {
            space = null;
        }
        C786410Ut5.x3(space.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(this, 1));
    }

    public final C1041540dD6 getTitleBar() {
        return this.LLILLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (!this.LLILZ) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Space space = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (numValueOf.intValue() == 0) {
                motionEvent.getY();
                this.LLILZIL = (int) motionEvent.getY();
            } else if (numValueOf.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i = y - this.LLILZIL;
                Space space2 = this.LL;
                if (space2 == null) {
                    space2 = null;
                }
                int height = space2.getHeight();
                this.LLILZIL = y;
                if (height > 0 && i < 0) {
                    Space space3 = this.LL;
                    if (space3 == null) {
                        space3 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = space3.getLayoutParams();
                    int i2 = layoutParams.height + i;
                    layoutParams.height = i2;
                    if (i2 < 0) {
                        layoutParams.height = 0;
                    }
                    Space space4 = this.LL;
                    if (space4 != null) {
                        space = space4;
                    }
                    C786410Ut5.f6(space, layoutParams);
                    C1041540dD6 c1041540dD6 = this.LLILLL;
                    if (c1041540dD6 != null) {
                        c1041540dD6.setBackgroundAlpha(layoutParams.height / this.LLILLJJLI);
                    }
                    return true;
                }
                if (height < this.LLILLJJLI && i > 0) {
                    Space space5 = this.LL;
                    if (space5 == null) {
                        space5 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = space5.getLayoutParams();
                    int i3 = layoutParams2.height + i;
                    layoutParams2.height = i3;
                    int i4 = this.LLILLJJLI;
                    if (i3 > i4) {
                        layoutParams2.height = i4;
                    }
                    C1041540dD6 c1041540dD62 = this.LLILLL;
                    if (c1041540dD62 != null) {
                        c1041540dD62.setBackgroundAlpha(layoutParams2.height / i4);
                    }
                    Space space6 = this.LL;
                    if (space6 != null) {
                        space = space6;
                    }
                    C786410Ut5.f6(space, layoutParams2);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setGradualChangeMode(boolean z) {
        this.LLILZ = z;
        Space space = this.LL;
        Space space2 = null;
        if (space == null) {
            space = null;
        }
        if (space.getHeight() != this.LLILLJJLI) {
            Space space3 = this.LL;
            if (space3 == null) {
                space3 = null;
            }
            ViewGroup.LayoutParams layoutParams = space3.getLayoutParams();
            layoutParams.height = this.LLILLJJLI;
            Space space4 = this.LL;
            if (space4 != null) {
                space2 = space4;
            }
            C786410Ut5.f6(space2, layoutParams);
        }
    }

    public final void setTitleBar(C1041540dD6 c1041540dD6) {
        this.LLILLL = c1041540dD6;
    }

    public C1041920dDi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
