package androidx.compose.ui.platform;

import X.C20029913Yr;
import X.C20036913aZ;
import X.InterfaceC1680500tpg;
import X.InterfaceC20036713aX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class WrappedComposition implements InterfaceC20036713aX, LifecycleEventObserver {
    public final AndroidComposeView LL;
    public final InterfaceC20036713aX LLILLJJLI;
    public boolean LLILLL;
    public Lifecycle LLILZ;
    public Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> LLILZIL = C20036913aZ.LIZ;

    @Override // X.InterfaceC20036713aX
    public final void dispose() {
        if (!this.LLILLL) {
            this.LLILLL = true;
            AndroidComposeView androidComposeView = this.LL;
            androidComposeView.getView();
            androidComposeView.setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.LLILZ;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.LLILLJJLI.dispose();
    }

    @Override // X.InterfaceC20036713aX
    public final void LJIILJJIL(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        this.LL.setOnViewTreeOwnersAvailable(new AwS396S0200000_30(this, (WrappedComposition) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 3));
    }

    public WrappedComposition(AndroidComposeView androidComposeView, C20029913Yr c20029913Yr) {
        this.LL = androidComposeView;
        this.LLILLJJLI = c20029913Yr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.LLILLL) {
                return;
            }
            LJIILJJIL(this.LLILZIL);
        }
    }
}
