package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456220Hum extends TuxTextView implements LifecycleOwner {
    public final C01GW LLJJJJ;
    public boolean LLJJJJJIL;

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLJJJJ.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final void setSelect(boolean z) {
        this.LLJJJJJIL = z;
    }

    public C456220Hum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1293));
    }
}
