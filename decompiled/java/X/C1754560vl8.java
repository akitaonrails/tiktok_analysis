package X;

import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0vl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754560vl8 extends AbstractC21463118z7 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public final RectF LLJLL = new RectF();

    public static RectF LJJIZ(View view) {
        if (view == null || !view.isLaidOut() || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        return C1753610vjb.LIZ(view);
    }

    @Override // X.AbstractC21463118z7
    public final void LIZLLL(C1489080oqw c1489080oqw) {
        View view = this.LLJL;
        if (view != null) {
            c1489080oqw.LIZIZ = view;
            ((HashMap) c1489080oqw.LIZ).put("PROP_BOUNDS:bounds", LJJIZ(view));
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LJI(C1489080oqw c1489080oqw) {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            c1489080oqw.LIZIZ = view;
            ((HashMap) c1489080oqw.LIZ).put("PROP_BOUNDS:bounds", LJJIZ(view));
        }
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View view2 = this.LLJJLIIIJLLLLLLLZ;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(0);
            } else {
                viewFindViewById = null;
            }
        }
        this.LLJLIL = viewFindViewById;
        RectF rectFLJJIZ = LJJIZ(viewFindViewById);
        if (rectFLJJIZ != null) {
            this.LLJLL.set(rectFLJJIZ);
        }
    }

    @Override // X.AbstractC21463118z7
    public final Animator LJIIJ(ViewGroup viewGroup, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        ViewGroup viewGroup2;
        RectF rectF;
        RectF rectF2;
        final View view;
        final View view2;
        if (c1489080oqw == null || c1489080oqw2 == null || (viewGroup2 = this.LLJLILLLLZIIL) == null) {
            return null;
        }
        Object obj = ((HashMap) c1489080oqw.LIZ).get("PROP_BOUNDS:bounds");
        if (!(obj instanceof RectF) || (rectF = (RectF) obj) == null) {
            return null;
        }
        Object obj2 = ((HashMap) c1489080oqw2.LIZ).get("PROP_BOUNDS:bounds");
        if (!(obj2 instanceof RectF) || (rectF2 = (RectF) obj2) == null || (view = c1489080oqw.LIZIZ) == null || (view2 = c1489080oqw2.LIZIZ) == null) {
            return null;
        }
        RectF rectFLIZ = C1753610vjb.LIZ(viewGroup2);
        float f = -rectFLIZ.left;
        float f2 = -rectFLIZ.top;
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        this.LLJLL.offset(f, f2);
        final C21689419uW c21689419uW = new C21689419uW(rectF, rectF2, this.LLJLL, this.LLJLIL, view, view2);
        c21689419uW.setBounds(viewGroup2.getLeft(), viewGroup2.getTop(), viewGroup2.getRight(), viewGroup2.getBottom());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(c21689419uW, 52));
        LIZ(new C1149100g0a() { // from class: X.0vl9
            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZ() {
                ViewGroupOverlay overlay;
                ViewGroup viewGroup3 = this.LL.LLJLILLLLZIIL;
                if (viewGroup3 != null && (overlay = viewGroup3.getOverlay()) != null) {
                    overlay.add(c21689419uW);
                }
                C786410Ut5.T4(view2, 0.0f);
                C786410Ut5.T4(view, 0.0f);
                View view3 = this.LL.LLJLIL;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 0.0f);
                }
            }

            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                ViewGroupOverlay overlay;
                this.LL.LJJII(this);
                C786410Ut5.T4(view2, 1.0f);
                ViewGroup viewGroup3 = this.LL.LLJLILLLLZIIL;
                if (viewGroup3 != null && (overlay = viewGroup3.getOverlay()) != null) {
                    overlay.remove(c21689419uW);
                }
            }
        });
        return valueAnimatorOfFloat;
    }
}
