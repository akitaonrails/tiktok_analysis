package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422840Gi2 extends C422820Gi0 {
    public C422840Gi2() {
        this(null, null, 7);
    }

    public C422840Gi2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C422820Gi0, X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public final void LIZJ() {
        super.LIZJ();
        C1331100kk8 c1331100kk8 = getHierarchy().LIZJ;
        if (c1331100kk8 != null) {
            c1331100kk8.LJFF(C12ES.LIZJ(1.0f, getContext()));
            c1331100kk8.LJFF = C960203pA.LIZ(R.attr.bv, getContext());
            c1331100kk8.LJIIIZ(C12ES.LIZJ(1.0f, getContext()));
        }
        getHierarchy().LJJI(R.raw.icon_color_default_avatar, InterfaceC1320380kSq.LJI);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C422820Gi0, X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C422840Gi2(Context context, AttributeSet attributeSet, int i) {
        super((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
