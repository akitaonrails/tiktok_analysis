package Y;

import X.C1109770ez9;
import X.C1555540qa8;
import X.C1697810uHb;
import X.C16FS;
import X.C1841350y17;
import X.C766270U4b;
import X.C915980Zwa;
import X.C931830aM9;
import X.C932680aNW;
import X.C932690aNX;
import X.C956790b0P;
import X.C971480bO6;
import X.C973660bRc;
import X.EnumC944980ahM;
import X.EnumC973640bRa;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.GuestInviteViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideEvent;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS8S0101100_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS53S0101000_15 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        GuestInvitePanelResp.ListUser listUser;
        User user;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IGuestInviteAbility iGuestInviteAbility;
        GuestInviteViewModel viewModel;
        GuestInvitePanelResp.ListUser listUser2;
        C16FS c16fs = ((C932690aNX) aCListenerS53S0101000_15.l0).LLIZLLLIL;
        int i = 0;
        if (c16fs != null && c16fs.isEnabled()) {
            C932690aNX c932690aNX = (C932690aNX) aCListenerS53S0101000_15.l0;
            int i2 = aCListenerS53S0101000_15.i1;
            if (c932690aNX.LLJI.LIZIZ()) {
                C766270U4b.LIZLLL(2131852852);
                return;
            }
            C932680aNW c932680aNW = c932690aNX.LLJIJIL;
            if (c932680aNW == null || (listUser = c932680aNW.LIZ) == null || (user = listUser.user) == null) {
                return;
            }
            long id = user.getId();
            DataChannel dataChannel = c932690aNX.LL;
            if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null || (iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null)) == null || (viewModel = iGuestInviteAbility.getViewModel()) == null) {
                return;
            }
            C932680aNW c932680aNW2 = c932690aNX.LLJIJIL;
            if (c932680aNW2 != null && (listUser2 = c932680aNW2.LIZ) != null) {
                i = listUser2.onlineStatus;
            }
            viewModel.xQ2(i, id, 1, new AwS8S0101100_15(c932690aNX, id, i2, 0), new AwS559S0100000_15(c932690aNX, 8));
            return;
        }
        C766270U4b.LIZLLL(2131854160);
    }

    public static final void onClick$1(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        C931830aM9.h6(aCListenerS53S0101000_15.i1, (LinkPlayerInfo) aCListenerS53S0101000_15.l0);
    }

    public static final void onClick$2(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        C931830aM9.h6(aCListenerS53S0101000_15.i1, (LinkPlayerInfo) aCListenerS53S0101000_15.l0);
    }

    public static final void onClick$3(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        boolean z;
        List list = (List) aCListenerS53S0101000_15.l0;
        int i = aCListenerS53S0101000_15.i1;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1841350y17 c1841350y17 = (C1841350y17) obj;
                if (c1841350y17 != null) {
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1841350y17.setChecked(z);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final void onClick$4(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        boolean z;
        List list = (List) aCListenerS53S0101000_15.l0;
        int i = aCListenerS53S0101000_15.i1;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1841350y17 c1841350y17 = (C1841350y17) obj;
                if (c1841350y17 != null) {
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1841350y17.setChecked(z);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static final void onClick$5(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        if (view != null && view.getContext() != null && ((C1109770ez9) aCListenerS53S0101000_15.l0).LJIIIZ != null) {
            EnumC944980ahM enumC944980ahMLLIIJI = C915980Zwa.LJI().LIZ().LLIIJI();
            C915980Zwa.LJI().LIZ().LLILZIL("pk_guide");
            if (enumC944980ahMLLIIJI == EnumC944980ahM.CONNECTION_SUCCEED) {
                DataChannel dataChannel = ((C1109770ez9) aCListenerS53S0101000_15.l0).LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.LC0(LinkBattleGuideEvent.class, Integer.valueOf(aCListenerS53S0101000_15.i1));
                    return;
                }
                return;
            }
            if (C915980Zwa.LJIIIZ().Jf()) {
                C766270U4b.LIZLLL(2131841103);
                return;
            }
            String value = EnumC973640bRa.PK_GUIDE.getValue();
            DataChannel dataChannel2 = ((C1109770ez9) aCListenerS53S0101000_15.l0).LJIIIZ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(OpenCoHostEvent.class, value);
            }
            DataChannel dataChannel3 = ((C1109770ez9) aCListenerS53S0101000_15.l0).LJIIIZ;
            if (dataChannel3 == null || !Intrinsics.LJFF(dataChannel3.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
                C766270U4b.LIZLLL(2131842739);
            }
            C973660bRc.LIZ.LJL(value, false, C915980Zwa.LJI().LIZ().LJIILLIIL());
        }
    }

    public static final void onClick$6(ACListenerS53S0101000_15 aCListenerS53S0101000_15, View view) {
        ((C971480bO6) aCListenerS53S0101000_15.l0).LL.invoke(Integer.valueOf(aCListenerS53S0101000_15.i1));
    }

    public ACListenerS53S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
