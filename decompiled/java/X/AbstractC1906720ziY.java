package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0ziY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1906720ziY implements C06LL, C03K6, InterfaceC1906740zia {
    public InterfaceC1906710ziX LL;
    public RecyclerView LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1906730ziZ(this));
    public final LifecycleRegistry LLILZIL = new LifecycleRegistry(this);
    public final C20600815jK<InterfaceC1891350zJl> LLILZLL = new C20600815jK<>();
    public final List<AbstractC21686119tz> LLIZ = new ArrayList();

    public AbstractC329610Cw3<?> LJIIJJI() {
        return null;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume(boolean z) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public final InterfaceC1906710ziX LJIIJ() {
        InterfaceC1906710ziX interfaceC1906710ziX = this.LL;
        if (interfaceC1906710ziX != null) {
            return interfaceC1906710ziX;
        }
        return null;
    }

    @Override // X.C03K6
    public final Context getContext() {
        return LJIIJ().getContext();
    }

    @Override // X.C03K6
    public final LifecycleOwner getCurrentLifeCycleOwner() {
        return LJIIJ().getLifecycleOwner();
    }

    public final List<InterfaceC1891350zJl> getItems() {
        return LJIIJ().LJIILJJIL();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // X.InterfaceC1906740zia
    public final LifecycleRegistry getLifecycleRegistry() {
        return this.LLILZIL;
    }

    public final void LIZ(View view) {
        if (view != null) {
            LJIIJ().LJIIJ(view);
        }
    }

    public final void LJII(View view) {
        LJIIJ().LJFF(0, view);
    }

    public final void LJIILIIL(Class<? extends PowerCell<?>>... clsArr) {
        LJIIJ().LIZIZ(this.LLILLJJLI, C13LQ.LJJLL(clsArr));
    }

    public final void LJIJJLI(View view) {
        if (view != null) {
            LJIIJ().LJIIIIZZ(Collections.singletonList(view));
        }
    }

    @Override // X.C06LL
    public final <T extends ViewModel> T getActivityViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        return (T) LJIIJ().getActivityViewModel(cls, factory);
    }

    @Override // X.C06LL
    public final <T extends ViewModel> T getFragmentViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        return (T) LJIIJ().getFragmentViewModel(cls, factory);
    }
}
