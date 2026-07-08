package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899240zWU extends C09AY implements Function0<Unit> {
    public C1899240zWU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator it2 = ((ArrayList) C1898970zW3.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC1899090zWF) it2.next()).LJI();
        }
        ((ArrayList) C1898970zW3.LIZIZ).clear();
        return Unit.LIZ;
    }
}
