package X;

import Y.ARunnableS111S0100000_11;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor$timingHandler$1;

/* JADX INFO: renamed from: X.0S3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715160S3m implements InterfaceC469360Ias {
    public long LLILLJJLI;
    public EnumC715150S3l LL = EnumC715150S3l.IDLE;
    public final ARunnableS111S0100000_11 LLILLL = new ARunnableS111S0100000_11(this, 88);
    public final ARunnableS111S0100000_11 LLILZ = new ARunnableS111S0100000_11(this, 89);

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        FeedInfraTimingSensor$timingHandler$1 feedInfraTimingSensor$timingHandler$1 = FeedInfraTimingSensor.LLJIJIL;
        feedInfraTimingSensor$timingHandler$1.removeCallbacks(this.LLILLL);
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        EnumC715150S3l enumC715150S3l = this.LL;
        feedInfraTimingSensor.getClass();
        if (i != 0) {
            if (i == 1) {
                enumC715150S3l = EnumC715150S3l.DRAGGING;
            }
        } else {
            enumC715150S3l = EnumC715150S3l.IDLE;
        }
        if (enumC715150S3l == EnumC715150S3l.IDLE && this.LL == EnumC715150S3l.SELECTED) {
            this.LLILLJJLI = System.currentTimeMillis();
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLILZ;
            feedInfraTimingSensor$timingHandler$1.removeCallbacks(aRunnableS111S0100000_11);
            feedInfraTimingSensor$timingHandler$1.postDelayed(aRunnableS111S0100000_11, 16L);
        }
        this.LL = enumC715150S3l;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        if (this.LL == EnumC715150S3l.IDLE) {
            FeedInfraTimingSensor.LLJIJIL.postDelayed(this.LLILLL, 500L);
        }
        this.LL = EnumC715150S3l.SELECTED;
    }
}
