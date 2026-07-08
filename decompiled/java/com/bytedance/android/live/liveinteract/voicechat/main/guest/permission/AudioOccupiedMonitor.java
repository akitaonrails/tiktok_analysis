package com.bytedance.android.live.liveinteract.voicechat.main.guest.permission;

import X.C0UO0;
import X.C11JF;
import X.C19490011Na;
import X.C356901a3;
import X.C500260Jjc;
import X.C948450amx;
import X.InterfaceC420801kM;
import X.InterfaceC923890a9L;
import Y.AfS184S0100000_15;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class AudioOccupiedMonitor implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final DataChannel LL;
    public final InterfaceC923890a9L LLILLJJLI;
    public C11JF LLILLL;
    public C11JF LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

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

    public final void LIZIZ() {
        InterfaceC420801kM interfaceC420801kMLJJLL = C19490011Na.LIZ(0L, 60L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 82), new AfS184S0100000_15(this, 83));
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = (C11JF) interfaceC420801kMLJJLL;
    }

    public final void LIZ(boolean z) {
        this.LLILZIL = z;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIJLIJ = !z;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        InterfaceC420801kM interfaceC420801kMLJJLL = C19490011Na.LIZ(0L, 5L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(this, 249), new AfS184S0100000_15(this, 250));
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLL = (C11JF) interfaceC420801kMLJJLL;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C11JF c11jf = this.LLILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLL = null;
        C11JF c11jf2 = this.LLILZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLILZ = null;
        LIZ(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLILZLL = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        Boolean boolLIZJ;
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILZLL = false;
        InterfaceC923890a9L interfaceC923890a9L = this.LLILLJJLI;
        if (interfaceC923890a9L != null) {
            boolLIZJ = interfaceC923890a9L.LIZJ();
        } else {
            boolLIZJ = null;
        }
        if (C500260Jjc.LJJJI(boolLIZJ)) {
            LIZIZ();
        }
    }

    public AudioOccupiedMonitor(DataChannel dataChannel, InterfaceC923890a9L interfaceC923890a9L) {
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC923890a9L;
    }
}
