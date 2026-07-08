package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0t69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652270t69 {
    public static final void LIZIZ(float f, float f2, final View view) {
        if (view == null) {
            return;
        }
        final int iLIZIZ = (int) C11VU.LIZIZ(f, view.getContext());
        final int iLIZIZ2 = (int) C11VU.LIZIZ(f2, view.getContext());
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0t2f
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
            /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(view.getViewTreeObserver(), this);
                ?? r7 = view;
                int i = iLIZIZ;
                int i2 = iLIZIZ2;
                while (true) {
                    ViewParent parent = r7.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        return;
                    }
                    r7 = (ViewGroup) parent;
                    if (r7.getWidth() >= i && r7.getHeight() >= i2) {
                        View view2 = view;
                        int i3 = iLIZIZ;
                        int i4 = iLIZIZ2;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                        ?? LIZ = C2188811AlT.LIZ();
                        LIZ.append("expandViewTouchArea: ");
                        LIZ.append(view2);
                        LIZ.append(", ");
                        LIZ.append(r7);
                        interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(LIZ));
                        C1652270t69.LIZ(i3, i4, null, view2, r7);
                        return;
                    }
                }
            }
        });
    }

    public static final void LIZ(int i, int i2, Rect rect, View view, ViewGroup viewGroup) {
        TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
        if (touchDelegate instanceof C1652280t6A) {
            ((ArrayList) ((C1652280t6A) touchDelegate).LIZ).add(new C19713612Ba(i, i2, rect, view, viewGroup));
        } else {
            C1652280t6A c1652280t6A = new C1652280t6A(view);
            viewGroup.setTouchDelegate(c1652280t6A);
            ((ArrayList) c1652280t6A.LIZ).add(new C19713612Ba(i, i2, rect, view, viewGroup));
        }
    }
}
