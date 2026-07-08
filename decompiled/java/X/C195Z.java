package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.195Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195Z {
    public static void LIZ(NavigationScene navigationScene) {
        if (navigationScene.LLLLIL().LJIIL) {
            LIZJ(navigationScene.LLLLII());
        } else if (navigationScene.LLLLIL().LJIIIZ) {
            ((C20689115xZ) navigationScene.mView).setDrawAnimationViewToFront(true);
        } else {
            LIZJ(navigationScene.LLLLII());
        }
    }

    public static void LIZIZ(NavigationScene navigationScene) {
        if (navigationScene.LLLLIL().LJIIL) {
            LJI(navigationScene.LLLLII());
        } else if (navigationScene.LLLLIL().LJIIIZ) {
            ((C20689115xZ) navigationScene.mView).setDrawAnimationViewToFront(false);
        } else {
            LIZJ(navigationScene.LLJILLL);
        }
    }

    public static void LIZJ(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int iIndexOfChild = viewGroup.indexOfChild(view);
        if (iIndexOfChild >= 0 && iIndexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    public static C214816195a LIZLLL(View view) {
        return new C214816195a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
    }

    public static void LJ(View view) {
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.Ab(view, 0.0f);
        C786410Ut5.Hb(view, 0.0f);
        C786410Ut5.Ib(view, 0.0f);
        C786410Ut5.T4(view, 1.0f);
        view.clearAnimation();
    }

    public static void LJI(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int iIndexOfChild = viewGroup.indexOfChild(view);
        if (childCount > 1 && iIndexOfChild > 0 && iIndexOfChild != childCount - 1) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            viewGroup.addView(view, 0);
        }
    }

    public static void LJFF(View view, C214816195a c214816195a) {
        C786410Ut5.Jc(view, c214816195a.LIZ);
        C786410Ut5.ed(view, c214816195a.LIZIZ);
        C786410Ut5.Ob(view, c214816195a.LIZJ);
        C786410Ut5.pc(view, c214816195a.LIZLLL);
        C786410Ut5.Ab(view, c214816195a.LJ);
        C786410Ut5.Hb(view, c214816195a.LJFF);
        C786410Ut5.Ib(view, c214816195a.LJI);
        C786410Ut5.T4(view, c214816195a.LJII);
    }
}
