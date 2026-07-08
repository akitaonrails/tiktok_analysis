package X;

import android.graphics.RectF;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiMatchAnchorWidgetLoadedEvent;
import com.bytedance.android.live.liveinteract.competition.event.CompetitionStateEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.AudioPunishEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostAudienceAreaExpandChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.event.MultiCohostAuxStreamSwitchClickEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStreamStatsEvent;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableChannelBasedTrackSupportGroupChannelIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostMixStreamAVState;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostSkipMixAvatarLayoutKeyPrefixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostLayoutIdConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveQuickBattleRegisterUserListChangedMessageInSingleLive;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0ay9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955390ay9 extends AbstractC945390ai1<InterfaceC955380ay8> implements OnMessageListener {
    public static final /* synthetic */ int LLJJIII = 0;
    public boolean LL;
    public Room LLILLJJLI;
    public boolean LLILZ;
    public final C11NJ LLILLL = new C11NJ();
    public final AwS629S0100000_15 LLILZIL = new AwS629S0100000_15(this, 13);
    public final AFwS299S0000000_15 LLILZLL = AFwS299S0000000_15.get$arr$(12);
    public final C957740b1w LLIZ = new C957740b1w();
    public final C01GW LLIZLLLIL = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(26));
    public final C01GW LLJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 98));
    public final C01GW LLJI = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(25));
    public final C01GW LLJIJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 99));
    public final C01GW LLJILJIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 100));
    public final C01GW LLJILJILJ = C1935407i4.LIZ(new AwS559S0100000_15(this, 97));
    public final BPEAHandler LLJILLL = new BPEAHandler(Looper.getMainLooper());
    public final List<InterfaceC957620b1k> LLJJ = new ArrayList();
    public final C01GW LLJJI = C1935407i4.LIZ(new AwS559S0100000_15(this, 96));

    @Override // X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        IMessageManager iMessageManager;
        C20441214yg.LJIIIZ("MultiCoHostPresenter", "detachView");
        if (this.LL) {
            C958110b2X.LJIIJ();
        } else {
            C958110b2X.LJIIL();
        }
        C915980Zwa.LJI().LJIIJ().LLLI(false);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LLILLL.LJ();
        C915980Zwa.LJII().LJJLIIIJL(C946680ak6.class, this.LLILZIL);
        C915980Zwa.LJII().LJJLIIIJL(C07PN.class, this.LLILZLL);
        if (this.LL && C915980Zwa.LJII().LLI().atLeast(EnumC950120ape.Prepared)) {
            C915980Zwa.LJII().LLLJL(new C920570a3z("leave_with_detach_view", 0L, 10083, 58), null);
        }
        C915980Zwa.LJII().LLFF();
        LJJJLZIJ("detachView", true);
        C923780a9A.LIZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC954180awCLJIIIZ.LLJJJJ(EnumC965730bEp.CROSS, new InterfaceC969870bLV() { // from class: X.0aPj
                    @Override // X.InterfaceC969870bLV
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final List<PosIdentity> LIZIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LIZJ() {
                        return true;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LIZLLL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJ(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final long LJFF(String str) {
                        return 0L;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJI(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final double LJIIIIZZ(Layout layout, String str) {
                        return 0.0d;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIIIZ(String str, String str2, String str3, RectF rectF) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final ImageModel LJIIJ(String str, boolean z) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIIL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final void LJIILIIL(C966870bGf c966870bGf) {
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILJJIL(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILL() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILLIIL(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIIZILJ() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJIJ(RectF rectF, long j, long j2) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIJI() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final double LJIJJ(String str) {
                        return 0.0d;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJJ(RectF rectF, long j, long j2) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final ImageModel LJJI(String str) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJJIFFI(Layout layout, String str, RectF rectF) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJJII(RectF rectF) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJJIII(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final EnumC1276740jKS LJIJJLI() {
                        return EnumC1276740jKS.RENDER_FIT;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final LinkUserState L8(String str) {
                        return new LinkUserState();
                    }
                });
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ2 != null) {
                interfaceC954180awCLJIIIZ2.LJJZ(new InterfaceC969870bLV() { // from class: X.0aPj
                    @Override // X.InterfaceC969870bLV
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final List<PosIdentity> LIZIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LIZJ() {
                        return true;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LIZLLL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJ(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final long LJFF(String str) {
                        return 0L;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJI(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final double LJIIIIZZ(Layout layout, String str) {
                        return 0.0d;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIIIZ(String str, String str2, String str3, RectF rectF) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final ImageModel LJIIJ(String str, boolean z) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIIL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final void LJIILIIL(C966870bGf c966870bGf) {
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILJJIL(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILL() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIILLIIL(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIIZILJ() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJIJ(RectF rectF, long j, long j2) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJIJI() {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final double LJIJJ(String str) {
                        return 0.0d;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final int LJIL(String str) {
                        return 0;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJJ(RectF rectF, long j, long j2) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final ImageModel LJJI(String str) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJJIFFI(Layout layout, String str, RectF rectF) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final RectF LJJII(RectF rectF) {
                        return null;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final boolean LJJIII(String str) {
                        return false;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final EnumC1276740jKS LJIJJLI() {
                        return EnumC1276740jKS.RENDER_FIT;
                    }

                    @Override // X.InterfaceC969870bLV
                    public final LinkUserState L8(String str) {
                        return new LinkUserState();
                    }
                });
            }
        }
        if (EnableChannelBasedTrackSupportGroupChannelIdSetting.INSTANCE.isEnable()) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = C1EOY.LJIILLIIL ? "broadcast_period" : "watch_period";
            c1eoy.LJIILLIIL();
        }
        super.detachView();
        C957740b1w c957740b1w = this.LLIZ;
        c957740b1w.LIZIZ = null;
        for (InterfaceC420801kM interfaceC420801kM : c957740b1w.LIZJ) {
            if (!interfaceC420801kM.isDisposed()) {
                interfaceC420801kM.dispose();
            }
        }
        C01GW c01gw = C1145050fu3.LIZ;
        C1145050fu3.LIZIZ(this.LLIZ);
        if (this.LL && LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
            ((InterfaceC956540b00) this.LLJIJIL.getValue()).finish();
            ((ArrayList) this.LLJJ).clear();
            ((InterfaceC956300azc) this.LLJ.getValue()).stop();
        }
        if (this.LL && LiveDirectMatchSetting.INSTANCE.isEnabled() && !LiveQuickBattleRegisterUserListChangedMessageInSingleLive.INSTANCE.isEnable()) {
            ((InterfaceC956300azc) this.LLJJI.getValue()).stop();
        }
    }

    public final void LJJJJZI() {
        int i;
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841441));
        C955400ayA c955400ayA = C955400ayA.LIZ;
        DataChannel dataChannel = this.dataChannel;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lineup_cohost_disconnect_toast");
            c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
            C497690JfT c497690JfT = (C497690JfT) dataChannel.gg0(C781150Ukb.class);
            if (c497690JfT != null) {
                i = c497690JfT.LIZ;
            } else {
                OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
                i = officialChannelInfo != null ? officialChannelInfo.roleType : 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "lineup_anchor_type");
            c474500IjALIZ.LIZ();
        }
        C915980Zwa.LJII().LLLJL(new C920570a3z("leave_with_microom_start", 0L, 10082, 58), null);
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC955380ay8 interfaceC955380ay8) {
        Room room;
        Boolean bool;
        IMessageManager iMessageManager;
        super.attachView(interfaceC955380ay8);
        C20441214yg.LJIIIZ("MultiCoHostPresenter", "attachView");
        boolean zBooleanValue = false;
        this.LLILZ = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_CO_HOST_GUIDE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE.getIntType(), this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LL = zBooleanValue;
        ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42();
        DataChannel dataChannel3 = this.dataChannel;
        Object objGg0 = null;
        if (dataChannel3 != null) {
            room = (Room) dataChannel3.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILLJJLI = room;
        MultiCohostAreaExpandSetting.INSTANCE.setLastCohostLayoutId("");
        if (this.LL && LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
            ((ArrayList) this.LLJJ).add(this.LLJ.getValue());
        }
        if (this.LL && LiveDirectMatchSetting.INSTANCE.isEnabled() && !LiveQuickBattleRegisterUserListChangedMessageInSingleLive.INSTANCE.isEnable()) {
            ((ArrayList) this.LLJJ).add(this.LLJJI.getValue());
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                objGg0 = dataChannel4.gg0(MultiCoHostStateChannel.class);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachView, cohostState=");
            sbLIZ.append(objGg0);
            C20441214yg.LIZIZ("MultiCoHostPresenter", C2188811AlT.LIZIZ(sbLIZ));
            EnumC950120ape enumC950120ape = EnumC950120ape.Linked;
            if (objGg0 == enumC950120ape) {
                LJJJLIIL(enumC950120ape);
            }
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(MultiCoHostStateChannel.class, this, new AwS594S0100000_15(this, 82));
            dataChannel5.EQ2((LifecycleOwner) this.mView, MuteMicChannel.class, new AwS594S0100000_15(this, 83));
            LifecycleOwner lifecycleOwner = (LifecycleOwner) this.mView;
            AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 12);
            dataChannel5.BQ2(lifecycleOwner, BattleStateChannel.class, new AwS594S0100000_15(awS629S0100000_15, (Function2<? super Boolean, ? super String, Unit>) 724));
            dataChannel5.BQ2(lifecycleOwner, CompetitionStateEvent.class, new AwS594S0100000_15(awS629S0100000_15, (Function2<? super Boolean, ? super String, Unit>) 725));
            C975230bU9.LJI(dataChannel5, (LifecycleOwner) this.mView, new AwS664S0100000_15(this, 3));
            dataChannel5.BQ2((LifecycleOwner) this.mView, CoHostAudienceAreaExpandChannel.class, new AwS594S0100000_15(this, 84));
            dataChannel5.BQ2((LifecycleOwner) this.mView, MultiCoHostStreamStatsEvent.class, new AwS594S0100000_15(this, 85));
            dataChannel5.BQ2((LifecycleOwner) this.mView, MultiCohostAuxStreamSwitchClickEvent.class, new AwS594S0100000_15(this, 86));
            dataChannel5.BQ2((LifecycleOwner) this.mView, MultiMatchAnchorWidgetLoadedEvent.class, new AwS594S0100000_15(this, 87));
        }
        DataChannelGlobal.LLILZ.DQ2(AudioPunishEvent.class, this, new AwS594S0100000_15(this, 88));
        C915980Zwa.LJII().LLLJIL(C946680ak6.class, this.LLILZIL);
        C915980Zwa.LJII().LLLJIL(C07PN.class, this.LLILZLL);
        if (this.LL) {
            InterfaceC969870bLV interfaceC969870bLV = new InterfaceC969870bLV(this) { // from class: X.0ayN
                @Override // X.InterfaceC969870bLV
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final List<PosIdentity> LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LIZJ() {
                    return true;
                }

                @Override // X.InterfaceC969870bLV
                public final int LIZLLL(String str) {
                    return 1;
                }

                @Override // X.InterfaceC969870bLV
                public final long LJFF(String str) {
                    return 0L;
                }

                @Override // X.InterfaceC969870bLV
                public final JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV2, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIIL(String str) {
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final void LJIILIIL(C966870bGf c966870bGf) {
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILJJIL(String str) {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILL() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIIZILJ() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJIJ(RectF rectF, long j, long j2) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIJI() {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final double LJIJJ(String str) {
                    return 0.0d;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIL(String str) {
                    return 0;
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJJ(RectF rectF, long j, long j2) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final ImageModel LJJI(String str) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final RectF LJJII(RectF rectF) {
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJJIII(String str) {
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final int LJIIJJI() {
                    return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt() ? 1 : 0;
                }

                @Override // X.InterfaceC969870bLV
                public final EnumC1276740jKS LJIJJLI() {
                    return EnumC1276740jKS.RENDER_HIDDEN;
                }

                @Override // X.InterfaceC969870bLV
                public final LinkUserState L8(String str) {
                    return new LinkUserState();
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJ(String str) {
                    List<LinkUser> listLIZLLL;
                    LinkUser next;
                    if (LinkMicCohostMixStreamAVState.INSTANCE.enable()) {
                        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                        if (interfaceC954180awCLJIIIZ != null && (listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL()) != null) {
                            Iterator<LinkUser> it2 = listLIZLLL.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.linkMicId, str)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            LinkUser linkUser = next;
                            if (linkUser != null && linkUser.audioOn()) {
                                return false;
                            }
                        }
                        return true;
                    }
                    InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ2 == null) {
                        return false;
                    }
                    return interfaceC954180awCLJIIIZ2.LJ(str);
                }

                /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
                @Override // X.InterfaceC969870bLV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJI(java.lang.String r6) {
                    /*
                        r5 = this;
                        com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
                        X.0awC r0 = r0.LJIIIZ()
                        r4 = 0
                        if (r0 == 0) goto L8b
                        java.util.List r0 = r0.LIZLLL()
                        if (r0 == 0) goto L8b
                        java.util.Iterator r2 = r0.iterator()
                    L15:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L89
                        java.lang.Object r1 = r2.next()
                        r0 = r1
                        com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
                        java.lang.String r0 = r0.linkMicId
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
                        if (r0 == 0) goto L15
                    L2a:
                        com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r1 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r1
                        if (r1 == 0) goto L8b
                        int r0 = r1.linkUserType
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    L34:
                        r3 = 0
                        if (r0 == 0) goto L79
                        int r1 = r0.intValue()
                        r0 = 1
                        if (r1 != r0) goto L79
                        com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostMixStreamAVState r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCohostMixStreamAVState.INSTANCE
                        boolean r0 = r0.enable()
                        if (r0 == 0) goto L7a
                        com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
                        X.0awC r0 = r0.LJIIIZ()
                        if (r0 == 0) goto L78
                        java.util.List r0 = r0.LIZLLL()
                        if (r0 == 0) goto L78
                        java.util.Iterator r2 = r0.iterator()
                    L5a:
                        boolean r0 = r2.hasNext()
                        if (r0 == 0) goto L70
                        java.lang.Object r1 = r2.next()
                        r0 = r1
                        com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
                        java.lang.String r0 = r0.linkMicId
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
                        if (r0 == 0) goto L5a
                        r4 = r1
                    L70:
                        com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r4 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r4
                        if (r4 == 0) goto L78
                        boolean r0 = r4.videoSwitchOn
                        if (r0 != 0) goto L79
                    L78:
                        r3 = 1
                    L79:
                        return r3
                    L7a:
                        com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
                        X.0awC r0 = r0.LJIIIZ()
                        if (r0 == 0) goto L78
                        boolean r3 = r0.LJJLIL(r6)
                        return r3
                    L89:
                        r1 = r4
                        goto L2a
                    L8b:
                        r0 = r4
                        goto L34
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C955530ayN.LJI(java.lang.String):boolean");
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIILLIIL(String str) {
                    List<LinkUser> listLIZLLL;
                    LinkUser next;
                    Integer numValueOf;
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null && (listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL()) != null) {
                        Iterator<LinkUser> it2 = listLIZLLL.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.linkMicId, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LinkUser linkUser = next;
                        if (linkUser != null && (numValueOf = Integer.valueOf(linkUser.linkUserType)) != null && numValueOf.intValue() == 1) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                @Override // X.InterfaceC969870bLV
                public final double LJIIIIZZ(Layout layout, String str) {
                    String str2 = layout.layoutId;
                    LiveCoHostLayoutIdConfigSetting liveCoHostLayoutIdConfigSetting = LiveCoHostLayoutIdConfigSetting.INSTANCE;
                    if (!C958040b2Q.LJIIIIZZ(str2, liveCoHostLayoutIdConfigSetting.getValue().selfAnchorZoomed_v2)) {
                        C958040b2Q.LJIIIIZZ(str2, liveCoHostLayoutIdConfigSetting.getValue().otherAnchorZoomed_v2);
                        return 0.0d;
                    }
                    return 0.0d;
                }

                @Override // X.InterfaceC969870bLV
                public final ImageModel LJIIJ(String str, boolean z) {
                    C936770aU7 c936770aU7LLLLILI = C915980Zwa.LJII().LLLLILI(str);
                    if (c936770aU7LLLLILI != null) {
                        return c936770aU7LLLLILI.LJFF;
                    }
                    return null;
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJJIFFI(Layout layout, String str, RectF rectF) {
                    return LJIILLIIL(str);
                }

                @Override // X.InterfaceC969870bLV
                public final boolean LJIIIZ(String str, String str2, String str3, RectF rectF) {
                    if (CohostSkipMixAvatarLayoutKeyPrefixSetting.INSTANCE.isPrefixMatched(str2)) {
                        return false;
                    }
                    return LJIILLIIL(str3);
                }
            };
            if (C931800aM6.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ != null) {
                    interfaceC954180awCLJIIIZ.LLJJJJ(EnumC965730bEp.CROSS, interfaceC969870bLV);
                }
            } else {
                InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
                if (interfaceC954180awCLJIIIZ2 != null) {
                    interfaceC954180awCLJIIIZ2.LJJZ(interfaceC969870bLV);
                }
            }
        }
        C957740b1w c957740b1w = this.LLIZ;
        c957740b1w.LIZIZ = this.dataChannel;
        C1145050fu3.LIZ(c957740b1w);
    }

    public final void LJJJJLL(boolean z) {
        C938200aWQ c938200aWQ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" Sei lastLayoutId = ");
        sbLIZ.append(MultiCohostAreaExpandSetting.INSTANCE.getLastCohostLayoutId());
        C20441214yg.LJIIIZ("live_host_change", C2188811AlT.LIZIZ(sbLIZ));
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("host count is ");
        sbLIZ2.append(size);
        C20441214yg.LJIIIZ("live_host_change", C2188811AlT.LIZIZ(sbLIZ2));
        if (size >= 3) {
            C20441214yg.LJIIIZ("live_host_change", "more than 2");
            DataChannel dataChannel = this.dataChannel;
            if ((dataChannel != null && (c938200aWQ = (C938200aWQ) dataChannel.gg0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class)) != null && c938200aWQ.LIZ == EnumC476080Ili.NORMAL_TRAY.getValue()) || z) {
                C956400azm.LIZIZ(this.dataChannel, "dealCoHostSceneGiftPanelChange");
                return;
            }
            return;
        }
        C20441214yg.LJIIIZ("live_host_change", "less than 3");
        C956400azm.LIZ(this.dataChannel, "dealCoHostSceneGiftPanelChange");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0221 A[PHI: r12
      0x0221: PHI (r12v6 X.07tI) = (r12v4 X.07tI), (r12v7 X.07tI) binds: [B:50:0x010a, B:48:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(X.EnumC950120ape r24) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955390ay9.LJJJLIIL(X.0ape):void");
    }

    public final void LJJJZ(boolean z) {
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        RtcUserInfo rtcUserInfoG0;
        String str;
        if (this.LL && (interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ()) != null && (rtcUserInfoG0 = interfaceC954180awCLJIIIZ.G0()) != null && (str = rtcUserInfoG0.linkMicId) != null && str.length() > 0) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ2 != null) {
                interfaceC954180awCLJIIIZ2.LJJJJZI(str, z);
            }
            InterfaceC954180awC interfaceC954180awCLJIIIZ3 = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ3 != null) {
                interfaceC954180awCLJIIIZ3.LLFZ(z);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        String str2;
        User user;
        long j;
        C974800bTS c974800bTS;
        if (iMessage instanceof LinkMicAnchorGuideMessage) {
            LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = (LinkMicAnchorGuideMessage) iMessage;
            if (linkMicAnchorGuideMessage.guideType == 8 && (str = linkMicAnchorGuideMessage.guideContent) != null && str.length() != 0 && (str2 = linkMicAnchorGuideMessage.buttonContent) != null && str2.length() != 0 && (user = linkMicAnchorGuideMessage.user) != null && user.getAvatarThumb() != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class)) != null) {
                    j = c974800bTS.LIZ;
                } else {
                    j = 0;
                }
                if (C915980Zwa.LJFF().co0() && (j < 10 || j > 290)) {
                    return;
                }
                ((InterfaceC955380ay8) this.mView).wF2(linkMicAnchorGuideMessage);
                return;
            }
            return;
        }
        if (iMessage instanceof LinkMessage) {
            if (this.LL && LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
                ((InterfaceC945090ahX) this.LLIZLLLIL.getValue()).LIZ((LinkMessage) iMessage);
                return;
            }
            return;
        }
        if ((iMessage instanceof LinkMicBattleMessage) && this.LL && LiveMatchTeamPairSetting.INSTANCE.isEnable()) {
            LinkMicBattleMessage linkMicBattleMessage = (LinkMicBattleMessage) iMessage;
            ((InterfaceC963690bBX) this.LLJILJILJ.getValue()).LIZ(linkMicBattleMessage);
            ((InterfaceC956530azz) this.LLJI.getValue()).LIZ(linkMicBattleMessage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0253  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(java.lang.String r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 2600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955390ay9.LJJJLZIJ(java.lang.String, boolean):void");
    }
}
