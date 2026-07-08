package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325680kbO extends C1320270kSf {
    public final List<InterfaceC1325670kbN> LIZ;

    public C1325680kbO(Set<InterfaceC1325670kbN> set) {
        this.LIZ = new ArrayList(set.size());
        for (InterfaceC1325670kbN interfaceC1325670kbN : set) {
            if (interfaceC1325670kbN != null) {
                this.LIZ.add(interfaceC1325670kbN);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325670kbN) ((ArrayList) this.LIZ).get(i)).LIZLLL(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJFF(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LJFF(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final boolean LJIIJ(String str) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LJIIJ(str)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] LJIIL(InputStream inputStream) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (this.LIZ.get(i) instanceof AbstractC539150LCn) {
                return ((AbstractC539150LCn) this.LIZ.get(i)).LJIIJJI(inputStream);
            }
        }
        return null;
    }

    public C1325680kbO(InterfaceC1325670kbN... interfaceC1325670kbNArr) {
        this.LIZ = new ArrayList(interfaceC1325670kbNArr.length);
        for (InterfaceC1325670kbN interfaceC1325670kbN : interfaceC1325670kbNArr) {
            if (interfaceC1325670kbN != null) {
                ((ArrayList) this.LIZ).add(interfaceC1325670kbN);
            }
        }
    }

    public static void LJIILIIL(String str, Throwable th) {
        C1328570kg3.LJI("ForwardingRequestListener", str, th);
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJI(String str, String str2) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LJI(str, str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LIZIZ(str, str2, map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJII(C1325710kbR c1325710kbR, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325670kbN) ((ArrayList) this.LIZ).get(i)).LJII(c1325710kbR, str, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJIIIIZZ(String str, String str2, Map<String, String> map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LJIIIIZZ(str, str2, map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJIIIZ(String str, String str2, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LJIIIZ(str, str2, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // X.C1320270kSf
    public final void LJIIJJI(C1325710kbR c1325710kbR, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            InterfaceC1325670kbN interfaceC1325670kbN = (InterfaceC1325670kbN) ((ArrayList) this.LIZ).get(i);
            try {
                if (interfaceC1325670kbN instanceof C1320270kSf) {
                    ((C1320270kSf) interfaceC1325670kbN).LJIIJJI(c1325710kbR, str, z);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onRequestIntermediateResult", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZ(String str, Throwable th, String str2, Map map) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325690kbP) ((ArrayList) this.LIZ).get(i)).LIZ(str, th, str2, map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZJ(C1325710kbR c1325710kbR, Object obj, String str, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325670kbN) ((ArrayList) this.LIZ).get(i)).LIZJ(c1325710kbR, obj, str, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC1325670kbN) ((ArrayList) this.LIZ).get(i)).LJ(c1325710kbR, str, th, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL("InternalListener exception in onRequestFailure", e);
            }
        }
    }
}
