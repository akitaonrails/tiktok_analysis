package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21586419du {
    public final DrawerLayout LIZ;
    public final C21586019dq LIZIZ;
    public final int LIZJ;
    public float LIZLLL;
    public float LJ;
    public int LJFF = 1;
    public boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public final boolean LIZLLL(float f) {
        boolean z;
        if (this.LIZ.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f >= 0.0f) {
                return false;
            }
        } else if (f <= 0.0f) {
            return false;
        }
        return true;
    }

    public C21586419du(DrawerLayout drawerLayout, C21586019dq c21586019dq) {
        this.LIZ = drawerLayout;
        this.LIZIZ = c21586019dq;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 3269));
        this.LJIIJ = C452501pT.LIZ(enumC452301pR, new AwS577S0100000_33(this, 3270));
        this.LIZJ = ViewConfiguration.get(drawerLayout.getContext()).getScaledTouchSlop();
        drawerLayout.setScrimColor(0);
        drawerLayout.LJIILLIIL(1, 8388611);
    }

    public final View LIZJ(MotionEvent motionEvent, int i) {
        if (i == 0) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ArrayList<View> arrayList = new ArrayList();
        LIZIZ(this.LIZ, x, y, arrayList);
        for (View view : arrayList) {
            while (view != null && view != this.LIZ) {
                if (view.getId() == i) {
                    return view;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return null;
    }

    public static boolean LIZ(C21586419du c21586419du, float f, float f2) {
        float f3 = (f * f) + (f2 * f2);
        int i = c21586419du.LIZJ;
        if (f3 > i * i) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(View view, int i, int i2, List list) {
        if (i >= 0 && i2 >= 0 && i < view.getWidth() && i2 < view.getHeight()) {
            ((ArrayList) list).add(view);
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = viewGroup.getScrollX();
            int scrollY = viewGroup.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0) {
                    int left = childAt.getLeft() - scrollX;
                    int top = childAt.getTop() - scrollY;
                    int right = childAt.getRight() - scrollX;
                    int bottom = childAt.getBottom() - scrollY;
                    if (i >= left && i < right && i2 >= top && i2 < bottom) {
                        LIZIZ(childAt, i - left, i2 - top, list);
                    }
                }
            }
        }
    }
}
