package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.List;

/* JADX INFO: renamed from: X.0SY5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SY5 {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(Integer.valueOf(C0SY7.UNFOLLOW.getValue()), Integer.valueOf(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED.getValue()));
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(Integer.valueOf(C0SY7.FOLLOWED.getValue()), Integer.valueOf(C0SY7.FOLLOW_MUTUAL.getValue()), Integer.valueOf(C0SY7.FOLLOW_REQUESTED.getValue()));

    public static final C0SY7 LIZ(int i) {
        switch (i) {
        }
        return C0SY7.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final LifecycleOwner LIZIZ(Context context) {
        if (context instanceof Activity) {
            if (!(context instanceof LifecycleOwner)) {
                return null;
            }
            return (LifecycleOwner) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C06MM.LIZ(((ContextWrapper) context).getBaseContext());
        if (!(componentCallbacks2LIZ instanceof LifecycleOwner)) {
            return null;
        }
        return (LifecycleOwner) componentCallbacks2LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ViewModelStoreOwner LIZJ(Context context) {
        if (context instanceof Activity) {
            if (!(context instanceof ViewModelStoreOwner)) {
                return null;
            }
            return (ViewModelStoreOwner) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C06MM.LIZ(((ContextWrapper) context).getBaseContext());
        if (!(componentCallbacks2LIZ instanceof ViewModelStoreOwner)) {
            return null;
        }
        return (ViewModelStoreOwner) componentCallbacks2LIZ;
    }
}
