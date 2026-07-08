package X;

import Y.ARunnableS1S1101000_4;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.ss.android.ugc.aweme.legoImp.task.ExceptionRuleConfig;
import com.ss.android.ugc.aweme.legoImp.task.TryCatchConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0CF7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CF7 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static final void LIZ(Context context, boolean z) {
        TryCatchConfig tryCatchConfig;
        Handler handlerLIZIZ;
        if (Build.VERSION.SDK_INT <= 23) {
            return;
        }
        AtomicBoolean atomicBoolean = LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        if (z) {
            tryCatchConfig = (TryCatchConfig) C302730Btn.LIZ.getValue();
        } else {
            tryCatchConfig = (TryCatchConfig) C302710Btl.LIZ.getValue();
        }
        if (tryCatchConfig == null) {
            return;
        }
        boolean zLJI = C2162308dZ.LJI(context);
        int i = tryCatchConfig.processMode;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else if (zLJI) {
                return;
            }
        } else if (!zLJI) {
            return;
        }
        ExceptionRuleConfig[] exceptionRuleConfigArr = tryCatchConfig.exceptionRules;
        if (exceptionRuleConfigArr != null && exceptionRuleConfigArr.length != 0) {
            C844470XAv.LIZ.getClass();
            int i2 = C844470XAv.LJIIJ;
            String strLIZJ = C844470XAv.LIZJ();
            if (i2 > 0 && strLIZJ.length() != 0) {
                ARunnableS1S1101000_4 aRunnableS1S1101000_4 = new ARunnableS1S1101000_4(i2, strLIZJ, tryCatchConfig, 0);
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                if (tryCatchConfig.delayMillis <= 0) {
                    aRunnableS1S1101000_4.run();
                    return;
                }
                if (z) {
                    handlerLIZIZ = C799570VYd.LIZJ();
                } else {
                    handlerLIZIZ = C799570VYd.LIZIZ();
                }
                C786410Ut5.LJLIIL(tryCatchConfig.delayMillis, handlerLIZIZ, aRunnableS1S1101000_4);
            }
        }
    }
}
