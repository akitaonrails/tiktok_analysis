package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359780E8q {
    public static final void LIZ(String str, Function0<Unit> function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        function0.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runWithTimeCost: ");
        sbLIZ.append(str);
        sbLIZ.append("- ");
        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
    }
}
