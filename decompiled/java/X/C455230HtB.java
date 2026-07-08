package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455230HtB extends SmartImageView implements LifecycleOwner {
    public final C01GW LLIZLLLIL;
    public boolean LLJ;

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLIZLLLIL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setSelect(boolean z) {
        this.LLJ = z;
    }

    public C455230HtB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C455230HtB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 81));
    }
}
