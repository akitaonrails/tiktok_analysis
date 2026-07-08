package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21500719Cj extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C21500619Ci LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21500719Cj(C21500619Ci c21500619Ci) {
        super(0);
        this.LL = c21500619Ci;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C06W3 next;
        Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C721340SRg) {
                break;
            }
        }
        C721340SRg c721340SRg = (C721340SRg) (next instanceof C721340SRg ? next : null);
        return Boolean.valueOf(c721340SRg != null ? c721340SRg.LIZ : false);
    }
}
