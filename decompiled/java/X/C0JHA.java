package X;

import Y.ARunnableS76S0200000_7;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JHA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHA {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C2252321DDq LIZIZ;
    public static final Set<String> LIZJ;
    public static final Object LIZLLL;
    public static final Map<String, Function1<C0JH7, Unit>> LJ;
    public static final Object LJFF;
    public static final C0JHH LJI;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C2097608Jq.LJ());
        LIZIZ = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        LIZJ = new LinkedHashSet();
        LIZLLL = new Object();
        LJ = new LinkedHashMap();
        LJFF = new Object();
        LJI = new C0JHH();
    }

    public static void LIZ(String str, C0JH7 c0jh7) {
        Object value;
        LinkedHashMap linkedHashMap;
        Function1 function1;
        C2252321DDq c2252321DDq = LIZIZ;
        do {
            value = c2252321DDq.getValue();
            linkedHashMap = new LinkedHashMap((Map) value);
            linkedHashMap.put(str, c0jh7);
        } while (!c2252321DDq.compareAndSet(value, linkedHashMap));
        synchronized (LJFF) {
            try {
                function1 = (Function1) ((LinkedHashMap) LJ).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (function1 != null) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    function1.invoke(c0jh7);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error notifying observer for creationId=");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
            }
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS76S0200000_7(c0jh7, function1, 60));
        }
    }
}
