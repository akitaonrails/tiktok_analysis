package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickIntervalSetting;

/* JADX INFO: renamed from: X.0ehR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098790ehR extends AbstractC431510Gw1 {
    public static final long LLILZ = FirstScreenDebounceClickIntervalSetting.INSTANCE.getValue();
    public final long LL;
    public long LLILLJJLI;
    public boolean LLILLL;

    public abstract void LIZIZ(View view);

    public AbstractC1098790ehR() {
        long j = LLILZ;
        this.LLILLL = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
        this.LL = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.LLILLL) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.LLILLJJLI >= this.LL) {
                this.LLILLJJLI = jUptimeMillis;
                LIZIZ(view);
                return;
            }
            return;
        }
        LIZIZ(view);
    }
}
