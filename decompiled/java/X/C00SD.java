package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00SD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00SD extends C09AY implements Function0<String> {
    public final /* synthetic */ C700170RdH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00SD(C700170RdH c700170RdH) {
        super(0);
        this.LL = c700170RdH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("timing: ");
        sb.append(System.currentTimeMillis());
        sb.append(" --- calculate current slot list: ");
        String strLIZIZ = "";
        for (String str : (ArrayList) this.LL.LJIJJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(strLIZIZ);
        return sb.toString();
    }
}
