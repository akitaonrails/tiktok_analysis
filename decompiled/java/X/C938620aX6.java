package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.voicechat.main.common.FanTicketIconUrlChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938620aX6 extends AbstractC938650aX9 {
    public final C938630aX7 LJIILLIIL;

    @Override // X.AbstractC938650aX9
    public final String LJIIIZ() {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        DataChannel dataChannel = this.LIZ;
        return (dataChannel == null || (interfaceC917640ZzG = (InterfaceC917640ZzG) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class)) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || abstractC928510aGnLIZ.LJIILIIL(UserService.getInstance().user().getCurrentUserId()) == null) ? "viewer" : "guest";
    }

    @Override // X.AbstractC938650aX9
    public final User LJIIJ() {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkListUser linkListUser;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (interfaceC917640ZzG = (InterfaceC917640ZzG) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class)) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIIZILJ(this.LIZIZ)) == null) {
            return null;
        }
        return linkListUser.user;
    }

    @Override // X.AbstractC938650aX9
    public final void LJIILIIL() {
        InterfaceC921620a5g interfaceC921620a5g;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC921620a5g = (InterfaceC921620a5g) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class)) != null) {
            interfaceC921620a5g.LJJIIJ(this.LJIILLIIL);
        }
        super.LJIILIIL();
    }

    @Override // X.AbstractC938650aX9
    public final void LJIIL() {
        Object objGg0;
        InterfaceC917640ZzG interfaceC917640ZzG;
        super.LJIIL();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC917640ZzG = (InterfaceC917640ZzG) C933980aPc.LJII(dataChannel, InterfaceC917640ZzG.class)) != null) {
            interfaceC917640ZzG.LJJIJIL(this.LJIILLIIL);
            this.LJIILLIIL.rn(interfaceC917640ZzG.LIZ(), 0);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 == null || (objGg0 = dataChannel2.gg0(FanTicketIconUrlChannel.class)) == null) {
            return;
        }
        AbstractC938650aX9.LJIILJJIL(LJIIIIZZ(), objGg0);
    }

    public C938620aX6(DataChannel dataChannel, String str) {
        super(dataChannel, str);
        this.LJIILLIIL = new C938630aX7(str, this);
    }
}
