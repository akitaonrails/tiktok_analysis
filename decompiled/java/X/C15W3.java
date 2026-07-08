package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15W3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15W3 extends C15W5 {
    public final C15W7 LLILLL;

    public C15W3() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C15W7.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        this.LLILLL = (C15W7) C1549500qQO.LIZJ(interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null, c19719912DlLIZ);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Activity activityLIZIZ;
        C1229500i6G c1229500i6G;
        int iIntValue;
        boolean zBooleanValue;
        C15W4 c15w4 = (C15W4) xBaseParamModel;
        String str = "";
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = true;
        if (c15w4.getBizLine().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && c15w4.getBizScene().length() != 0 && c15w4.getEnterFrom().length() != 0 && c15w4.getEnterMethod().length() != 0) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    String eventTracking = c15w4.getEventTracking();
                    if (eventTracking == null) {
                        eventTracking = "";
                    }
                    JSONObject jSONObject = new JSONObject(eventTracking);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LLILLL.setStatus(c15w4.getGroupStatus());
                C1229380i64 c1229380i64LJJIJLIJ = C913630Zsn.LJJIJLIJ(C913630Zsn.LJIIJJI, c15w4.getBizLine(), c15w4.getBizScene());
                C1230650i87 c1230650i87 = EnumC1230500i7s.Companion;
                String joinGroupSource = c15w4.getJoinGroupSource();
                c1230650i87.getClass();
                EnumC1230500i7s enumC1230500i7sLIZ = C1230650i87.LIZ(joinGroupSource);
                C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
                int iIntValue2 = c15w4.getGroupStatus().intValue();
                c1229970i71.getClass();
                EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(iIntValue2);
                C15W8 enterChatParams = c15w4.getEnterChatParams();
                if (enterChatParams != null) {
                    String enterFrom = c15w4.getEnterFrom();
                    String enterMethod = c15w4.getEnterMethod();
                    Number quickChatPanelType = enterChatParams.getQuickChatPanelType();
                    if (quickChatPanelType != null) {
                        iIntValue = quickChatPanelType.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    Boolean disableMask = enterChatParams.getDisableMask();
                    if (disableMask != null) {
                        zBooleanValue2 = disableMask.booleanValue();
                    }
                    Boolean boolIsFullScreen = enterChatParams.isFullScreen();
                    if (boolIsFullScreen != null) {
                        zBooleanValue = boolIsFullScreen.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    String trafficType = enterChatParams.getTrafficType();
                    if (trafficType != null) {
                        str = trafficType;
                    }
                    c1229500i6G = new C1229500i6G(iIntValue, zBooleanValue2 ? 1 : 0, 64, enterFrom, enterMethod, str, zBooleanValue);
                } else {
                    c1229500i6G = new C1229500i6G(0, 0, 124, c15w4.getEnterFrom(), c15w4.getEnterMethod(), (String) null, false);
                }
                String conversationID = c15w4.getConversationID();
                Boolean joinGroupAutomatically = c15w4.getJoinGroupAutomatically();
                if (joinGroupAutomatically != null) {
                    zBooleanValue3 = joinGroupAutomatically.booleanValue();
                }
                c1229380i64LJJIJLIJ.LIZIZ(activityLIZIZ, new C1230080i7C(enumC1230500i7sLIZ, enumC1229960i70LIZ, c1229500i6G, conversationID, linkedHashMap, zBooleanValue3, null, false, new InterfaceC1229620i6S() { // from class: X.15W6
                    @Override // X.InterfaceC1229620i6S
                    public final void LIZ(C0YMW c0ymw) {
                        CompletionBlock<C15W7> completionBlock2 = completionBlock;
                        C15W7 c15w7 = this.LIZ.LLILLL;
                        c15w7.setSuccess(Boolean.FALSE);
                        C2382909Vj.LIZ(completionBlock2, 0, null, c15w7, 2);
                    }

                    @Override // X.InterfaceC1229620i6S
                    public final void LIZIZ(String str2) {
                        CompletionBlock<C15W7> completionBlock2 = completionBlock;
                        C15W7 c15w7 = this.LIZ.LLILLL;
                        c15w7.setSuccess(Boolean.TRUE);
                        completionBlock2.onSuccess(c15w7, "");
                    }

                    public final void LIZLLL(EnumC1229960i70 enumC1229960i70) {
                        this.LIZ.LLILLL.setStatus(Integer.valueOf(enumC1229960i70.getValue()));
                    }

                    @Override // X.InterfaceC1229620i6S
                    public final void LIZJ(EnumC1229960i70 enumC1229960i70, PopupDisplayMeta popupDisplayMeta) {
                        LIZLLL(enumC1229960i70);
                    }
                }, 192), null);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "param is invalid", null, 4);
    }
}
