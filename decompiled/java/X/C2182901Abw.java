package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1Abw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2182901Abw {
    public static final Executor LIZ(AbstractC2252651DEx abstractC2252651DEx) {
        C1DFT c1dft;
        Executor executorLLIILII;
        if (!(abstractC2252651DEx instanceof C1DFT) || (c1dft = (C1DFT) abstractC2252651DEx) == null || (executorLLIILII = c1dft.LLIILII()) == null) {
            return new C1DFM(abstractC2252651DEx);
        }
        return executorLLIILII;
    }

    public static final AbstractC2252651DEx LIZIZ(Executor executor) {
        C1DFM c1dfm;
        AbstractC2252651DEx abstractC2252651DEx;
        if (!(executor instanceof C1DFM) || (c1dfm = (C1DFM) executor) == null || (abstractC2252651DEx = c1dfm.LL) == null) {
            return new C2232408os(executor);
        }
        return abstractC2252651DEx;
    }
}
