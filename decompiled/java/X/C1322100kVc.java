package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0kVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322100kVc extends C1322090kVb<C1331070kk5> {
    public void com_facebook_drawee_view_GenericDraweeView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_facebook_drawee_view_GenericDraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    public C1322100kVc(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public C1322100kVc(Context context, C1331070kk5 c1331070kk5) {
        super(context);
        setHierarchy(c1331070kk5);
    }

    public static void com_facebook_drawee_view_GenericDraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1322100kVc c1322100kVc, Canvas canvas) {
        try {
            c1322100kVc.com_facebook_drawee_view_GenericDraweeView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1322100kVc);
            throw e;
        }
    }

    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        C1336010ks3.LIZIZ();
        C1331090kk7 c1331090kk7LIZLLL = C1335990ks1.LIZLLL(context, attributeSet);
        setAspectRatio(c1331090kk7LIZLLL.LIZLLL);
        setHierarchy(c1331090kk7LIZLLL.LIZ());
        C1336010ks3.LIZIZ();
    }

    public C1322100kVc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public C1322100kVc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public C1322100kVc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
