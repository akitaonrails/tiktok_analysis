package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0SmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731400SmY extends C731860SnI {
    @Override // X.C731860SnI
    public int getLandscapeDrawableWidth() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    @Override // X.C731860SnI
    public C731340SmS getFavoriteViewScaleHelper() {
        C731340SmS scaleHelper = getScaleHelper();
        if (scaleHelper != null) {
            return scaleHelper;
        }
        C731340SmS c731340SmS = new C731340SmS() { // from class: X.0SmX
            @Override // X.C731340SmS
            public final int LJFF() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
        };
        setScaleHelper(c731340SmS);
        return c731340SmS;
    }

    @Override // X.C1303280k1G, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C731860SnI, X.C1303280k1G, X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C731400SmY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }
}
