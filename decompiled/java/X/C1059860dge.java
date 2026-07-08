package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059860dge {
    public static boolean LIZIZ;
    public final Map<Class<?>, InterfaceC1059830dgb<?>> LIZ = new LinkedHashMap();

    public final <T> T LIZ(Class<T> cls) {
        T t;
        InterfaceC1059830dgb interfaceC1059830dgb = (InterfaceC1059830dgb) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC1059830dgb == null || (t = (T) interfaceC1059830dgb.LIZ()) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    public final <T> void LIZIZ(Class<T> cls, final T t) {
        LIZJ(cls, new InterfaceC1059830dgb<T>(t) { // from class: X.0dgg
            public T LIZ;

            @Override // X.InterfaceC1059850dgd
            public final void release() {
                this.LIZ = null;
            }

            @Override // X.InterfaceC1059830dgb
            public final T LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = t;
            }
        });
    }

    public final <T> void LIZJ(Class<T> cls, InterfaceC1059830dgb<? extends T> interfaceC1059830dgb) {
        InterfaceC1059850dgd interfaceC1059850dgd = (InterfaceC1059850dgd) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC1059850dgd != null && interfaceC1059850dgd != interfaceC1059830dgb) {
            interfaceC1059850dgd.release();
        }
        this.LIZ.put(cls, interfaceC1059830dgb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0dge] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final <T> void LIZLLL(Class<T> cls, final T t) {
        if (LIZIZ && Intrinsics.LJFF(cls, Context.class) && (t instanceof Context)) {
            Context baseContext = (Context) t;
            while (true) {
                if (baseContext != null) {
                    if (baseContext instanceof Activity) {
                        t = (T) baseContext;
                        break;
                    } else if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        LIZJ(cls, new InterfaceC1059830dgb<T>(t) { // from class: X.0dgf
            public WeakReference<T> LIZ;

            @Override // X.InterfaceC1059830dgb
            public final T LIZ() {
                WeakReference<T> weakReference = this.LIZ;
                if (weakReference != null) {
                    return weakReference.get();
                }
                return null;
            }

            @Override // X.InterfaceC1059850dgd
            public final void release() {
                WeakReference<T> weakReference = this.LIZ;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.LIZ = null;
            }

            {
                WeakReference<T> weakReference;
                if (t == null) {
                    weakReference = null;
                } else {
                    weakReference = new WeakReference<>(t);
                }
                this.LIZ = weakReference;
            }
        });
    }
}
