package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0y7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845130y7D {
    public static final Activity LIZ(View view) {
        Object next;
        Object obj;
        WeakReference<Object> weakReference;
        if (!view.isAttachedToWindow()) {
            return null;
        }
        C1845140y7E c1845140y7E = C1845140y7E.LIZ;
        View rootView = view.getRootView();
        c1845140y7E.getClass();
        if (rootView == null || (weakReference = C1845140y7E.LIZIZ.get(rootView)) == null || (obj = weakReference.get()) == null) {
            Iterator it2 = C09R4.LJ(AFwS245S0000000_12.get$arr$(237), view.getContext()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof Activity) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            obj = (C19EG) next;
        }
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (!(obj instanceof Dialog)) {
            return null;
        }
        return C1808610xAJ.LIZ((Dialog) obj);
    }
}
