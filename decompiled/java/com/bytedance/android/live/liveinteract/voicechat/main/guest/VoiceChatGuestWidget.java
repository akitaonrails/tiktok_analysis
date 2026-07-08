package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.C01GW;
import X.C1555540qa8;
import X.C162100jj;
import X.C20441214yg;
import X.C2188811AlT;
import X.C307001Gy;
import X.C465900IOu;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C920460a3o;
import X.C921720a5q;
import X.C922030a6L;
import X.C922430a6z;
import X.C924630aAX;
import X.C924660aAa;
import X.C924810aAp;
import X.C925150aBN;
import X.C926770aDz;
import X.C927600aFK;
import X.C930540aK4;
import X.C933980aPc;
import X.C934690aQl;
import X.InterfaceC665370Q7z;
import X.InterfaceC922040a6M;
import X.InterfaceC923890a9L;
import X.InterfaceC924270a9x;
import X.InterfaceC954180awC;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.permission.AudioOccupiedMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatGuestWidget extends AbsVoiceChatWidget implements InterfaceC922040a6M {
    public final InterfaceC923890a9L LLILLJJLI;
    public boolean LLILLL;
    public C922030a6L LLILZ;
    public final C01GW LLILZIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(158));

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean x1(Runnable runnable, boolean z, C465900IOu c465900IOu, boolean z2) {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean y1() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void z1(String str, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    @Override // com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatGuestWidget.onResume():void");
    }

    @Override // X.InterfaceC922040a6M
    public final InterfaceC665370Q7z F3() {
        View view = getView();
        if (!(view instanceof FrameLayout) || view == null) {
            return null;
        }
        return C1555540qa8.LIZLLL(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC924270a9x interfaceC924270a9x;
        super.onCreate();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(this);
        if (interfaceC665370Q7zLIZIZ != null) {
            C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, true);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC924270a9x = (InterfaceC924270a9x) C933980aPc.LJII(dataChannel, InterfaceC924270a9x.class)) != null) {
            interfaceC924270a9x.rc();
        }
        C922030a6L c922030a6L = new C922030a6L(this, this.LLILLJJLI);
        c922030a6L.attachView(this);
        this.LLILZ = c922030a6L;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJZZIII((C921720a5q) this.LLILZIL.getValue());
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            getLifecycle().addObserver(new AudioOccupiedMonitor(dataChannel2, this.LLILLJJLI));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC924270a9x interfaceC924270a9x;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ((C921720a5q) this.LLILZIL.getValue());
        }
        if (!C925150aBN.LJJIJ(C162100jj.LIZ(this.dataChannel))) {
            C924660aAa.LJIIIIZZ();
        }
        C922030a6L c922030a6L = this.LLILZ;
        if (c922030a6L != null) {
            c922030a6L.detachView();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (interfaceC924270a9x = (InterfaceC924270a9x) C933980aPc.LJII(dataChannel, InterfaceC924270a9x.class)) != null) {
            interfaceC924270a9x.If();
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C926770aDz.LIZIZ(this);
        if (interfaceC665370Q7zLIZIZ != null) {
            C926770aDz.LIZ(interfaceC665370Q7zLIZIZ, false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy this:");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("VoiceChatGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        super.onDestroy();
        C934690aQl.LIZ.LIZIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        InterfaceC924270a9x interfaceC924270a9x;
        super.onPause();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (interfaceC924270a9x = (InterfaceC924270a9x) C933980aPc.LJII(dataChannel, InterfaceC924270a9x.class)) == null) {
            return;
        }
        interfaceC924270a9x.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C922030a6L c922030a6L = this.LLILZ;
        if (c922030a6L != null) {
            c922030a6L.LLILLJJLI = true;
            DataChannel dataChannel = c922030a6L.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(MultiLiveGuestMuteAudioEvent.class, new C922430a6z(false, "business_mute_enter_foreground"));
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.pause();
            }
            InterfaceC923890a9L interfaceC923890a9L = c922030a6L.LL;
            if (interfaceC923890a9L != null) {
                interfaceC923890a9L.LJIILL(CertProviderManagerKt.findCert("bpea-voice-linkmic_guestpre_onenterbackground", 1476788484));
            }
            InterfaceC922040a6M interfaceC922040a6M = (InterfaceC922040a6M) c922030a6L.mView;
            if (C500260Jjc.LJJIFFI(interfaceC922040a6M != null ? Boolean.valueOf(interfaceC922040a6M.Gy()) : null)) {
                WeakHandler weakHandler = c922030a6L.LLILZIL;
                if (weakHandler != null) {
                    weakHandler.sendEmptyMessageDelayed(123110, LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT);
                }
                if (!C924810aAp.LJ().LJJIL) {
                    DataChannel dataChannel2 = c922030a6L.dataChannel;
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    C924630aAX.LJJIL(dataChannel2, "guest_pause", C927600aFK.LJII(), false);
                }
            }
            C920460a3o.LJI();
        }
    }

    @Override // X.InterfaceC922040a6M
    public final boolean Gy() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC922040a6M
    public final boolean isValid() {
        return this.isViewValid;
    }

    public VoiceChatGuestWidget(InterfaceC923890a9L interfaceC923890a9L) {
        this.LLILLJJLI = interfaceC923890a9L;
    }
}
