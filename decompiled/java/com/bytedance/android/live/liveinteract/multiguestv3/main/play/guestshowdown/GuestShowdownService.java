package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown;

import X.AbstractC19994813Le;
import X.C01FV;
import X.C01II;
import X.C01IJ;
import X.C01IL;
import X.C01IM;
import X.C01IR;
import X.C0UO0;
import X.C11NJ;
import X.C13LZ;
import X.C1516000pYM;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C334801Rq;
import X.C354710DvR;
import X.C516201zk;
import X.C915980Zwa;
import X.C930930aKh;
import X.C930940aKi;
import X.C954140aw8;
import X.InterfaceC938530aWx;
import X.InterfaceC938550aWz;
import X.InterfaceC948500an2;
import X.InterfaceC954180awC;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAndAudienceRoleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownResumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.GuestShowdownAudienceResumeFixSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest.GuestShowdownGuestViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentParams;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiGuestShowdownExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;
import org.json.JSONException;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "GUEST_SHOWDOWN")
public final class GuestShowdownService<VM extends BaseGuestShowdownViewModel> implements InterfaceC938530aWx {
    public static final /* synthetic */ int LIZJ = 0;
    public final VM LIZ;
    public ViewGroup LIZIZ;

    @Override // X.InterfaceC938530aWx
    public final String LIZLLL() {
        return this.LIZ.yQ2();
    }

    @Override // X.InterfaceC938530aWx
    public final Integer LJ() {
        return this.LIZ.xQ2().LJIILLIIL;
    }

