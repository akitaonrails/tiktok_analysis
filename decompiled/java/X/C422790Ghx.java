package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Ghx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422790Ghx extends C427870Gq9 {
    public static Drawable LLJJI;

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView
    public final void LIZJ() {
        super.LIZJ();
        if (LLJJI == null) {
            LLJJI = getResources().getDrawable(2130971789);
        }
        Drawable drawable = LLJJI;
        if (!(drawable instanceof BitmapDrawable)) {
            getHierarchy().LJJI(2130971789, InterfaceC1320380kSq.LJI);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            getHierarchy().LJJI(2130971789, InterfaceC1320380kSq.LJI);
        } else {
            getHierarchy().LJJIFFI(new BitmapDrawable(getResources(), bitmap), InterfaceC1320380kSq.LJI);
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C422790Ghx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
