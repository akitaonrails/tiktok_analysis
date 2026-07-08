package X;

import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ytr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875290ytr extends AbstractC1875250ytn {
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0yts] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final InterfaceC1063720dms interfaceC1063720dms;
        String containerID;
        boolean z;
        String data;
        byte[] bArrDecode;
        boolean z2;
        InterfaceC1700110uLJ interfaceC1700110uLJ;
        InterfaceC1700110uLJ interfaceC1700110uLJ2;
        final InterfaceC1875280ytq interfaceC1875280ytq = (InterfaceC1875280ytq) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (interfaceC1063720dms = (InterfaceC1063720dms) interfaceC634840OvC.LIZIZ(InterfaceC1063720dms.class)) != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && interfaceC634840OvC2.getContext() != null) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (containerID = interfaceC634840OvC3.getContainerID()) != null && containerID.length() != 0) {
                    if (interfaceC1875280ytq.getSocketTaskID().length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C2382909Vj.LIZ(completionBlock, -3, "The socketTaskID key is required.", null, 4);
                        return;
                    }
                    if (interfaceC1875280ytq.getData().length() == 0) {
                        C2382909Vj.LIZ(completionBlock, -3, "The data key is required.", null, 4);
                        return;
                    }
                    if (interfaceC1875280ytq.getDataType().length() == 0) {
                        C2382909Vj.LIZ(completionBlock, -3, "The dataType key is required.", null, 4);
                        return;
                    }
                    if (!(interfaceC1875280ytq.getData() instanceof String)) {
                        data = "";
                    } else {
                        data = interfaceC1875280ytq.getData();
                        data.toString();
                    }
                    String dataType = interfaceC1875280ytq.getDataType();
                    if (Intrinsics.LJFF(dataType, "string")) {
                        bArrDecode = null;
                    } else if (Intrinsics.LJFF(dataType, "base64")) {
                        bArrDecode = Base64.decode(data, 0);
                        data = null;
                    } else {
                        data = null;
                        bArrDecode = null;
                    }
                    String socketTaskID = interfaceC1875280ytq.getSocketTaskID();
                    ?? r4 = new Object() { // from class: X.0yts
                        public final void LIZ(String str) {
                            C1875290ytr c1875290ytr = this.LIZ;
                            InterfaceC1063720dms interfaceC1063720dms2 = interfaceC1063720dms;
                            String socketTaskID2 = interfaceC1875280ytq.getSocketTaskID();
                            c1875290ytr.getClass();
                            HashMap map = new HashMap();
                            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                            map.put("message", str);
                            if (socketTaskID2 != null) {
                                map.put("socketTaskID", socketTaskID2);
                            }
                            if (interfaceC1063720dms2 != null) {
                                interfaceC1063720dms2.LIZ("x.socketStatusChanged", map);
                            }
                        }
                    };
                    if (data != null && data.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    String strSendMessage = "The socketTaskID doesn't exist";
                    if (!z2) {
                        C1700080uLG.LIZIZ.getValue().getClass();
                        List listLIZ = C1700080uLG.LIZ(containerID, socketTaskID);
                        if (listLIZ == null || (interfaceC1700110uLJ2 = (InterfaceC1700110uLJ) ListProtector.get(listLIZ, 0)) == null || (strSendMessage = interfaceC1700110uLJ2.LIZJ(data)) != null) {
                            r4.LIZ(strSendMessage);
                        }
                    } else if (bArrDecode != null && bArrDecode.length != 0) {
                        C1700080uLG.LIZIZ.getValue().getClass();
                        List listLIZ2 = C1700080uLG.LIZ(containerID, socketTaskID);
                        if (listLIZ2 == null || (interfaceC1700110uLJ = (InterfaceC1700110uLJ) ListProtector.get(listLIZ2, 0)) == null || (strSendMessage = interfaceC1700110uLJ.sendMessage(bArrDecode)) != null) {
                            r4.LIZ(strSendMessage);
                        }
                    } else {
                        r4.LIZ("unknown error");
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1875260yto.class, null), "");
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, "ContainerID not provided in host", null, 4);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "JsEventDelegate not provided in host", null, 4);
    }
}
