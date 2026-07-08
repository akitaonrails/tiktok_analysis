package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0jrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297500jrw extends C1295960jpS {
    public static final /* synthetic */ int LL = 0;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJ(boolean z) {
        C1584506Ih.LIZ(this);
        if (z) {
            cancelAnimation();
        }
        removeAllAnimatorListeners();
        setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0jrx
            @Override // X.InterfaceC1294390jmv
            public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                return null;
            }
        });
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C1297500jrw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xv);
    }

    public C1297500jrw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1584506Ih.LIZ(this);
    }
}
