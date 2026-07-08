package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0Owq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635860Owq {
    public static final C635860Owq LIZ = new C635860Owq();

    public final void LIZJ(int i, View view) {
        getClass();
        LIZIZ(i, i, i, i, view, null, false);
    }

    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        Rect rect = new Rect();
        rect.left = (int) C497740JfY.LIZIZ(i);
        rect.top = (int) C497740JfY.LIZIZ(i2);
        rect.right = (int) C497740JfY.LIZIZ(i3);
        rect.bottom = (int) C497740JfY.LIZIZ(i4);
        TouchDelegate touchDelegate = view2.getTouchDelegate();
        if (touchDelegate instanceof C635840Owo) {
            ((LinkedList) ((C635840Owo) touchDelegate).LIZ).add(new C635830Own(view, rect));
        } else {
            C635840Owo c635840Owo = new C635840Owo(view);
            view2.setTouchDelegate(c635840Owo);
            ((LinkedList) c635840Owo.LIZ).add(new C635830Own(view, rect));
        }
    }

    public static void LIZIZ(int i, int i2, int i3, int i4, View view, View view2, boolean z) {
        View view3 = (View) view.getParent();
        Rect rect = new Rect();
        rect.left = (int) C497740JfY.LIZIZ(i);
        rect.top = (int) C497740JfY.LIZIZ(i2);
        rect.right = (int) C497740JfY.LIZIZ(i3);
        rect.bottom = (int) C497740JfY.LIZIZ(i4);
        TouchDelegate touchDelegate = view3.getTouchDelegate();
        if (touchDelegate instanceof C635840Owo) {
            ((LinkedList) ((C635840Owo) touchDelegate).LIZ).add(new C635830Own(view, rect, false, z, view2));
        } else {
            C635840Owo c635840Owo = new C635840Owo(view);
            view3.setTouchDelegate(c635840Owo);
            ((LinkedList) c635840Owo.LIZ).add(new C635830Own(view, rect, false, z, view2));
        }
    }
}
