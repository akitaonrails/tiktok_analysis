package X;

import Y.ACallableS416S0100000_9;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0N7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588910N7x {
    public static final LoudnessStrategyConfig LJ = C582130MsN.LIZ().getConfig().getCommonConfig().getLoudnessStrategyConfig();
    public volatile CountDownLatch LIZ;
    public Future<Float> LIZIZ;
    public float LIZJ;
    public String LIZLLL;

    public final Future<Float> LIZ(String str) {
        boolean z;
        LoudnessStrategyConfig loudnessStrategyConfig = LJ;
        if (loudnessStrategyConfig != null && loudnessStrategyConfig.enabled) {
            z = true;
        } else {
            z = false;
        }
        if (!z || TextUtils.isEmpty(str)) {
            return null;
        }
        Future<Float> future = this.LIZIZ;
        if (future != null && !future.isDone()) {
            this.LIZIZ.cancel(true);
        }
        this.LIZIZ = null;
        this.LIZJ = 0.0f;
        this.LIZ = null;
        this.LIZLLL = str;
        ExecutorService executorService = C1475000oUE.LIZLLL;
        if (executorService == null) {
            return null;
        }
        Future<Float> futureSubmit = executorService.submit(new ACallableS416S0100000_9(this, 8));
        this.LIZIZ = futureSubmit;
        return futureSubmit;
    }
}
