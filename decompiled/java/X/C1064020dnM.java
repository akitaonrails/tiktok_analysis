package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0dnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064020dnM extends AbstractC1064030dnN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C1051660dTQ c1051660dTQ;
        Context context;
        Activity activity;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        InterfaceC1064050dnP interfaceC1064050dnP = (InterfaceC1064050dnP) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null) {
            c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class);
        } else {
            c1051660dTQ = null;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        if (c1051660dTQ != null && (interfaceC1051470dT7LIZ = c1051660dTQ.LIZ(Context.class)) != null) {
            context = (Context) interfaceC1051470dT7LIZ.LIZ();
        } else {
            context = null;
        }
        sAFHelper.getClass();
        final Context contextLJ = SAFHelper.LJ(context);
        if (contextLJ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "no params found", null, 4);
            return;
        }
        final IMUser iMUser = new IMUser();
        iMUser.setUid(interfaceC1064050dnP.getUid());
        iMUser.setNickName(interfaceC1064050dnP.getNickName());
        final String enterFrom = interfaceC1064050dnP.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "search";
        }
        final String enterMethod = interfaceC1064050dnP.getEnterMethod();
        if (enterMethod == null) {
            enterMethod = "button";
        }
        iMUser.setFake(true);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (!(contextLJ instanceof Activity)) {
                return;
            }
            if (contextLJ instanceof Activity) {
                activity = (Activity) contextLJ;
            } else {
                activity = null;
            }
            C0XPD.LIZIZ(activity, enterFrom, enterMethod, null, new InterfaceC849390XTt() { // from class: X.0dnO
                @Override // X.InterfaceC849390XTt
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    if (!C1064020dnM.LIZJ(contextLJ, iMUser, enterFrom, enterMethod)) {
                        C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
                    } else {
                        InterfaceC634840OvC interfaceC634840OvC2 = this.LIZ.IBridgeSdkContext;
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064060dnQ.class, interfaceC634840OvC2 != null ? interfaceC634840OvC2.getContainerID() : null), "");
                    }
                }
            });
            return;
        }
        if (LIZJ(contextLJ, iMUser, enterFrom, enterMethod)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064060dnQ.class, containerID2), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
    }

    public static final boolean LIZJ(Context context, IMUser iMUser, String str, String str2) {
        if (context == null) {
            return false;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterMethodForMob(str2);
        enterChatParams.setNoEnterChatEvent(true);
        imChatService.LJIILLIIL(enterChatParams, null);
        return true;
    }
}
