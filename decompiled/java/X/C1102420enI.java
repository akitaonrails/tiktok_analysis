package X;

import Y.AfS143S0200000_7;
import Y.AfS186S0100000_17;
import Y.AfS4S0000100_17;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlReq;
import com.bytedance.android.livesdk.chatroom.model.MsgNotifyControlResp;
import com.bytedance.android.livesdk.frequency.api.LiveNotifyMessageFrequencyApi;
import com.bytedance.android.livesdk.frequency.setting.LiveFixFrequencyManagerConcurrentModificationExceptionSetting;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyRecord;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyWatchContinuousQuota;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyWatchEarlyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyRecord;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0enI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102420enI {
    public static long LIZLLL;
    public static final long LJIIIIZZ;
    public static final long LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static C11JF LJIILIIL;
    public static AnonymousClass0956 LJIILJJIL;
    public static int LJIILL;
    public static boolean LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static C0UX8 LJIJI;
    public static final Map<Long, C1099650eip> LJIJJ;
    public static final C01GW LJIJJLI;
    public static final HashMap<Long, MsgNotifyQuota> LIZ = new HashMap<>();
    public static final Map<Long, MsgNotifyWatchEarlyQuota> LIZIZ = new LinkedHashMap();
    public static final Map<Long, Long> LIZJ = new LinkedHashMap();
    public static final Map<Long, MsgNotifyWatchContinuousQuota> LJ = new LinkedHashMap();
    public static ArrayList<MsgNotifyRecord> LJFF = new ArrayList<>();
    public static final List<NotifyRecord> LJI = new ArrayList();
    public static long LJII = 1;

    static {
        LiveNotifyMessageFrequencySetting liveNotifyMessageFrequencySetting = LiveNotifyMessageFrequencySetting.INSTANCE;
        LJIIIIZZ = liveNotifyMessageFrequencySetting.reportIntervalMs();
        LJIIIZ = liveNotifyMessageFrequencySetting.reportIntervalRandomDelayMs();
        LJIIJ = liveNotifyMessageFrequencySetting.reportInfoMaxLength();
        LJIIJJI = liveNotifyMessageFrequencySetting.reportMinIntervalMs();
        LJIIL = liveNotifyMessageFrequencySetting.reportMaxFailTimes();
        LJIJJ = new LinkedHashMap();
        LJIJJLI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(399));
    }

    public static boolean LJI() {
        return !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || LiveNotifyMessageFrequencySetting.INSTANCE.enable();
    }

    public static void LJIIJ() {
        int i = LJIIJ;
        if (i > LJFF.size() && i > ((ArrayList) LJI).size()) {
            LJIILJJIL();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LJIIZILJ < LJIIJJI) {
            C1DFH c1dfh = C0PEM.LIZ;
            LJIILJJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C473000Igk(jCurrentTimeMillis, null), 3);
            return;
        }
        LJIIJJI();
        C11JF c11jf = LJIILIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJIILJJIL();
    }

    public static void LJIIJJI() {
        ArrayList<MsgNotifyRecord> arrayList = LJFF;
        LJFF = new ArrayList<>();
        List<NotifyRecord> list = LJI;
        List listLLIIII = C13LP.LLIIII(list);
        ((ArrayList) list).clear();
        C20337914i1<List<MsgNotifyRecord>> c20337914i1 = InterfaceC1106030et7.a7;
        c20337914i1.LJFF(new ArrayList());
        c20337914i1.LIZJ();
        C20337914i1<List<NotifyRecord>> c20337914i12 = InterfaceC1106030et7.b7;
        c20337914i12.LJFF(new ArrayList());
        c20337914i12.LIZJ();
        LJIIZILJ = System.currentTimeMillis();
        long j = LJIJ;
        LiveNotifyMessageFrequencyApi.LIZ.getClass();
        LiveNotifyMessageFrequencyApi liveNotifyMessageFrequencyApiLIZ = C782810UnH.LIZ();
        MsgNotifyControlReq msgNotifyControlReq = new MsgNotifyControlReq();
        msgNotifyControlReq.records = arrayList;
        msgNotifyControlReq.roomId = String.valueOf(j);
        msgNotifyControlReq.notifyRecords.addAll(listLLIIII);
        C11NZ<C470590Icr<MsgNotifyControlResp.Data>> c11nzReportMsgNotifyRecord = liveNotifyMessageFrequencyApiLIZ.reportMsgNotifyRecord(msgNotifyControlReq);
        if (LiveFixFrequencyManagerConcurrentModificationExceptionSetting.INSTANCE.isEnabled()) {
            c11nzReportMsgNotifyRecord.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        c11nzReportMsgNotifyRecord.LJJLL(new AfS4S0000100_17(j, 1), new AfS143S0200000_7((Object) arrayList, (EmoteModel) listLLIIII, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 52));
    }

    public static void LJIILJJIL() {
        C11JF c11jf = LJIILIIL;
        if (c11jf == null || c11jf.isDisposed()) {
            C11JF c11jf2 = LJIILIIL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            long j = LJIIIIZZ;
            long j2 = LJIIIZ;
            LJIILIIL = (C11JF) C11NZ.LJJJJLI(j + (j2 > 0 ? AbstractC19994813Le.Default.nextLong(0L, j2) : 0L), TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0Igl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveNotifyMessageFrequencyManager@3a91.startReportTimer$1");
                    if (C1102420enI.LJFF.isEmpty() && ((ArrayList) C1102420enI.LJI).isEmpty()) {
                        C11JF c11jf3 = C1102420enI.LJIILIIL;
                        if (c11jf3 != null) {
                            c11jf3.dispose();
                        }
                    } else {
                        HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                        C1102420enI.LJIIJJI();
                    }
                    C1C7U.LIZIZ("LiveNotifyMessageFrequencyManager@3a91.startReportTimer$1");
                }
            });
        }
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Component Quota: {");
        sbLIZ.append(C13LP.LJJLIIIJ(C2097808Js.LJIL(LIZ), ";", null, null, 0, null, AFwS254S0000000_17.get$arr$(464), 30));
        sbLIZ.append("}, \nWatch Duration Quota: {");
        sbLIZ.append(C13LP.LJJLIIIJ(C2097808Js.LJIL(LIZIZ), ";", null, null, 0, null, AFwS254S0000000_17.get$arr$(465), 30));
        sbLIZ.append("}, \nContinuous Room Quota: ");
        sbLIZ.append(C13LP.LJJLIIIJ(C2097808Js.LJIL(LJ), ";", null, null, 0, null, AFwS254S0000000_17.get$arr$(466), 30));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILIIL() {
        if (LJI()) {
            if (!LJIILLIIL) {
                List<MsgNotifyRecord> listLIZIZ = InterfaceC1106030et7.a7.LIZIZ();
                List<NotifyRecord> listLIZIZ2 = InterfaceC1106030et7.b7.LIZIZ();
                LJIILLIIL = true;
                if (!listLIZIZ.isEmpty()) {
                    LJFF.addAll(listLIZIZ);
                }
                if (!listLIZIZ2.isEmpty()) {
                    ((ArrayList) LJI).addAll(listLIZIZ2);
                }
            }
            if ((!LJFF.isEmpty()) || (!((ArrayList) LJI).isEmpty())) {
                LJIIJJI();
            }
        }
    }

    public static void LJII(C0UX8 c0ux8) {
        if (LJIJI == c0ux8) {
            C11JF c11jf = LJIILIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LIZ.clear();
            AnonymousClass0956 anonymousClass0956 = LJIILJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    public static void LJIIIIZZ(C0UX8 c0ux8, long j) {
        boolean z;
        LJIJJ.remove(Long.valueOf(j));
        if (c0ux8 == C0UX8.EVENT_PAGE_WATCH_LIVE) {
            LIZLLL = SystemClock.uptimeMillis();
            LIZJ.remove(Long.valueOf(j));
        }
        boolean z2 = C1102370enD.LIZ;
        if (c0ux8 == C0UX8.EVENT_PAGE_BROADCAST) {
            z = true;
        } else {
            z = false;
        }
        if (j != 0) {
            if (z) {
                AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) C1102370enD.LIZJ().get(1);
                if (abstractC1102390enF != null) {
                    abstractC1102390enF.LJFF(j);
                    return;
                }
                return;
            }
            AbstractC1102390enF abstractC1102390enF2 = (AbstractC1102390enF) C1102370enD.LIZJ().get(2);
            if (abstractC1102390enF2 == null) {
                return;
            }
            abstractC1102390enF2.LJFF(j);
        }
    }

    public static void LJIILL(long j, Map map) {
        Map<Integer, List<InterfaceC1097800efq>> map2;
        Long lValueOf;
        long j2;
        HashMap<Long, MsgNotifyQuota> map3 = LIZ;
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(map3);
        map3.clear();
        if (map == null) {
            return;
        }
        map3.putAll(map);
        C1099650eip c1099650eip = (C1099650eip) ((LinkedHashMap) LJIJJ).get(Long.valueOf(j));
        if (c1099650eip != null && (map2 = c1099650eip.LIZ) != null) {
            Iterator it2 = ((LinkedHashMap) map2).entrySet().iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) it2.next()).getKey()).intValue();
                long j3 = iIntValue;
                MsgNotifyQuota msgNotifyQuota = (MsgNotifyQuota) mapLJIIZILJ.get(Long.valueOf(j3));
                MsgNotifyQuota msgNotifyQuota2 = LIZ.get(Long.valueOf(j3));
                Long lValueOf2 = null;
                if (msgNotifyQuota != null) {
                    lValueOf = Long.valueOf(msgNotifyQuota.defaultCount);
                } else {
                    lValueOf = null;
                }
                if (msgNotifyQuota2 != null) {
                    lValueOf2 = Long.valueOf(msgNotifyQuota2.defaultCount);
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    if (msgNotifyQuota2 != null) {
                        j2 = msgNotifyQuota2.defaultCount;
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    LJIIIZ(iIntValue, j, j2);
                }
            }
        }
    }

    public static void LJIIIZ(int i, long j, long j2) {
        C1099650eip c1099650eip = (C1099650eip) ((LinkedHashMap) LJIJJ).get(Long.valueOf(j));
        if (c1099650eip != null) {
            List list = (List) ((LinkedHashMap) c1099650eip.LIZ).get(Integer.valueOf(i));
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1097800efq) it2.next()).LIZ(j2);
                }
            }
        }
    }

    public static void LJIIL(Long l, Integer num, Integer num2) {
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        if (!LJI()) {
            return;
        }
        long j = 16;
        MsgNotifyQuota msgNotifyQuota = LIZ.get(Long.valueOf(j));
        if (msgNotifyQuota != null) {
            if (msgNotifyQuota.positionCountMap.containsKey("watch")) {
                Map<String, Long> map = msgNotifyQuota.positionCountMap;
                Long l2 = map.get("watch");
                if (l2 != null) {
                    jLongValue2 = l2.longValue() - 1;
                } else {
                    jLongValue2 = 0;
                }
                map.put("watch", Long.valueOf(jLongValue2));
            } else {
                long j2 = msgNotifyQuota.defaultCount;
                long j3 = j2 - 1;
                msgNotifyQuota.defaultCount = j3;
                if (j2 != j3 && l != null) {
                    LJIIIZ(16, l.longValue(), j3);
                }
            }
        }
        if (LJIJI == C0UX8.EVENT_PAGE_WATCH_LIVE) {
            MsgNotifyWatchEarlyQuota msgNotifyWatchEarlyQuota = (MsgNotifyWatchEarlyQuota) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j));
            if (msgNotifyWatchEarlyQuota != null && msgNotifyWatchEarlyQuota.watchMillSeconds >= 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                Long l3 = (Long) ((LinkedHashMap) LIZJ).get(l);
                if (l3 != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jUptimeMillis - jLongValue < msgNotifyWatchEarlyQuota.watchMillSeconds) {
                    msgNotifyWatchEarlyQuota.count--;
                }
            }
            MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota = (MsgNotifyWatchContinuousQuota) ((LinkedHashMap) LJ).get(Long.valueOf(j));
            if (msgNotifyWatchContinuousQuota != null && msgNotifyWatchContinuousQuota.coutinuousRoomCnt >= 0) {
                msgNotifyWatchContinuousQuota.count--;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Quota Config After Decrease: ");
            sbLIZ.append(LJ());
            C20441214yg.LJ("LiveNotifyMessageFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        LiveNotifyMessageFrequencyApi.LIZ.getClass();
        LiveNotifyMessageFrequencyApi liveNotifyMessageFrequencyApiLIZ = C782810UnH.LIZ();
        MsgNotifyControlReq msgNotifyControlReq = new MsgNotifyControlReq();
        MsgNotifyRecord[] msgNotifyRecordArr = new MsgNotifyRecord[1];
        MsgNotifyRecord msgNotifyRecord = new MsgNotifyRecord();
        msgNotifyRecord.roomId = String.valueOf(l);
        msgNotifyRecord.ts = String.valueOf(System.currentTimeMillis() / 1000);
        msgNotifyRecord.componentType = 16;
        msgNotifyRecord.bizKey = String.valueOf(num);
        msgNotifyRecord.position = "watch";
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        msgNotifyRecord.userAction = iIntValue;
        msgNotifyRecordArr[0] = msgNotifyRecord;
        msgNotifyControlReq.records = C1697810uHb.LJIILJJIL(msgNotifyRecordArr);
        msgNotifyControlReq.roomId = String.valueOf(l);
        liveNotifyMessageFrequencyApiLIZ.reportMsgNotifyRecord(msgNotifyControlReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(l, 201));
    }

    public static void LIZ(int i, long j, int i2, String str, String str2) {
        MsgNotifyRecord msgNotifyRecord = new MsgNotifyRecord();
        msgNotifyRecord.roomId = String.valueOf(j);
        msgNotifyRecord.ts = String.valueOf(System.currentTimeMillis() / 1000);
        if (str2 == null) {
            str2 = "";
        }
        msgNotifyRecord.bizKey = str2;
        msgNotifyRecord.componentType = i;
        if (str == null) {
            str = "";
        }
        msgNotifyRecord.position = str;
        msgNotifyRecord.userAction = i2;
        LJFF.add(msgNotifyRecord);
        C20337914i1<List<MsgNotifyRecord>> c20337914i1 = InterfaceC1106030et7.a7;
        c20337914i1.LJFF(LJFF);
        c20337914i1.LIZJ();
        LJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d A[PHI: r3
      0x014d: PHI (r3v2 boolean) = (r3v1 boolean), (r3v1 boolean), (r3v5 boolean), (r3v5 boolean), (r3v5 boolean), (r3v5 boolean) binds: [B:26:0x006d, B:28:0x0071, B:42:0x00b7, B:44:0x00c8, B:46:0x00ce, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C512940K9s LIZLLL(int r13, com.bytedance.ies.sdk.datachannel.DataChannel r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102420enI.LIZLLL(int, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean, boolean):X.0K9s");
    }

    public static void LIZIZ(int i, boolean z, boolean z2, String str, String str2, long j) {
        long jLongValue;
        long jLongValue2;
        if (!LJI()) {
            return;
        }
        long j2 = i;
        MsgNotifyQuota msgNotifyQuota = LIZ.get(Long.valueOf(j2));
        if (msgNotifyQuota != null) {
            if (str != null && msgNotifyQuota.positionCountMap.containsKey(str)) {
                Map<String, Long> map = msgNotifyQuota.positionCountMap;
                Long l = map.get(str);
                if (l != null) {
                    jLongValue2 = l.longValue() - 1;
                } else {
                    jLongValue2 = 0;
                }
                map.put(str, Long.valueOf(jLongValue2));
            } else {
                long j3 = msgNotifyQuota.defaultCount;
                long j4 = j3 - 1;
                msgNotifyQuota.defaultCount = j4;
                if (j3 != j4) {
                    LJIIIZ(i, j, j4);
                }
            }
        }
        if (LJIJI == C0UX8.EVENT_PAGE_WATCH_LIVE) {
            if (!z) {
                MsgNotifyWatchEarlyQuota msgNotifyWatchEarlyQuota = (MsgNotifyWatchEarlyQuota) ((LinkedHashMap) LIZIZ).get(Long.valueOf(j2));
                if (msgNotifyWatchEarlyQuota != null && msgNotifyWatchEarlyQuota.watchMillSeconds >= 0) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Long l2 = (Long) ((LinkedHashMap) LIZJ).get(Long.valueOf(j));
                    if (l2 != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jUptimeMillis - jLongValue < msgNotifyWatchEarlyQuota.watchMillSeconds) {
                        msgNotifyWatchEarlyQuota.count--;
                    }
                }
            }
            if (!z2) {
                MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota = (MsgNotifyWatchContinuousQuota) ((LinkedHashMap) LJ).get(Long.valueOf(j2));
                if (msgNotifyWatchContinuousQuota != null && msgNotifyWatchContinuousQuota.coutinuousRoomCnt >= 0) {
                    msgNotifyWatchContinuousQuota.count--;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Quota Config After Decrease: ");
            sbLIZ.append(LJ());
            C20441214yg.LJ("LiveNotifyMessageFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZ(i, j, 1, str, str2);
    }

    public static void LJFF(Map map, Map map2, Map map3, long j, C0UX8 c0ux8, long j2) {
        C11JF c11jf;
        long j3;
        long jMin;
        if (!LJI()) {
            return;
        }
        LJIILL(j2, map);
        Map<Long, MsgNotifyWatchEarlyQuota> map4 = LIZIZ;
        ((LinkedHashMap) map4).clear();
        if (map2 != null) {
            map4.putAll(map2);
        }
        long j4 = 1;
        if (c0ux8 == C0UX8.EVENT_PAGE_WATCH_LIVE) {
            if (SystemClock.uptimeMillis() - LIZLLL > j) {
                LJII = 1L;
            } else {
                LJII++;
            }
            C20441214yg.LJ("LiveNotifyMessageFrequencyManager", "continuousWatchCount: " + LJII);
        }
        if (map3 != null && !map3.isEmpty()) {
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(LJ);
            for (Map.Entry entry : map3.entrySet()) {
                if (((MsgNotifyWatchContinuousQuota) entry.getValue()).coutinuousRoomCnt > 0) {
                    Map<Long, MsgNotifyWatchContinuousQuota> map5 = LJ;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota = (MsgNotifyWatchContinuousQuota) value;
                    if ((LJII - j4) % ((MsgNotifyWatchContinuousQuota) entry.getValue()).coutinuousRoomCnt == 0) {
                        jMin = msgNotifyWatchContinuousQuota.count;
                    } else {
                        MsgNotifyWatchContinuousQuota msgNotifyWatchContinuousQuota2 = (MsgNotifyWatchContinuousQuota) mapLJIIZILJ.get(entry.getKey());
                        if (msgNotifyWatchContinuousQuota2 != null) {
                            j3 = msgNotifyWatchContinuousQuota2.count;
                        } else {
                            j3 = Long.MAX_VALUE;
                        }
                        jMin = Math.min(j3, msgNotifyWatchContinuousQuota.count);
                    }
                    msgNotifyWatchContinuousQuota.count = jMin;
                    map5.put((Long) key, (MsgNotifyWatchContinuousQuota) value);
                    j4 = 1;
                }
            }
        } else {
            ((LinkedHashMap) LJ).clear();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Quota Config After Init: ");
        sbLIZ.append(LJ());
        C20441214yg.LJ("LiveNotifyMessageFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        LJIJ = j2;
        if (c0ux8 != LJIJI && (c11jf = LJIILIIL) != null) {
            c11jf.dispose();
        }
        LJIJI = c0ux8;
        if (c0ux8 != C0UX8.EVENT_PAGE_WATCH_LIVE) {
            LJIILIIL();
        }
        LIZJ.put(Long.valueOf(j2), Long.valueOf(SystemClock.uptimeMillis()));
        boolean z = C1102370enD.LIZ;
        if (c0ux8 == C0UX8.EVENT_PAGE_BROADCAST) {
            AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) C1102370enD.LIZJ().get(1);
            if (abstractC1102390enF != null) {
                abstractC1102390enF.LIZIZ(j2);
                return;
            }
            return;
        }
        AbstractC1102390enF abstractC1102390enF2 = (AbstractC1102390enF) C1102370enD.LIZJ().get(2);
        if (abstractC1102390enF2 == null) {
            return;
        }
        abstractC1102390enF2.LIZIZ(j2);
    }
}
