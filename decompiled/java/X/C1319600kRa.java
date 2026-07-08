package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319600kRa extends C16G0 {
    public static final /* synthetic */ int LLJLIL = 0;
    public C16GX LLJJL;
    public Function0<Unit> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLJJL = (C16GX) findViewById(R.id.fbu);
    }

    public final boolean getOverlayMode() {
        return this.LLJL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (i < 0) {
            C16GX c16gx = this.LLJJL;
            if (c16gx != null && c16gx.getTop() < 0) {
                return true;
            }
            return LJIJJLI(i, this);
        }
        if (i > 0) {
            C16GX c16gx2 = this.LLJJL;
            if (c16gx2 != null) {
                if (Math.abs(c16gx2.getTop()) < c16gx2.getTotalScrollRange()) {
                    return true;
                }
            }
            return LJIJJLI(i, this);
        }
        return false;
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (this.LLJL && this.LLJJL != null) {
            Rect rect = new Rect();
            C16GX c16gx = this.LLJJL;
            if (c16gx != null) {
                c16gx.getGlobalVisibleRect(rect);
            }
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                if (motionEvent.getAction() == 0 && (function0 = this.LLJJLIIIJLLLLLLLZ) != null) {
                    function0.invoke();
                    return true;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnCollapseSkylight(Function0<Unit> function0) {
        this.LLJJLIIIJLLLLLLLZ = function0;
    }

    public final void setOverlayMode(boolean z) {
        this.LLJL = z;
    }

    public C1319600kRa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static boolean LJIJJLI(int i, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.canScrollVertically(i)) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && LJIJJLI(i, (ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }
}
