package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0xAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808610xAJ {
    public static final WeakHashMap<Activity, List<WeakReference<Dialog>>> LIZ = new WeakHashMap<>();

    public static Activity LIZ(Dialog dialog) {
        Context context = dialog.getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }
}
