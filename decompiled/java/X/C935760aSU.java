package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935760aSU extends C09AY implements Function0<C935730aSR> {
    public final /* synthetic */ C935720aSQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935760aSU(C935720aSQ c935720aSQ) {
        super(0);
        this.LL = c935720aSQ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0aSR] */
    @Override // kotlin.jvm.functions.Function0
    public final C935730aSR invoke() {
        final C935720aSQ c935720aSQ = this.LL;
        return new InterfaceC922630a7J() { // from class: X.0aSR
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                c935720aSQ.LIZ();
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                c935720aSQ.LIZ();
            }
        };
    }
}
