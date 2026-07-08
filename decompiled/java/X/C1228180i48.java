package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0i48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1228180i48 extends C2217421BqW implements Function2<Context, C0Y8T, Unit> {
    public C1228180i48(Object obj) {
        super(2, obj, C1228170i47.class, "doWhenCreateGroupFinish", "doWhenCreateGroupFinish(Landroid/content/Context;Lcom/bytedance/im/core/conversation/core/model/Conversation;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Context context, C0Y8T c0y8t) {
        Context context2 = context;
        C0Y8T c0y8t2 = c0y8t;
        C1228170i47 c1228170i47 = (C1228170i47) this.receiver;
        if (c0y8t2 == null) {
            c1228170i47.getClass();
        } else {
            InterfaceC1226510i1R interfaceC1226510i1R = c1228170i47.LL.LIZ;
            IMContact iMContactLJI = null;
            if (interfaceC1226510i1R != null) {
                interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
            }
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null) {
                iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8t2);
            }
            EnterChatParams enterChatParams = new EnterChatParams(context2, iMContactLJI);
            enterChatParams.setNewGroupChat(true);
            enterChatParams.setChatType(3);
            enterChatParams.setEnterFrom(15);
            enterChatParams.setEnterMethodForMob((String) c1228170i47.LLJJ.getValue());
            enterChatParams.setSessionId(c0y8t2.getConversationId());
            enterChatParams.setEnterFromForMob((String) c1228170i47.LLJILLL.getValue());
            imChatService.LJIILLIIL(enterChatParams, null);
        }
        return Unit.LIZ;
    }
}
