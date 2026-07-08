package X;

import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS158S1100000_9;

/* JADX INFO: renamed from: X.0MrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581480MrK {
    public static final C581480MrK LIZ = new C581480MrK();
    public static final boolean LIZIZ = ((Boolean) C276420AsS.LIZ.getValue()).booleanValue();
    public static final C584970Mwx LIZJ = new C584970Mwx(0);
    public static final ConcurrentHashMap<String, C581990Ms9> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C0N23, C581850Mrv> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WeakReference<InterfaceC582120MsM>> LJFF = new ConcurrentHashMap<>();

    public static C581990Ms9 LIZIZ(String str) {
        C581990Ms9 c581990Ms9PutIfAbsent;
        ConcurrentHashMap<String, C581990Ms9> concurrentHashMap = LIZLLL;
        C581990Ms9 c581990Ms9 = concurrentHashMap.get(str);
        if (c581990Ms9 == null && (c581990Ms9PutIfAbsent = concurrentHashMap.putIfAbsent(str, (c581990Ms9 = new C581990Ms9()))) != null) {
            c581990Ms9 = c581990Ms9PutIfAbsent;
        }
        return c581990Ms9;
    }

    public final void LIZ(C0N23 c0n23, String str, Map<String, ? extends Object> map) {
        C589080N8o.LIZJ(this, new AwS158S1100000_9(str, c0n23, 23));
        MeasurementContext.LIZ.getClass();
        C584230Mvl.LIZ().LJIIJ().LIZ("m_notify_expose", c0n23, new AwS123S1100000_9(str, c0n23, 9));
        Iterator<T> it2 = LJFF.values().iterator();
        while (it2.hasNext()) {
            InterfaceC582120MsM interfaceC582120MsM = (InterfaceC582120MsM) ((Reference) it2.next()).get();
            if (interfaceC582120MsM != null) {
                interfaceC582120MsM.LJII(c0n23, str, C0N2R.LIZ(map));
            }
        }
    }
}
