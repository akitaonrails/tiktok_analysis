package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.livesdk.dataChannel.MultiGuestContinuousTypeData;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925210aBT implements InterfaceC1102810env {
    public DataChannel LL;
    public InterfaceC785120Ur0 LLILLJJLI;
    public final C914960Zuw LLILLL = new C0IMT() { // from class: X.0Zuw
        @Override // X.C0IMT
        public final void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    C925210aBT c925210aBT = this.LL;
                    c925210aBT.getClass();
                    c925210aBT.LJFF(C925210aBT.LJI(), true);
                } else {
                    if (num.intValue() != 0 && num.intValue() != -1) {
                        return;
                    }
                    C925210aBT c925210aBT2 = this.LL;
                    c925210aBT2.getClass();
                    c925210aBT2.LJFF(C925210aBT.LJI(), false);
                }
            }
        }
    };

    @Override // X.InterfaceC1102810env
    public final void J() {
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return 220;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return 60;
    }

    public static boolean LJI() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ == null || (multiLiveUserSettings = roomLJIIIZ.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null) {
            return false;
        }
        return multiLiveUserApplySettings.isEligibleForApplyAutoApprove;
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FILL_REMAINING;
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        String str;
        String str2;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        C927240aEk c927240aEk = new C927240aEk("continuousMatch", "apply");
        c927240aEk.LIZJ.put("link_page", "continuous_match");
        Map<String, String> map = c927240aEk.LIZJ;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.randomMatchLinkPageEntrance) == null) {
            str = "";
        }
        map.put("link_page_entrance", str);
        c927240aEk.LJ = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        c927240aEk.LIZ();
        if (LJI()) {
            str2 = "join";
        } else {
            str2 = "request";
        }
        C947520alS.LIZIZ(null, str2, "click", "continuous_match");
        C925770aCN c925770aCN = new C925770aCN(null, 0, 20, false, 0, false, 0, 0L, null, 0L, null, 8187);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(GuestApplyEvent.class, c925770aCN);
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        DataChannel dataChannel = c1099960ejK.LIZJ;
        this.LL = dataChannel;
        this.LLILLJJLI = c945840aik;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiGuestContinuousTypeData.class, this, new AwS594S0100000_15(this, 1179));
        }
        C924790aAn.LIZLLL().LIZ(this.LLILLL);
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C924790aAn.LIZLLL().LIZJ(this.LLILLL);
    }

    public final void LJFF(boolean z, boolean z2) {
        String str;
        int i;
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILLJJLI;
        if (interfaceC785120Ur0 != null) {
            TextView textView = (TextView) interfaceC785120Ur0.findViewById(R.id.zsn);
            if (textView != null) {
                if (z2) {
                    textView.setText(C20642515q3.LJI(2131854556));
                } else if (z) {
                    textView.setText(C20642515q3.LJI(2131854554));
                } else {
                    textView.setText(C20642515q3.LJI(2131854555));
                }
            }
            View viewFindViewById = interfaceC785120Ur0.findViewById(R.id.lm2);
            if (viewFindViewById != null) {
                C500260Jjc.LJLJLJ(viewFindViewById, !z2);
            }
            if (z2) {
                i = R.drawable.e_l;
            } else {
                i = R.drawable.e_k;
            }
            View viewFindViewById2 = interfaceC785120Ur0.findViewById(R.id.y7q);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(i);
            }
        }
        if (!z2) {
            if (z) {
                str = "join";
            } else {
                str = "request";
            }
            C947520alS.LIZIZ(null, str, "show", "continuous_match");
        }
    }
}
