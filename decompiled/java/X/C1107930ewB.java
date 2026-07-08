package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107930ewB extends C09AY implements Function1<C1088240eQQ, Unit> {
    public C1107930ewB() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1088240eQQ c1088240eQQ) {
        C1088240eQQ c1088240eQQ2 = c1088240eQQ;
        for (Map.Entry entry : ((LinkedHashMap) C1107850ew3.LLILZIL).entrySet()) {
            if (entry.getKey() != c1088240eQQ2.LIZ) {
                ((InterfaceC1107910ew9) entry.getValue()).LIZJ(c1088240eQQ2.LIZ, c1088240eQQ2.LIZIZ);
            }
        }
        return Unit.LIZ;
    }
}
