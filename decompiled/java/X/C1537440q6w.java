package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537440q6w implements InterfaceC1537420q6u {
    public final ConcurrentHashMap<Class<?>, InterfaceC1537470q6z<?>> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1537420q6u
    public final C1537440q6w LIZJ() {
        C1537440q6w c1537440q6w = new C1537440q6w();
        for (Map.Entry<Class<?>, InterfaceC1537470q6z<?>> entry : this.LIZ.entrySet()) {
            c1537440q6w.LIZ.put(entry.getKey(), new C1537450q6x(entry.getValue().LIZ()));
        }
        return c1537440q6w;
    }

    @Override // X.InterfaceC1537420q6u
    public final void release() {
        Iterator<Map.Entry<Class<?>, InterfaceC1537470q6z<?>>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Object objLIZ = it2.next().getValue().LIZ();
            if (objLIZ instanceof InterfaceC1163130gND) {
                ((InterfaceC1163130gND) objLIZ).release();
            } else {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
                c1537410q6tLIZIZ.getClass();
                if (!Intrinsics.LJFF(C1535630q41.LIZIZ("disable_jsb_not_found_fix_when_recreate"), Boolean.TRUE)) {
                    for (Class cls : (ArrayList) c1537410q6tLIZIZ.LJIIIIZZ) {
                        if (objLIZ == null || !cls.isAssignableFrom(objLIZ.getClass())) {
                        }
                    }
                }
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC1537420q6u
    public final <T> void LIZ(Class<T> cls) {
        this.LIZ.remove(cls);
    }

    @Override // X.InterfaceC1537420q6u
    public final <T> T LIZIZ(Class<T> cls) {
        T t;
        InterfaceC1537470q6z<?> interfaceC1537470q6z = this.LIZ.get(cls);
        if (interfaceC1537470q6z == null || (t = (T) interfaceC1537470q6z.LIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC1537420q6u
    public final <T> T LJ(Class<T> cls) {
        T t;
        InterfaceC1537470q6z<?> interfaceC1537470q6zRemove = this.LIZ.remove(cls);
        if (interfaceC1537470q6zRemove == null || (t = (T) interfaceC1537470q6zRemove.LIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // X.InterfaceC1537420q6u
    public final <T> void LIZLLL(Class<T> cls, T t) {
        if (t != null) {
            if (t instanceof InterfaceC1537460q6y) {
                if (this.LIZ.get(cls) == null) {
                    this.LIZ.put(cls, new C1537450q6x(t));
                    return;
                }
                Object objLIZIZ = LIZIZ(cls);
                while (objLIZIZ instanceof InterfaceC1537460q6y) {
                    InterfaceC1537460q6y interfaceC1537460q6y = (InterfaceC1537460q6y) objLIZIZ;
                    if (interfaceC1537460q6y.next() == null) {
                        ((InterfaceC1537460q6y) objLIZIZ).LJIJ(t);
                        return;
                    }
                    objLIZIZ = interfaceC1537460q6y.next();
                }
                return;
            }
            this.LIZ.put(cls, new C1537450q6x(t));
            return;
        }
        this.LIZ.put(cls, new C1537450q6x(null));
    }
}
