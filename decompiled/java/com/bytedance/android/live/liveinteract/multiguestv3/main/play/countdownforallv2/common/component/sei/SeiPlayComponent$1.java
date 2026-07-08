package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.component.sei;

import X.C356801a2;
import X.C356901a3;
import X.InterfaceC940430aa1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class SeiPlayComponent$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C356801a2<InterfaceC940430aa1> LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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

    public SeiPlayComponent$1(C356801a2<InterfaceC940430aa1> c356801a2) {
        this.LL = c356801a2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().removeObserver(this);
        C356801a2<InterfaceC940430aa1> c356801a2 = this.LL;
        c356801a2.LJ = true;
        c356801a2.LIZIZ.clear();
        c356801a2.LIZJ.clear();
        c356801a2.LIZLLL.clear();
        c356801a2.LIZ = null;
    }
}
