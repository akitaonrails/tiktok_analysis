package X;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0Wif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830910Wif {
    public static final C830930Wih LIZ;

    static {
        C830930Wih c830930WihLIZ;
        C01GW c01gw = C261430AMj.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            ExecutorService executorServiceH4 = ((Number) c01gw.getValue()).intValue() == 1 ? C786410Ut5.h4() : C786410Ut5.d4(((Number) c01gw.getValue()).intValue());
            C830920Wig c830920Wig = new C830920Wig();
            c830920Wig.LIZLLL = executorServiceH4;
            c830930WihLIZ = c830920Wig.LIZ();
        } else {
            c830930WihLIZ = null;
        }
        LIZ = c830930WihLIZ;
    }
}