    @Override // X.InterfaceC938530aWx
    public final String LJFF() {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel;
        String strLJIL;
        VM vm = this.LIZ;
        return (!(vm instanceof GuestShowdownAnchorViewModel) || (guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) vm) == null || (strLJIL = guestShowdownAnchorViewModel.LLJJIII.LJIL(null)) == null) ? "" : strLJIL;
    }

    @Override // X.InterfaceC938530aWx
    public final GuestShowdownContent LJI() {
        return this.LIZ.LLILZLL.getValue();
    }

    @Override // X.InterfaceC938530aWx
    public final InterfaceC938550aWz LJIIL() {
        return this.LIZ.vQ2();
    }

    @Override // X.InterfaceC938530aWx
    public final int LLLL() {
        Integer value = this.LIZ.LLILLJJLI.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC938530aWx
    public final long getPlayId() {
        GuestShowdownContent guestShowdownContentZQ2 = this.LIZ.zQ2();
        if (guestShowdownContentZQ2 != null) {
            return guestShowdownContentZQ2.playId;
        }
        return 0L;
    }

    @Override // X.InterfaceC938530aWx
    public final boolean LJIIJ() {
        return LLLL() == 1 || LLLL() == 2 || LLLL() == 3;
    }

    @Override // X.InterfaceC938530aWx
    public final boolean isRunning() {
        return LJIIJ() || LLLL() == 4;
    }

    @Override // X.InterfaceC938530aWx
    public final ViewGroup LIZIZ() {
        return this.LIZIZ;
    }

    public GuestShowdownService(VM vm) {
        this.LIZ = vm;
    }

    @Override // X.InterfaceC938530aWx
    public final void LIZ(SeiAppData seiAppData) throws JSONException {
        GuestShowdownGuestViewModel guestShowdownGuestViewModel;
        Map<String, String> map;
        SeiGuestShowdownExtra seiGuestShowdownExtra;
        long id;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        long jLongValue3;
        long jLongValue4;
        int iIntValue2;
        long jLongValue5;
        int iIntValue3;
        List<GuestShowdownUser> arrayList;
        List<GuestShowdownUser> arrayList2;
        int iIntValue4;
        Long lLJIILIIL;
        Integer num;
        Integer num2;
        Integer num3;
        long jLJIIJJI;
        long jLongValue6;
        Long l;
        Map<String, Map<String, String>> map2;
        VM vm = this.LIZ;
        Object objGg0 = null;
        if ((vm instanceof GuestShowdownGuestViewModel) && (guestShowdownGuestViewModel = (GuestShowdownGuestViewModel) vm) != null) {
            C01IJ c01ij = guestShowdownGuestViewModel.LLJI;
            c01ij.getClass();
            if (seiAppData != null && (map2 = seiAppData.businessExtraInfo) != null) {
                map = map2.get("guest_showdown");
            } else {
                map = null;
            }
            if (map == null) {
                c01ij.LJIJJ(null, "parse_sei");
                c01ij.LJIL = true;
                return;
            }
            Map<String, Map<String, String>> map3 = seiAppData.businessExtraInfo;
            if (map3 == null) {
                return;
            }
            Map<String, String> map4 = map3.get("guest_showdown");
            if (map4 != null) {
                seiGuestShowdownExtra = (SeiGuestShowdownExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, C1516000pYM.LIZJ(map4), SeiGuestShowdownExtra.class);
            } else {
                seiGuestShowdownExtra = null;
            }
            if (c01ij.LIZIZ == null && ((!c01ij.LJIJJ || (GuestShowdownAudienceResumeFixSetting.INSTANCE.isFix() && c01ij.LJIL)) && seiGuestShowdownExtra != null && (((num = seiGuestShowdownExtra.status) != null && num.intValue() == 2) || (((num2 = seiGuestShowdownExtra.status) != null && num2.intValue() == 3) || ((num3 = seiGuestShowdownExtra.status) != null && num3.intValue() == 4))))) {
                if (c01ij.LJIJJ) {
                    jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, 3000L));
                } else {
                    jLJIIJJI = 0;
                }
                c01ij.LJIJJ = true;
                GuestShowdownGetContentParams guestShowdownGetContentParams = new GuestShowdownGetContentParams();
                guestShowdownGetContentParams.roomId = C954140aw8.LIZJ();
                guestShowdownGetContentParams.channelId = C954140aw8.LIZIZ();
                if (seiGuestShowdownExtra != null && (l = seiGuestShowdownExtra.playId) != null) {
                    jLongValue6 = l.longValue();
                } else {
                    jLongValue6 = 0;
                }
                guestShowdownGetContentParams.playId = jLongValue6;
                guestShowdownGetContentParams.getType = 1;
                ((C11NJ) c01ij.LJJ.getValue()).LIZ(c01ij.LJIJI(guestShowdownGetContentParams, jLJIIJJI).LJFF(new C0UO0()).LJJIIZ(new C516201zk(c01ij, 325), new C516201zk(c01ij, 326)));
            } else {
                c01ij.LJIJJ = true;
            }
            c01ij.LJIL = false;
            if (seiGuestShowdownExtra == null) {
                return;
            }
            DataChannel dataChannel = c01ij.LIZ;
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(MultiGuestAndAudienceRoleChannel.class);
            }
            if (objGg0 == C01FV.GUEST) {
                C20441214yg.LIZIZ("GuestShowdownGuestModel", "parseSei updateContent return as is GUEST");
                return;
            }
            GuestShowdownContent guestShowdownContent = new GuestShowdownContent();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
                id = 0;
            } else {
                id = room.getId();
            }
            guestShowdownContent.roomId = id;
            String str = seiAppData.channelId;
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            guestShowdownContent.channelId = jLongValue;
            Long l2 = seiGuestShowdownExtra.playId;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            guestShowdownContent.playId = jLongValue2;
            Integer num4 = seiGuestShowdownExtra.status;
            if (num4 != null) {
                iIntValue = num4.intValue();
            } else {
                iIntValue = 0;
            }
            guestShowdownContent.playStatus = iIntValue;
            Long l3 = seiGuestShowdownExtra.startTime;
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            } else {
                jLongValue3 = 0;
            }
            guestShowdownContent.partyStartTime = jLongValue3;
            Long l4 = seiGuestShowdownExtra.startTime;
            if (l4 != null) {
                jLongValue4 = l4.longValue();
            } else {
                jLongValue4 = 0;
            }
            guestShowdownContent.punishmentStartTime = jLongValue4;
            GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
            Integer num5 = seiGuestShowdownExtra.winnerNum;
            if (num5 != null) {
                iIntValue2 = num5.intValue();
            } else {
                iIntValue2 = 1;
            }
            guestShowdownConfig.winnerNum = iIntValue2;
            Long l5 = seiGuestShowdownExtra.duration;
            if (l5 != null) {
                jLongValue5 = l5.longValue();
            } else {
                jLongValue5 = 0;
            }
            guestShowdownConfig.duration = jLongValue5;
            Integer num6 = seiGuestShowdownExtra.loserNum;
            if (num6 != null) {
                iIntValue3 = num6.intValue();
            } else {
                iIntValue3 = 0;
            }
            guestShowdownConfig.loserNum = iIntValue3;
            guestShowdownContent.playConfig = guestShowdownConfig;
            GuestShowdownContent guestShowdownContent2 = c01ij.LIZIZ;
            if (guestShowdownContent2 == null || (arrayList = guestShowdownContent2.runningPlayUsers) == null) {
                arrayList = new ArrayList<>();
            }
            guestShowdownContent.runningPlayUsers = arrayList;
            GuestShowdownContent guestShowdownContent3 = c01ij.LIZIZ;
            if (guestShowdownContent3 == null || (arrayList2 = guestShowdownContent3.leavePlayUsers) == null) {
                arrayList2 = new ArrayList<>();
            }
            guestShowdownContent.leavePlayUsers = arrayList2;
            String str2 = seiGuestShowdownExtra.contentId;
            if (str2 == null) {
                str2 = "";
            }
            guestShowdownContent.streamId = str2;
            Integer num7 = seiGuestShowdownExtra.runningStep;
            if (num7 != null) {
                iIntValue4 = num7.intValue();
            } else {
                iIntValue4 = 0;
            }
            guestShowdownContent.runningStep = iIntValue4;
            GuestShowdownContent guestShowdownContent4 = c01ij.LIZIZ;
            if (guestShowdownContent4 != null && guestShowdownContent4.playStatus == 4 && guestShowdownContent.playStatus == 3) {
                return;
            }
            c01ij.LJIJJ(guestShowdownContent, "parse_sei");
        }
    }

    @Override // X.InterfaceC938530aWx
    public final void LIZJ(ViewGroup viewGroup) {
        this.LIZIZ = viewGroup;
        this.LIZ.vQ2().LIZJ(viewGroup);
    }

    @Override // X.InterfaceC938530aWx
    public final void LJII(Bitmap bitmap) {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel;
        VM vm = this.LIZ;
        Integer numValueOf = null;
        if ((vm instanceof GuestShowdownAnchorViewModel) && (guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) vm) != null) {
            C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "updatePlayBoardAuxStream");
            if (bitmap.isRecycled()) {
                C20441214yg.LJIIL("GuestShowdownAnchorViewModel", "updatePlayBoardAuxStream, but bitmap is error");
                return;
            }
            C01II c01ii = guestShowdownAnchorViewModel.LLJJIII;
            String str = c01ii.LJIJJ;
            boolean z = false;
            if (str == null || a0.LJJJIL(str)) {
                return;
            }
            C01IL c01il = new C01IL();
            c01il.LIZ = bitmap.getWidth();
            c01il.LIZIZ = bitmap.getHeight();
            c01il.LIZJ = 1;
            c01il.LIZLLL = 800;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJZZI(str, c01il);
            }
            C01IM c01im = new C01IM();
            c01im.LIZ = C01IR.BITMAP;
            c01im.LIZIZ = bitmap;
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null) {
                interfaceC954180awCLLJLL2.LJIJJ(str, c01im);
            }
            if (c01ii.LJIJJLI) {
                return;
            }
            String str2 = c01ii.LJIJJ;
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null) {
                numValueOf = Integer.valueOf(interfaceC954180awCLLJLL3.startAuxStream(str2));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startedAuxStream startResult=");
            sbLIZ.append(numValueOf);
            C20441214yg.LJIIIZ("GuestShowdownAnchorModel", C2188811AlT.LIZIZ(sbLIZ));
            if (numValueOf != null && numValueOf.intValue() == 0) {
                z = true;
            }
            c01ii.LJIJJLI = z;
            if (z) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startedAuxStream failed: ");
            sbLIZ2.append(c01ii.LJIJJLI);
            C20441214yg.LJ("GuestShowdownAnchorModel", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC938530aWx
    public final long LJIIIZ(Long l) {
        VM vm = this.LIZ;
        vm.getClass();
        if (l != null) {
            Long l2 = vm.xQ2().LJIIJJI.get(Long.valueOf(l.longValue()));
            if (l2 != null) {
                return l2.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.InterfaceC938530aWx
    public final void LJIIJJI(GuestShowdownContent guestShowdownContent) throws JSONException {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel;
        VM vm = this.LIZ;
        if ((vm instanceof GuestShowdownAnchorViewModel) && (guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) vm) != null) {
            guestShowdownAnchorViewModel.LLJJIII.LJIJJ(guestShowdownContent, "resumeShowdown");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumeShowdown playStatus:");
            sbLIZ.append(guestShowdownContent.playStatus);
            sbLIZ.append(" streamId:");
            sbLIZ.append(guestShowdownContent.streamId);
            C20441214yg.LIZIZ("GuestShowdown", C2188811AlT.LIZIZ(sbLIZ));
            int i = guestShowdownContent.playStatus;
            if (i != 0 && i != 5 && guestShowdownContent.streamId.length() > 0) {
                guestShowdownAnchorViewModel.LLJJIII.LJIL(guestShowdownContent.streamId);
                DataChannel dataChannel = guestShowdownAnchorViewModel.LLJ;
                if (dataChannel != null) {
                    dataChannel.FQ2(GuestShowdownResumeEvent.class);
                }
            }
        }
    }

    @Override // X.InterfaceC938530aWx
    public final void LJIIIIZZ(long j, int i, int i2, long j2, boolean z, String str, C334801Rq c334801Rq, AwS594S0100000_15 awS594S0100000_15) {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel;
        VM vm = this.LIZ;
        if ((vm instanceof GuestShowdownAnchorViewModel) && (guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) vm) != null) {
            guestShowdownAnchorViewModel.HQ2(j, i, i2, j2, z, c334801Rq, awS594S0100000_15);
        }
    }
}
