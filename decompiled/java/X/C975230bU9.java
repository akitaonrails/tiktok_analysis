package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.competition.event.CompetitionStateEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975230bU9 {
    public static final EnumC962960bAM LIZJ() {
        C962950bAL c962950bAL = EnumC962960bAM.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        c962950bAL.getClass();
        return C962950bAL.LIZLLL(enumC919170a1jXB0);
    }

    public static final void LJFF() {
        InterfaceC960800b6s.LLJLLIL.LJFF(C930540aK4.LJIIJ());
    }

    public static final EnumC964170bCJ LIZIZ(DataChannel dataChannel) {
        C975240bUA c975240bUA;
        if (dataChannel != null) {
            EnumC964170bCJ enumC964170bCJ = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class);
            if (enumC964170bCJ != null && enumC964170bCJ != EnumC964170bCJ.NONE) {
                return enumC964170bCJ;
            }
            if (dataChannel != null && (c975240bUA = (C975240bUA) dataChannel.gg0(CompetitionStateEvent.class)) != null) {
                return LJIIIIZZ(c975240bUA).getSecond();
            }
        }
        return EnumC964170bCJ.NONE;
    }

    public static final long LIZLLL(SeiAppData seiAppData) {
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        String str;
        if (seiAppData == null || (map = seiAppData.businessExtraInfo) == null || (map2 = map.get("match_info")) == null || (str = map2.get("competition_id")) == null) {
            return 0L;
        }
        return C950220apo.LJJ(str);
    }

    public static final Pair<Boolean, EnumC964170bCJ> LJIIIIZZ(C975240bUA c975240bUA) {
        EnumC964170bCJ enumC964170bCJ;
        EnumC964170bCJ enumC964170bCJ2 = c975240bUA.LIZLLL;
        EnumC964170bCJ enumC964170bCJ3 = c975240bUA.LJ;
        if (enumC964170bCJ2 == enumC964170bCJ3) {
            return new Pair<>(Boolean.valueOf(c975240bUA.LIZJ), c975240bUA.LIZLLL);
        }
        boolean z = c975240bUA.LIZJ;
        if (z) {
            EnumC964170bCJ enumC964170bCJ4 = EnumC964170bCJ.NONE;
            if ((enumC964170bCJ3 == enumC964170bCJ4 || enumC964170bCJ3 == EnumC964170bCJ.MATCH_END) && enumC964170bCJ2 != enumC964170bCJ4 && enumC964170bCJ2 != EnumC964170bCJ.MATCH_END) {
                return new Pair<>(Boolean.FALSE, enumC964170bCJ2);
            }
        } else {
            EnumC964170bCJ enumC964170bCJ5 = EnumC964170bCJ.NONE;
            if ((enumC964170bCJ2 == enumC964170bCJ5 || enumC964170bCJ2 == EnumC964170bCJ.MATCH_END) && enumC964170bCJ3 != enumC964170bCJ5 && enumC964170bCJ3 != EnumC964170bCJ.MATCH_END) {
                return new Pair<>(Boolean.TRUE, enumC964170bCJ3);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (c975240bUA.LIZJ) {
            enumC964170bCJ = c975240bUA.LJ;
        } else {
            enumC964170bCJ = c975240bUA.LIZLLL;
        }
        return new Pair<>(boolValueOf, enumC964170bCJ);
    }

    public static final C982390bfh LIZ(long j, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C982390bfh c982390bfh = (C982390bfh) it2.next();
                Iterator<C982710bgD> it3 = c982390bfh.LJI.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LIZ == j) {
                        return c982390bfh;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003b A[PHI: r2
      0x003b: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean) binds: [B:27:0x0038, B:15:0x0022, B:17:0x0026, B:19:0x002a, B:21:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(com.bytedance.android.livesdkapi.depend.model.live.Room r4, com.bytedance.ies.sdk.datachannel.DataChannel r5) {
        /*
            com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveLinkReserveToolbarOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveLinkReserveToolbarOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            r3 = 1
            if (r0 == 0) goto L3f
            if (r4 == 0) goto L3d
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r4.getLinkMicInfo()
            if (r0 == 0) goto L37
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r0 = r0.battleInfo
            if (r0 == 0) goto L37
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r0.setting
            if (r0 == 0) goto L37
            int r0 = r0.status
            if (r0 != r3) goto L37
            r2 = 1
        L1e:
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r4.getLinkMicInfo()
            if (r0 == 0) goto L3b
            com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo r0 = r0.competitionInfo
            if (r0 == 0) goto L3b
            com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo r0 = r0.takeTheStageInfo
            if (r0 == 0) goto L3b
            int r1 = r0.takeTheStageStatus
            r0 = 3
            if (r1 != r0) goto L3b
            r0 = 1
        L32:
            if (r2 != 0) goto L36
            if (r0 == 0) goto L3d
        L36:
            return r3
        L37:
            r2 = 0
            if (r4 == 0) goto L3b
            goto L1e
        L3b:
            r0 = 0
            goto L32
        L3d:
            r3 = 0
            return r3
        L3f:
            X.0bCJ r1 = LIZIZ(r5)
            X.0bCJ r0 = X.EnumC964170bCJ.MATCH_START
            if (r1 == r0) goto L48
            r3 = 0
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975230bU9.LJ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):boolean");
    }

    public static final void LJI(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC1631620sYq interfaceC1631620sYq) {
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, BattleStateChannel.class, new AwS594S0100000_15(interfaceC1631620sYq, (InterfaceC1631620sYq<? super EnumC964170bCJ, ? super EnumC962960bAM, ? super Boolean, Unit>) 726));
            dataChannel.BQ2(lifecycleOwner, BattleReMatchStateChannel.class, new AwS594S0100000_15(interfaceC1631620sYq, (InterfaceC1631620sYq<? super EnumC964170bCJ, ? super EnumC962960bAM, ? super Boolean, Unit>) 727));
            dataChannel.BQ2(lifecycleOwner, CompetitionStateEvent.class, new AwS594S0100000_15(interfaceC1631620sYq, (InterfaceC1631620sYq<? super EnumC964170bCJ, ? super EnumC962960bAM, ? super Boolean, Unit>) 728));
        }
    }

    public static final void LJII(DataChannel dataChannel, Object obj, Function2 function2) {
        if (dataChannel != null) {
            dataChannel.CQ2(BattleStateChannel.class, obj, new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 729));
            dataChannel.CQ2(CompetitionStateEvent.class, obj, new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 730));
        }
    }
}
