package com.bytedance.android.live.uikit.reddot;

import X.C0KAJ;
import X.C0UX6;
import X.C0UX8;
import X.C0UX9;
import X.C1102070emj;
import X.C13LQ;
import X.C1697810uHb;
import X.C20337914i1;
import X.C2097608Jq;
import X.C782710Un7;
import X.C782750UnB;
import X.C782760UnC;
import X.C782780UnE;
import X.C782810UnH;
import X.C782820UnI;
import X.InterfaceC1102120emo;
import X.InterfaceC1102150emr;
import X.InterfaceC1106030et7;
import X.InterfaceC782830UnJ;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.uikit.setting.LiveRedDotCompleteCheckIsShowingSetting;
import com.bytedance.android.live.uikit.setting.LiveRedDotNotifyProtectSetting;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlReq;
import com.bytedance.android.livesdk.frequency.api.LiveNotifyMessageFrequencyApi;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class RedDotExtensionKt {
    public static final void LIZ(C0UX6 c0ux6) {
        boolean z;
        Set<String> set;
        int i;
        String str;
        C782780UnE c782780UnE;
        String str2;
        if (c0ux6.getCurrentId().length() == 0) {
            return;
        }
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        c782710Un7.getClass();
        if (c0ux6.isAssetsRedDot()) {
            if (C782710Un7.LJIIZILJ.contains(c0ux6.getCurrentId())) {
                LiveNotifyMessageFrequencyApi.LIZ.getClass();
                LiveNotifyMessageFrequencyApi liveNotifyMessageFrequencyApiLIZ = C782810UnH.LIZ();
                MsgNotifyControlReq msgNotifyControlReq = new MsgNotifyControlReq();
                MsgNotifyRecord[] msgNotifyRecordArr = new MsgNotifyRecord[1];
                MsgNotifyRecord msgNotifyRecord = new MsgNotifyRecord();
                msgNotifyRecord.roomId = C782710Un7.LIZIZ;
                msgNotifyRecord.ts = String.valueOf(System.currentTimeMillis() / 1000);
                msgNotifyRecord.componentType = 2;
                msgNotifyRecord.bizKey = c0ux6.getCurrentId();
                String str3 = c0ux6.getLiveMessagePlatformRedDotConfig().roomLocation;
                if (str3 == null) {
                    str3 = "";
                }
                msgNotifyRecord.position = str3;
                msgNotifyRecord.userAction = 2;
                msgNotifyRecordArr[0] = msgNotifyRecord;
                msgNotifyControlReq.records = C1697810uHb.LJIILJJIL(msgNotifyRecordArr);
                msgNotifyControlReq.roomId = C782710Un7.LIZIZ;
                liveNotifyMessageFrequencyApiLIZ.reportMsgNotifyRecord(msgNotifyControlReq).LJJLJ();
            }
        } else {
            C20337914i1<Set<String>> c20337914i1 = InterfaceC1106030et7.U6;
            Set<String> setLIZIZ = c20337914i1.LIZIZ();
            setLIZIZ.add(c0ux6.getCurrentId());
            c20337914i1.LJFF(setLIZIZ);
        }
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = C782710Un7.LJIIIIZZ(c782710Un7);
        String str4 = null;
        if (concurrentHashMapLJIIIIZZ != null && concurrentHashMapLJIIIIZZ.remove(c0ux6.getCurrentId()) != null) {
            C20337914i1<Map<String, String>> c20337914i12 = InterfaceC1106030et7.W6;
            Map<String, String> mapLIZIZ = c20337914i12.LIZIZ();
            C0UX8 c0ux8 = C782710Un7.LJFF;
            if (c0ux8 != null) {
                str2 = c0ux8.page;
            } else {
                str2 = null;
            }
            mapLIZIZ.put(str2, String.valueOf(System.currentTimeMillis()));
            c20337914i12.LJFF(mapLIZIZ);
            z = true;
        } else {
            z = false;
        }
        HashSet hashSetLJII = C782710Un7.LJII(c782710Un7);
        if (hashSetLJII != null && hashSetLJII.remove(c0ux6.getCurrentId())) {
            z = true;
        }
        C782710Un7.LJIILJJIL.remove(c0ux6);
        if (!c0ux6.isAssetsRedDot() && c0ux6.getLiveMessagePlatformRedDotConfig().priority > 0 && C782710Un7.LJIILL != c0ux6 && (c782780UnE = C782710Un7.LJIIIIZZ.get(C782710Un7.LJFF)) != null) {
            c782780UnE.LIZLLL = c0ux6;
        }
        if (C782710Un7.LJIILL == c0ux6) {
            C20337914i1<Map<String, String>> c20337914i13 = InterfaceC1106030et7.X6;
            Map<String, String> mapLIZIZ2 = c20337914i13.LIZIZ();
            C0UX8 c0ux82 = C782710Un7.LJFF;
            if (c0ux82 != null) {
                str4 = c0ux82.page;
            }
            mapLIZIZ2.put(str4, String.valueOf(System.currentTimeMillis()));
            c20337914i13.LIZJ();
            z = true;
        }
        C20337914i1<Map<String, String>> c20337914i14 = InterfaceC1106030et7.T6;
        Map<String, String> mapLIZIZ3 = c20337914i14.LIZIZ();
        mapLIZIZ3.remove(c0ux6.getCurrentId());
        c20337914i14.LJFF(mapLIZIZ3);
        DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(c782710Un7);
        if (dataChannelLJIIIZ != null) {
            dataChannelLJIIIZ.LC0(RedDotStatusChangeEvent.class, new C782820UnI(c0ux6, false));
        }
        if (C782710Un7.LJIIL) {
            c782710Un7.getClass();
            C782710Un7.LJFF(c0ux6, "clicked", "DISMISS", null);
        }
        if (z) {
            if (LiveRedDotCompleteCheckIsShowingSetting.INSTANCE.enable() && !c0ux6.isShowing()) {
                return;
            }
            if (!LiveRedDotNotifyProtectSetting.INSTANCE.enable()) {
                LIZJ(c0ux6);
                C1102070emj c1102070emj = C1102070emj.LIZ;
                c1102070emj.LJJI(C782710Un7.LJIIIZ(c782710Un7), c0ux6.getComponent(), c0ux6.getComponentInstance(), LIZLLL(c0ux6));
                c1102070emj.LJIIJ(C782710Un7.LJIIIZ(c782710Un7), c0ux6.getComponent(), c0ux6.getComponentInstance(), LIZLLL(c0ux6));
            }
            String position = c0ux6.getLiveMessagePlatformRedDotConfig().roomLocation;
            if ((position != null || (position = c0ux6.getPosition()) != null) && (set = C782710Un7.LJIJ.get(position)) != null) {
                set.remove(c0ux6.getCurrentId());
            }
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, C782710Un7.LJIIIZ(c782710Un7), c0ux6.getComponent(), c0ux6.getComponentInstance(), C0KAJ.MANUALLY_ROUTE, LIZLLL(c0ux6), null, 96);
            C0UX8 c0ux83 = C782710Un7.LJFF;
            if (c0ux83 == null) {
                i = -1;
            } else {
                i = C0UX9.LIZ[c0ux83.ordinal()];
            }
            if (i != 1) {
                if (i == 2 || i == 3) {
                    DataChannel dataChannelLJIIIZ2 = C782710Un7.LJIIIZ(c782710Un7);
                    String str5 = C782710Un7.LIZIZ;
                    String str6 = C782710Un7.LIZJ;
                    String str7 = C782710Un7.LIZLLL;
                    String strValueOf = String.valueOf(c0ux6.getPageLevel().getLevel());
                    String currentId = c0ux6.getCurrentId();
                    if (C782710Un7.LJFF == C0UX8.EVENT_PAGE_BROADCAST_PREVIEW) {
                        str = "live_take_page";
                    } else {
                        str = "live_detail";
                    }
                    C782750UnB.LIZIZ(dataChannelLJIIIZ2, "livesdk_anchor_red_dot_disappear", str6, str5, str7, str, strValueOf, currentId, null, c0ux6.getPriority$liveui_release(), c0ux6.getEventPosition$liveui_release(), c0ux6.getCurrentRedDotCount$liveui_release(), C2097608Jq.LJIIJ(new Pair("show_duration_ms", String.valueOf(c0ux6.getShowTotalDuration()))));
                }
            } else {
                C782750UnB.LIZJ(C782710Un7.LJIIIZ(c782710Un7), "livesdk_audience_red_dot_disappear", C782710Un7.LIZJ, C782710Un7.LIZIZ, C782710Un7.LIZLLL, String.valueOf(c0ux6.getPageLevel().getLevel()), c0ux6.getCurrentId(), c0ux6.getPriority$liveui_release(), c0ux6.getEventPosition$liveui_release(), c0ux6.getCurrentRedDotCount$liveui_release(), C2097608Jq.LJIIJ(new Pair("show_duration_ms", String.valueOf(c0ux6.getShowTotalDuration()))));
            }
            c0ux6.clearShowStartTimestamp();
        }
    }

    public static final void LIZIZ(C0UX6 c0ux6) {
        String currentId = c0ux6.getCurrentId();
        ArrayList arrayList = new ArrayList();
        HashSet hashSetLJII = C782710Un7.LJII(C782710Un7.LIZ);
        if (hashSetLJII != null) {
            for (Object obj : hashSetLJII) {
                if (C13LQ.LJIILLIIL(obj, c0ux6.getIds())) {
                    arrayList.add(obj);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c0ux6.setCurrentId((String) it2.next());
            LIZ(c0ux6);
        }
        c0ux6.setCurrentId(currentId);
    }

    public static final void LIZJ(C0UX6 c0ux6) {
        C782760UnC c782760UnC;
        if (LiveRedDotNotifyProtectSetting.INSTANCE.enable()) {
            return;
        }
        InterfaceC1102120emo componentInstance = c0ux6.getComponentInstance();
        if (componentInstance == null) {
            componentInstance = c0ux6.createComponentInstance();
        }
        if (!(componentInstance instanceof C782760UnC) || (c782760UnC = (C782760UnC) componentInstance) == null || c782760UnC.LIZLLL) {
            return;
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
        InterfaceC1102150emr component = c0ux6.getComponent();
        c1102070emj.getClass();
        C1102070emj.LJJIII(dataChannelLJIIIZ, component, c782760UnC);
        c782760UnC.LIZLLL = true;
    }

    public static final Map<String, String> LIZLLL(C0UX6 c0ux6) {
        String str;
        String str2;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("page_level", String.valueOf(c0ux6.getPageLevel().getLevel()));
        pairArr[1] = new Pair("priority", String.valueOf(c0ux6.getPriority$liveui_release()));
        pairArr[2] = new Pair("current_red_dot_cnt", String.valueOf(c0ux6.getCurrentRedDotCount$liveui_release()));
        if (c0ux6.isGuide()) {
            str = "guidance";
        } else {
            str = "function";
        }
        pairArr[3] = new Pair("red_dot_type", str);
        if (c0ux6.isAssetsRedDot()) {
            str2 = "asset";
        } else {
            str2 = "common";
        }
        pairArr[4] = new Pair("red_dot_function_type", str2);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String eventPosition$liveui_release = c0ux6.getEventPosition$liveui_release();
        if (eventPosition$liveui_release != null) {
            mapLJIIJ.put("event_position", eventPosition$liveui_release);
        }
        return mapLJIIJ;
    }

    public static final boolean LJ(C0UX6 c0ux6) {
        if (c0ux6.isAssetsRedDot()) {
            Iterator<String> it2 = c0ux6.getLiveMessagePlatformRedDotConfig().assetsIds.iterator();
            while (it2.hasNext()) {
                if (!InterfaceC1106030et7.V6.LIZIZ().contains(it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return InterfaceC1106030et7.U6.LIZIZ().contains(c0ux6.getCurrentId());
    }

    public static final void LJFF(C0UX6 c0ux6) {
        if (c0ux6.getCurrentId().length() == 0) {
            return;
        }
        C782710Un7.LIZ.LJIIJ(c0ux6);
    }

    public static final boolean LJIILLIIL(C0UX6 c0ux6) {
        boolean zContainsValue;
        HashSet hashSetLJII;
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = C782710Un7.LJIIIIZZ(c782710Un7);
        if (concurrentHashMapLJIIIIZZ != null) {
            zContainsValue = concurrentHashMapLJIIIIZZ.containsValue(c0ux6);
        } else {
            zContainsValue = false;
        }
        if (!zContainsValue && ((hashSetLJII = C782710Un7.LJII(c782710Un7)) == null || !hashSetLJII.contains(c0ux6.getCurrentId()))) {
            return false;
        }
        return true;
    }

    public static final void LJIIJJI(C0UX6 c0ux6, String str) {
        LJIIL(c0ux6, str, c0ux6.getCurrentId());
    }

    public static final void LJIILL(C0UX6 c0ux6, boolean z) {
        if (z == c0ux6.isValid()) {
            return;
        }
        c0ux6.setValid(z);
    }

    public static final boolean LJIIL(C0UX6 c0ux6, String str, String str2) {
        if (c0ux6.isDynamic()) {
            C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.e7;
            if (!c20337914i1.LIZIZ().containsKey(str2) || !Intrinsics.LJFF(c20337914i1.LIZIZ().get(str2), str)) {
                Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
                mapLIZIZ.put(str2, str);
                c20337914i1.LJFF(mapLIZIZ);
                C20337914i1<Set<String>> c20337914i12 = InterfaceC1106030et7.U6;
                Set<String> setLIZIZ = c20337914i12.LIZIZ();
                setLIZIZ.remove(str2);
                c20337914i12.LJFF(setLIZIZ);
                C20337914i1<Map<String, String>> c20337914i13 = InterfaceC1106030et7.T6;
                Map<String, String> mapLIZIZ2 = c20337914i13.LIZIZ();
                mapLIZIZ2.remove(str2);
                c20337914i13.LJFF(mapLIZIZ2);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJIILJJIL(C0UX6 c0ux6, View view, boolean z) {
        boolean z2;
        if (z && LJIILLIIL(c0ux6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIILIIL(c0ux6, view, null, z2, null, null, 16);
    }

    public static final void LJI(View view, LifecycleOwner lifecycleOwner, InterfaceC782830UnJ interfaceC782830UnJ, C0UX6 c0ux6, Function1 function1) {
        if (c0ux6.isAssetsRedDot()) {
            if (view == null || lifecycleOwner == null) {
                return;
            }
            LJIIJ(c0ux6, view, lifecycleOwner, function1, null, 8);
            return;
        }
        LJII(c0ux6, lifecycleOwner, view, interfaceC782830UnJ, function1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C0UX6 r10, androidx.lifecycle.LifecycleOwner r11, android.view.View r12, X.InterfaceC782830UnJ r13, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r14, boolean r15) {
        /*
            r0 = 1
            r4 = r10
            r4.setValid(r0)
            LIZJ(r4)
            boolean r7 = LJIILLIIL(r4)
            r6 = r14
            r8 = r13
            r5 = r12
            if (r7 != 0) goto L13
            if (r15 == 0) goto L1b
        L13:
            r9 = 0
            r10 = 16
            LJIILIIL(r4, r5, r6, r7, r8, r9, r10)
            if (r7 != 0) goto L71
        L1b:
            X.0Un7 r0 = X.C782710Un7.LIZ
            r0.getClass()
            boolean r0 = X.C782710Un7.LJ
            if (r0 != 0) goto L71
            if (r11 == 0) goto L59
            com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig r0 = r4.getLiveMessagePlatformRedDotConfig()
            int r0 = r0.priority
            if (r0 <= 0) goto L4b
            java.util.HashSet<X.0UX6> r0 = X.C782710Un7.LJIILLIIL
            r0.add(r4)
            X.0956 r0 = X.C782710Un7.LJIJJ
            r3 = 0
            if (r0 == 0) goto L3b
            r0.LIZIZ(r3)
        L3b:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r11)
            X.01W5 r1 = new X.01W5
            r1.<init>(r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            X.C782710Un7.LJIJJ = r0
        L4b:
            androidx.lifecycle.Lifecycle r1 = r11.getLifecycle()
            if (r1 == 0) goto L59
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt$observe$2 r0 = new com.bytedance.android.live.uikit.reddot.RedDotExtensionKt$observe$2
            r0.<init>(r4)
            r1.addObserver(r0)
        L59:
            X.0Un7 r0 = X.C782710Un7.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C782710Un7.LJIIIZ(r0)
            if (r1 == 0) goto L70
            java.lang.Class<com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent> r0 = com.bytedance.android.live.uikit.reddot.RedDotStatusChangeEvent.class
            kotlin.jvm.internal.AwS47S0500000_12 r9 = new kotlin.jvm.internal.AwS47S0500000_12
            r15 = 0
            r10 = r5
            r12 = r8
            r13 = r4
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.BQ2(r11, r0, r9)
        L70:
            return
        L71:
            if (r11 == 0) goto L59
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJII(X.0UX6, androidx.lifecycle.LifecycleOwner, android.view.View, X.0UnJ, kotlin.jvm.functions.Function1, boolean):void");
    }

    public static void LJIIJ(C0UX6 c0ux6, View view, LifecycleOwner lifecycleOwner, Function1 function1, String str, int i) {
        Function1 function12 = function1;
        String str2 = null;
        if ((i & 4) != 0) {
            function12 = null;
        }
        if ((i & 8) == 0) {
            str2 = str;
        }
        if (c0ux6.isAssetsRedDot()) {
            c0ux6.setValid(true);
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
            InterfaceC1102150emr component = c0ux6.getComponent();
            InterfaceC1102120emo interfaceC1102120emoCreateComponentInstance = c0ux6.createComponentInstance();
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannelLJIIIZ, component, interfaceC1102120emoCreateComponentInstance);
            c0ux6.setCurrentId(c0ux6.getIds()[0]);
            lifecycleOwner.getLifecycle().addObserver(new RedDotExtensionKt$observeAssetsDecision$1(view, lifecycleOwner, c0ux6, c0ux6, str2, function12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(X.C0UX6 r18, android.view.View r19, kotlin.jvm.functions.Function1 r20, boolean r21, X.InterfaceC782830UnJ r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJIILIIL(X.0UX6, android.view.View, kotlin.jvm.functions.Function1, boolean, X.0UnJ, java.lang.String, int):void");
    }
}
