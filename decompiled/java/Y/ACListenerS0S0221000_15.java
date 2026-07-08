package Y;

import X.C1161920gLG;
import X.C766270U4b;
import X.C919470a2D;
import X.C930940aKi;
import X.C931830aM9;
import X.C931880aME;
import X.InterfaceC931760aM2;
import android.view.View;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ModeratorMuteGuestOp;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS0S0221000_15 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS0S0221000_15 aCListenerS0S0221000_15, View view) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(room.getId()))) {
            C766270U4b.LIZLLL(2131843091);
            return;
        }
        if (!aCListenerS0S0221000_15.z2 && !aCListenerS0S0221000_15.z3) {
            InterfaceC931760aM2 interfaceC931760aM2 = ((C931830aM9) aCListenerS0S0221000_15.l0).LLILLJJLI;
            if (interfaceC931760aM2 != null) {
                interfaceC931760aM2.LJJJJIZL(aCListenerS0S0221000_15.i4, (LinkPlayerInfo) aCListenerS0S0221000_15.l1);
                return;
            }
            return;
        }
        C766270U4b.LIZLLL(2131843091);
    }

    public static final void onClick$1(ACListenerS0S0221000_15 aCListenerS0S0221000_15, View view) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(room.getId()))) {
            C766270U4b.LIZLLL(2131843091);
            return;
        }
        if (!aCListenerS0S0221000_15.z2 && !aCListenerS0S0221000_15.z3) {
            DataChannel dataChannel = ((C931880aME) aCListenerS0S0221000_15.l0).LL;
            if (dataChannel != null) {
                dataChannel.LC0(ModeratorMuteGuestOp.class, new C919470a2D(aCListenerS0S0221000_15.i4, ((LinkPlayerInfo) aCListenerS0S0221000_15.l1).mUser, false));
                return;
            }
            return;
        }
        C766270U4b.LIZLLL(2131843091);
    }

    public ACListenerS0S0221000_15(boolean z, boolean z2, Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i4 = i;
    }
}
