package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common;

import X.C1107810evz;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C356901a3;
import X.C989730brX;
import X.C989740brY;
import X.InterfaceC1102350enB;
import X.InterfaceC1107760evu;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUiStateListenerManager;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TextHeaderUiStateListenerManager implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final List<C989740brY> LLILZIL = C1697810uHb.LJIIJJI(new C989740brY(0, new C989730brX(1, Collections.singletonList(2)), null, 5), new C989740brY(0, new C989730brX(3, Collections.singletonList(2)), null, 5), new C989740brY(0, new C989730brX(5, Collections.singletonList(0)), null, 5), new C989740brY(0, new C989730brX(4, Collections.singletonList(0)), null, 5), new C989740brY(2, null, C1107810evz.LJJJJIZL, 2));
    public final DataChannel LL;
    public final Map<C989740brY, InterfaceC1102350enB> LLILLJJLI = new HashMap();
    public final Map<C989740brY, InterfaceC1107760evu> LLILLL = new HashMap();
    public final ArrayList<Object> LLILZ = new ArrayList<>();

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

    public final void LIZ() {
        DataChannel dataChannel;
        for (Map.Entry entry : ((HashMap) this.LLILLJJLI).entrySet()) {
            int i = ((C989740brY) entry.getKey()).LIZ;
            if (i == 1) {
                C989730brX c989730brX = ((C989740brY) entry.getKey()).LIZIZ;
                if (c989730brX != null) {
                    Iterator<Integer> it2 = c989730brX.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).iF2(this.LL, c989730brX.LIZ, it2.next().intValue(), (InterfaceC1102350enB) entry.getValue());
                    }
                }
            } else if (i == 2 && (dataChannel = this.LL) != null) {
                Iterator it3 = ((HashMap) this.LLILLL).entrySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it3.next();
                        InterfaceC1107760evu interfaceC1107760evu = (InterfaceC1107760evu) entry2.getValue();
                        if (interfaceC1107760evu != null) {
                            ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).Eq(dataChannel, interfaceC1107760evu);
                            break;
                        }
                    }
                }
            }
        }
        ((HashMap) this.LLILLJJLI).clear();
        ((HashMap) this.LLILLL).clear();
        this.LLILZ.clear();
    }

    public TextHeaderUiStateListenerManager(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r12) {
        /*
            r11 = this;
            java.util.List<X.0brY> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUiStateListenerManager.LLILZIL
            java.util.Iterator r10 = r0.iterator()
        L6:
            boolean r0 = r10.hasNext()
            java.lang.String r4 = "TextHeaderUiStateListenerManager"
            r3 = 1
            r2 = 2
            if (r0 == 0) goto La5
            java.lang.Object r5 = r10.next()
            r8 = r5
            X.0brY r8 = (X.C989740brY) r8
            int r0 = r8.LIZ
            if (r0 == r3) goto L70
            if (r0 != r2) goto L6
            com.bytedance.ies.sdk.datachannel.DataChannel r6 = r11.LL
            if (r6 == 0) goto L6
            java.lang.Class<com.bytedance.android.live.notify.ILiveNotifyService> r0 = com.bytedance.android.live.notify.ILiveNotifyService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.notify.ILiveNotifyService r1 = (com.bytedance.android.live.notify.ILiveNotifyService) r1
            X.0evz r0 = X.C1107810evz.LJJJJIZL
            boolean r1 = r1.TE(r6, r0)
        L2f:
            if (r1 == 0) goto L6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateUiState active info:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C972080bP4.LIZLLL(r0, r4, r2)
            if (r5 == 0) goto L47
            r3 = 2
        L47:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateUiState source:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " activeState:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C972080bP4.LIZLLL(r0, r4, r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r11.LL
            if (r2 == 0) goto L6f
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderDisplayStateChannel> r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderDisplayStateChannel.class
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.zW(r1, r0)
        L6f:
            return
        L70:
            X.0brX r0 = r8.LIZIZ
            if (r0 == 0) goto L6
            java.util.List<java.lang.Integer> r0 = r0.LIZIZ
            if (r0 == 0) goto L6
            java.util.Iterator r9 = r0.iterator()
        L7c:
            r1 = 0
        L7d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r9.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            if (r1 != 0) goto La3
            java.lang.Class<com.bytedance.android.live.notify.ILiveNotifyService> r0 = com.bytedance.android.live.notify.ILiveNotifyService.class
            X.006A r6 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.notify.ILiveNotifyService r6 = (com.bytedance.android.live.notify.ILiveNotifyService) r6
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r11.LL
            X.0brX r0 = r8.LIZIZ
            int r0 = r0.LIZ
            boolean r0 = r6.x82(r0, r1, r7)
            if (r0 == 0) goto L7c
        La3:
            r1 = 1
            goto L7d
        La5:
            r5 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUiStateListenerManager.LIZIZ(java.lang.String):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        LIZ();
        for (final C989740brY c989740brY : LLILZIL) {
            int i = c989740brY.LIZ;
            if (i != 1) {
                if (i == 2 && this.LL != null) {
                    InterfaceC1107760evu interfaceC1107760evu = new InterfaceC1107760evu() { // from class: X.0epx
                        @Override // X.InterfaceC1107760evu
                        public final void LIZIZ(C1107810evz c1107810evz, boolean z, C1107780evw c1107780evw) {
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZ() {
                            this.LIZ.LIZIZ("onAllInvisible");
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZJ() {
                            this.LIZ.LIZIZ("onAllVisible");
                        }
                    };
                    ILiveNotifyService iLiveNotifyService = (ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class);
                    DataChannel dataChannel = this.LL;
                    C1107810evz c1107810evz = C1107810evz.LJJJJIZL;
                    iLiveNotifyService.sf(dataChannel, Collections.singletonList(c1107810evz), interfaceC1107760evu, c1107810evz.LIZ, null, true);
                }
            } else {
                InterfaceC1102350enB interfaceC1102350enB = new InterfaceC1102350enB() { // from class: X.0epw
                    @Override // X.InterfaceC1102350enB
                    public final void LIZ() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c989740brY);
                        sbLIZ.append(" onConsumed");
                        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderUiStateListenerManager", 2);
                        TextHeaderUiStateListenerManager textHeaderUiStateListenerManager = this;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onConsumed_");
                        sbLIZ2.append(c989740brY);
                        textHeaderUiStateListenerManager.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC1102350enB
                    public final void LIZIZ() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c989740brY);
                        sbLIZ.append(" onActive");
                        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderUiStateListenerManager", 2);
                        TextHeaderUiStateListenerManager textHeaderUiStateListenerManager = this;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onActive_");
                        sbLIZ2.append(c989740brY);
                        textHeaderUiStateListenerManager.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                };
                ((HashMap) this.LLILLJJLI).put(c989740brY, interfaceC1102350enB);
                C989730brX c989730brX = c989740brY.LIZIZ;
                if (c989730brX != null) {
                    Iterator<Integer> it2 = c989730brX.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).tc2(this.LL, c989730brX.LIZ, it2.next().intValue(), interfaceC1102350enB);
                    }
                }
            }
        }
        LIZIZ("initListener");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LIZ();
    }
}
