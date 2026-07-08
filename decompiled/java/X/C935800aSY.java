package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935800aSY extends C09AY implements Function0<C935790aSX> {
    public final /* synthetic */ C935780aSW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935800aSY(C935780aSW c935780aSW) {
        super(0);
        this.LL = c935780aSW;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0aSX] */
    @Override // kotlin.jvm.functions.Function0
    public final C935790aSX invoke() {
        final C935780aSW c935780aSW = this.LL;
        return new InterfaceC922630a7J() { // from class: X.0aSX
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                c935780aSW.LIZ();
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                c935780aSW.LIZ();
            }
        };
    }
}
