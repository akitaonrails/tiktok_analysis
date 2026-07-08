package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.146L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146L extends C09AY implements Function0<Unit> {
    public C146L() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        for (Map.Entry<String, Long> entry : C146K.LIZJ.entrySet()) {
            Long l = C146K.LIZJ.get(entry.getKey());
            if ((l != null ? l.longValue() : 0L) >= C146K.LIZLLL) {
                C146K.LIZIZ += C146K.LJ - entry.getValue().longValue();
            } else {
                C146K.LIZIZ += C146K.LJ - C146K.LIZLLL;
            }
        }
        C146K.LIZ(new C146N());
        return Unit.LIZ;
    }
}
