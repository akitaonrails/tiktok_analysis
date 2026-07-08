package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.0WUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824130WUp {
    public static final C824120WUo LIZ = new AbstractC824140WUq<Pair<String, Boolean>>() { // from class: X.0WUo
        /* JADX WARN: Type inference failed for: r0v6, types: [X.0WHo] */
        @Override // X.AbstractC824140WUq
        public final Pair<String, Boolean> LIZ(Object[] objArr) {
            try {
                final C820710WHl c820710WHl = ((C844770XBz) objArr[0]).LJJIIJ;
                if (c820710WHl != null) {
                    try {
                        return (Pair) C824170WUt.LJI(new Callable<Pair<String, Boolean>>() { // from class: X.0WHo
                            @Override // java.util.concurrent.Callable
                            public final Pair<String, Boolean> call() {
                                C1C7U.LIZ("SensitiveUtils@46c7.<field>$1$create$1");
                                Pair<String, Boolean> pairLIZIZ = c820710WHl.LIZIZ();
                                C1C7U.LIZIZ("SensitiveUtils@46c7.<field>$1$create$1");
                                return pairLIZIZ;
                            }
                        }).get(4500L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            return new Pair<>(null, Boolean.FALSE);
        }
    };
}
