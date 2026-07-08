package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0T8H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8H extends FrameLayout {
    public boolean LL;
    public Aweme LLILLJJLI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    public final boolean getTouchToGone() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AwemeRawAd awemeRawAd;
        if (this.LL) {
            C786410Ut5.d(this, 8);
            ITopViewAdEventLogger iTopViewAdEventLoggerLJJIIZ = TopViewAdEventLogger.LJJIIZ();
            C1018060cbE.LIZ.getClass();
            C1023960ckk c1023960ckk = C1018060cbE.LJIJJ;
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            iTopViewAdEventLoggerLJJIIZ.logAd(c1023960ckk, awemeRawAd);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAweme(Aweme aweme) {
        this.LLILLJJLI = aweme;
    }

    public final void setTouchToGone(boolean z) {
        this.LL = z;
    }

    public C0T8H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }
}
