package X;

import com.ss.android.ugc.aweme.nxet.ITracingService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848540yCi extends C09AY implements Function0<String> {
    public C1848540yCi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strLJI;
        InterfaceC1848550yCj interfaceC1848550yCjLJIJ;
        C1848530yCh.LIZ.getClass();
        ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
        C1847770yBT c1847770yBTLIZ = null;
        if (iTracingServiceLIZ != null && (interfaceC1848550yCjLJIJ = iTracingServiceLIZ.LJIJ()) != null) {
            c1847770yBTLIZ = interfaceC1848550yCjLJIJ.LIZ();
        }
        String str = "";
        if (c1847770yBTLIZ != null) {
            strLJI = c1847770yBTLIZ.LJI();
            String strLIZ = c1847770yBTLIZ.LIZ();
            if (strLIZ != null) {
                str = strLIZ;
            }
        } else {
            strLJI = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJI);
        sbLIZ.append('|');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
