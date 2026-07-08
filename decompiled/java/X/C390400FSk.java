package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390400FSk {
    public final List<AbstractC388880FMo<?>> LIZ;
    public final C0FUH LIZIZ;

    public final AbstractC388880FMo<?> LIZ(EnumC1466150oFx enumC1466150oFx) throws Exception {
        AbstractC388880FMo<?> next;
        Iterator<AbstractC388880FMo<?>> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZLLL() == enumC1466150oFx) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC388880FMo<?> abstractC388880FMo = next;
        if (abstractC388880FMo != null) {
            return abstractC388880FMo;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("component not find ");
        sbLIZ.append(enumC1466150oFx);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C390400FSk(List<? extends AbstractC388880FMo<?>> list, C0FUH c0fuh) {
        this.LIZ = list;
        this.LIZIZ = c0fuh;
    }
}
