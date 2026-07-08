package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g1c.AjS63S0100000_6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Geb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420710Geb extends FrameLayout {
    public final C420690GeZ LL;
    public View LLILLJJLI;
    public View LLILLL;
    public Function0<Unit> LLILZ;

    public final void LIZJ() {
        this.LL.LIZJ();
        C786410Ut5.O1(this.LL, 8);
        C420690GeZ c420690GeZ = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c420690GeZ);
        c420690GeZ.setTranslationX(0.0f);
        C420690GeZ c420690GeZ2 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c420690GeZ2);
        c420690GeZ2.setTranslationY(0.0f);
    }

    public final void LIZ() {
        LIZJ();
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LIZ();
        super.onDetachedFromWindow();
    }

    public C420710Geb(Context context) {
        super(context, null, 0);
        C420690GeZ c420690GeZ = new C420690GeZ(context);
        this.LL = c420690GeZ;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setLayoutDirection(0);
        setClipChildren(false);
        setClipToPadding(false);
        setClickable(false);
        setFocusable(false);
        C786410Ut5.O1(c420690GeZ, 8);
        C786410Ut5.I7(new AjS63S0100000_6(this, 0), c420690GeZ);
        addView(c420690GeZ);
    }

    public final Rect LIZIZ(View view) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        view.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public final void setOnAnchorClickListener(Function0<Unit> function0) {
        boolean z;
        this.LLILZ = function0;
        C420690GeZ c420690GeZ = this.LL;
        if (function0 != null) {
            z = true;
        } else {
            z = false;
        }
        c420690GeZ.setClickable(z);
    }

    public static void LIZLLL(View view, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.gravity = 51;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.Jc(view, i);
        C786410Ut5.ed(view, i2);
        C786410Ut5.LJLLLLLL(0, view);
    }
}
