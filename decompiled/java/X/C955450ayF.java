package X;

import Y.AcS496S0100000_15;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.abtest.MultiHostAbTestHelper;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCohostForSuperFanOnlyLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0ayF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955450ayF extends C957430b1R<InterfaceC955990az7, C955590ayT> {
    public static final C955450ayF LIZ = new C955450ayF();

    public static boolean LIZLLL(C955590ayT c955590ayT) {
        int i;
        int i2;
        boolean z;
        boolean zO1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInMgAndNotAllowToCohost, isInMg=");
        sbLIZ.append(zO1);
        C20441214yg.LIZIZ("MultiHostLinkViewDelegate", C2188811AlT.LIZIZ(sbLIZ));
        if (!zO1) {
            return false;
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            MultiHostAbTestHelper.CoHostABInfoInRoom coHostABInfoInRoomLIZ = MultiHostAbTestHelper.LIZ(c955590ayT.LJ.getOwnerUserId(), c955590ayT.LJ.roomCreateAbParam);
            if (coHostABInfoInRoomLIZ != null) {
                i = coHostABInfoInRoomLIZ.isCohostDuringMultiguestEnabled;
            } else {
                i = 0;
            }
            boolean zLJJIII = C915980Zwa.LJII().LJJIII();
            RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
            if (rivalExtraInfo != null) {
                i2 = rivalExtraInfo.showPlayType;
            } else {
                i2 = EnumC919160a1i.PLAYTYPE_INVITE.value;
            }
            if (i2 == EnumC919160a1i.PLAYTYPE_APPLY.value) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isInMgAndNotAllowToCohost, enableCohostInMg=");
            sbLIZ2.append(zLJJIII);
            sbLIZ2.append(", isRivalHostInPhase2Ab=");
            sbLIZ2.append(i);
            sbLIZ2.append(", isApply=");
            sbLIZ2.append(z);
            C20441214yg.LJIIIZ("MultiHostLinkViewDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z && zLJJIII && i > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJFF(C955590ayT c955590ayT) {
        RivalExtraInfo rivalExtraInfo;
        if (!(c955590ayT instanceof C957700b1s) || ((C957700b1s) c955590ayT).LJJ != EnumC959280b4Q.FRIENDS_RANKING || (rivalExtraInfo = c955590ayT.LJIIJ) == null) {
            return false;
        }
        if (rivalExtraInfo.showPlayType != 3 && rivalExtraInfo.detailBlockReason != 310) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(InterfaceC955990az7 interfaceC955990az7, Function0 function0) {
        Room room;
        DataChannel dataChannel = interfaceC955990az7.getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.visibleScopeType != 0) {
            C782110Um9 c782110Um9 = new C782110Um9(interfaceC955990az7.getItemView().getContext());
            c782110Um9.LJII(2131856064);
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131856065);
            c755620TkW.LIZJ = new AcS496S0100000_15(function0, 51);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131856053);
            c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0Zzu
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            };
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = 1;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final X.InterfaceC955990az7 r17, final X.C955590ayT r18) {
        /*
            Method dump skipped, instruction units count: 1283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955450ayF.LJ(X.0az7, X.0ayT):void");
    }

    public static void LIZIZ(InterfaceC955990az7 interfaceC955990az7, C955590ayT c955590ayT, long j) {
        C947390alF.LIZ(interfaceC955990az7.getItemView().getContext(), ViewTreeLifecycleOwner.get(interfaceC955990az7.getItemView()), interfaceC955990az7.getDataChannel(), C949460aoa.LIZ, AFwS193S0000000_7.get$arr$(224), new C955460ayG(interfaceC955990az7, c955590ayT, j));
    }

    public static void LIZ(InterfaceC955990az7 interfaceC955990az7, C955590ayT c955590ayT, boolean z, long j) {
        Room room;
        User owner;
        DataChannel dataChannel = interfaceC955990az7.getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && owner.getSecret() == 1) {
            C962110b8z.LIZ(interfaceC955990az7.getItemView().getContext(), EnumC960290b63.REQUEST, new AwS133S0110000_15(z, c955590ayT, 10), new AwS416S0200000_15(interfaceC955990az7, c955590ayT, 81));
        } else if (FansClubCohostForSuperFanOnlyLiveSetting.INSTANCE.isEnabled() && C494680Jac.LJIILL(interfaceC955990az7.getDataChannel())) {
            C958650b3P.LIZ(interfaceC955990az7.getItemView().getContext(), new AwS416S0200000_15(interfaceC955990az7, c955590ayT, 82), new AwS133S0110000_15(z, c955590ayT, 11));
        } else {
            LIZIZ(interfaceC955990az7, c955590ayT, j);
        }
    }
}
