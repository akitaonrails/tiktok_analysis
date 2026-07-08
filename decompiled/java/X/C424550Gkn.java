package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424550Gkn extends C424560Gko {
    public C424550Gkn() {
        throw null;
    }

    @Override // X.C424560Gko, com.bytedance.lighten.loader.SmartImageView
    public final void LIZJ() {
        super.LIZJ();
        C1331070kk5 hierarchy = getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(C12ES.LIZJ(6.0f, getContext()));
        c1331100kk8.LJFF(C12ES.LIZJ(3.0f, getContext()));
        c1331100kk8.LJFF = -1;
        hierarchy.LJJIII(c1331100kk8);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C424560Gko, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C424550Gkn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
