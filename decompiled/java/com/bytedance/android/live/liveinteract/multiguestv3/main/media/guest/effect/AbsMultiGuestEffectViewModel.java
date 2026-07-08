package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C01GW;
import X.C0U78;
import X.C292401Bi;
import X.C377010EqJ;
import X.C769720UHi;
import X.InterfaceC769000UEo;
import X.InterfaceC769650UHb;
import X.InterfaceC923870a9J;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbsMultiGuestEffectViewModel extends ViewModelExt {
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final InterfaceC923870a9J LLILZ;
    public InterfaceC769650UHb LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 68));
    public final C377010EqJ LLILZLL = C769720UHi.LIZ();
    public final C377010EqJ LLIZ = C769720UHi.LIZ();
    public final C377010EqJ LLIZLLLIL = C769720UHi.LIZ();
    public final C377010EqJ LLJ = C769720UHi.LIZ();
    public final C377010EqJ LLJI = new C377010EqJ(new Channel());
    public final C377010EqJ LLJIJIL = C769720UHi.LIZ();
    public final C377010EqJ LLJILJIL = C769720UHi.LIZ();
    public final C377010EqJ LLJJ = C769720UHi.LIZ();

    public final InterfaceC769000UEo vQ2() {
        InterfaceC923870a9J interfaceC923870a9J = this.LLILZ;
        Object attachedComposerManager = interfaceC923870a9J != null ? interfaceC923870a9J.getAttachedComposerManager() : null;
        if (attachedComposerManager instanceof InterfaceC769000UEo) {
            return (InterfaceC769000UEo) attachedComposerManager;
        }
        return null;
    }

    public final C0U78 wQ2() {
        InterfaceC923870a9J interfaceC923870a9J = this.LLILZ;
        Object attachedComposerManager = interfaceC923870a9J != null ? interfaceC923870a9J.getAttachedComposerManager() : null;
        if (attachedComposerManager instanceof C0U78) {
            return (C0U78) attachedComposerManager;
        }
        return null;
    }

    public AbsMultiGuestEffectViewModel(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC923870a9J interfaceC923870a9J) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = interfaceC923870a9J;
    }
}
