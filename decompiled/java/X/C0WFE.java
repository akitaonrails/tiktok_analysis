package X;

import android.content.Context;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.ISettings;

/* JADX INFO: renamed from: X.0WFE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFE {
    public static final C0WFG LIZ;
    public static final C0WFD LIZIZ;
    public static final C0WFC LIZJ;

    static {
        C0WFG c0wfg = new C0WFG();
        LIZ = c0wfg;
        LIZIZ = new C0WFD(c0wfg);
        LIZJ = new C0WFC();
    }

    public static <T> T LIZ(Context context, Class<T> cls) {
        Object obj;
        ISettings iSettings;
        if (ISettings.class.isAssignableFrom(cls)) {
            C0WFC c0wfc = LIZJ;
            T t = (T) c0wfc.LIZ.get(cls);
            if (t == null) {
                synchronized (c0wfc.LIZIZ) {
                    try {
                        if (c0wfc.LIZIZ.containsKey(cls)) {
                            obj = c0wfc.LIZIZ.get(cls);
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            obj = new Object();
                            c0wfc.LIZIZ.put(cls, obj);
                        }
                    } finally {
                    }
                }
                synchronized (obj) {
                    try {
                        iSettings = (T) c0wfc.LIZ.get(cls);
                        if (iSettings == null) {
                            iSettings = (T) C0WFC.LIZ(context, cls);
                            c0wfc.LIZ.put((Class<? extends ISettings>) cls, iSettings);
                        }
                    } finally {
                    }
                }
                return (T) iSettings;
            }
            if (c0wfc.LIZIZ.containsKey(cls)) {
                c0wfc.LIZIZ.remove(cls);
            }
            return t;
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) LIZIZ.LIZIZ(context, cls);
        }
        throw new IllegalArgumentException("tClass must be child of ISettings or ILocalSettings");
    }
}
