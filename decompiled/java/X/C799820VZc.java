package X;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799820VZc {
    public Context LIZ;
    public final Map<String, InterfaceC799850VZf> LIZIZ = new ConcurrentHashMap();
    public final Map<String, InterfaceC799850VZf> LIZJ = new ConcurrentHashMap();
    public final Map<Class<? extends Activity>, WeakReference<Activity>> LIZLLL = new HashMap();

    public final InterfaceC799850VZf LIZIZ(String str) {
        InterfaceC799850VZf interfaceC799850VZf;
        InterfaceC799850VZf interfaceC799850VZf2 = (InterfaceC799850VZf) ((ConcurrentHashMap) this.LIZJ).get(str);
        C799900VZk.LIZ.getClass();
        C2162308dZ.LJI(C799900VZk.LJFF().context());
        synchronized (interfaceC799850VZf2) {
            try {
                if (!((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                    Integer num = C0VZX.LIZ;
                    if (num != null) {
                        if (num.intValue() == (interfaceC799850VZf2.targetProcess() & C0VZX.LIZ.intValue())) {
                            Context contextThemeWrapper = this.LIZ;
                            Activity activity = null;
                            if (contextThemeWrapper == null) {
                                contextThemeWrapper = null;
                            }
                            if (interfaceC799850VZf2.LIZJ() != 0) {
                                Context context = this.LIZ;
                                if (context == null) {
                                    context = null;
                                }
                                contextThemeWrapper = new ContextThemeWrapper(context, interfaceC799850VZf2.LIZJ());
                            }
                            WeakReference weakReference = (WeakReference) ((HashMap) this.LIZLLL).get(interfaceC799850VZf2.LIZIZ());
                            if (weakReference != null) {
                                activity = (Activity) weakReference.get();
                            }
                            InterfaceC799860VZg interfaceC799860VZg = C799900VZk.LJI;
                            if (interfaceC799860VZg != null) {
                                interfaceC799860VZg.LIZIZ(interfaceC799850VZf2);
                            }
                            interfaceC799850VZf2.LJII(activity, contextThemeWrapper);
                            InterfaceC799860VZg interfaceC799860VZg2 = C799900VZk.LJI;
                            if (interfaceC799860VZg2 != null) {
                                interfaceC799860VZg2.LIZ(interfaceC799850VZf2);
                            }
                        }
                    }
                    synchronized (this.LIZIZ) {
                        try {
                            ((ConcurrentHashMap) this.LIZIZ).put(str, interfaceC799850VZf2);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                interfaceC799850VZf = (InterfaceC799850VZf) ((ConcurrentHashMap) this.LIZIZ).get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC799850VZf;
    }

    public final void LIZ(String str, InterfaceC799850VZf interfaceC799850VZf) {
        if (!((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
            ((ConcurrentHashMap) this.LIZJ).put(str, interfaceC799850VZf);
        }
    }
}
