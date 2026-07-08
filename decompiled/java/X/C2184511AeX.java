package X;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1AeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184511AeX {
    public static volatile int LIZLLL;
    public static final C2184511AeX LJ = new C2184511AeX();
    public final Map<String, LayoutInflater> LIZ = new ConcurrentHashMap();
    public LayoutInflater LIZIZ;
    public InterfaceC739920T0s LIZJ;

    public final synchronized void LIZJ() {
        this.LIZJ = null;
        this.LIZIZ = null;
        ((ConcurrentHashMap) this.LIZ).clear();
    }

    public final synchronized LayoutInflater LIZ(Context context) {
        LayoutInflater layoutInflaterCloneInContext;
        InterfaceC739920T0s interfaceC739920T0s = this.LIZJ;
        if (interfaceC739920T0s != null) {
            layoutInflaterCloneInContext = interfaceC739920T0s.LIZ();
        } else {
            layoutInflaterCloneInContext = null;
        }
        if (layoutInflaterCloneInContext != null) {
            if (Looper.myLooper() == Looper.getMainLooper() && !"NitaMainThread".equals(C786410Ut5.u3().getName())) {
                return layoutInflaterCloneInContext;
            }
            layoutInflaterCloneInContext = layoutInflaterCloneInContext.cloneInContext(context);
        }
        return layoutInflaterCloneInContext;
    }

    public final synchronized void LIZIZ(InterfaceC739920T0s interfaceC739920T0s, int i) {
        this.LIZJ = interfaceC739920T0s;
        LIZLLL = i;
    }
}
