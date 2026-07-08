package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.01CR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CR {
    public static WeakReference<Activity> LIZ;

    public static Activity LIZ() {
        WeakReference<Activity> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
