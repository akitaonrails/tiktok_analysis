package com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic;

import X.C13LP;
import X.C356901a3;
import X.C955400ayA;
import X.C960270b61;
import X.C962380b9Q;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractRandomLinkMicSmallViewBinder$InteractRandomLinkMicSmallViewHolder$showSelectInterestTagView$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C962380b9Q LL;

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

    public InteractRandomLinkMicSmallViewBinder$InteractRandomLinkMicSmallViewHolder$showSelectInterestTagView$2(C962380b9Q c962380b9Q) {
        this.LL = c962380b9Q;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        String str;
        C356901a3.LIZIZ(this, lifecycleOwner);
        C962380b9Q c962380b9Q = this.LL;
        if (c962380b9Q.LLJJL) {
            str = "edit";
        } else if (c962380b9Q.LLJJJJLIIL) {
            str = "more";
        } else {
            str = "quit";
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C960270b61.LIZ(), null, null, null, 0, null, AFwS250S0000000_15.get$arr$(89), 31);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C962380b9Q c962380b9Q2 = this.LL;
        C955400ayA.LLIIL("quick_invite_card", str, "small_card", c962380b9Q2.LLJJJJ, c962380b9Q2.LLJJJJJIL, strLJJLIIIJ, !Intrinsics.LJFF(r14, strLJJLIIIJ), Boolean.FALSE);
    }
}
