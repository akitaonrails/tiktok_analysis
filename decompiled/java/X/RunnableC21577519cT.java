package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.19cT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC21577519cT implements Runnable {
    public final /* synthetic */ float LL = 1.0f;
    public final /* synthetic */ int LLILLJJLI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ C21576919cN LLILZ;

    public final void LIZ() {
        C21576919cN c21576919cN = this.LLILZ;
        if (c21576919cN.LLLLLLLLL != EnumC21577619cU.Refreshing) {
            return;
        }
        ValueAnimator valueAnimator = c21576919cN.LLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILZ.LLJI = r2.getMeasuredWidth() / 2.0f;
        this.LLILZ.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownToRefresh);
        C21576919cN c21576919cN2 = this.LLILZ;
        c21576919cN2.LLLLZI = ValueAnimator.ofInt(c21576919cN2.LLILLJJLI, (int) (c21576919cN2.LLLLIIIILLL * this.LL));
        this.LLILZ.LLLLZI.setDuration(this.LLILLJJLI);
        this.LLILZ.LLLLZI.setInterpolator(new C19ZZ(0));
        this.LLILZ.LLLLZI.addUpdateListener(new AUListenerS280S0100000_33(this, 56));
        this.LLILZ.LLLLZI.addListener(new ALAdapterS27S0100000_33(this, 27));
        this.LLILZ.LLLLZI.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SmartRefreshLayout@e706.autoRefresh$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartRefreshLayout@e706.autoRefresh$1");
    }

    public RunnableC21577519cT(C21576919cN c21576919cN) {
        this.LLILZ = c21576919cN;
    }
}
