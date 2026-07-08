package X;

import android.view.View;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.MultiGuestContinuousTypeData;
import com.bytedance.android.livesdk.dataChannel.MultiGuestContinuousTypeDataWhenHVSwitch;
import com.bytedance.android.livesdk.dataChannel.RandomMatchTypeData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914910Zur {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(DataChannel dataChannel) {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        C20441214yg.LJIIIZ("MultiGuestContinuousMatchHelper", "enterContinuousMatchScene");
        if (dataChannel != null) {
            Boolean bool = Boolean.TRUE;
            dataChannel.zW(MultiGuestContinuousTypeData.class, bool);
            dataChannel.zW(MultiGuestContinuousTypeDataWhenHVSwitch.class, Boolean.FALSE);
            ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).GL(true, false, dataChannel);
            if (!Intrinsics.LJFF(dataChannel.gg0(RandomMatchTypeData.class), bool)) {
                EnumC1102740eno.MULTI_GUEST_BACK.load(dataChannel, new InterfaceC1102810env() { // from class: X.0KX6
                    public InterfaceC785120Ur0 LL;

                    @Override // X.InterfaceC1102810env
                    public final void J() {
                    }

                    @Override // X.InterfaceC1102810env
                    public final Integer LIZJ() {
                        return null;
                    }

                    @Override // X.InterfaceC1102810env
                    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
                    }

                    @Override // X.InterfaceC1102810env
                    public final Integer LJ() {
                        return null;
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
                    public final C0KX7 LIZ() {
                        return C0KX7.FIXED;
                    }

                    @Override // X.InterfaceC1102810env
                    public final void onClick(View view) {
                        C947520alS.LIZIZ(null, "back", "click", "continuous_match");
                        C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
                    }

                    @Override // X.InterfaceC1102810env
                    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
                        this.LL = c945840aik;
                        C947520alS.LIZIZ(null, "back", "show", "continuous_match");
                    }
                }, true);
            }
            EnumC1102740eno.MULTI_GUEST_JOIN.load(dataChannel, new C925210aBT(), true);
            EnumC1102740eno.MULTIGUEST.hide(dataChannel);
        }
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            roomsData.multiGuestContinuousType = 0;
        }
    }
}
