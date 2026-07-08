package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X6P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6P extends C09AY implements Function0<Unit> {
    public C0X6P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C823050WQl.LJ().schedule(new Runnable() { // from class: X.0X6N
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HybridWebTTPInitTask@985f.submitFetchScript$1$1");
                try {
                    C0X6U.LIZ.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null) {
                        iSparkHostApi.LLIIIL(new C843080X5m(jCurrentTimeMillis));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HybridWebTTPInitTask@985f.submitFetchScript$1$1");
            }
        }, 500L, TimeUnit.MILLISECONDS);
        return Unit.LIZ;
    }
}
