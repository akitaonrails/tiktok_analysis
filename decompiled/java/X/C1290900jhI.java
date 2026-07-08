package X;

import android.content.Context;
import android.graphics.Canvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.lynx.base.log.LynxLog;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0jhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290900jhI extends C1291330jhz {
    public boolean LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // X.C1291330jhz, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        if (this.LLJJIJI) {
            return;
        }
        super.onAttachedToWindow();
        if (this.LLJJ && this.LLJJIJIIJIL) {
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL.LLILLL;
            if (choreographerFrameCallbackC1291420ji8 == null || !choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                playAnimation();
            }
        }
    }

    @Override // X.C1291330jhz, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!this.LLJJIJI) {
            ChoreographerFrameCallbackC1291420ji8 choreographerFrameCallbackC1291420ji8 = this.LLILLL.LLILLL;
            if (choreographerFrameCallbackC1291420ji8 != null && choreographerFrameCallbackC1291420ji8.LLJIJIL) {
                this.LLJJIJIIJIL = true;
            }
            super.onDetachedFromWindow();
            cancelAnimation();
        }
        C20597815iq.LIZ(this);
    }

    public final boolean getDestroyed() {
        return this.LLJJI;
    }

    public final boolean getIgnoreAttachStatus() {
        return this.LLJJIJI;
    }

    public final boolean getMAutoPlay() {
        return this.LLJJ;
    }

    public final String getSrcUrl() {
        return this.LLJJIII;
    }

    public C1290900jhI(Context context) {
        new LinkedHashMap();
        super(context);
    }

    @Override // X.C1291330jhz, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (this.LLJJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("draw lottie-view after destroyed with src ");
                sbLIZ.append(this.LLJJIII);
                LynxLog.d("byted-lottie", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setDestroyed(boolean z) {
        this.LLJJI = z;
    }

    public final void setIgnoreAttachStatus(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setMAutoPlay(boolean z) {
        this.LLJJ = z;
    }

    public final void setSrcUrl(String str) {
        this.LLJJIII = str;
    }
}
