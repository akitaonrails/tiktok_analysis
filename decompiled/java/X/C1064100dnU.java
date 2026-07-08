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

/* JADX INFO: renamed from: X.0dnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064100dnU extends AbstractC1064130dnX {
    public static final boolean LIZJ(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
        enterChatParams.setEnterFrom(i);
        imChatService.LJIILLIIL(enterChatParams, null);
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        final Context context;
        String str;
        final int i;
        C1051660dTQ c1051660dTQ;
        InterfaceC1064120dnW interfaceC1064120dnW = (InterfaceC1064120dnW) xBaseParamModel;
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
        if (c1537480q70LIZIZ != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) != null) {
            context = (Context) c1051660dTQ.LIZIZ(Context.class);
        } else {
            context = null;
        }
        final IMUser iMUser = new IMUser();
        String uid = interfaceC1064120dnW.getUid();
        if (uid == null) {
            uid = "";
        }
        iMUser.setUid(uid);
        String nickName = interfaceC1064120dnW.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        iMUser.setNickName(nickName);
        String alias = interfaceC1064120dnW.getAlias();
        if (alias == null) {
            alias = "";
        }
        iMUser.setSignature(alias);
        iMUser.setFake(true);
        Boolean boolIsAuthorService = interfaceC1064120dnW.isAuthorService();
        if (boolIsAuthorService == null || !boolIsAuthorService.booleanValue()) {
            str = "";
            i = 0;
        } else {
            str = "message";
            i = 12;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (context != null && (context instanceof Activity)) {
                C0XPD.LIZIZ((Activity) context, str, "click_chat_button", null, new InterfaceC849390XTt() { // from class: X.0dnV
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        if (!C1064100dnU.LIZJ(context, iMUser, i)) {
                            C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
                        } else {
                            InterfaceC634840OvC interfaceC634840OvC2 = this.LIZ.IBridgeSdkContext;
                            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064140dnY.class, interfaceC634840OvC2 != null ? interfaceC634840OvC2.getContainerID() : null), "");
                        }
                    }
                });
                return;
            }
            return;
        }
        if (LIZJ(context, iMUser, i)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064140dnY.class, containerID2), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
    }
}
