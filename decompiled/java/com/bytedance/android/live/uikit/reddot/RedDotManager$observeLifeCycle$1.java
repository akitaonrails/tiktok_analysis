package com.bytedance.android.live.uikit.reddot;

import X.C09AJ;
import X.C0UX8;
import X.C11JF;
import X.C19491211Nm;
import X.C19719512Dh;
import X.C782710Un7;
import X.C782780UnE;
import X.C782850UnL;
import Y.AfS181S0100000_12;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class RedDotManager$observeLifeCycle$1 implements GenericLifecycleObserver {
    public final C0UX8 LL = C782710Un7.LJFF;
    public C11JF LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        C782710Un7.LJ = true;
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        C19491211Nm c19491211NmLJ = C782850UnL.LJ();
        LifecycleOwner lifecycleOwner = this.LLILLL;
        this.LLILLJJLI = (C11JF) c19491211NmLJ.LJJLL(new AfS181S0100000_12(lifecycleOwner, 46), new AfS181S0100000_12(lifecycleOwner, 47));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        C11JF c11jf = this.LLILLJJLI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        HashMap<C0UX8, C782780UnE> map = C782710Un7.LJIIIIZZ;
        C19719512Dh.LIZJ(map).remove(this.LL);
    }

    public RedDotManager$observeLifeCycle$1(LifecycleOwner lifecycleOwner) {
        this.LLILLL = lifecycleOwner;
    }
}
