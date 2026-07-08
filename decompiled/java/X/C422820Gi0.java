package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Gi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C422820Gi0 extends C424620Gku {
    @Override // X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public void LIZJ() {
        super.LIZJ();
        try {
            getHierarchy().LJJI(2130971789, InterfaceC1320380kSq.LJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                C844470XAv.LIZ.getClass();
                Drawable drawableLIZ = C14MI.LIZ(C844470XAv.LIZ(), 2130971789);
                if (drawableLIZ != null) {
                    getHierarchy().LJJIFFI(drawableLIZ, InterfaceC1320380kSq.LJI);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public C422820Gi0(Context context) {
        super(context);
    }

    @Override // X.C424620Gku, X.C424700Gl2, com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C422820Gi0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C422820Gi0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
