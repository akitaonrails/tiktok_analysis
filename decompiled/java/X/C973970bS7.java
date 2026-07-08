package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0bS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973970bS7 {
    public static C973960bS6 LIZJ() {
        String strLIZIZ = LIZIZ(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastConfig, hash: ");
        sbLIZ.append(strLIZIZ);
        C20441214yg.LIZIZ("MatchPreviousModeHelper", C2188811AlT.LIZIZ(sbLIZ));
        C973980bS8 c973980bS8 = InterfaceC1106030et7.O4.LIZIZ().get(strLIZIZ);
        C973960bS6 c973960bS6 = c973980bS8 != null ? new C973960bS6(C918130a03.LIZ(Integer.valueOf(c973980bS8.LIZ)), c973980bS8.LIZIZ) : LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getLastConfig, lastConfig: ");
        sbLIZ2.append(c973960bS6);
        C20441214yg.LIZIZ("MatchPreviousModeHelper", C2188811AlT.LIZIZ(sbLIZ2));
        return c973960bS6;
    }

    public static C973960bS6 LIZ() {
        InterfaceC2262081DgM currentUser;
        C20441214yg.LIZIZ("MatchPreviousModeHelper", "getDefaultConfig");
        EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(Integer.valueOf(LiveMatchInviterPanelLynxConfigSetting.INSTANCE.getDefaultMatchType(C915980Zwa.LJII().LLILZLL(true).size())));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        return new C973960bS6(enumC919170a1jLIZ, C1697810uHb.LJIILJJIL(Long.valueOf((interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null) ? 0L : currentUser.getId())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    public static String LIZIZ(List list) {
        if (list == 0) {
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            list = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
            Iterator<C954460awe> it2 = listLLILZLL.iterator();
            while (it2.hasNext()) {
                list.add(Long.valueOf(it2.next().LJ));
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLJ(list), ":", null, null, 0, null, null, 62);
        try {
            String strLJJIJIL = C13LQ.LJJIJIL(MessageDigest.getInstance("SHA-256").digest(strLJJLIIIJ.getBytes(Charsets.UTF_8)), "", AFwS247S0000000_13.get$arr$(48));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getKeyForCurrentHostConfiguration, hostIdsString: ");
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(", hashString: ");
            sbLIZ.append(strLJJIJIL);
            C20441214yg.LIZIZ("MatchPreviousModeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return strLJJIJIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static void LIZLLL(C973960bS6 c973960bS6, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertCacheEntry: ");
        sbLIZ.append(c973960bS6);
        C20441214yg.LIZIZ("MatchPreviousModeHelper", C2188811AlT.LIZIZ(sbLIZ));
        String strLIZIZ = LIZIZ(list);
        LinkedHashMap<String, C973980bS8> linkedHashMapLIZIZ = InterfaceC1106030et7.O4.LIZIZ();
        if (linkedHashMapLIZIZ.size() >= 20 && !linkedHashMapLIZIZ.containsKey(strLIZIZ)) {
            linkedHashMapLIZIZ.remove(C13LP.LJJJLIIL(linkedHashMapLIZIZ.keySet()));
        }
        linkedHashMapLIZIZ.remove(strLIZIZ);
        linkedHashMapLIZIZ.put(strLIZIZ, new C973980bS8(c973960bS6.LIZ.getType(), c973960bS6.LIZIZ));
    }
}
