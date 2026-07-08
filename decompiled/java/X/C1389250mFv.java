package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389250mFv extends AbstractC1389270mFx {
    public final InterfaceC1389280mFy LLILLL;

    public C1389250mFv() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1389280mFy.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        this.LLILLL = (InterfaceC1389280mFy) C1549500qQO.LIZJ(interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null, c19719912DlLIZ);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Activity activityLIZIZ;
        boolean zBooleanValue;
        EnumC913760Zt0 enumC913760Zt0LIZJ;
        InterfaceC1389260mFw interfaceC1389260mFw = (InterfaceC1389260mFw) xBaseParamModel;
        boolean zBooleanValue2 = true;
        boolean zBooleanValue3 = false;
        if (interfaceC1389260mFw.getBizLine().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        LinkedHashMap linkedHashMap = null;
        if (!z && interfaceC1389260mFw.getBizScene().length() != 0 && interfaceC1389260mFw.getEnterFrom().length() != 0 && interfaceC1389260mFw.getEnterMethod().length() != 0) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                String enterFrom = interfaceC1389260mFw.getEnterFrom();
                String enterMethod = interfaceC1389260mFw.getEnterMethod();
                Map<String, Object> extraETParams = interfaceC1389260mFw.getExtraETParams();
                if (extraETParams != null) {
                    linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(extraETParams.size()));
                    Iterator<T> it2 = extraETParams.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                Boolean boolIsFullScreen = interfaceC1389260mFw.isFullScreen();
                if (boolIsFullScreen != null) {
                    zBooleanValue = boolIsFullScreen.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean showActiveStatus = interfaceC1389260mFw.getShowActiveStatus();
                if (showActiveStatus != null) {
                    zBooleanValue3 = showActiveStatus.booleanValue();
                }
                List<String> defaultSelectedIdList = interfaceC1389260mFw.getDefaultSelectedIdList();
                String groupType = interfaceC1389260mFw.getGroupType();
                if (groupType == null || (enumC913760Zt0LIZJ = C1229420i68.LIZJ(groupType)) == null) {
                    enumC913760Zt0LIZJ = EnumC913760Zt0.NORMAL_GROUP_CHAT;
                }
                Boolean enterChatRoomAfterCreatedSuccess = interfaceC1389260mFw.getEnterChatRoomAfterCreatedSuccess();
                if (enterChatRoomAfterCreatedSuccess != null) {
                    zBooleanValue2 = enterChatRoomAfterCreatedSuccess.booleanValue();
                }
                List<String> stickyTopUidList = interfaceC1389260mFw.getStickyTopUidList();
                if (stickyTopUidList == null) {
                    stickyTopUidList = C13BV.INSTANCE;
                }
                String stickyTopText = interfaceC1389260mFw.getStickyTopText();
                if (stickyTopText == null) {
                    stickyTopText = "";
                }
                List<String> headerList = interfaceC1389260mFw.getHeaderList();
                if (headerList == null) {
                    headerList = C13BV.INSTANCE;
                }
                C1227130i2R.LIZLLL(activityLIZIZ, new C1226980i2C(activityLIZIZ, linkedHashMap, null, enterFrom, enterMethod, zBooleanValue3, defaultSelectedIdList, null, enumC913760Zt0LIZJ, zBooleanValue2, null, null, new AwS387S0200000_21(interfaceC1389260mFw, activityLIZIZ, 74), false, stickyTopUidList, stickyTopText, C1227890i3f.LIZ(headerList), null, null, false, false, zBooleanValue, null, 2076637476), interfaceC1389260mFw.getBizLine(), interfaceC1389260mFw.getBizScene(), "jsb");
                completionBlock.onSuccess(this.LLILLL, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "param is invalid", null, 4);
    }
}
