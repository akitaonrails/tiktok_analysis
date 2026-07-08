package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.service.service.ISendToDialogService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.service.SendToDialogService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS128S1100000_14;

/* JADX INFO: renamed from: X.0Zho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906820Zho extends AbstractC906840Zhq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C19EG c19eg;
        ISendToDialogService iSendToDialogService;
        Object c098200Yq;
        Object c098200Yq2;
        InterfaceC906830Zhp interfaceC906830Zhp = (InterfaceC906830Zhp) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Object obj = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C0I0B c0i0b = C0I0B.LJFF;
        if (((C1400340mXo) c0i0b.LIZ()).isLogin() && !C1336205Ku.LIZJ().LIZJ() && !((C1400340mXo) c0i0b.LIZ()).LIZIZ()) {
            Activity topActivity = ActivityStack.getTopActivity();
            if ((topActivity instanceof C19EG) && (c19eg = (C19EG) topActivity) != null) {
                if ((C293370Beh.LIZ() & 2) == 2) {
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.SEND_TO_DIALOG);
                }
                Object objLIZ = C04TD.LIZ(ISendToDialogService.class, false);
                if (objLIZ != null) {
                    iSendToDialogService = (ISendToDialogService) objLIZ;
                } else {
                    if (C04TD.j1 == null) {
                        synchronized (ISendToDialogService.class) {
                            if (C04TD.j1 == null) {
                                C04TD.j1 = new SendToDialogService();
                            }
                        }
                    }
                    iSendToDialogService = C04TD.j1;
                }
                try {
                    c098200Yq = Integer.valueOf(interfaceC906830Zhp.getSendMessageScene().intValue());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Integer num = (Integer) c098200Yq;
                String uid = interfaceC906830Zhp.getUid();
                interfaceC906830Zhp.getNickName();
                String conversationId = interfaceC906830Zhp.getConversationId();
                try {
                    c098200Yq2 = Integer.valueOf(interfaceC906830Zhp.getMessageType().intValue());
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                iSendToDialogService.LIZ(c19eg, new C905710Zg1(num, uid, conversationId, interfaceC906830Zhp.getMessageToSend(), interfaceC906830Zhp.getCoverUrl(), interfaceC906830Zhp.getContent(), (Integer) obj, interfaceC906830Zhp.getSendScene()), new AwS128S1100000_14(completionBlock, (CompletionBlock<InterfaceC906850Zhr>) containerID, (String) 13));
                return;
            }
            return;
        }
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(561);
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC906850Zhr.class, containerID);
        aFwS248S0000000_14.invoke(xBaseResultModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success - ");
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
