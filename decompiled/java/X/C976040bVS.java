package X;

import X.InterfaceC975780bV2;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattlePunishDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFallbackSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS155S1200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C976040bVS<COORDINATOR extends InterfaceC975780bV2> implements InterfaceC975690bUt<COORDINATOR> {
    public final EnumC964170bCJ LIZ;
    public final InterfaceC975520bUc LIZIZ;
    public final InterfaceC977310bXV LIZJ;
    public final LinkMicBattleMessage LIZLLL;
    public final EnumC975850bV9 LJ;
    public volatile COORDINATOR LJFF;

    @Override // X.InterfaceC975690bUt
    public void H0(C960280b62 c960280b62) {
    }

    @Override // X.InterfaceC975690bUt
    public boolean LIZIZ(BattleInfoResponse battleInfoResponse) {
        return true;
    }

    @Override // X.InterfaceC975690bUt
    public void LIZLLL(String str) {
    }

    @Override // X.InterfaceC975690bUt
    public void LJ() {
    }

    @Override // X.InterfaceC975690bUt
    public void LJFF(long j, String str) {
    }

    @Override // X.InterfaceC975690bUt
    public void LJII(long j) {
    }

    @Override // X.InterfaceC975690bUt
    public void LJIIIIZZ(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason) {
    }

    @Override // X.InterfaceC975690bUt
    public boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC975690bUt
    public void X2(C974180bSS c974180bSS) {
    }

    @Override // X.InterfaceC975690bUt
    public void d1() {
    }

    @Override // X.InterfaceC975690bUt
    public void e3(C975600bUk c975600bUk) {
    }

    @Override // X.InterfaceC975690bUt
    public void j3() {
    }

    public final long LJIILIIL() {
        long value;
        C975960bVK c975960bVKM3;
        BattleSetting battleSetting;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc == null || (c975960bVKM3 = interfaceC975520bUc.m3()) == null || (battleSetting = c975960bVKM3.LJII) == null) {
            value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue();
        } else {
            long jLIZ = MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled() ? C974520bT0.LIZ() : C158B.LIZIZ();
            if (jLIZ <= 0) {
                jLIZ = System.currentTimeMillis();
            }
            value = LiveInteractBattlePunishDurationSetting.INSTANCE.getValue() - (Math.max(0L, jLIZ - battleSetting.endTimeMs) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C20441214yg.LJIIIZ("MatchState", "getBattlePunishRemainSecond, remainSecond  = " + value);
        return value;
    }

    public final COORDINATOR LJIILJJIL() {
        Object obj;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        InterfaceC975700bUu delegate;
        if (this.LJFF == null) {
            synchronized (this) {
                InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
                Boolean bool = (COORDINATOR) null;
                obj = bool;
                if (interfaceC975520bUc != null) {
                    InterfaceC975710bUv interfaceC975710bUvA3 = interfaceC975520bUc.a3();
                    obj = bool;
                    if (interfaceC975710bUvA3 != null) {
                        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
                        if (interfaceC975520bUc2 != null && (delegate = interfaceC975520bUc2.getDelegate()) != null) {
                            delegate.LIZIZ();
                        }
                        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
                        Boolean bool2 = bool;
                        if (interfaceC975520bUc3 != null) {
                            bool2 = (COORDINATOR) Boolean.valueOf(interfaceC975520bUc3.isAnchor());
                        }
                        boolean zLJJJI = C500260Jjc.LJJJI(bool2);
                        InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
                        if (interfaceC975520bUc4 == null || (enumC919170a1jLJIIIZ = interfaceC975520bUc4.LJIIIZ()) == null) {
                            enumC919170a1jLJIIIZ = EnumC919170a1j.UNKNOWN;
                        }
                        obj = (COORDINATOR) interfaceC975710bUvA3.LIZIZ(zLJJJI, enumC919170a1jLJIIIZ, this.LIZ, this.LJ);
                    }
                }
            }
            this.LJFF = (COORDINATOR) obj;
        }
        return this.LJFF;
    }

    public final long LJIILL() {
        long value;
        C975960bVK c975960bVKM3;
        BattleSetting battleSetting;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (C500260Jjc.LJJJI(interfaceC975520bUc != null ? Boolean.valueOf(interfaceC975520bUc.isAnchor()) : null)) {
            C0UVC.LIZIZ(null);
            C20441214yg.LJ("MatchState", "Can't use for Anchor side");
        }
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        if (interfaceC975520bUc2 == null || (c975960bVKM3 = interfaceC975520bUc2.m3()) == null || (battleSetting = c975960bVKM3.LJII) == null) {
            value = LiveInteractBattleDurationSetting.INSTANCE.getValue();
        } else {
            long jLIZ = MatchTimeOptSetting.INSTANCE.getAudienceStartTimeOptEnabled() ? C974520bT0.LIZ() : C158B.LIZIZ();
            if (jLIZ <= 0) {
                jLIZ = System.currentTimeMillis();
            }
            value = ((long) battleSetting.duration) - (Math.max(0L, jLIZ - battleSetting.startTimeMs) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        C20441214yg.LJIIIZ("MatchState", "getMatchRemainSecond, remainSecond  = " + value);
        return value;
    }

    @Override // X.InterfaceC975690bUt
    public final EnumC964170bCJ getStatus() {
        return this.LIZ;
    }

    public static void LJIIJJI(Map map) {
        if (map == null) {
            return;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        long jLongValue = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getKey()).longValue() > 0 && ((Number) entry.getKey()).longValue() != currentUserId) {
                jLongValue = ((Number) entry.getKey()).longValue();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureLinkMicGuestUserId, rightUserId = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LIZIZ("MatchState", C2188811AlT.LIZIZ(sbLIZ));
        if (jLongValue > 0 && C915980Zwa.LJI().LJIIJ().LLJJJIL() <= 0) {
            C915980Zwa.LJI().LJIIJ().LJJJJZ(jLongValue);
        }
    }

    public static boolean LJIIZILJ(long j) {
        if (j == -1) {
            return C915980Zwa.LJI().LIZ().LJJIJLIJ();
        }
        if (j == 3) {
            return true;
        }
        return false;
    }

    public final void LJIJI(Map<Long, AnchorMatchSettings> map) {
        InterfaceC975520bUc interfaceC975520bUc;
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        if (map != null && (interfaceC975520bUc = this.LIZIZ) != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
            c975990bVN.LIZ.LJIJ = map;
        }
    }

    public final void LJIJJ(EnigmaBattleExtraInfo enigmaBattleExtraInfo) {
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
            C20441214yg.LIZIZ("LiveMatchModelUpdater", "updateEnigmaBattleExtraInfo");
            if (enigmaBattleExtraInfo != null) {
                c975990bVN.LIZ.getClass();
            }
        }
    }

    public final void LJIJJLI(EnigmaBattleSetting enigmaBattleSetting) {
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
            C20441214yg.LIZIZ("LiveMatchModelUpdater", "updateEnigmaBattleSetting");
            if (enigmaBattleSetting != null) {
                c975990bVN.LIZ.LJJLIIIJJI = enigmaBattleSetting;
            }
        }
    }

    public final void LJIL(BattleInfoResponse battleInfoResponse) {
        InterfaceC975520bUc interfaceC975520bUc;
        Long lValueOf;
        DataChannel dataChannel;
        Room roomLJJLIIIIJ;
        User owner;
        boolean z;
        C954460awe c954460awe;
        C975960bVK c975960bVKM3;
        C975990bVN c975990bVN;
        Room roomInfo;
        if (battleInfoResponse.setting == null) {
            return;
        }
        InterfaceC975520bUc interfaceC975520bUc2 = this.LIZIZ;
        Integer numValueOf = null;
        if ((interfaceC975520bUc2 != null && (roomInfo = interfaceC975520bUc2.getRoomInfo()) != null && (owner = roomInfo.getOwner()) != null) || ((interfaceC975520bUc = this.LIZIZ) != null && (dataChannel = interfaceC975520bUc.getDataChannel()) != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null)) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            z = true;
        } else {
            z = false;
        }
        long jLongValue = 0;
        if (z || (lValueOf != null && lValueOf.longValue() == 0)) {
            List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
            if (listLJIJJ != null && (true ^ listLJIJJ.isEmpty()) && (c954460awe = (C954460awe) C13LP.LJJJLL(listLJIJJ)) != null) {
                lValueOf = Long.valueOf(c954460awe.LJ);
            } else {
                lValueOf = null;
            }
        }
        LJJ(battleInfoResponse.leagueInfoMap, battleInfoResponse.leagueScoreInfoMap);
        LJIJJLI(battleInfoResponse.enigmaBattleSetting);
        LJIJJ(battleInfoResponse.enigmaBattleExtraInfo);
        LJIJI(battleInfoResponse.anchorMatchSettings);
        InterfaceC975520bUc interfaceC975520bUc3 = this.LIZIZ;
        if (interfaceC975520bUc3 != null && (c975960bVKM3 = interfaceC975520bUc3.m3()) != null && (c975990bVN = c975960bVKM3.LJJJLZIJ) != null) {
            C20441214yg.LJIIIZ("MatchModelUpdater", "clearEnigmaInfo: ");
            C975960bVK c975960bVK = c975990bVN.LIZ;
            c975960bVK.LJJLIIIJJIZ = 0L;
            c975960bVK.LJJLIIIJL = 0L;
            c975990bVN.LIZJ();
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
            c975990bVN.LJI(null, battleInfoResponse, jLongValue);
        }
        InterfaceC975520bUc interfaceC975520bUc4 = this.LIZIZ;
        if (interfaceC975520bUc4 != null) {
            BattleSetting battleSetting = battleInfoResponse.setting;
            if (battleSetting != null) {
                numValueOf = Integer.valueOf(battleSetting.battleType);
            }
            interfaceC975520bUc4.k3(C918130a03.LIZ(numValueOf));
        }
    }

    public static boolean LJIIJ(C976040bVS c976040bVS, long j) {
        C975960bVK c975960bVKM3;
        InterfaceC975520bUc interfaceC975520bUc = c976040bVS.LIZIZ;
        if (interfaceC975520bUc != null && (c975960bVKM3 = interfaceC975520bUc.m3()) != null && j == c975960bVKM3.LJ) {
            return true;
        }
        return false;
    }

    public static void LJJ(Map map, Map map2) {
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        String str;
        GiftGalleryBadgeSection giftGalleryBadgeSection;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
        GiftGalleryBadgeSection giftGalleryBadgeSection2;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText2;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        StringBuilder sb = new StringBuilder("updateRankInfo, leagueInfo=");
        sb.append(map);
        sb.append(", leagueScore=");
        sb.append(map2);
        sb.append(", linkedUids=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        sb.append(arrayList);
        C20441214yg.LIZIZ("MatchState", sb.toString());
        for (C954460awe c954460awe : listLLILZLL) {
            String str2 = null;
            if (map != null) {
                giftGalleryBadgeInfo = (GiftGalleryBadgeInfo) map.get(Long.valueOf(c954460awe.LJ));
            } else {
                giftGalleryBadgeInfo = null;
            }
            if (!Intrinsics.LJFF(c954460awe.LJJIII, giftGalleryBadgeInfo)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateRankInfo apply uid=");
                sbLIZ.append(c954460awe.LJ);
                sbLIZ.append(", leagueInfo: ");
                GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = c954460awe.LJJIII;
                if (giftGalleryBadgeInfo2 != null && (giftGalleryBadgeSection2 = giftGalleryBadgeInfo2.leagueInfo) != null && (linkMicGiftGalleryDisplayText2 = giftGalleryBadgeSection2.displayText) != null) {
                    str = linkMicGiftGalleryDisplayText2.content;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(" -> ");
                if (giftGalleryBadgeInfo != null && (giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo) != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText) != null) {
                    str2 = linkMicGiftGalleryDisplayText.content;
                }
                sbLIZ.append(str2);
                C20441214yg.LJIIIZ("MatchState", C2188811AlT.LIZIZ(sbLIZ));
            }
            c954460awe.LJJIII = giftGalleryBadgeInfo;
        }
        if (map2 != null && !map2.isEmpty()) {
            for (C954460awe c954460awe2 : listLLILZLL) {
                c954460awe2.LJJIIJ = (LeagueScoreInfo) map2.get(Long.valueOf(c954460awe2.LJ));
            }
        }
    }

    @Override // X.InterfaceC975690bUt
    public void LJIIL(List list, List list2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list Changed , after = ");
        sbLIZ.append(list);
        sbLIZ.append(" , old = ");
        sbLIZ.append(list2);
        C20441214yg.LJ("MatchState", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIILLIIL(C976400bW2 c976400bW2, String str, Function2<? super BattleInfoResponse, ? super Long, Unit> function2) {
        if (LiveMatchFallbackSwitch.INSTANCE.getValue()) {
            AwS155S1200000_15 awS155S1200000_15 = new AwS155S1200000_15(str, (String) this, (Function2) function2, (Function2<? super BattleInfoResponse, ? super Long, Unit>) 1);
            c976400bW2.LIZ();
            c976400bW2.LIZLLL = C23250099c.LIZLLL(c976400bW2.LIZJ, null, null, new C976130bVb(SystemClock.elapsedRealtime(), c976400bW2, new C118300cf(), awS155S1200000_15, null), 3);
        }
    }

    public final boolean LJIJ(EnumC964170bCJ enumC964170bCJ, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage, BattleInfoResponse battleInfoResponse) {
        InterfaceC975520bUc interfaceC975520bUc = this.LIZIZ;
        if (interfaceC975520bUc != null) {
            return interfaceC975520bUc.r3(enumC964170bCJ, enumC975850bV9, linkMicBattleMessage, battleInfoResponse);
        }
        return false;
    }

    public C976040bVS(EnumC964170bCJ enumC964170bCJ, InterfaceC975520bUc interfaceC975520bUc, InterfaceC977310bXV interfaceC977310bXV, LinkMicBattleMessage linkMicBattleMessage, EnumC975850bV9 enumC975850bV9) {
        this.LIZ = enumC964170bCJ;
        this.LIZIZ = interfaceC975520bUc;
        this.LIZJ = interfaceC977310bXV;
        this.LIZLLL = linkMicBattleMessage;
        this.LJ = enumC975850bV9;
    }
}
