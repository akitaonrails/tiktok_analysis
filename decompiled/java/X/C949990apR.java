package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostOffliveInviteTimeOutSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: renamed from: X.0apR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949990apR {
    public static final ConcurrentHashMap<Long, C954460awe> LIZ = new ConcurrentHashMap<>();
    public static final C744830TJp LIZIZ = new C744830TJp();
    public static final AFwS299S0000000_15 LIZJ = AFwS299S0000000_15.get$arr$(10);

    public static boolean LJFF() {
        return InterfaceC960800b6s.LLLLILI.LIZIZ().booleanValue();
    }

    public static boolean LIZ(long j) {
        if (LIZIZ.LIZLLL(j) > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(RivalExtraInfo rivalExtraInfo) {
        return C1697810uHb.LJIIJJI(3, 4).contains(Integer.valueOf(rivalExtraInfo.showPlayType));
    }

    public static boolean LIZJ(C954640aww c954640aww) {
        JoinGroupMessageExtra joinGroupMessageExtra;
        MHJoinBizContent mHJoinBizContent = c954640aww.LJI;
        if (mHJoinBizContent != null && (joinGroupMessageExtra = mHJoinBizContent.bizExtra) != null && joinGroupMessageExtra.sourceType == C955540ayO.LJJJJIZL.LIZ) {
            return true;
        }
        return false;
    }

    public static void LJ(long j) {
        LIZ.remove(Long.valueOf(j));
        C744830TJp c744830TJp = LIZIZ;
        c744830TJp.LIZJ(j, 0L, EnumC950510aqH.OFFLIVE_INVITE);
        c744830TJp.LJ(j);
    }

    public static void LIZLLL(C950000apS c950000apS, InterfaceC950010apT interfaceC950010apT) {
        int iIntValue;
        long id;
        Integer num;
        C954460awe c954460awePutIfAbsent;
        long j = c950000apS.LIZJ;
        ConcurrentHashMap<Long, C954460awe> concurrentHashMap = LIZ;
        Long lValueOf = Long.valueOf(j);
        C954460awe c954460awe = concurrentHashMap.get(lValueOf);
        if (c954460awe == null && (c954460awePutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (c954460awe = new C954460awe(j)))) != null) {
            c954460awe = c954460awePutIfAbsent;
        }
        C954460awe c954460awe2 = c954460awe;
        c954460awe2.LJII = C950220apo.LJFF();
        c954460awe2.LJJIIZI = true;
        c954460awe2.LJJIIZ = EnumC950200apm.INVITING;
        Map<String, Object> map = c950000apS.LJII;
        Object obj = null;
        if (map != null) {
            obj = map.get("invite_type");
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c954460awe2.LJJIJL = iIntValue;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        LIZIZ.LIZ(c950000apS.LIZJ, MtCoHostOffliveInviteTimeOutSetting.INSTANCE.getValue(), EnumC950510aqH.OFFLIVE_INVITE, new AwS559S0100000_15(c950000apS, 94));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        coHostApi.reserve(id, c950000apS.LIZIZ, c950000apS.LIZJ, 2).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(c954460awe2, interfaceC950010apT, 10), new AfS151S0200000_15(c950000apS, interfaceC950010apT, 11));
    }
}
