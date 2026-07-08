package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0toW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679780toW extends FrameLayout implements LifecycleOwner, C128Y {
    public final LifecycleRegistry LL;
    public final C197065128h LLILLJJLI;
    public final C05P0<Bitmap> LLILLL;
    public final InterfaceC1676320tiw LLILZ;
    public final C05P0<Float> LLILZIL;
    public Function0<Unit> LLILZLL;

    @Override // X.C128Y
    public C197066128i getSavedStateRegistry() {
        return this.LLILLJJLI.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    public C1679780toW(Context context) {
        super(context);
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LL = lifecycleRegistry;
        C197065128h c197065128hLIZ = C197069128l.LIZ(this);
        this.LLILLJJLI = c197065128hLIZ;
        this.LLILLL = C20028913Yh.LJI(null);
        this.LLILZ = C1696870uG5.LIZ(0);
        this.LLILZIL = C20028913Yh.LJI(Float.valueOf(0.0f));
        c197065128hLIZ.LIZ(null);
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ViewTreeLifecycleOwner.set(this, this);
        setTag(R.id.view_tree_saved_state_registry_owner, this);
        ComposeView composeView = new ComposeView(context, null, 6);
        C786410Ut5.k6(composeView, new FrameLayout.LayoutParams(-1, -1));
        composeView.setViewCompositionStrategy(C20088113ip.LIZIZ);
        composeView.setContent(new C19719212De(-2075371728, new AwS639S0100000_25(this, 0), true));
        addView(composeView);
    }
}
