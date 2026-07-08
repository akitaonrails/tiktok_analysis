package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053010dVb<T> implements InterfaceC1041900dDg<T> {
    public final Class<T> LIZ;
    public final Map<Class<?>, Function2<?, String, ?>> LIZIZ = new LinkedHashMap();
    public final Map<Class<?>, InterfaceC1631620sYq<?, String, ?, ?>> LIZJ = new LinkedHashMap();

    public final String toString() {
        return Intrinsics.LJIIJJI(this.LIZ.getCanonicalName(), "ParamType: ");
    }

    public C1053010dVb(Class<T> cls) {
        this.LIZ = cls;
    }

    @Override // X.InterfaceC1041900dDg
    public final <R> InterfaceC1631620sYq<R, String, T, R> LIZ(Class<R> cls) {
        Object c098200Yq;
        Object obj = null;
        try {
            c098200Yq = (InterfaceC1631620sYq) ((LinkedHashMap) this.LIZJ).get(cls);
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InterfaceC1631620sYq) obj;
    }

    @Override // X.InterfaceC1041900dDg
    public final <R> Function2<R, String, T> LIZIZ(Class<R> cls) {
        Object c098200Yq;
        Object obj = null;
        try {
            c098200Yq = (Function2) ((LinkedHashMap) this.LIZIZ).get(cls);
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Function2) obj;
    }

    public final <R> void LIZJ(Class<R> cls, InterfaceC1631620sYq<? super R, ? super String, ? super T, ? extends R> interfaceC1631620sYq) {
        this.LIZJ.put(cls, interfaceC1631620sYq);
    }

    public final <R> void LIZLLL(Class<R> cls, Function2<? super R, ? super String, ? extends T> function2) {
        this.LIZIZ.put(cls, function2);
    }
}
