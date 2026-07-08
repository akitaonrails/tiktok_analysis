package com.bytedance.android.live.wallet.infrastructure.view;

import X.C356901a3;
import X.C786410Ut5;
import X.C820670WHh;
import Y.ARunnableS127S0100000_27;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes28.dex */
public final class WalletUSDisclaimerView$applyLayoutTransition$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ WalletUSDisclaimerView LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C820670WHh.LIZ.removeCallbacks(this.LL);
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C786410Ut5.LJLIIL(this.LLILLJJLI.LJIIIIZZ, C820670WHh.LIZ, this.LL);
    }

    public WalletUSDisclaimerView$applyLayoutTransition$observer$1(ARunnableS127S0100000_27 aRunnableS127S0100000_27, WalletUSDisclaimerView walletUSDisclaimerView) {
        this.LL = aRunnableS127S0100000_27;
        this.LLILLJJLI = walletUSDisclaimerView;
    }
}
