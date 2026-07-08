package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849800yEk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL = 22;

    public C1849800yEk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("task_type", String.valueOf(this.LL));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("date_change", linkedHashMap);
        }
        return Unit.LIZ;
    }
}
