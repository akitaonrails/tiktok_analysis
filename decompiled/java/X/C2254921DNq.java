package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS579S0100000_35;
import wm3.j;

/* JADX INFO: renamed from: X.1DNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254921DNq implements InterfaceC2254931DNr {
    public final Function0<Boolean> LIZ;
    public final Function0<InterfaceC2238351CjB> LIZIZ;
    public final ConcurrentHashMap<Class<?>, InterfaceC2254971DNv<?>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, Function1<InterfaceC2238351CjB, InterfaceC2254971DNv<?>>> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC2254931DNr
    public final <API extends InterfaceC2254261DLc> API LIZ(Class<API> cls) {
        ConcurrentHashMap<Class<?>, InterfaceC2254971DNv<?>> concurrentHashMap = this.LIZJ;
        InterfaceC2254971DNv<?> interfaceC2254971DNvInvoke = concurrentHashMap.get(cls);
        if (interfaceC2254971DNvInvoke == null) {
            Function1<InterfaceC2238351CjB, InterfaceC2254971DNv<?>> function1 = this.LIZLLL.get(cls);
            if (function1 == null || (interfaceC2254971DNvInvoke = function1.invoke(this.LIZIZ.invoke())) == null) {
                return null;
            }
            interfaceC2254971DNvInvoke.init();
            InterfaceC2254971DNv<?> interfaceC2254971DNvPutIfAbsent = concurrentHashMap.putIfAbsent(cls, interfaceC2254971DNvInvoke);
            if (interfaceC2254971DNvPutIfAbsent != null) {
                interfaceC2254971DNvInvoke = interfaceC2254971DNvPutIfAbsent;
            }
        }
        if (!(interfaceC2254971DNvInvoke instanceof InterfaceC2254261DLc)) {
            return null;
        }
        return (API) interfaceC2254971DNvInvoke;
    }

    public C2254921DNq(AwS579S0100000_35 awS579S0100000_35, AwS579S0100000_35 awS579S0100000_352) {
        this.LIZ = awS579S0100000_35;
        this.LIZIZ = awS579S0100000_352;
    }

    @Override // X.InterfaceC2254931DNr
    public final <API extends InterfaceC2254261DLc, IMPL extends j<API>> void LIZIZ(boolean z, Class<API> cls, Function1<? super InterfaceC2238351CjB, ? extends IMPL> function1) {
        if (this.LIZ.invoke().booleanValue()) {
            if (z) {
                this.LIZLLL.put(cls, function1);
                return;
            }
            InterfaceC2254971DNv<?> interfaceC2254971DNvInvoke = function1.invoke(this.LIZIZ.invoke());
            this.LIZJ.put(cls, interfaceC2254971DNvInvoke);
            interfaceC2254971DNvInvoke.init();
            return;
        }
        "CKCameraView is not init.".toString();
        throw new IllegalArgumentException("CKCameraView is not init.");
    }
}
