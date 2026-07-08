package com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common;

import X.AnonymousClass0206;
import X.C01GW;
import X.C11NJ;
import X.C13LE;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C304201Fw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.C917140ZyS;
import X.C917650ZzH;
import X.C917740ZzQ;
import X.C920190a3N;
import X.C920960a4c;
import X.C920970a4d;
import X.C930190aJV;
import X.C930540aK4;
import X.C931740aM0;
import X.C940770aaZ;
import X.C942200acs;
import X.C948450amx;
import X.C957020b0m;
import X.EnumC930180aJU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC743640TFa;
import X.InterfaceC920220a3Q;
import X.InterfaceC923120a86;
import X.InterfaceC927510aFB;
import Y.AcS354S0200000_15;
import Y.AcS496S0100000_15;
import Y.AcS4S0002000_15;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.Event;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class SwitchLayoutPanelController {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIZ;
    public final DataChannel LIZ;
    public final Context LIZIZ;
    public MultiLiveAnchorPanelSettings LIZJ;
    public final C11NJ LIZLLL = new C11NJ();
    public final C01GW LJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1063));
    public final boolean LJFF = C917740ZzQ.LIZ(C930540aK4.LIZJ());
    public final C01GW LJI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(430));
    public final C01GW LJII = C930540aK4.LJJIJIL(AnonymousClass0206.get$arr$(501));
    public final C304201Fw LJIIIIZZ = new C304201Fw("ZOOM_SERVICE");

    public static final class CheckIncreaseGuestCountEvent extends Event<C920970a4d> {
        public static final int $stable = 8;
    }

    public static final class ShowSwitchTipsDialogEvent extends Event<C920960a4c> {
        public static final int $stable = 8;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SwitchLayoutPanelController.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LJIIIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LIZ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(ShowSwitchTipsDialogEvent.class, this, new AwS594S0100000_15(this, 436));
            dataChannel.CQ2(CheckIncreaseGuestCountEvent.class, this, new AwS594S0100000_15(this, 437));
        }
    }

    public final MultiLiveAnchorPanelSettings LJFF() {
        if (this.LIZJ == null) {
            this.LIZJ = ((MultiGuestDataHolder) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER")).LIZIZ();
        }
        return this.LIZJ;
    }

    public final int LJI() {
        if (!LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_skip_enlarge_check_in_change_layout")) {
            return 2131843496;
        }
        C304201Fw c304201Fw = this.LJIIIIZZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIIZ;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
        return C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJJJI(interfaceC927510aFB != null ? Boolean.valueOf(interfaceC927510aFB.LJIIIIZZ()) : null))) ? 2131843357 : 2131843496;
    }

    public final void LJIIJJI() {
        C20441214yg.LIZIZ("SwitchLayoutPanelController", "switchLayoutInterface fail");
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = ((MultiGuestDataHolder) C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER")).LIZIZ();
        this.LIZJ = multiLiveAnchorPanelSettingsLIZIZ != null ? MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607) : null;
    }

    public final Pair<Integer, Integer> LJII() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        return C942200acs.LIZIZ(multiLiveAnchorPanelSettingsLJFF != null ? C917650ZzH.LJII(multiLiveAnchorPanelSettingsLJFF) : 0);
    }

    public final void LIZJ(Function1<? super Boolean, Unit> function1) {
        boolean z;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
            if (multiLiveAnchorPanelSettingsLJFF != null && multiLiveAnchorPanelSettingsLJFF.layoutType == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LIZIZ(null, function1);
                return;
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF2 = LJFF();
            if (multiLiveAnchorPanelSettingsLJFF2 == null || multiLiveAnchorPanelSettingsLJFF2.layoutType != 1) {
                return;
            }
            LIZLLL(null, function1);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public final void LJIIJ(Function0 function0) {
        C920190a3N action;
        if (C917140ZyS.LIZJ()) {
            Pair<Integer, Integer> pairLJII = LJII();
            int iIntValue = pairLJII.getFirst().intValue();
            int iIntValue2 = pairLJII.getSecond().intValue();
            if (iIntValue == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layoutStyle = LayoutStyle.UNDEFINED, maxPosition = ");
                sbLIZ.append(iIntValue2);
                C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
            if (interfaceC923120a86LIZ != null && (action = interfaceC923120a86LIZ.getAction()) != null) {
                action.LJII(iIntValue, iIntValue2, new AwS559S0100000_15(function0, (Function0<Unit>) 1066), new AwS594S0100000_15(this, 1075));
                return;
            }
            return;
        }
        C766270U4b.LIZLLL(2131843698);
    }

    public SwitchLayoutPanelController(Context context, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function1 r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController.LIZIZ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    public final void LIZLLL(Function0 function0, Function1 function1) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF;
        int i;
        InterfaceC920220a3Q dataSource;
        List<C957020b0m> listLJIIIZ;
        PosIdentity posIdentity;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && (multiLiveAnchorPanelSettingsLJFF = LJFF()) != null && multiLiveAnchorPanelSettingsLJFF.fixMicNumAction == 0) {
            InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
            if (interfaceC923120a86LIZ != null && (dataSource = interfaceC923120a86LIZ.getDataSource()) != null && (listLJIIIZ = dataSource.LJIIIZ()) != null && !listLJIIIZ.isEmpty()) {
                i = 0;
                for (C957020b0m c957020b0m : listLJIIIZ) {
                    PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
                    if ((posIdentity2 != null && posIdentity2.type == 1) || ((posIdentity = c957020b0m.getPosIdentity()) != null && posIdentity.type == 2)) {
                        i++;
                        if (i < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
            } else {
                i = 0;
            }
            int iIntValue = LJII().getSecond().intValue() - 1;
            int i2 = i - 1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIncreasePanelGuestCount, curGuestCount:");
            sbLIZ.append(i2);
            sbLIZ.append(", panelSelectedGuestCount:");
            sbLIZ.append(iIntValue);
            C20441214yg.LIZIZ("SwitchLayoutPanelController", C2188811AlT.LIZIZ(sbLIZ));
            if (i2 > 0 && iIntValue > 0) {
                if (i2 > 6 && iIntValue < 8) {
                    LJIIIZ(i2, 2, 9, C497740JfY.LJIJI(2131843508), C497740JfY.LJIJJ(2131843507, Integer.valueOf(iIntValue), Integer.valueOf(i2)), function0);
                    function1.invoke(Boolean.TRUE);
                    return;
                } else if (iIntValue + 1 <= i2 && i2 < 7) {
                    LJIIIZ(i2, 2, 7, C497740JfY.LJIJI(2131843508), C497740JfY.LJIJJ(2131843507, Integer.valueOf(iIntValue), Integer.valueOf(i2)), function0);
                    function1.invoke(Boolean.TRUE);
                    return;
                } else {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public final void LJIIIIZZ(EnumC930180aJU enumC930180aJU, Function0<Unit> function0) {
        int i;
        String strLJIJI;
        int i2;
        int[] iArr = C930190aJV.LIZ;
        switch (iArr[enumC930180aJU.ordinal()]) {
            case 1:
            case 2:
                i = 2131843584;
                break;
            case 3:
            default:
                i = 2131843361;
                break;
            case 4:
            case 5:
                i = 2131843585;
                break;
            case 6:
                i = 2131843362;
                break;
            case 7:
                i = 2131843589;
                break;
            case 8:
                i = 2131843587;
                break;
        }
        String strLJIJI2 = C497740JfY.LJIJI(i);
        int i3 = iArr[enumC930180aJU.ordinal()];
        if (i3 != 3 && i3 != 6) {
            if (i3 == 7 || i3 != 8) {
                strLJIJI = C497740JfY.LJIJI(LJI());
            } else {
                strLJIJI = C497740JfY.LJIJI(LJI());
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843360);
        }
        int i4 = iArr[enumC930180aJU.ordinal()];
        if (i4 != 7) {
            if (i4 != 8) {
                i2 = 2131843583;
            } else {
                i2 = 2131843586;
            }
        } else {
            i2 = 2131843588;
        }
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ);
        c782110Um9.LIZJ = strLJIJI2;
        if (C500260Jjc.LJJIIZ(strLJIJI)) {
            c782110Um9.LJIIIZ(strLJIJI);
        }
        c782110Um9.LJIILIIL(i2, new AcS354S0200000_15(this, enumC930180aJU, function0, 10));
        c782110Um9.LJIIJ(2131843510, new AcS496S0100000_15(this, 29));
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public final void LJ(int i, int i2, int i3, Function0 function0) {
        LJIIIZ(i2, 2, i3 + 1, C497740JfY.LJIJI(2131843508), C497740JfY.LJIJJ(2131843507, Integer.valueOf(i), Integer.valueOf(i2)), function0);
    }

    public final void LJIIIZ(final int i, final int i2, final int i3, String str, String str2, final Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        c782110Um9.LJIIJ(2131843504, new AcS4S0002000_15(i, i3, 1));
        c782110Um9.LJIILIIL(2131843503, new InterfaceC743640TFa() { // from class: X.0a4e
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                C920190a3N action;
                liveDialog.dismiss();
                InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
                if (interfaceC923120a86LIZ != null && (action = interfaceC923120a86LIZ.getAction()) != null) {
                    action.LJII(i2, i3, new AwS559S0100000_15(function0, (Function0<Unit>) 1064), new AwS594S0100000_15(this, 1074));
                }
                C931740aM0.LJII(i, i3 - 1, "guidance", "click", "change", "live_take_detail");
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        C931740aM0.LJII(i, i3 - 1, "guidance", "show", "", "live_take_detail");
    }
}
