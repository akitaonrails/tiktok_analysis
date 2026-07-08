package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Space;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.matchv2.connection.individualmatch.coordinator.matching.view.IndividualMatchQuitRequestFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.AbsTeamPairInviteeFragment;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee.TeamPairInviteeCohostRoomFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.livesetting.MultiGuestLiveSettingFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986950bn3 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onCheckedChanged$9(this, compoundButton, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onCheckedChanged$10(this, compoundButton, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onCheckedChanged$11(this, compoundButton, z);
                break;
        }
    }

    public C986950bn3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        InteractDisconnectDialog interactDisconnectDialog = (InteractDisconnectDialog) c986950bn3.l0;
        interactDisconnectDialog.LLJILLL = z ? 1 : 0;
        View viewFindViewById = null;
        if (z) {
            C786410Ut5.LLJJJ(interactDisconnectDialog.MR(), 8);
            View view = interactDisconnectDialog.LLILLL;
            if (view == null) {
                View view2 = interactDisconnectDialog.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.vry);
                }
                interactDisconnectDialog.LLILLL = (Space) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LLIIZ((Space) view, 8);
            return;
        }
        C786410Ut5.LLJJJ(interactDisconnectDialog.MR(), 0);
        View view3 = interactDisconnectDialog.LLILLL;
        if (view3 == null) {
            View view4 = interactDisconnectDialog.getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.vry);
            }
            interactDisconnectDialog.LLILLL = (Space) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.LLIIZ((Space) view3, 0);
    }

    public static final void onCheckedChanged$1(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        if (z) {
            C16FS c16fs = ((IndividualMatchQuitRequestFragment) c986950bn3.l0).LLJ;
            if (c16fs != null) {
                C786410Ut5.LLJJJ(c16fs, 8);
                return;
            }
            return;
        }
        C16FS c16fs2 = ((IndividualMatchQuitRequestFragment) c986950bn3.l0).LLJ;
        if (c16fs2 == null) {
            return;
        }
        C786410Ut5.LLJJJ(c16fs2, 0);
    }

    public static final void onCheckedChanged$10(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C013C) c986950bn3.l0).element = z;
    }

    public static final void onCheckedChanged$11(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C936740aU4) c986950bn3.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$2(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((AbsTeamPairInviteeFragment) c986950bn3.l0).LLLI = z;
    }

    public static final void onCheckedChanged$3(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        TeamPairInviteeCohostRoomFragment teamPairInviteeCohostRoomFragment = (TeamPairInviteeCohostRoomFragment) c986950bn3.l0;
        teamPairInviteeCohostRoomFragment.LLLI = z;
        C975250bUB c975250bUB = teamPairInviteeCohostRoomFragment.LLLIILIL;
        if (c975250bUB != null) {
            c975250bUB.LJIJJ = z;
        }
    }

    public static final void onCheckedChanged$4(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C013C) c986950bn3.l0).element = z;
    }

    public static final void onCheckedChanged$5(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C013C) c986950bn3.l0).element = z;
    }

    public static final void onCheckedChanged$6(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        String str;
        InterfaceC761860Tua interfaceC761860TuaNR = ((MultiGuestLiveSettingFragment) c986950bn3.l0).NR();
        if (interfaceC761860TuaNR != null) {
            MultiGuestLiveSettingFragment multiGuestLiveSettingFragment = (MultiGuestLiveSettingFragment) c986950bn3.l0;
            interfaceC761860TuaNR.LIZLLL(multiGuestLiveSettingFragment.getDataChannel());
            interfaceC761860TuaNR.LJII(z, true, true);
            interfaceC761860TuaNR.LIZIZ(multiGuestLiveSettingFragment.getDataChannel());
        }
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("switch_to", str);
        C0KX4.LIZ("livesdk_multi_guest_switch_hear_voice_setting", map, null, true);
    }

    public static final void onCheckedChanged$7(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        if (!((MultiLiveSettingDialog) c986950bn3.l0).LLLLLLIL && compoundButton.isPressed()) {
            MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) c986950bn3.l0;
            if (z) {
                multiLiveSettingDialog.FS(true);
                C932160aMg.LIZIZ("camara_control_switch", "open");
                return;
            }
            C21411818qq c21411818qq = multiLiveSettingDialog.LLLLLL;
            if (c21411818qq != null) {
                multiLiveSettingDialog.LLLLLLIL = true;
                c21411818qq.setChecked(true);
                multiLiveSettingDialog.LLLLLLIL = false;
            }
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(multiLiveSettingDialog, 775);
            Context context = multiLiveSettingDialog.getContext();
            if (context == null) {
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131854253);
            c1397580mTM.LIZ(2131854252);
            C985403tE.LIZ(c1397580mTM, new AwS594S0100000_15(awS559S0100000_15, 780));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LJ();
        }
    }

    public static final void onCheckedChanged$8(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C935140aRU) c986950bn3.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$9(C986950bn3 c986950bn3, CompoundButton compoundButton, boolean z) {
        ((C937400aV8) c986950bn3.l0).LIZ.invoke(Boolean.valueOf(z));
    }
}
