package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575000Mgs implements InterfaceC568850MSt {
    public static final Map<Class<?>, Function0<InterfaceC575140Mh6<?>>> LIZIZ;
    public static final Map<Class<?>, Function0<InterfaceC575170Mh9<?, ?>>> LIZJ;
    public static final Map<Class<?>, Function0<InterfaceC575150Mh7<?>>> LIZLLL;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        linkedHashMap.put(String.class, AFwS194S0000000_8.get$arr$(571));
    }

    public final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, new RunnableC514801zW(function0, (Function0<Unit>) 170));
        }
    }
}
