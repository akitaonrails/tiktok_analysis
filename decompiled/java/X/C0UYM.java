package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UYM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C0UYR c0uyr, Function0 function0) {
        FrameLayout.LayoutParams layoutParams;
        int iHeight;
        int i;
        int i2;
        int iLJIJ;
        int i3;
        FrameLayout.LayoutParams layoutParams2;
        if (((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        boolean z = false;
        int i4 = 51;
        FrameLayout.LayoutParams layoutParams3 = null;
        if (c0uyr.LJFF) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    layoutParams2.topMargin = 0;
                    layoutParams2.leftMargin = 0;
                    layoutParams2.gravity = 51;
                    layoutParams3 = layoutParams2;
                }
                C786410Ut5.W5(view, layoutParams3);
            }
        } else {
            Rect rectInvoke = c0uyr.LJIIIZ.invoke();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams5) != null) {
                    int iWidth = c0uyr.LIZ;
                    if (iWidth == 0 || c0uyr.LIZIZ == 0) {
                        if (rectInvoke != null) {
                            iWidth = rectInvoke.width();
                        } else {
                            iWidth = 0;
                        }
                    }
                    layoutParams.width = iWidth;
                    if (c0uyr.LIZ != 0 && c0uyr.LIZIZ != 0) {
                        iHeight = c0uyr.LIZIZ;
                    } else if (rectInvoke != null) {
                        iHeight = rectInvoke.height();
                    } else {
                        iHeight = 0;
                    }
                    layoutParams.height = iHeight;
                    int i5 = c0uyr.LIZ;
                    if (i5 != 0 && c0uyr.LIZIZ != 0) {
                        i = c0uyr.LIZJ;
                    } else if (rectInvoke != null) {
                        i = rectInvoke.left;
                    } else {
                        i = 0;
                    }
                    layoutParams.leftMargin = i;
                    if (!c0uyr.LJII) {
                        i3 = 0;
                    } else {
                        if (i5 != 0 && c0uyr.LIZIZ != 0) {
                            i2 = c0uyr.LIZLLL;
                        } else if (rectInvoke != null) {
                            i2 = rectInvoke.top;
                        } else {
                            i2 = 0;
                        }
                        C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
                        if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ && !c0uyr.LJIIJ) {
                            iLJIJ = C497740JfY.LJIJ();
                        } else {
                            iLJIJ = 0;
                        }
                        i3 = i2 + iLJIJ;
                    }
                    layoutParams.topMargin = i3;
                    int i6 = c0uyr.LJIIIIZZ;
                    if (i6 >= 0) {
                        i4 = i6;
                    }
                    layoutParams.gravity = i4;
                    layoutParams3 = layoutParams;
                }
                C786410Ut5.W5(view, layoutParams3);
            }
        }
        int i7 = c0uyr.LJIIJJI;
        if (i7 >= 0 && view != null) {
            if (i7 == 0) {
                z = true;
            }
            C500260Jjc.LJLJLJ(view, z);
        }
    }
}
