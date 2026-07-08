package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;

/* JADX INFO: renamed from: X.0dnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064150dnZ extends AbstractC1064170dnb {
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
        String str;
        final int i;
        final Context context;
        Activity activity;
        InterfaceC1064180dnc interfaceC1064180dnc = (InterfaceC1064180dnc) xBaseParamModel;
        final IMUser iMUser = new IMUser();
        String uid = interfaceC1064180dnc.getUid();
        if (uid == null) {
            uid = "";
        }
        iMUser.setUid(uid);
        String nickName = interfaceC1064180dnc.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        iMUser.setNickName(nickName);
        String alias = interfaceC1064180dnc.getAlias();
        if (alias == null) {
            alias = "";
        }
        iMUser.setSignature(alias);
        iMUser.setFake(true);
        Boolean boolIsAuthorService = interfaceC1064180dnc.isAuthorService();
        if (boolIsAuthorService == null || !boolIsAuthorService.booleanValue()) {
            str = "";
            i = 0;
        } else {
            str = "message";
            i = 12;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                C0XPD.LIZIZ(activity, str, "click_chat_button", null, new InterfaceC849390XTt() { // from class: X.0dna
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        if (!C1064150dnZ.LIZJ(context, iMUser, i)) {
                            C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
                        } else {
                            InterfaceC634840OvC interfaceC634840OvC2 = this.LIZ.IBridgeSdkContext;
                            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064190dnd.class, interfaceC634840OvC2 != null ? interfaceC634840OvC2.getContainerID() : null), "");
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
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1064190dnd.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "open chat fail", null, 4);
    }
}
