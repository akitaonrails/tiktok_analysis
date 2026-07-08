package X;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532360KuI<FLOW_CONTEXT> {
    public final String LIZ;
    public final LinkedHashMap<String, C532440KuQ<FLOW_CONTEXT, ?, ?>> LIZIZ = new LinkedHashMap<>();

    public C532360KuI(String str) {
        this.LIZ = str;
    }

    public static void LIZ(C532360KuI c532360KuI, InterfaceC532490KuV interfaceC532490KuV, Function2 function2, C531840KtS c531840KtS, Function2 function22, int i, Function2 function23, int i2) {
        if ((i2 & 2) != 0) {
            function2 = new C01Y4(null);
        }
        Function2 c01y5 = c531840KtS;
        if ((i2 & 4) != 0) {
            c01y5 = new C01Y5(null);
        }
        if ((i2 & 8) != 0) {
            function22 = new C01Y3(null);
        }
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if (!c532360KuI.LIZIZ.containsKey(interfaceC532490KuV.getName())) {
            c532360KuI.LIZIZ.put(interfaceC532490KuV.getName(), new C532440KuQ<>(interfaceC532490KuV, function2, c01y5, function22, i, function23));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlowGraph[");
        sbLIZ.append(c532360KuI.LIZ);
        sbLIZ.append("] duplicate node name '");
        sbLIZ.append(interfaceC532490KuV.getName());
        sbLIZ.append('\'');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
