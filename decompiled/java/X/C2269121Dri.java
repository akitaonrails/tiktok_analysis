package X;

import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import java.util.Map;
import joo.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269121Dri extends C09AY implements Function0<C1699910uKz> {
    public C2269121Dri() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0uKz] */
    @Override // kotlin.jvm.functions.Function0
    public final C1699910uKz invoke() {
        return new ILargeTransactionService() { // from class: X.0uKz
            @Override // com.ss.android.ugc.aweme.services.external.ILargeTransactionService
            public final void clearPreviousDiskBundle() {
                f.LIZ.getClass();
                f.LJII.execute(new Runnable() { // from class: X.0uKx
                    public static void LIZ() {
                        C1701150uMz c1701150uMz = f.LJFF;
                        for (Map.Entry<String, ?> entry : c1701150uMz.LIZJ().getAll().entrySet()) {
                            c1701150uMz.LIZJ().storeInt(entry.getKey(), ((Integer) entry.getValue()).intValue() + 1);
                        }
                        f.LJFF.LIZIZ();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LargeTransaction@7195.clearPreviousDiskBundle$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LargeTransaction@7195.clearPreviousDiskBundle$1");
                    }
                });
                C1701150uMz c1701150uMz = C1701170uN1.LIZ;
                C1701170uN1.LIZJ.execute(new Runnable() { // from class: X.0uKy
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SceneLargeTransaction@b671.clearPreviousDiskBundle$1");
                        try {
                            C1701170uN1.LIZ.LIZIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SceneLargeTransaction@b671.clearPreviousDiskBundle$1");
                    }
                });
            }
        };
    }
}
