package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import u4.q0;

/* JADX INFO: renamed from: X.14dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20309014dM implements C0TVI {
    public final int $t;
    public Object l0 = new Rect();
    public Object l1;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C20309014dM(C21597019fc c21597019fc, int i) {
        this.$t = i;
        this.l1 = c21597019fc;
    }

    public C20309014dM(C21597919fl c21597919fl, int i) {
        this.$t = i;
        this.l1 = c21597919fl;
    }

    public C20309014dM(VerticalViewPager verticalViewPager, int i) {
        this.$t = i;
        this.l1 = verticalViewPager;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C20309014dM c20309014dM, View view, C20246014Ju c20246014Ju) {
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        if (c20246014JuLJIIL.LJII()) {
            return c20246014JuLJIIL;
        }
        Rect rect = (Rect) c20309014dM.l0;
        rect.left = c20246014JuLJIIL.LIZLLL();
        rect.top = c20246014JuLJIIL.LJFF();
        rect.right = c20246014JuLJIIL.LJ();
        rect.bottom = c20246014JuLJIIL.LIZJ();
        int childCount = ((C21597919fl) c20309014dM.l1).getChildCount();
        for (int i = 0; i < childCount; i++) {
            C20246014Ju c20246014JuLIZJ = q0.LIZJ(((C21597919fl) c20309014dM.l1).getChildAt(i), c20246014JuLJIIL);
            rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
            rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
            rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
            rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
        }
        return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C20246014Ju onApplyWindowInsets$1(C20309014dM c20309014dM, View view, C20246014Ju c20246014Ju) {
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        if (c20246014JuLJIIL.LJII()) {
            return c20246014JuLJIIL;
        }
        Rect rect = (Rect) c20309014dM.l0;
        rect.left = c20246014JuLJIIL.LIZLLL();
        rect.top = c20246014JuLJIIL.LJFF();
        rect.right = c20246014JuLJIIL.LJ();
        rect.bottom = c20246014JuLJIIL.LIZJ();
        int childCount = ((VerticalViewPager) c20309014dM.l1).getChildCount();
        for (int i = 0; i < childCount; i++) {
            C20246014Ju c20246014JuLIZJ = q0.LIZJ(((VerticalViewPager) c20309014dM.l1).getChildAt(i), c20246014JuLJIIL);
            rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
            rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
            rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
            rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
        }
        return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C20246014Ju onApplyWindowInsets$2(C20309014dM c20309014dM, View view, C20246014Ju c20246014Ju) {
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        if (c20246014JuLJIIL.LJII()) {
            return c20246014JuLJIIL;
        }
        Rect rect = (Rect) c20309014dM.l0;
        rect.left = c20246014JuLJIIL.LIZLLL();
        rect.top = c20246014JuLJIIL.LJFF();
        rect.right = c20246014JuLJIIL.LJ();
        rect.bottom = c20246014JuLJIIL.LIZJ();
        int childCount = ((C21597019fc) c20309014dM.l1).getChildCount();
        for (int i = 0; i < childCount; i++) {
            C20246014Ju c20246014JuLIZJ = q0.LIZJ(((C21597019fc) c20309014dM.l1).getChildAt(i), c20246014JuLJIIL);
            rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
            rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
            rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
            rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
        }
        return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
    }
}
