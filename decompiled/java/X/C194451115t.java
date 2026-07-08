package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.115t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194451115t extends FrameLayout implements C128Y, ViewModelStoreOwner, HasDefaultViewModelProviderFactory {
    public final LifecycleRegistry LL;
    public final C01GW LLILLJJLI;
    public final C197065128h LLILLL;
    public ViewModelProvider.Factory LLILZ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    private final ViewModelProvider.Factory getDefaultViewModelProviderFactoryInner() {
        ViewModelProvider.Factory savedStateViewModelFactory = this.LLILZ;
        if (savedStateViewModelFactory == null) {
            savedStateViewModelFactory = new SavedStateViewModelFactory(C1BWL.LIZ(), this, null);
        }
        this.LLILZ = savedStateViewModelFactory;
        return savedStateViewModelFactory;
    }

    @Override // X.C128Y
    public C197066128i getSavedStateRegistry() {
        return this.LLILLL.LIZIZ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLILLJJLI.getValue();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return getDefaultViewModelProviderFactoryInner();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        LIZLLL();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "parent_saved_state", parcelableOnSaveInstanceState);
        this.LLILLL.LIZIZ(bundle);
        return bundle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    public C194451115t(Context context) {
        super(context);
        this.LL = new LifecycleRegistry(this);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(453));
        this.LLILLL = C197069128l.LIZ(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parent_saved_state"));
            this.LLILLL.LIZ(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (!((Boolean) C279710Axl.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (i == 0) {
            if (C19386310sv.LIZ(this)) {
                LIZ();
            }
        } else {
            if (i != 1 || C19386310sv.LIZ(this)) {
                return;
            }
            LIZIZ();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else {
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }
}
