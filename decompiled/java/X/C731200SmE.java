package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0SmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731200SmE extends C1303280k1G {
    public static final /* synthetic */ int LLILZIL = 0;
    public final String LL;
    public final String LLILLJJLI;
    public C731230SmH LLILLL;
    public C731230SmH LLILZ;

    public C731200SmE(Context context) {
        this(context, null, 6, 0);
    }

    public C731200SmE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static final int getImageWidth() {
        return C487560JAc.LIZ();
    }

    private final String getDislikeAnimation() {
        return C695390RPl.LJ ? "tt_feed_dislike_type1_tux_lottie.json" : "tt_feed_dislike_type2_tux_lottie.json";
    }

    private final String getDislikeCancleAnimation() {
        return C695390RPl.LJ ? "tt_feed_dislike_cancel_type1_tux_lottie.json" : "tt_feed_dislike_cancel_type2_tux_lottie.json";
    }

    @Override // X.C1303280k1G, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C1303280k1G, X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C731200SmE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = getDislikeAnimation();
        this.LLILLJJLI = getDislikeCancleAnimation();
    }

    public /* synthetic */ C731200SmE(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
