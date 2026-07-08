package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350200DoA {
    public static final C348760Dlq LIZ(AbstractC350210DoB abstractC350210DoB, Function2 function2) {
        C348760Dlq c348760Dlq = new C348760Dlq(function2);
        ((ArrayList) abstractC350210DoB.LL).add(c348760Dlq);
        return c348760Dlq;
    }

    public static final void LIZIZ(InterfaceC350240DoE interfaceC350240DoE, C348820Dlw c348820Dlw) {
        InterfaceC350230DoD interfaceC350230DoD;
        if ((interfaceC350240DoE instanceof InterfaceC350230DoD) && (interfaceC350230DoD = (InterfaceC350230DoD) interfaceC350240DoE) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC350230DoD.LIZIZ(c348820Dlw);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String simpleName = interfaceC350230DoD.getClass().getSimpleName();
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(simpleName);
            sbLIZ.append(" [nle-publishModel-update] ");
            sbLIZ.append(jCurrentTimeMillis2);
            C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZJ(InterfaceC350240DoE interfaceC350240DoE, C0EMN c0emn) {
        InterfaceC350220DoC interfaceC350220DoC;
        if ((interfaceC350240DoE instanceof InterfaceC350220DoC) && (interfaceC350220DoC = (InterfaceC350220DoC) interfaceC350240DoE) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC350220DoC.LIZLLL(c0emn);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String simpleName = interfaceC350220DoC.getClass().getSimpleName();
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(simpleName);
            sbLIZ.append(" [save-publishModel] ");
            sbLIZ.append(jCurrentTimeMillis2);
            C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
