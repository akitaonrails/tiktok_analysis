package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.09Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2363109Nt {
    public static volatile C2363109Nt LIZLLL;
    public static final Object LJ = new Object();
    public final Context LIZJ;
    public final Set<Class<? extends InterfaceC2363209Nu<?>>> LIZIZ = new HashSet();
    public final Map<Class<?>, Object> LIZ = new HashMap();

    public C2363109Nt(Context context) {
        this.LIZJ = C786410Ut5.N3(context);
    }

    public static C2363109Nt LIZJ(Context context) {
        if (LIZLLL == null) {
            synchronized (LJ) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2363109Nt(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZ(Bundle bundle) {
        String string = this.LIZJ.getString(R.string.dr5);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC2363209Nu.class.isAssignableFrom(cls)) {
                            ((HashSet) this.LIZIZ).add(cls);
                        }
                    }
                }
                Iterator it2 = ((HashSet) this.LIZIZ).iterator();
                while (it2.hasNext()) {
                    LIZIZ((Class) it2.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C2363009Ns(e);
            }
        }
    }

    public final <T> T LIZIZ(Class<? extends InterfaceC2363209Nu<?>> cls, Set<Class<?>> set) {
        T t;
        if (C2077708Bz.LIZ()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        HashSet hashSet = (HashSet) set;
        if (!hashSet.contains(cls)) {
            if (!((HashMap) this.LIZ).containsKey(cls)) {
                hashSet.add(cls);
                try {
                    InterfaceC2363209Nu<?> interfaceC2363209NuNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends InterfaceC2363209Nu<?>>> listDependencies = interfaceC2363209NuNewInstance.dependencies();
                    if (!listDependencies.isEmpty()) {
                        for (Class<? extends InterfaceC2363209Nu<?>> cls2 : listDependencies) {
                            if (!((HashMap) this.LIZ).containsKey(cls2)) {
                                LIZIZ(cls2, set);
                            }
                        }
                    }
                    t = (T) interfaceC2363209NuNewInstance.create(this.LIZJ);
                    hashSet.remove(cls);
                    ((HashMap) this.LIZ).put(cls, t);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw new C2363009Ns(th2);
                }
            } else {
                t = (T) ((HashMap) this.LIZ).get(cls);
            }
            Trace.endSection();
            return t;
        }
        throw new IllegalStateException(C786410Ut5.j4("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }
}
