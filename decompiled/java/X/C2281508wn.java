package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.roma.deploy.model.SparkAppModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281508wn {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final ExecutorService LIZJ;
    public final Map<String, String> LIZLLL;

    public final void LIZIZ() {
        if (this.LIZIZ.compareAndSet(false, true)) {
            C2283408x6.LIZ().LIZLLL(new C2028707x7(this));
            C786410Ut5.LJLIIL(60000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(this, 156));
        }
    }

    public C2281508wn() {
        ExecutorService executorService = C2281108wj.LIZ;
        this.LIZJ = C2281108wj.LIZ(EnumC2281308wl.Sequence);
        this.LIZLLL = new HashMap();
    }

    public final void LIZJ() {
        if (C2283408x6.LIZ().enable()) {
            this.LIZJ.submit(new Runnable() { // from class: X.08wo
                /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 421
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2281608wo.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SparkAppRepositoryImpl@e4de.update$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SparkAppRepositoryImpl@e4de.update$1");
                }
            });
        } else {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "GeckoDepend is disabled, skip update.", null, "RomaSDK", 2);
        }
    }

    public static SparkAppModel LIZ(String str) {
        C1550300qRg c1550300qRg = C1550300qRg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("spark_app_");
        sbLIZ.append(str);
        return (SparkAppModel) c1550300qRg.LJIIIIZZ(SparkAppModel.class, C2188811AlT.LIZIZ(sbLIZ));
    }
}
