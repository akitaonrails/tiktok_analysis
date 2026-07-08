package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21501319Cp extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C21501119Cn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21501319Cp(C21501119Cn c21501119Cn) {
        super(0);
        this.LL = c21501119Cn;
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
            if (next instanceof C1239450iMJ) {
                break;
            }
        }
        C1239450iMJ c1239450iMJ = (C1239450iMJ) (next instanceof C1239450iMJ ? next : null);
        return Boolean.valueOf(c1239450iMJ != null ? c1239450iMJ.LIZ : false);
    }
}
