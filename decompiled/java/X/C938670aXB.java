package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938670aXB extends AbstractC938650aX9 {
    public final C938640aX8 LJIILLIIL;

    @Override // X.AbstractC938650aX9
    public final String LJIIIZ() {
        return "anchor";
    }

    @Override // X.AbstractC938650aX9
    public final User LJIIJ() {
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (interfaceC302401Fe = (InterfaceC302401Fe) C933980aPc.LJII(dataChannel, InterfaceC302401Fe.class)) == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJIIZILJ(this.LIZIZ)) == null) {
            return null;
        }
        return linkPlayerInfo.mUser;
    }

    @Override // X.AbstractC938650aX9
    public final void LJIILIIL() {
        InterfaceC921620a5g interfaceC921620a5g;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (interfaceC921620a5g = (InterfaceC921620a5g) C933980aPc.LJII(dataChannel, InterfaceC302401Fe.class)) != null) {
            interfaceC921620a5g.LJJIIJ(this.LJIILLIIL);
        }
        super.LJIILIIL();
    }

    @Override // X.AbstractC938650aX9
    public final void LJIIL() {
        InterfaceC302401Fe interfaceC302401Fe;
        super.LJIIL();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (interfaceC302401Fe = (InterfaceC302401Fe) C933980aPc.LJII(dataChannel, InterfaceC302401Fe.class)) == null) {
            return;
        }
        interfaceC302401Fe.LJJIJIL(this.LJIILLIIL);
        this.LJIILLIIL.L2(interfaceC302401Fe.LIZ(), 0);
    }

    public C938670aXB(DataChannel dataChannel, String str) {
        super(dataChannel, str);
        this.LJIILLIIL = new C938640aX8(str, this);
    }
}
