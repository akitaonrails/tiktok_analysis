package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper;
import com.ss.android.ugc.aweme.unifiedauthapi.model.DynamicPopup;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentResponse;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208210Cq {
    public static final C19208210Cq LIZ = new C19208210Cq();

    public static void LIZLLL(UnifiedAuthPopupConfig unifiedAuthPopupConfig) {
        boolean z;
        int i;
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (i = unifiedAuthPopupConfig.currentIndex) >= 0 && i < list.size()) {
            PopupInstanceConfig popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex);
            PopupElementsConfig popupElementsConfig = popupInstanceConfig.popupElementsConfig;
            if (!popupElementsConfig.dynamicTextEnabled) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip dynamic fallback: dynamicTextEnabled is false for scene=");
                sbLIZ.append(unifiedAuthPopupConfig.sceneId);
                sbLIZ.append(", trigger=");
                sbLIZ.append(unifiedAuthPopupConfig.trigger);
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("ServerIntelligentHelper");
                return;
            }
            if (popupElementsConfig.dynamicUseFallback) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("applyDynamicFallbackIfNeeded: already in fallback mode for scene=");
                sbLIZ2.append(unifiedAuthPopupConfig.sceneId);
                sbLIZ2.append(", trigger=");
                sbLIZ2.append(unifiedAuthPopupConfig.trigger);
                C2188811AlT.LIZIZ(sbLIZ2);
                C211000rc.LIZ("ServerIntelligentHelper");
                return;
            }
            PopupElementsConfig popupElementsConfigCopy = popupElementsConfig.copy(popupElementsConfig.title, popupElementsConfig.subtitle, popupElementsConfig.description, popupElementsConfig.dynamicTextEnabled, popupElementsConfig.dynamicValues, popupElementsConfig.dynamicTitle, popupElementsConfig.dynamicSubtitle, popupElementsConfig.dynamicDescription, popupElementsConfig.dynamicUseFallback, popupElementsConfig.header, popupElementsConfig.hideDetailIcon, popupElementsConfig.showCloseIcon, popupElementsConfig.usersList, popupElementsConfig.buttons, popupElementsConfig.subSwitches, popupElementsConfig.toastBottomMargin, popupElementsConfig.bannerTitle, popupElementsConfig.bannerButtonTitle);
            popupElementsConfigCopy.setDynamicUseFallback(true);
            PopupInstanceConfig popupInstanceConfigCopy = popupInstanceConfig.copy(popupInstanceConfig.panelId, popupInstanceConfig.overwriteType, popupInstanceConfig.platform, popupInstanceConfig.popupCombinationType, popupInstanceConfig.oneClickSysPopup, popupInstanceConfig.panelType, popupElementsConfigCopy, popupInstanceConfig.popupFiltersConfig, popupInstanceConfig.popupActionsConfig);
            ArrayList arrayList = new ArrayList(list);
            ListProtector.set(arrayList, unifiedAuthPopupConfig.currentIndex, popupInstanceConfigCopy);
            unifiedAuthPopupConfig.setPopupInstances(arrayList);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("applyDynamicFallbackIfNeeded: set fallback for scene=");
            sbLIZ3.append(unifiedAuthPopupConfig.sceneId);
            sbLIZ3.append(", trigger=");
            sbLIZ3.append(unifiedAuthPopupConfig.trigger);
            C2188811AlT.LIZIZ(sbLIZ3);
            C211000rc.LIZ("ServerIntelligentHelper");
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("skip dynamic fallback: invalid local instance, index=");
        sbLIZ4.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ4.append(", size=");
        if (list != null) {
            size = list.size();
        }
        sbLIZ4.append(size);
        C211000rc.LIZIZ("ServerIntelligentHelper", C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LIZ(UnifiedAuthPopupConfig unifiedAuthPopupConfig, ServerIntelligentResponse serverIntelligentResponse) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        DynamicPopup dynamicPopup = serverIntelligentResponse.dynamicPopup;
        if (dynamicPopup == null) {
            LIZLLL(unifiedAuthPopupConfig);
            return;
        }
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        int size = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (i = unifiedAuthPopupConfig.currentIndex) >= 0 && i < list.size()) {
            if (!((PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex)).popupElementsConfig.dynamicTextEnabled) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("skip dynamic response: dynamicTextEnabled is false for scene=");
                sbLIZ.append(unifiedAuthPopupConfig.sceneId);
                sbLIZ.append(", trigger=");
                sbLIZ.append(unifiedAuthPopupConfig.trigger);
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("ServerIntelligentHelper");
                return;
            }
            boolean z3 = dynamicPopup.dynamicUseFallback;
            String str = dynamicPopup.dynamicTitle;
            String str2 = dynamicPopup.dynamicSubtitle;
            String str3 = dynamicPopup.dynamicDescription;
            if ((str == null || str.length() == 0) && ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z3 && z2) {
                List<PopupInstanceConfig> list2 = unifiedAuthPopupConfig.popupInstances;
                if (list2 != null && !list2.isEmpty() && (i2 = unifiedAuthPopupConfig.currentIndex) >= 0 && i2 < list2.size()) {
                    PopupInstanceConfig popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list2, unifiedAuthPopupConfig.currentIndex);
                    PopupElementsConfig popupElementsConfig = popupInstanceConfig.popupElementsConfig;
                    PopupElementsConfig popupElementsConfigCopy = popupElementsConfig.copy(popupElementsConfig.title, popupElementsConfig.subtitle, popupElementsConfig.description, popupElementsConfig.dynamicTextEnabled, popupElementsConfig.dynamicValues, popupElementsConfig.dynamicTitle, popupElementsConfig.dynamicSubtitle, popupElementsConfig.dynamicDescription, popupElementsConfig.dynamicUseFallback, popupElementsConfig.header, popupElementsConfig.hideDetailIcon, popupElementsConfig.showCloseIcon, popupElementsConfig.usersList, popupElementsConfig.buttons, popupElementsConfig.subSwitches, popupElementsConfig.toastBottomMargin, popupElementsConfig.bannerTitle, popupElementsConfig.bannerButtonTitle);
                    if (str != null && str.length() > 0) {
                        popupElementsConfigCopy.setDynamicTitle(str);
                    }
                    if (str2 != null && str2.length() > 0) {
                        popupElementsConfigCopy.setDynamicSubtitle(str2);
                    }
                    if (str3 != null && str3.length() > 0) {
                        popupElementsConfigCopy.setDynamicDescription(str3);
                    }
                    popupElementsConfigCopy.setDynamicTextEnabled(true);
                    popupElementsConfigCopy.setDynamicUseFallback(false);
                    PopupInstanceConfig popupInstanceConfigCopy = popupInstanceConfig.copy(popupInstanceConfig.panelId, popupInstanceConfig.overwriteType, popupInstanceConfig.platform, popupInstanceConfig.popupCombinationType, popupInstanceConfig.oneClickSysPopup, popupInstanceConfig.panelType, popupElementsConfigCopy, popupInstanceConfig.popupFiltersConfig, popupInstanceConfig.popupActionsConfig);
                    ArrayList arrayList = new ArrayList(list2);
                    ListProtector.set(arrayList, unifiedAuthPopupConfig.currentIndex, popupInstanceConfigCopy);
                    unifiedAuthPopupConfig.setPopupInstances(arrayList);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("applyDynamicPopupIfNeeded: merged dynamic text for scene=");
                    sbLIZ2.append(unifiedAuthPopupConfig.sceneId);
                    sbLIZ2.append(", trigger=");
                    sbLIZ2.append(unifiedAuthPopupConfig.trigger);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("ServerIntelligentHelper");
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("skip dynamic merge: invalid local instance, index=");
                sbLIZ3.append(unifiedAuthPopupConfig.currentIndex);
                sbLIZ3.append(", size=");
                if (list2 != null) {
                    size = list2.size();
                }
                sbLIZ3.append(size);
                C211000rc.LIZIZ("ServerIntelligentHelper", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("apply fallback(applyFallback=");
            sbLIZ4.append(z3);
            sbLIZ4.append(", hasDynamic=");
            sbLIZ4.append(z2);
            sbLIZ4.append('[');
            sbLIZ4.append(str);
            sbLIZ4.append(", ");
            sbLIZ4.append(str2);
            sbLIZ4.append(", ");
            sbLIZ4.append(str3);
            sbLIZ4.append("])");
            C2188811AlT.LIZIZ(sbLIZ4);
            C211000rc.LIZ("ServerIntelligentHelper");
            LIZLLL(unifiedAuthPopupConfig);
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("skip dynamic merge: invalid local instance, index=");
        sbLIZ5.append(unifiedAuthPopupConfig.currentIndex);
        sbLIZ5.append(", size=");
        if (list != null) {
            size = list.size();
        }
        sbLIZ5.append(size);
        C211000rc.LIZIZ("ServerIntelligentHelper", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public static void LIZIZ(UnifiedAuthPopupConfig unifiedAuthPopupConfig, Boolean bool, boolean z, String str, Float f, Integer num, String str2, long j) {
        int i;
        PopupInstanceConfig popupInstanceConfig;
        IntelligentPopupHelper intelligentPopupHelper = IntelligentPopupHelper.LIZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(unifiedAuthPopupConfig, 585);
        intelligentPopupHelper.getClass();
        IntelligentPopupHelper.LJ(awS572S0100000_28);
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("intelligent_trigger_id", unifiedAuthPopupConfig.intelligentTriggerId);
        pairArr[1] = new Pair("pitaya_trace_id", str);
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        String str3 = null;
        if (list != null && (!list.isEmpty()) && (i = unifiedAuthPopupConfig.currentIndex) >= 0 && i < list.size() && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex)) != null) {
            str3 = popupInstanceConfig.panelType;
        }
        pairArr[2] = new Pair("pop_up_type", str3);
        pairArr[3] = new Pair("trigger", unifiedAuthPopupConfig.trigger);
        pairArr[4] = new Pair("enter_from", unifiedAuthPopupConfig.enterFrom);
        pairArr[5] = new Pair("enter_method", unifiedAuthPopupConfig.enterMethod);
        pairArr[6] = new Pair("response_time", String.valueOf(j));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str4 = "1";
        if (z) {
            if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("is_show", str4);
            mapLJIIJ.put("final_score", String.valueOf(f));
        } else {
            if (!C609600Nva.LIZ().backupFreqEnabled) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            mapLJIIJ.put("do_backup_frequency", str4);
        }
        if (num != null) {
            mapLJIIJ.put("error_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapLJIIJ.put("error_msg", str2);
        }
        C20684815ws.LJIILLIIL("server_intelligent_popup_result", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r18, java.lang.Boolean r19, boolean r20, java.lang.String r21, java.lang.Float r22, java.lang.Integer r23, java.lang.String r24, long r25, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            r17 = this;
            r7 = r18
            r8 = r19
            r10 = r21
            r12 = r23
            r13 = r24
            r4 = r28
            r11 = r22
            r9 = r20
            r14 = r25
            boolean r0 = r4 instanceof X.C19208910Cx
            if (r0 == 0) goto Laf
            r3 = r4
            X.10Cx r3 = (X.C19208910Cx) r3
            int r2 = r3.LLJIJIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laf
            int r2 = r2 - r1
            r3.LLJIJIL = r2
        L24:
            java.lang.Object r6 = r3.LLJ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r3.LLJIJIL
            r5 = 0
            r0 = 2
            r4 = 1
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L66
            if (r1 != r0) goto Lb8
            X.C155000ia.LIZIZ(r6)
        L38:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            X.C155000ia.LIZIZ(r6)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r1 = r0.LLIILII()
            X.01wT r0 = new X.01wT
            r6 = r27
            r0.<init>(r6, r8, r9, r5)
            r3.LL = r7
            r3.LLILLJJLI = r8
            r3.LLILLL = r10
            r3.LLILZ = r11
            r3.LLILZIL = r12
            r3.LLILZLL = r13
            r3.LLIZ = r9
            r3.LLIZLLLIL = r14
            r3.LLJIJIL = r4
            java.lang.Object r6 = X.C23250099c.LJI(r3, r1, r0)
            if (r6 != r2) goto L83
            return r2
        L66:
            long r14 = r3.LLIZLLLIL
            boolean r9 = r3.LLIZ
            java.lang.Object r13 = r3.LLILZLL
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r3.LLILZIL
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r11 = r3.LLILZ
            java.lang.Float r11 = (java.lang.Float) r11
            java.lang.Object r10 = r3.LLILLL
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r3.LLILLJJLI
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r7 = r3.LL
            X.C155000ia.LIZIZ(r6)
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            X.09AM r1 = X.C09AM.LL
            X.1DFB r0 = X.C0PEM.LIZJ
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r0)
            X.01wS r5 = new X.01wS
            r0 = 0
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            r3.LL = r0
            r3.LLILLJJLI = r0
            r3.LLILLL = r0
            r3.LLILZ = r0
            r3.LLILZIL = r0
            r3.LLILZLL = r0
            r0 = 2
            r3.LLJIJIL = r0
            java.lang.Object r0 = X.C23250099c.LJI(r3, r1, r5)
            if (r0 != r2) goto L38
            return r2
        Laf:
            X.10Cx r3 = new X.10Cx
            r0 = r17
            r3.<init>(r0, r4)
            goto L24
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19208210Cq.LIZJ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig, java.lang.Boolean, boolean, java.lang.String, java.lang.Float, java.lang.Integer, java.lang.String, long, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
