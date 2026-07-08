package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1A5G, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5G {
    public static final C1A5G LIZ = new C1A5G();

    public static void LIZ(View view) throws NoSuchFieldException {
        C1A5D c1a5dLJFF = C1A5C.LJFF(view);
        if (!c1a5dLJFF.LIZIZ && !c1a5dLJFF.LIZJ) {
            return;
        }
        boolean zLIZ = C1A5F.LIZ.LIZ(view);
        if (!C1A5E.LIZ.LIZ(view)) {
            C19396910ud.LIZ.getClass();
            C19396910ud.LIZJ(c1a5dLJFF, "ClickArea");
        } else if (!zLIZ) {
            C19396910ud.LIZ.getClass();
            C19396910ud.LIZJ(c1a5dLJFF, "ScrollArea");
        } else {
            C19396910ud.LIZ.getClass();
            C19396910ud.LIZJ(c1a5dLJFF, "None");
        }
    }

    public static void LIZIZ(View view) throws NoSuchFieldException {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            LIZ(view);
            Iterator it2 = new C1077420e8y((ViewGroup) view, 36).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (c1077410e8x.hasNext()) {
                    View view2 = (View) c1077410e8x.next();
                    LIZ.getClass();
                    LIZIZ(view2);
                } else {
                    return;
                }
            }
        } else {
            LIZ(view);
        }
    }
}
