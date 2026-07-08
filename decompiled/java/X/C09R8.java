package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09R8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09R8 {
    public static final InterfaceC553010LmV LIZ(C13IQ<? extends InterfaceC553010LmV> c13iq) {
        Object c098200Yq;
        Object obj = null;
        try {
            c098200Yq = (InterfaceC553010LmV) C09R7.LIZ(c13iq).getDeclaredField("INSTANCE").get(null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        InterfaceC553010LmV interfaceC553010LmV = (InterfaceC553010LmV) obj;
        if (interfaceC553010LmV != null) {
            return interfaceC553010LmV;
        }
        throw new C1890807as("Artifact define " + C09R7.LIZ(c13iq).getName() + " must be a Kotlin object");
    }
}
