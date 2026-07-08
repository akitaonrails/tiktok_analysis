package X;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850250yFT<T, V> {
    public final C1850230yFR LIZ;
    public final Class<? extends V> LIZIZ;
    public V LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final Object LIZ(InterfaceC2217461Bqa interfaceC2217461Bqa) throws C1850310yFZ {
        if (!this.LIZLLL.getAndSet(true)) {
            Function0 function0 = (Function0) ((LinkedHashMap) this.LIZ.LIZ).get(this.LIZIZ);
            if (function0 != null) {
                this.LIZJ = (V) function0.invoke();
            } else {
                throw new C1850310yFZ(this.LIZIZ.toString(), interfaceC2217461Bqa.getName());
            }
        }
        return this.LIZJ;
    }

    public C1850250yFT(C1850230yFR c1850230yFR, Class<? extends V> cls) {
        this.LIZ = c1850230yFR;
        this.LIZIZ = cls;
    }
}
