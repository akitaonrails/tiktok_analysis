package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00H0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H0 extends C09AY implements Function0<String> {
    public final /* synthetic */ List<Map.Entry<String, Integer>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C00H0(List<? extends Map.Entry<String, Integer>> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("timing: ");
        sb.append(System.currentTimeMillis());
        sb.append(" --- calculate current priority sort map: ");
        String strLIZIZ = "";
        for (Map.Entry<String, Integer> entry : this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", \"{key: ");
            sbLIZ.append(entry.getKey());
            sbLIZ.append(", priority: ");
            sbLIZ.append(entry.getValue().intValue());
            sbLIZ.append("}\"");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(strLIZIZ);
        return sb.toString();
    }
}
