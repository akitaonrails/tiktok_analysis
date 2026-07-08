package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850210yFP<T, V> {
    public final C1850230yFR LIZ;
    public final String LIZIZ;
    public Function0<? extends Object> LIZJ;

    public final Object LIZ(InterfaceC2217461Bqa interfaceC2217461Bqa) throws C1850310yFZ {
        if (this.LIZJ == null) {
            Function0<? extends Object> function0 = (Function0) ((LinkedHashMap) this.LIZ.LIZIZ).get(this.LIZIZ);
            if (function0 != null) {
                this.LIZJ = function0;
            } else {
                throw new C1850310yFZ(this.LIZIZ, interfaceC2217461Bqa.getName());
            }
        }
        Function0<? extends Object> function02 = this.LIZJ;
        if (function02 == null) {
            function02 = null;
        }
        return function02.invoke();
    }

    public C1850210yFP(C1850230yFR c1850230yFR, String str) {
        this.LIZ = c1850230yFR;
        this.LIZIZ = str;
    }
}
