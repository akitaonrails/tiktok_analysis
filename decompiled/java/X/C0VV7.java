package X;

import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VV7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VV7 implements C0V22, InterfaceC791210V1z {
    public final String LL;
    public final Function0<HashMap<String, String>> LLILLJJLI;
    public LagDataCallback LLILLL = null;
    public double LLILZ;
    public long LLILZIL;

    @Override // X.C0V22
    public final void LIZIZ(double d) {
        this.LLILZ = d;
    }

    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(final JSONObject jSONObject) {
        final String str = this.LL;
        final long j = this.LLILZIL;
        final double d = this.LLILZ;
        final C860330Xp1 c860330Xp1 = C860340Xp2.LIZ;
        C787900UvU.LIZ.LIZJ(new Runnable() { // from class: X.0VV6
            /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[PHI: r7
              0x0095: PHI (r7v4 int) = (r7v2 int), (r7v7 int) binds: [B:23:0x0079, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 363
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0VV6.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CreativeFpsMonitor$FpsCollector@360e.handleFpsData$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CreativeFpsMonitor$FpsCollector@360e.handleFpsData$1");
            }
        });
        this.LLILZIL = -1L;
        this.LLILZ = -1.0d;
    }

    public C0VV7(String str, Function0 function0) {
        this.LL = str;
        this.LLILLJJLI = function0;
    }
}
