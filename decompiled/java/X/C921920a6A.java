package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921920a6A {
    public static long LIZ;
    public static int LJFF;
    public static boolean LJII;
    public static final HashMap<Long, String> LIZIZ = new HashMap<>();
    public static final HashMap<Long, String> LIZJ = new HashMap<>();
    public static final HashSet<Long> LIZLLL = new HashSet<>();
    public static final HashMap<Long, String> LJ = new HashMap<>();
    public static final String LJI = "MultiLiveEnd";

    public static final void LIZLLL(long j) {
        LIZLLL.add(Long.valueOf(j));
    }

    public static final void LJI(EnumC918970a1P enumC918970a1P, DataChannel dataChannel) {
        Boolean bool;
        String str;
        Map map;
        if (LIZIZ.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, String>> it2 = LIZJ.entrySet().iterator();
        while (true) {
            bool = null;
            str = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<Long, String> next = it2.next();
            if (dataChannel != null && (map = (Map) dataChannel.gg0(C749200TaA.class)) != null) {
                str2 = (String) map.get(next.getKey());
            }
            C922220a6e.LIZ(next.getKey().longValue(), next.getValue(), "live_end", 0L, false, str2, Integer.valueOf(LIZJ.size()), dataChannel, 16);
        }
        LIZIZ.clear();
        LIZJ.clear();
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C750180Tbk.class);
        }
        if (C500260Jjc.LJJJI(bool)) {
            if (dataChannel != null) {
                dataChannel.SX0(C750180Tbk.class, Boolean.FALSE);
            }
            str = "lineup_start";
        } else {
            str = "live_end";
        }
        LJIIIIZZ(str, 0L, -1L, enumC918970a1P, "liveEnd&turnOff", "", dataChannel);
        C500260Jjc.LJJLIIIJJI(30L, AFwS203S0000000_15.get$arr$(493));
    }

    public static final void LJII(EnumC918970a1P enumC918970a1P, DataChannel dataChannel) {
        if (LIZIZ.isEmpty()) {
            return;
        }
        for (Map.Entry<Long, String> entry : LIZJ.entrySet()) {
            C922220a6e.LIZ(entry.getKey().longValue(), entry.getValue(), "turn_off_functions", 0L, false, null, null, dataChannel, 112);
        }
        LIZIZ.clear();
        LIZJ.clear();
        LJIIIIZZ("turn_off_functions", 0L, -1L, enumC918970a1P, "liveEnd&turnOff", "", null);
    }

    public static void LJIIJ(long j, String str) {
        LJ.put(Long.valueOf(j), str);
    }

    public static final void LJ(long j, String str, String str2) {
        List<LinkUser> listLIZLLL;
        List<LinkUser> listLIZLLL2;
        List<LinkUser> listLIZLLL3;
        EnumC918990a1R enumC918990a1RLIZ;
        InterfaceC924740aAi interfaceC924740aAiLIZ;
        HashMap<Long, String> map = LIZIZ;
        LinkUser linkUser = null;
        int size = 0;
        if (map.isEmpty()) {
            LIZ = System.currentTimeMillis();
            C917290Zyh c917290Zyh = C917290Zyh.LIZ;
            C917290Zyh.LJIIL = "guest_link";
            C917290Zyh.LJIIJJI = false;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings != null) {
                enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettings);
            } else {
                enumC918990a1RLIZ = null;
            }
            c917290Zyh.LJIIIZ(enumC918990a1RLIZ, true);
            if (PlayRecordManager.LIZLLL != null && (interfaceC924740aAiLIZ = C920350a3d.LIZ()) != null) {
                interfaceC924740aAiLIZ.LJII();
            }
        }
        map.put(Long.valueOf(j), str);
        LIZJ.put(Long.valueOf(j), str2);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL3 = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            Iterator<LinkUser> it2 = listLIZLLL3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LinkUser next = it2.next();
                Long l = next.userId;
                if (l != null && l.longValue() == j) {
                    linkUser = next;
                    break;
                }
            }
        }
        if (C917810ZzX.LJIILIIL()) {
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null && (listLIZLLL2 = interfaceC954180awCLLJLL2.LIZLLL()) != null) {
                ArrayList arrayList = new ArrayList();
                for (LinkUser linkUser2 : listLIZLLL2) {
                    if (Intrinsics.LJFF(linkUser2.roomId, C930540aK4.LJIIJ())) {
                        arrayList.add(linkUser2);
                    }
                }
                size = arrayList.size();
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null && (listLIZLLL = interfaceC954180awCLLJLL3.LIZLLL()) != null) {
                size = listLIZLLL.size();
            }
        }
        if (linkUser == null) {
            size++;
        }
        if (size == 0 || size == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkedCnt invalid, value ");
            sbLIZ.append(size);
            C20441214yg.LJ("LinkInRoomAnchorOverLogger", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJFF = Math.max(size - 1, LJFF);
    }

    public static final void LIZ(long j, long j2, EnumC918970a1P enumC918970a1P, DataChannel dataChannel) {
        HashMap<Long, String> map = LIZIZ;
        String strRemove = map.remove(Long.valueOf(j));
        String strRemove2 = LIZJ.remove(Long.valueOf(j));
        if (strRemove2 != null) {
            C922220a6e.LIZ(j, strRemove2, "anchor_kick_out_guest", j2, false, null, null, dataChannel, 112);
            if (strRemove != null && map.size() == 0) {
                C917290Zyh.LJIIJJI = true;
                if (enumC918970a1P == EnumC918970a1P.GRID || enumC918970a1P == EnumC918970a1P.FLOATING) {
                    C917290Zyh.LJIILIIL = "guest_link";
                    C917290Zyh.LJIIJJI();
                }
                LJIIIIZZ("anchor_kick_out_guest", j, j2, enumC918970a1P, strRemove, strRemove2, dataChannel);
            }
        }
    }

    public static final void LIZJ(long j, long j2, EnumC918970a1P enumC918970a1P, DataChannel dataChannel) {
        HashMap<Long, String> map = LIZIZ;
        String strRemove = map.remove(Long.valueOf(j));
        String strRemove2 = LIZJ.remove(Long.valueOf(j));
        if (strRemove2 != null) {
            C922220a6e.LIZ(j, strRemove2, "anchor_kick_out_guest", j2, true, null, null, dataChannel, 96);
            if (strRemove != null && map.size() == 0) {
                LJIIIIZZ("anchor_kick_out_guest", j, j2, enumC918970a1P, strRemove, strRemove2, null);
            }
        }
    }

    public static final void LJFF(long j, long j2, EnumC918970a1P enumC918970a1P, DataChannel dataChannel) {
        Boolean bool;
        String str;
        HashMap<Long, String> map = LIZIZ;
        String strRemove = map.remove(Long.valueOf(j));
        String strRemove2 = LIZJ.remove(Long.valueOf(j));
        if (strRemove2 != null) {
            C922220a6e.LIZ(j, strRemove2, "guest_over", j2, false, null, null, dataChannel, 112);
            if (strRemove != null && map.size() == 0) {
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.gg0(C750170Tbj.class);
                } else {
                    bool = null;
                }
                if (C500260Jjc.LJJJI(bool)) {
                    str = "lineup_over";
                } else {
                    str = "guest_over";
                }
                LJIIIIZZ(str, j, j2, enumC918970a1P, strRemove, strRemove2, null);
                if (dataChannel != null) {
                    dataChannel.SX0(C750170Tbj.class, Boolean.FALSE);
                }
                C917290Zyh.LJIIJJI = true;
                if (enumC918970a1P == EnumC918970a1P.GRID || enumC918970a1P == EnumC918970a1P.FLOATING) {
                    C917290Zyh.LJIILIIL = "guest_link";
                    C917290Zyh.LJIIJJI();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r7, long r8, long r10, X.EnumC918970a1P r12, java.lang.String r13, java.lang.String r14, com.bytedance.ies.sdk.datachannel.DataChannel r15) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921920a6A.LJIIIIZZ(java.lang.String, long, long, X.0a1P, java.lang.String, java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
