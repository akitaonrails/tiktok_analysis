package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424600Gks extends C424700Gl2 {
    @Override // X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public final void LIZJ() {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(C12ES.LIZJ(2.0f, getContext()));
        getHierarchy().LJJIII(c1331100kk8);
        getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C424600Gks(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
