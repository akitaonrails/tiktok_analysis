package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552770Lm7 {
    public final Map<String, C552890LmJ<?, ?, ?, ?>> LIZ = new LinkedHashMap();

    public final <CTX extends InterfaceC551900Lki<CFG>, CFG extends Serializable, IN, OUT> C551120LjS LIZ(InterfaceC552790Lm9<CTX, CFG, IN, OUT> interfaceC552790Lm9, Function1<? super C552830LmD<CFG>, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC552790Lm9.getNodeName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C552830LmD c552830LmD = new C552830LmD();
        function1.invoke(c552830LmD);
        this.LIZ.put(strLIZIZ, new C552890LmJ<>(strLIZIZ, c552830LmD.LIZ, c552830LmD.LIZIZ, interfaceC552790Lm9));
        return new C551120LjS(strLIZIZ);
    }
}
