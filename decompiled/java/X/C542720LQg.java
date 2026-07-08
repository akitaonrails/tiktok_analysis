package X;

import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AITheaterGenerateConfigExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542720LQg extends C542820LQq {
    public final String LJI;
    public final C01GW LJII;

    @Override // X.C542820LQq
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final AITheaterGenerateConfigExp.AITheaterGenerateConfig LJFF() {
        return (AITheaterGenerateConfigExp.AITheaterGenerateConfig) this.LJII.getValue();
    }

    @Override // X.C542820LQq
    public final String LJI() {
        return this.LJI;
    }

    public C542720LQg(Map<String, Float> map) {
        super(map);
        this.LJI = "CustomPEProgressStrategy";
        this.LJII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(624));
    }

    @Override // X.C542820LQq, X.C0LSL
    public final Long LIZLLL(long j) {
        long j2;
        if (LJFF().pollingOptimizeTimeEdge >= 0 && j / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > LJFF().pollingOptimizeTimeEdge) {
            j2 = LJFF().pollingOptimizeMaxInterval;
        } else {
            j2 = LJFF().pollingOptimizeMinInterval;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(j2));
    }

    @Override // X.C542820LQq, X.C0LSL
    public final Integer LIZIZ(float f, int i, int i2) {
        float fFloatValue;
        float fMin;
        float f2;
        Float f3 = this.LIZ.get(C0LMH.LIZ("PROGRESS"));
        if (f3 != null) {
            fFloatValue = f3.floatValue();
        } else {
            fFloatValue = 0.5f;
        }
        float f4 = 100;
        float f5 = (LJFF().peFakeProgressValue * f4) / (fFloatValue * f4);
        float f6 = f5 * f4;
        if (i != 1) {
            if (i != 2) {
                fMin = i2;
                if (i == 0) {
                    f2 = 100.0f;
                }
                return Integer.valueOf((int) Math.min(fMin, f2));
            }
            fMin = (f * (1 - f5)) + f6;
        } else {
            fMin = Math.min(i2 + (LJFF().peFakeProgressStep * f4), f6);
        }
        f2 = 99.0f;
        return Integer.valueOf((int) Math.min(fMin, f2));
    }
}
