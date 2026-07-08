package Y;

import X.C766270U4b;
import X.C919470a2D;
import X.C927560aFG;
import X.C927580aFI;
import X.C931830aM9;
import X.C931880aME;
import X.InterfaceC931760aM2;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ModeratorMuteGuestOp;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS45S0201000_15 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS45S0201000_15 aCListenerS45S0201000_15, View view) {
        if (C927560aFG.LIZJ()) {
            C766270U4b.LIZLLL(2131851254);
            C927580aFI.LIZIZ();
            return;
        }
        InterfaceC931760aM2 interfaceC931760aM2 = ((C931830aM9) aCListenerS45S0201000_15.l0).LLILLJJLI;
        if (interfaceC931760aM2 != null) {
            interfaceC931760aM2.LJIJI(aCListenerS45S0201000_15.i2, (LinkPlayerInfo) aCListenerS45S0201000_15.l1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS45S0201000_15 r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS45S0201000_15.onClick$1(Y.ACListenerS45S0201000_15, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS45S0201000_15 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS45S0201000_15.onClick$2(Y.ACListenerS45S0201000_15, android.view.View):void");
    }

    public static final void onClick$3(ACListenerS45S0201000_15 aCListenerS45S0201000_15, View view) {
        if (C927560aFG.LIZJ()) {
            C766270U4b.LIZLLL(2131851254);
            C927580aFI.LIZIZ();
        } else {
            DataChannel dataChannel = ((C931880aME) aCListenerS45S0201000_15.l0).LL;
            if (dataChannel != null) {
                dataChannel.LC0(ModeratorMuteGuestOp.class, new C919470a2D(aCListenerS45S0201000_15.i2, ((LinkPlayerInfo) aCListenerS45S0201000_15.l1).mUser, true));
            }
        }
    }

    public ACListenerS45S0201000_15(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
