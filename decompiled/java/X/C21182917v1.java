package X;

import Y.AComparatorS51S0000000_32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21182917v1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(316));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(317));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(541));

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static List LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return new ArrayList();
                    }
                    return C1697810uHb.LJIILJJIL(Integer.valueOf(C001A.OEC_LIVE_BILLBOARD_MESSAGE.getIntType()), 10000, 100005);
                }
                return C1697810uHb.LJIILJJIL(Integer.valueOf(C001A.O_E_C_DISPLAY_SCRIPT_INFO_MESSAGE.getIntType()));
            }
            return C1697810uHb.LJIILJJIL(10000, 100002, 100001, Integer.valueOf(C001A.MEMBER.getIntType()), 10004, Integer.valueOf(C001A.EC_DRAW_GRAB_REMIND_MESSAGE.getIntType()));
        }
        return C1697810uHb.LJIILJJIL(10000, 100005, Integer.valueOf(C001A.OEC_LIVE_CREATOR_MESSAGE.getIntType()));
    }

    public static void LIZLLL(String str, AbstractC21181017ui abstractC21181017ui) {
        if (!LIZIZ().containsKey(str)) {
            LIZIZ().put(str, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ().get(str);
        int iLIZLLL = (int) abstractC21181017ui.LIZLLL();
        if (concurrentHashMap != null && !concurrentHashMap.containsKey(Integer.valueOf(iLIZLLL))) {
            concurrentHashMap.put(Integer.valueOf(iLIZLLL), new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap2 = null;
        if (concurrentHashMap != null) {
            concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iLIZLLL));
        }
        Iterator<Integer> it2 = abstractC21181017ui.LIZJ().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (concurrentHashMap2 != null) {
                if (!concurrentHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    concurrentHashMap2.put(Integer.valueOf(iIntValue), new CopyOnWriteArraySet());
                }
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap2.get(Integer.valueOf(iIntValue));
                if (copyOnWriteArraySet != null) {
                    if (copyOnWriteArraySet.contains(abstractC21181017ui)) {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ECLiveMessageCenter: registerV2Handler duplicate ");
                        abstractC21181017ui.message();
                        sbLIZ.append(10000);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                    } else {
                        copyOnWriteArraySet.add(abstractC21181017ui);
                        C13LP.LJLLLL(new AComparatorS51S0000000_32(2), copyOnWriteArraySet);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r18, int r19, com.ss.ugc.live.sdk.message.data.IMessage r20) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21182917v1.LIZJ(java.lang.String, int, com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
