package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.08RY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RY {
    public static WeakReference<Context> LIZ;
    public static InterfaceC2116908Rb LIZIZ;

    public static Context LIZ() {
        Context context;
        WeakReference<Context> weakReference = LIZ;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<Context> weakReference2 = LIZ;
            if (weakReference2 != null) {
                return weakReference2.get();
            }
            return null;
        }
        InterfaceC2116908Rb interfaceC2116908Rb = LIZIZ;
        if (interfaceC2116908Rb == null || (context = interfaceC2116908Rb.getContext()) == null) {
            return null;
        }
        LIZIZ(context);
        return context;
    }

    public static void LIZIZ(Context context) {
        WeakReference<Context> weakReference;
        WeakReference<Context> weakReference2 = LIZ;
        if (weakReference2 != null && weakReference2.get() != null) {
            return;
        }
        if (context instanceof Application) {
            weakReference = new WeakReference<>(((ContextWrapper) context).getBaseContext());
        } else {
            weakReference = new WeakReference<>(context);
        }
        LIZ = weakReference;
    }
}
