package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0Ors, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632780Ors {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        Rect rect = new Rect();
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(i)));
        rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(i2)));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(i3)));
        rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(i4)));
        TouchDelegate touchDelegate = view2.getTouchDelegate();
        if (touchDelegate instanceof C632790Ort) {
            ((LinkedList) ((C632790Ort) touchDelegate).LIZ).add(new C632770Orr(rect, view));
        } else {
            C632790Ort c632790Ort = new C632790Ort(view);
            view2.setTouchDelegate(c632790Ort);
            ((LinkedList) c632790Ort.LIZ).add(new C632770Orr(rect, view));
        }
    }
}
