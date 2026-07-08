package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410350mnx implements InterfaceC1410340mnw {
    public final List<InterfaceC1410340mnw> LIZ = new LinkedList();

    @Override // X.InterfaceC1410340mnw
    public final String getTag() {
        return "CreateAwemeFieldsBuilderManager";
    }

    @Override // X.InterfaceC1410340mnw
    public final Map<String, String> LIZ(C1410370mnz c1410370mnz) {
        Map<String, String> mapLJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1410340mnw interfaceC1410340mnw : this.LIZ) {
            try {
                mapLJ = interfaceC1410340mnw.LIZ(c1410370mnz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("build create/aweme fields crashed, tag=");
                sbLIZ.append(interfaceC1410340mnw.getTag());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0CHQ.LIZ().LJIIJJI();
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("tag", interfaceC1410340mnw.getTag()));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Publisher-CA-");
                sbLIZ2.append(interfaceC1410340mnw.getTag());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                String message = th.getMessage();
                if (message != null) {
                    strLIZIZ = message;
                }
                Npth.reportBizException(strLIZIZ2, th, strLIZIZ, mapLIZJ);
                mapLJ = C2097608Jq.LJ();
            }
            linkedHashMap.putAll(mapLJ);
        }
        return linkedHashMap;
    }

    public final void LIZIZ(InterfaceC1410340mnw interfaceC1410340mnw) {
        ((LinkedList) this.LIZ).add(interfaceC1410340mnw);
    }
}
