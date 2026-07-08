package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NCW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCW extends C09AY implements Function0<String> {
    public final /* synthetic */ List<AbstractC738140SxQ> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NCW(List<? extends AbstractC738140SxQ> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("timing: ");
        sb.append(System.currentTimeMillis());
        sb.append(" --- other nodes: ");
        String strLIZIZ = "";
        for (AbstractC738140SxQ abstractC738140SxQ : this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", ");
            sbLIZ.append(abstractC738140SxQ.getClass().getSimpleName());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(strLIZIZ);
        sb.append(" don't need fcp compete to modify active!");
        return sb.toString();
    }
}
