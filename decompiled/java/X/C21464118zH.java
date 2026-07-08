package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashMap;

/* JADX INFO: renamed from: X.18zH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21464118zH extends AbstractC21460218ye {
    public static final TimeInterpolator LLJLILLLLZIIL = new DecelerateInterpolator();
    public static final TimeInterpolator LLJLL = new AccelerateInterpolator();
    public static final C21464718zN LLJLLIL;
    public InterfaceC21465018zQ LLJLIL = LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.18zN] */
    static {
        new AbstractC21464818zO() { // from class: X.18zK
            @Override // X.InterfaceC21465018zQ
            public final float LIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
        };
        new AbstractC21464818zO() { // from class: X.18zI
            @Override // X.InterfaceC21465018zQ
            public final float LIZ(View view, ViewGroup viewGroup) {
                if (viewGroup.getLayoutDirection() == 1) {
                    return view.getTranslationX() + viewGroup.getWidth();
                }
                return view.getTranslationX() - viewGroup.getWidth();
            }
        };
        new AbstractC21464918zP() { // from class: X.18zM
            @Override // X.InterfaceC21465018zQ
            public final float LIZIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationY() - viewGroup.getHeight();
            }
        };
        new AbstractC21464818zO() { // from class: X.18zL
            @Override // X.InterfaceC21465018zQ
            public final float LIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        new AbstractC21464818zO() { // from class: X.18zJ
            @Override // X.InterfaceC21465018zQ
            public final float LIZ(View view, ViewGroup viewGroup) {
                if (viewGroup.getLayoutDirection() == 1) {
                    return view.getTranslationX() - viewGroup.getWidth();
                }
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        LLJLLIL = new AbstractC21464918zP() { // from class: X.18zN
            @Override // X.InterfaceC21465018zQ
            public final float LIZIZ(View view, ViewGroup viewGroup) {
                return view.getTranslationY() + viewGroup.getHeight();
            }
        };
    }

    public C21464118zH() {
        C21464018zG c21464018zG = new C21464018zG();
        c21464018zG.LIZIZ = 80;
        this.LLJJJ = c21464018zG;
    }

    @Override // X.AbstractC21460218ye, X.AbstractC21463118z7
    public final void LIZLLL(C1489080oqw c1489080oqw) {
        AbstractC21460218ye.LJJIZ(c1489080oqw);
        int[] iArr = new int[2];
        c1489080oqw.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c1489080oqw.LIZ).put("android:slide:screenPosition", iArr);
    }

    @Override // X.AbstractC21463118z7
    public final void LJI(C1489080oqw c1489080oqw) {
        AbstractC21460218ye.LJJIZ(c1489080oqw);
        int[] iArr = new int[2];
        c1489080oqw.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c1489080oqw.LIZ).put("android:slide:screenPosition", iArr);
    }

    @Override // X.AbstractC21460218ye
    public final Animator LJJJIL(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw) {
        if (c1489080oqw == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) c1489080oqw.LIZ).get("android:slide:screenPosition");
        return C21348318gb.LIZ(view, c1489080oqw, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.LLJLIL.LIZ(view, viewGroup), this.LLJLIL.LIZIZ(view, viewGroup), LLJLL, this);
    }

    @Override // X.AbstractC21460218ye
    public final Animator LJJJI(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        if (c1489080oqw2 == null) {
            return null;
        }
        int[] iArr = (int[]) ((HashMap) c1489080oqw2.LIZ).get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C21348318gb.LIZ(view, c1489080oqw2, iArr[0], iArr[1], this.LLJLIL.LIZ(view, viewGroup), this.LLJLIL.LIZIZ(view, viewGroup), translationX, translationY, LLJLILLLLZIIL, this);
    }
}
