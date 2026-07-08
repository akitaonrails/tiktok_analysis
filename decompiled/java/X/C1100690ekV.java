package X;

import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ekV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100690ekV<T> {
    public final Map<InterfaceC1100670ekT<T>, C1100660ekS<T>> LIZ = new LinkedHashMap();

    public final void LIZ(T t) {
        boolean zLJI = MethodIDManager.LJI(197100);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            LIZIZ(t);
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS86S0200000_17(this, t, 69));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZIZ(T t) {
        C2044407ze.LIZ("emitOnMainThread");
        for (Pair pair : C2097808Js.LJIL(this.LIZ)) {
            InterfaceC1100670ekT interfaceC1100670ekT = (InterfaceC1100670ekT) pair.getFirst();
            if (((C1100660ekS) pair.getSecond()).LIZIZ) {
                try {
                    interfaceC1100670ekT.LLZZLLIL(t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJFF("StateData", "observer onChange failed", th);
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC1100670ekT<T> interfaceC1100670ekT) {
        C2044407ze.LIZ("removeObserver");
        C1100660ekS c1100660ekS = (C1100660ekS) ((LinkedHashMap) this.LIZ).get(interfaceC1100670ekT);
        if (c1100660ekS != null) {
            c1100660ekS.LIZIZ = false;
        }
        this.LIZ.remove(interfaceC1100670ekT);
    }

    public final void LIZJ(C1100530ekF c1100530ekF, InterfaceC1100670ekT<T> interfaceC1100670ekT) {
        C2044407ze.LIZ("observer");
        if (c1100530ekF.LIZ != EnumC1100490ekB.END && !this.LIZ.containsKey(interfaceC1100670ekT)) {
            C1100660ekS<T> c1100660ekS = new C1100660ekS<>(interfaceC1100670ekT);
            this.LIZ.put(interfaceC1100670ekT, c1100660ekS);
            c1100530ekF.LIZ(c1100660ekS);
        }
    }
}
