package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748760vbm {
    public static final void LIZ(InterfaceC1748810vbr interfaceC1748810vbr, C1748770vbn c1748770vbn, boolean z, Function1<? super InterfaceC1748810vbr, Unit> function1) {
        Stack stack = new Stack();
        while (interfaceC1748810vbr != null && (!z || !(interfaceC1748810vbr instanceof C993503uX))) {
            stack.push(interfaceC1748810vbr);
            interfaceC1748810vbr = interfaceC1748810vbr.d8();
        }
        while (!stack.isEmpty()) {
            InterfaceC1748810vbr interfaceC1748810vbr2 = (InterfaceC1748810vbr) stack.pop();
            if (function1 != null) {
                function1.invoke(interfaceC1748810vbr2);
            }
            if (C1748830vbt.LIZ && c1748770vbn.LIZ != null) {
                LaneParams laneParams = new LaneParams();
                LaneParams laneParamsLIZIZ = c1748770vbn.LIZIZ(c1748770vbn.LIZ.LIZIZ);
                if (laneParamsLIZIZ != null) {
                    laneParams.putAll(laneParamsLIZIZ);
                }
                interfaceC1748810vbr2.Q3(c1748770vbn);
                LaneParams laneParamsLIZIZ2 = c1748770vbn.LIZIZ(c1748770vbn.LIZ.LIZIZ);
                if (laneParamsLIZIZ2 != null) {
                    LaneParams laneParams2 = new LaneParams();
                    for (Map.Entry<String, Object> entry : laneParamsLIZIZ2.entrySet()) {
                        if (laneParams.get((Object) entry.getKey()) == null || !Intrinsics.LJFF(laneParams.get((Object) entry.getKey()), laneParamsLIZIZ2.get((Object) entry.getKey()))) {
                            laneParams2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    StringBuilder sb = AbstractC1748750vbl.LJIIJ.get(c1748770vbn.LIZ);
                    if (sb != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("node ");
                        sbLIZ.append(interfaceC1748810vbr2);
                        sbLIZ.append(" supply params:\n");
                        sbLIZ.append(C1010603xI.LIZIZ(laneParams2));
                        sbLIZ.append('\n');
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } else {
                interfaceC1748810vbr2.Q3(c1748770vbn);
            }
            if (interfaceC1748810vbr2 instanceof InterfaceC1748820vbs) {
                InterfaceC1748820vbs interfaceC1748820vbs = (InterfaceC1748820vbs) interfaceC1748810vbr2;
                Iterator<String> it2 = interfaceC1748820vbs.getRegisteredLane().iterator();
                while (it2.hasNext()) {
                    C1748780vbo.LIZIZ(c1748770vbn, it2.next(), new AwS605S0100000_26(interfaceC1748810vbr2, 278));
                }
                if (z) {
                    c1748770vbn.LIZ(new AwS615S0100000_1(interfaceC1748820vbs.Aa(), (Map<String, String>) 79));
                }
            }
        }
    }
}
