package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1325000kaI extends C1322110kVd {
    public WeakReference<InterfaceC1325010kaJ> LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1339410kxX LLILZIL;

    public String getUrl() {
        return "";
    }

    public void setImageLoadFinishListener(InterfaceC787180UuK interfaceC787180UuK) {
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public InterfaceC1320650kTH<InterfaceC1330440kj4> getControllerListener() {
        return this.LLILZIL;
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setAnimationListener(InterfaceC1325010kaJ interfaceC1325010kaJ) {
        this.LL = new WeakReference<>(interfaceC1325010kaJ);
    }

    public void setAttached(boolean z) {
        this.LLILLJJLI = z;
    }

    public void setUserVisibleHint(boolean z) {
        this.LLILZ = z;
    }

    public C1325000kaI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new C1339410kxX(this, 4);
    }
}
