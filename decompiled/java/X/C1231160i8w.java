package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;

/* JADX INFO: renamed from: X.0i8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231160i8w implements InterfaceC863600XuI<C0Y8T> {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ C1231150i8v LIZIZ;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        C1231130i8t.LIZLLL(null, false, this.LIZ.getString(2131835079));
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(C0Y8T c0y8t) {
        C0Y8T c0y8t2 = c0y8t;
        if (c0y8t2 != null) {
            Context context = this.LIZ;
            C1231150i8v c1231150i8v = this.LIZIZ;
            IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpiForReal(IIMChatRoomOpenService.class);
            if (iIMChatRoomOpenService != null) {
                iIMChatRoomOpenService.LIZLLL(new InterfaceC624460OeS() { // from class: X.0OUw
                    @Override // X.InterfaceC624460OeS
                    public void onEvent(C624430OeP c624430OeP) {
                        IIMChatRoomOpenService iIMChatRoomOpenService2;
                        if (c624430OeP.LIZ == 2 && (iIMChatRoomOpenService2 = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpiForReal(IIMChatRoomOpenService.class)) != null) {
                            iIMChatRoomOpenService2.LJ(this);
                        }
                    }
                });
            }
            C1231130i8t.LIZJ(context, c0y8t2.getConversationId(), c1231150i8v.getEnterMethod(), c1231150i8v.getExtraMap());
            String conversationId = c0y8t2.getConversationId();
            InterfaceC1231230i93 interfaceC1231230i93 = C1231130i8t.LIZIZ;
            if (interfaceC1231230i93 != null) {
                interfaceC1231230i93.LIZIZ(2, conversationId);
            }
        }
    }

    public C1231160i8w(Context context, C1231150i8v c1231150i8v) {
        this.LIZ = context;
        this.LIZIZ = c1231150i8v;
    }
}
