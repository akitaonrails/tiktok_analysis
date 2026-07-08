package X;

import com.ss.android.ugc.aweme.im.lightinteract.impl.autofetch.LightInteractionAutoRetryConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0CFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310620CFo {
    public final LightInteractionAutoRetryConfig LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;

    public C310620CFo(LightInteractionAutoRetryConfig lightInteractionAutoRetryConfig) {
        this.LIZ = lightInteractionAutoRetryConfig;
    }

    public final boolean LIZ(long j) {
        long j2 = this.LIZJ;
        long j3 = (j - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 != 0 && j3 < this.LIZ.minIntervalSeconds) {
            return false;
        }
        long j4 = (j - this.LIZIZ) / ((long) C538540LAe.LLJJJIL);
        LightInteractionAutoRetryConfig lightInteractionAutoRetryConfig = this.LIZ;
        if (j4 < lightInteractionAutoRetryConfig.minutes && this.LIZLLL >= lightInteractionAutoRetryConfig.times) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(long j) {
        this.LIZJ = j;
        long j2 = (j - this.LIZIZ) / ((long) C538540LAe.LLJJJIL);
        LightInteractionAutoRetryConfig lightInteractionAutoRetryConfig = this.LIZ;
        if (j2 >= lightInteractionAutoRetryConfig.minutes) {
            this.LIZIZ = j;
            this.LIZLLL = 1;
        } else {
            if (this.LIZLLL >= lightInteractionAutoRetryConfig.times) {
                this.LIZLLL = 0;
            }
            this.LIZLLL++;
        }
    }
}
