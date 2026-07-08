package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.C356901a3;
import X.C755770Tkl;
import X.C776250Uch;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.RealLinkControlWidgetCreatedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes16.dex */
public final class LandscapeLinkControlWidget implements DefaultLifecycleObserver, IInterceptor, GenericLifecycleObserver {
    public final DataChannel LL;
    public final List<IMessage> LLILLJJLI = new CopyOnWriteArrayList();

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

    public LandscapeLinkControlWidget(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        IMessageManager iMessageManager;
        C356901a3.LIZ(this, lifecycleOwner);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.SX0(C755770Tkl.class, null);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.addInterceptor(this);
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(lifecycleOwner, RealLinkControlWidgetCreatedChannel.class, new AwS591S0100000_12(this, 125));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeInterceptor(this);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(lifecycleOwner);
        }
        ((CopyOnWriteArrayList) this.LLILLJJLI).clear();
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C755770Tkl.class, null);
        }
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        r8.add(new X.C968800bJm(r1));
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage
            r5 = 0
            if (r0 == 0) goto Lbb
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting.isEnable()
            if (r0 != 0) goto Lbb
            r4 = r11
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r4 = (com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage) r4
            int r1 = r4.scene
            r0 = 4
            if (r1 != r0) goto L85
            int r0 = r4.messageType
            r1 = 2
            if (r0 != r1) goto L85
            android.content.Context r0 = com.bytedance.android.livesdk.util.GlobalContext.getApplicationContext()
            if (r0 == 0) goto L85
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L85
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L85
            int r0 = r0.orientation
            if (r0 != r1) goto L85
            java.util.List<com.ss.ugc.live.sdk.message.data.IMessage> r0 = r10.LLILLJJLI
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.add(r11)
            long r1 = r4.getMessageId()
            com.bytedance.ies.sdk.datachannel.DataChannel r9 = r10.LL
            if (r9 == 0) goto L72
            java.lang.Class<X.0Tkl> r0 = X.C755770Tkl.class
            java.lang.Object r8 = r9.gg0(r0)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L4c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L4c:
            java.util.Iterator r7 = r8.iterator()
        L50:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r3 = r7.next()
            r0 = r3
            X.0bJm r0 = (X.C968800bJm) r0
            long r5 = r0.LIZ
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            if (r3 != 0) goto L6d
        L65:
            X.0bJm r0 = new X.0bJm
            r0.<init>(r1)
            r8.add(r0)
        L6d:
            java.lang.Class<X.0Tkl> r0 = X.C755770Tkl.class
            r9.SX0(r0, r8)
        L72:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r10.LL
            if (r1 == 0) goto L7b
            java.lang.Class<com.bytedance.android.livesdk.watch.OrientationChangeEvent> r0 = com.bytedance.android.livesdk.watch.OrientationChangeEvent.class
            r1.FQ2(r0)
        L7b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r10.LL
            if (r1 == 0) goto L84
            java.lang.Class<com.bytedance.android.live.gift.ResetSilentTimerEvent> r0 = com.bytedance.android.live.gift.ResetSilentTimerEvent.class
            r1.FQ2(r0)
        L84:
            r5 = 1
        L85:
            X.1AZW r3 = X.C1AZW.LIZ
            java.lang.String r2 = "LandscapeLinkControlWidget"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "intercept message: scene="
            r1.append(r0)
            int r0 = r4.scene
            r1.append(r0)
            java.lang.String r0 = ", type="
            r1.append(r0)
            int r0 = r4.messageType
            r1.append(r0)
            java.lang.String r0 = ", intercept = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 0
            r3.getClass()
            X.C1AZW.LIZ(r2, r1, r0, r0)
            if (r5 == 0) goto Lbb
            com.ss.ugc.live.sdk.message.MessageMonitor$DispatchStatus r0 = com.ss.ugc.live.sdk.message.MessageMonitor.DispatchStatus.SKIPPING_EXPLICIT
            com.ss.ugc.live.sdk.message.MessageMonitor.markDispatchStatus(r11, r0)
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroom.widget.LandscapeLinkControlWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):boolean");
    }
}
