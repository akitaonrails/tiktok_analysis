package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeBannerMetaData;
import com.bytedance.android.livesdk.guide.model.TaskInfo;

/* JADX INFO: renamed from: X.0fbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133730fbn extends C0GUM {
    public final C1123320fL0<RechargeBannerMetaData, InterfaceC1121530fI7> LLJ;
    public TaskInfo LLJI;
    public final ConstraintLayout LLJIJIL;
    public final C16F5 LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final View LLJILLL;
    public final C1133800fbu LLJJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1133800fbu c1133800fbu = this.LLJJ;
        CountDownTimer countDownTimer = c1133800fbu.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c1133800fbu.LIZIZ = null;
    }

    public C1133730fbn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1133730fbn(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133730fbn.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
