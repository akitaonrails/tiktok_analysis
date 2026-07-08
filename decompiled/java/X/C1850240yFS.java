package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850240yFS<T, V> {
    public final C1850230yFR LIZ;
    public final Class<? extends V> LIZIZ;
    public Function0<? extends Object> LIZJ;

    public final Object LIZ(InterfaceC2217461Bqa interfaceC2217461Bqa) throws C1850310yFZ {
        if (this.LIZJ == null) {
            Function0<? extends Object> function0 = (Function0) ((LinkedHashMap) this.LIZ.LIZ).get(this.LIZIZ);
            if (function0 != null) {
                this.LIZJ = function0;
            } else {
                throw new C1850310yFZ(this.LIZIZ.toString(), interfaceC2217461Bqa.getName());
            }
        }
        Function0<? extends Object> function02 = this.LIZJ;
        if (function02 == null) {
            function02 = null;
        }
        return function02.invoke();
    }

    public C1850240yFS(C1850230yFR c1850230yFR, Class<? extends V> cls) {
        this.LIZ = c1850230yFR;
        this.LIZIZ = cls;
    }
}
