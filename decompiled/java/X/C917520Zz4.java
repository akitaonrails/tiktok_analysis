package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917520Zz4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJIIJJI(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i == 4 ? "everyone" : "" : "followers" : "no_one" : "followers" : "";
    }

    public static String LJ() {
        StringBuilder sb = new StringBuilder();
        List listLIZLLL = LIZLLL();
        if (listLIZLLL != null) {
            int size = listLIZLLL.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) ListProtector.get(listLIZLLL, i));
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String LJI() {
        InterfaceC921620a5g interfaceC921620a5g;
        String strLIZIZ;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        return (!(objLJIIIZ instanceof InterfaceC917640ZzG) || (interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ) == null || (strLIZIZ = interfaceC921620a5g.LIZIZ(UserService.getInstance().user().getCurrentUserId())) == null) ? "others" : strLIZIZ;
    }

    public static LiveMode LJIIJ() {
        LiveMode streamType;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (streamType = room.getStreamType()) == null) ? LiveMode.VIDEO : streamType;
    }

    public static String LJIIL() {
        LiveMode streamType;
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (streamType = room.getStreamType()) == null || (str = streamType.logStreamingType) == null) ? "video_live" : str;
    }

    public static EnumC918970a1P LJIILIIL() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILL()) {
            C307001Gy.LIZ().getClass();
            return C927600aFK.LJII();
        }
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJJJJI;
        }
        return null;
    }

    public static String LIZJ() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String realDrawLayoutId;
        if (C931790aM5.LIZIZ()) {
            return C940770aaZ.LIZ().getDataSource().LJIL();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        return (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (realDrawLayoutId = interfaceC937820aVoLJJJJZ.getRealDrawLayoutId()) == null) ? "" : realDrawLayoutId;
    }

    public static List LIZLLL() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        ArrayList arrayList = null;
        if (C930540aK4.LIZJ()) {
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJIII2, 10));
                Iterator it2 = listLJJIII2.iterator();
                while (it2.hasNext()) {
                    User user = ((LinkPlayerInfo) it2.next()).mUser;
                    arrayList2.add(C01Z4.LIZIZ(user != null ? user.getId() : 0L));
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    String str = (String) obj;
                    if (C1533950q1J.LJ(str) && !Intrinsics.LJFF(str, C924810aAp.LJ().LJIILJJIL)) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJIII, 10));
                Iterator it3 = listLJJIII.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((LinkListUser) it3.next()).linkMicId);
                }
                arrayList = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (!Intrinsics.LJFF(obj2, C924810aAp.LJ().LJIILJJIL)) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static int LJIILJJIL() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        if (C931790aM5.LIZIZ()) {
            return C940770aaZ.LIZ().getDataSource().LJIIIZ().size() - 1;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        return ((interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) ? 1 : allLayoutWindows.size()) - 1;
    }

    public static void LIZ(Map map) {
        String strValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        int i = 0;
        if (room != null && C781520UlC.LJFF(room)) {
            map.put("layout_id", LIZJ());
            map.remove("layout_setting");
            map.remove("window_setting");
        } else {
            C917650ZzH.LIZIZ(map);
        }
        C404301hh.LIZ(map);
        if (C917810ZzX.LJIILIIL()) {
            strValueOf = String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        } else {
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            if (multiGuestDataHolder != null) {
                i = multiGuestDataHolder.LJJIFFI;
            }
            strValueOf = String.valueOf(i);
        }
        map.put("guest_cnt", strValueOf);
    }

    public static void LIZIZ(Runnable runnable) {
        if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            runnable.run();
        }
    }

    public static Pair LJII(EnumC918970a1P enumC918970a1P) {
        int i;
        if (enumC918970a1P == null) {
            i = -1;
        } else {
            i = C915810ZwJ.LIZ[enumC918970a1P.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return new Pair("normal_floating", "not_existed");
                    }
                    return new Pair("grid", "unfixed");
                }
                return new Pair("grid", "fixed");
            }
            return new Pair("floating", "unfixed");
        }
        return new Pair("floating", "fixed");
    }

    public static String LJIILL(User user) {
        if (C930540aK4.LJIJJ(user)) {
            return "anchor";
        }
        if (C930540aK4.LJJII(user)) {
            return "guest";
        }
        if (C930540aK4.LJIL(user)) {
            return "user";
        }
        return "";
    }

    public static String LJIILLIIL(Integer num) {
        if (num != null) {
            if (num.intValue() != 1 && num.intValue() != 3) {
                if (num.intValue() == 2) {
                    return "audio";
                }
                num.intValue();
                return "no_permission";
            }
            return "video";
        }
        return "no_permission";
    }

    public static String LJFF(Long l, String str) {
        if ((LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && l != null && l.longValue() > 0) || str == null) {
            return "";
        }
        return str;
    }

    public static String LJIIIIZZ(boolean z, Room room) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        Integer numValueOf;
        if (!z) {
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            if (multiGuestDataHolder != null) {
                numValueOf = Integer.valueOf(multiGuestDataHolder.LJJLIIIIJ);
            } else {
                numValueOf = null;
            }
            return LJIILLIIL(numValueOf);
        }
        long jLongValue = 0;
        if (room != null) {
            boolean z2 = C925080aBG.LIZ;
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
                jLongValue = l.longValue();
            }
        }
        return LJIILLIIL(Integer.valueOf((int) jLongValue));
    }
}
