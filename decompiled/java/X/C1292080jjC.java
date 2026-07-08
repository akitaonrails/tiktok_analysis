package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0jjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292080jjC extends C16FV {
    public boolean LLILZIL;

    public C1292080jjC() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILZIL = true;
    }

    @Override // X.C16FV, X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C16FV, android.view.View
    public void setBackground(Drawable drawable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBackground called for view id=");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("only local support");
        sbLIZ.append(" drawable=");
        sbLIZ.append(drawable);
        sbLIZ.append(" inflated=");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("ImmutableBgView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILZIL) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBackgroundColor called for view id=");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("only local support");
        sbLIZ.append(" color=");
        sbLIZ.append(i);
        sbLIZ.append(" inflated=");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("ImmutableBgView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILZIL) {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    @InterfaceC1294060jmO
    public void setBackgroundDrawable(Drawable drawable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBackgroundDrawable called for view id=");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("only local support");
        sbLIZ.append(" drawable=");
        sbLIZ.append(drawable);
        sbLIZ.append(" inflated=");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("ImmutableBgView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILZIL) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // X.C16FV, androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBackgroundResource called for view id=");
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("only local support");
        sbLIZ.append(" resId=");
        sbLIZ.append(i);
        sbLIZ.append(" inflated=");
        sbLIZ.append(this.LLILZIL);
        C20441214yg.LIZIZ("ImmutableBgView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILZIL) {
            super.setBackgroundResource(i);
        }
    }

    public C1292080jjC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
