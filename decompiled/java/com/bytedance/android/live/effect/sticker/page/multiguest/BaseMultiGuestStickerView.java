package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C01GW;
import X.C0U98;
import X.C0UA3;
import X.C0UCH;
import X.C0UCI;
import X.C0UCY;
import X.C0UD4;
import X.C13LP;
import X.C20441214yg;
import X.C452501pT;
import X.C475510Ikn;
import X.C786410Ut5;
import X.InterfaceC1268640j7O;
import X.InterfaceC769000UEo;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.effect.model.EffectDataRestoreSucc;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseMultiGuestStickerView implements GenericLifecycleObserver {
    public static boolean LLJIJIL;
    public final Fragment LL;
    public final InterfaceC1268640j7O LLILLJJLI;
    public final InterfaceC769000UEo LLILLL;
    public final ViewGroup LLILZ;
    public final boolean LLILZIL;
    public final DataChannel LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(33));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 62));
    public final C0U98 LLJ = new C0U98(this);
    public final C0UCH LLJI;

    public abstract View LJFF();

    public abstract String LJI();

    public abstract void LJIIJJI();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final View LJII() {
        return (View) this.LLIZLLLIL.getValue();
    }

    public final LiveEffect LJIIIIZZ() {
        List<LiveEffect> listQr;
        InterfaceC769000UEo interfaceC769000UEo = this.LLILLL;
        if (interfaceC769000UEo == null || (listQr = interfaceC769000UEo.qr(C0UD4.LJ)) == null) {
            return null;
        }
        return (LiveEffect) C13LP.LJJJLL(listQr);
    }

    public final void LJIIIZ() {
        this.LL.getLifecycle().addObserver(this);
        this.LLJ.LJIIJJI(C0UD4.LJ);
        this.LLJ.LJIILL(this.LLILZ);
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, MultiGuestPreviewCameraOpenEvent.class, new AwS591S0100000_12(this, 103));
            dataChannel.BQ2(this.LL, EffectDataRestoreSucc.class, new AwS591S0100000_12(this, 104));
        }
    }

    public void LJIIJ() {
        C0U98 c0u98 = this.LLJ;
        String str = C0UD4.LIZ;
        c0u98.getClass();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C20441214yg.LIZIZ("EffectMonitor#guest", "onDestroyed");
        C0UCH c0uch = this.LLJI;
        if (c0uch != null) {
            c0uch.onDestroy();
        }
        this.LL.getLifecycle().removeObserver(this);
        C786410Ut5.LJJJJI(this.LLILZ);
    }

    public BaseMultiGuestStickerView(Fragment fragment, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, ViewGroup viewGroup, C0UCY c0ucy, boolean z) {
        C0UCH c0uch;
        this.LL = fragment;
        this.LLILLJJLI = interfaceC1268640j7O;
        this.LLILLL = interfaceC769000UEo;
        this.LLILZ = viewGroup;
        this.LLILZIL = z;
        this.LLILZLL = C475510Ikn.LJ(fragment);
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            c0uch = null;
        } else {
            WeakReference weakReference = new WeakReference(dataChannel);
            c0uch = new C0UCH(weakReference, new WeakReference(this.LL), c0ucy);
            DataChannel dataChannel2 = (DataChannel) weakReference.get();
            if (dataChannel2 != null) {
                dataChannel2.SX0(C0UA3.class, c0uch);
            }
            c0uch.LJIIIZ = new AwS626S0100000_12(this, 7);
            C0UCI c0uciLJIILIIL = c0uch.LJIILIIL();
            if (c0uciLJIILIIL != null) {
                c0uciLJIILIIL.setComposerManager(interfaceC769000UEo);
            }
        }
        this.LLJI = c0uch;
    }
}
