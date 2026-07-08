package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424650Gkx extends C424630Gkv {
    public void setResizeOptions(C1324630kZh c1324630kZh) {
    }

    @Override // X.C424630Gkv
    public final void LIZ() {
        super.LIZ();
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(C12ES.LIZJ(1.0f, getContext()));
            getHierarchy().LIZJ.LJFF = C960203pA.LIZ(R.attr.bx, getContext());
            getHierarchy().LIZJ.LJIIIZ(C12ES.LIZJ(1.0f, getContext()));
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C424630Gkv, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setBorderAttrColor(int i) {
        Integer numLIZJ;
        if (getHierarchy().LIZJ != null && (numLIZJ = C1308910kAL.LIZJ(i, getContext())) != null) {
            getHierarchy().LIZJ.LJFF = numLIZJ.intValue();
        }
    }

    public void setBorderColor(int i) {
        Context context = getContext();
        if (context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (getHierarchy().LIZJ != null && numLIZJ != null) {
                getHierarchy().LIZJ.LJFF = numLIZJ.intValue();
            }
        }
    }

    public void setBorderWidth(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(C12ES.LIZJ(i, getContext()));
        }
    }

    public void setBorderWidthPx(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF(i);
        }
    }

    public C424650Gkx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
