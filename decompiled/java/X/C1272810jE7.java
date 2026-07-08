package X;

import android.util.AndroidRuntimeException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0jE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272810jE7 implements InterfaceC1272820jE8 {
    public final Map<Class<? extends InterfaceC1272840jEA>, InterfaceC1272840jEA> LIZ = new ConcurrentHashMap();

    public final void LIZIZ() {
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1272840jEA) ((Map.Entry) it2.next()).getValue()).onRelease();
        }
        ((ConcurrentHashMap) this.LIZ).clear();
    }

    @Override // X.InterfaceC1272820jE8
    public final <T extends InterfaceC1272840jEA> T getService(Class<? extends T> cls) {
        T t = (T) ((ConcurrentHashMap) this.LIZ).get(cls);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T extends InterfaceC1272840jEA> void LIZ(Class<? extends T> cls, T t) {
        if (((ConcurrentHashMap) this.LIZ).get(cls) != null) {
            if (!C1274040jG6.LIZ()) {
                if (Unit.LIZ != null) {
                    return;
                }
            } else {
                throw new AndroidRuntimeException("service already registered");
            }
        }
        ((ConcurrentHashMap) this.LIZ).put(cls, t);
    }
}
