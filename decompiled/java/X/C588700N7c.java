package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588700N7c extends C09AY implements Function0<String> {
    public final /* synthetic */ List<C443120HZe<Long, String, Integer>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C588700N7c(List<C443120HZe<Long, String, Integer>> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("There are ");
        sbLIZ.append(this.LL.size());
        sbLIZ.append(" in db");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
