package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0TLB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLB {
    public static final C21411818qq LIZ(View view) {
        if (view instanceof C21411818qq) {
            return (C21411818qq) view;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                C21411818qq c21411818qqLIZ = LIZ(it2.next());
                if (c21411818qqLIZ != null) {
                    return c21411818qqLIZ;
                }
            }
            return null;
        }
        return null;
    }
}
