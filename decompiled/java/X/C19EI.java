package X;

import android.content.res.Configuration;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.PrintWriter;

/* JADX INFO: renamed from: X.19EI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19EI extends AnonymousClass1996<C19EG> implements InterfaceC19739612La, InterfaceC21507519Ez, InterfaceC21507319Ex, InterfaceC21507419Ey, ViewModelStoreOwner, InterfaceC1671500tbA, InterfaceC1670800ta2, C128Y, InterfaceC1840220xzI, C19F8 {
    public final /* synthetic */ C19EG LLILZIL;

    @Override // X.AnonymousClass1996, X.C19F6
    public final boolean LIZJ() {
        Window window = this.LLILZIL.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.AnonymousClass1996
    public final LayoutInflater LJIIIIZZ() {
        return this.LLILZIL.getLayoutInflater().cloneInContext(this.LLILZIL);
    }

    @Override // X.AnonymousClass1996
    public final void LJIIL() {
        this.LLILZIL.invalidateMenu();
    }

    @Override // X.InterfaceC1670800ta2
    public final C19FF getActivityResultRegistry() {
        return this.LLILZIL.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL.mFragmentLifecycleRegistry;
    }

    @Override // X.InterfaceC1671500tbA
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LLILZIL.getOnBackPressedDispatcher();
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        return this.LLILZIL.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLILZIL.getViewModelStore();
    }

    @Override // X.AnonymousClass1996
    public final /* bridge */ /* synthetic */ C19EG LJII() {
        return this.LLILZIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19EI(C19EG c19eg) {
        super(c19eg, c19eg, new Handler());
        this.LLILZIL = c19eg;
    }

    @Override // X.InterfaceC1840220xzI
    public final void LIZ(Fragment fragment) {
        this.LLILZIL.onAttachFragment(fragment);
    }

    @Override // X.AnonymousClass1996, X.C19F6
    public final View LIZIZ(int i) {
        return this.LLILZIL.findViewById(i);
    }

    @Override // X.AnonymousClass1996
    public final boolean LJIIJ(String str) {
        return C0VE9.LJIIJ(this.LLILZIL, str);
    }

    @Override // X.C19F8
    public final void addMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        this.LLILZIL.addMenuProvider(interfaceC21506819Es);
    }

    @Override // X.InterfaceC19739612La
    public final void addOnConfigurationChangedListener(C092O<Configuration> c092o) {
        this.LLILZIL.addOnConfigurationChangedListener(c092o);
    }

    @Override // X.InterfaceC21507319Ex
    public final void addOnMultiWindowModeChangedListener(C092O<C19FD> c092o) {
        this.LLILZIL.addOnMultiWindowModeChangedListener(c092o);
    }

    @Override // X.InterfaceC21507419Ey
    public final void addOnPictureInPictureModeChangedListener(C092O<C480030Is5> c092o) {
        this.LLILZIL.addOnPictureInPictureModeChangedListener(c092o);
    }

    @Override // X.InterfaceC21507519Ez
    public final void addOnTrimMemoryListener(C092O<Integer> c092o) {
        this.LLILZIL.addOnTrimMemoryListener(c092o);
    }

    @Override // X.C19F8
    public final void removeMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        this.LLILZIL.removeMenuProvider(interfaceC21506819Es);
    }

    @Override // X.InterfaceC19739612La
    public final void removeOnConfigurationChangedListener(C092O<Configuration> c092o) {
        this.LLILZIL.removeOnConfigurationChangedListener(c092o);
    }

    @Override // X.InterfaceC21507319Ex
    public final void removeOnMultiWindowModeChangedListener(C092O<C19FD> c092o) {
        this.LLILZIL.removeOnMultiWindowModeChangedListener(c092o);
    }

    @Override // X.InterfaceC21507419Ey
    public final void removeOnPictureInPictureModeChangedListener(C092O<C480030Is5> c092o) {
        this.LLILZIL.removeOnPictureInPictureModeChangedListener(c092o);
    }

    @Override // X.InterfaceC21507519Ez
    public final void removeOnTrimMemoryListener(C092O<Integer> c092o) {
        this.LLILZIL.removeOnTrimMemoryListener(c092o);
    }

    @Override // X.AnonymousClass1996
    public final void LJI(PrintWriter printWriter, String[] strArr) {
        this.LLILZIL.dump("  ", null, printWriter, strArr);
    }
}
