package X;

import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0NOU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOU {
    public static final void LIZ(C1306060k5k c1306060k5k, String str) {
        if (!C0NOR.LIZLLL().containsKey(str)) {
            C1306520k6U.LJ(C0NOR.LIZLLL(), str, new C0NOT(str, null));
        }
        C0NON c0non = (C0NON) C0NOR.LIZLLL().get(str);
        if (c0non != null && !C0NOR.LIZIZ(c0non)) {
            return;
        }
        C0NOR.LIZ(str, "trace_span_run", new AwS588S0100000_9(c1306060k5k, 443));
        C0NOR.LIZJ(str, "trace_span_run");
    }
}
