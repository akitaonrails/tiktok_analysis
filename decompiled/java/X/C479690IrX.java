package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479690IrX extends LiveIconView {
    public C479690IrX() {
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        Context context = getContext();
        if (z) {
            i = R.attr.c9i;
        } else {
            i = R.attr.c9m;
        }
        setIconTint(C20736316Cj.LIZIZ(i, context));
    }

    public C479690IrX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
