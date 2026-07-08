package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;

/* JADX INFO: renamed from: X.0xY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823300xY0 implements InterfaceC1822470xWf, InterfaceC624460OeS {
    public InterfaceC1823410xYB LIZ;

    @Override // X.InterfaceC1822470xWf
    public final void LLLILZ() {
        this.LIZ = null;
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            iIMChatRoomOpenService.LJ(this);
        }
    }

    public final void LIZ(InterfaceC1823410xYB interfaceC1823410xYB) {
        this.LIZ = interfaceC1823410xYB;
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            iIMChatRoomOpenService.LIZLLL(this);
        }
    }

    @Override // X.InterfaceC624460OeS
    public void onEvent(C624430OeP c624430OeP) {
        InterfaceC1823410xYB interfaceC1823410xYB;
        int i = c624430OeP.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && (interfaceC1823410xYB = this.LIZ) != null) {
                        interfaceC1823410xYB.LIZJ();
                        return;
                    }
                    return;
                }
                InterfaceC1823410xYB interfaceC1823410xYB2 = this.LIZ;
                if (interfaceC1823410xYB2 == null) {
                    return;
                }
                interfaceC1823410xYB2.LIZ();
                return;
            }
            InterfaceC1823410xYB interfaceC1823410xYB3 = this.LIZ;
            if (interfaceC1823410xYB3 == null) {
                return;
            }
            interfaceC1823410xYB3.LIZIZ();
            return;
        }
        InterfaceC1823410xYB interfaceC1823410xYB4 = this.LIZ;
        if (interfaceC1823410xYB4 == null) {
            return;
        }
        interfaceC1823410xYB4.LIZLLL();
    }
}
