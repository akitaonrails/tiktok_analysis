package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877450yxL {
    public static final C1877450yxL LIZ = new C1877450yxL();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static final void LIZ() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!C1544000qHW.LIZJ) {
            if (!C1544000qHW.LJIIZILJ) {
                C1062300dka.LJ("x.uploadFile", C09NG.class);
            }
            z = false;
        } else if (LIZIZ.get()) {
            C20684815ws.LJIILLIIL("xbridge_init_event", C2097608Jq.LJIIIIZZ(new Pair("xbridge_init_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("optimized", String.valueOf(true)), new Pair("only_one_time", "true")));
            return;
        } else {
            if (!C1544000qHW.LJIIZILJ) {
                C1062300dka.LJ("x.uploadFile", C09NG.class);
            }
            z = true;
        }
        C1878050yyJ.LIZJ();
        C1877380yxE.LIZ();
        C20684815ws.LJIILLIIL("xbridge_init_event", C2097608Jq.LJIIIIZZ(new Pair("xbridge_init_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("optimized", String.valueOf(z)), new Pair("only_one_time", "false")));
        C1063910dnB.LIZ("true", "XBridgeStarter_finish");
        LIZIZ.set(true);
    }
}
