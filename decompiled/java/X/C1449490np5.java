package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.lancet.PlayerGroupIdRecorderData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0np5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449490np5 {
    public static final C1449490np5 LIZ = new C1449490np5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1449510np7());
    public static final Map<String, PlayerGroupIdRecorderData> LIZJ = new LinkedHashMap();
    public static final PlayerGroupIdRecorderData LIZLLL = new PlayerGroupIdRecorderData("", "", "", "", "", "", "", "", "", "");
    public static final List<String> LJ = new ArrayList();

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    public final String toString() {
        return String.valueOf(LIZLLL);
    }

    public static void LIZ(String str) {
        Boolean boolValueOf;
        try {
            List<String> list = LJ;
            if (C13LP.LJJJJ(str, list)) {
                return;
            }
            LIZ.getClass();
            LIZJ().storeString(str, C09C2.LIZ().LJIILL(LJIIIIZZ(str)));
            if (str == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(((ArrayList) list).add(str));
            }
            C189200o6.m2constructorimpl(boolValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(String str) {
        try {
            C19719512Dh.LIZJ(LIZJ).remove(str);
            LIZ.getClass();
            LIZJ().storeString(str, null);
            C189200o6.m2constructorimpl(Boolean.valueOf(C19719512Dh.LIZ(LJ).remove(str)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LIZLLL(String str) {
        return LJIIIIZZ(str).lastPageName;
    }

    public static String LJ(String str) {
        return LJIIIIZZ(str).lastPagePlayGid;
    }

    public static String LJFF(String str) {
        return LJIIIIZZ(str).lastPlayGid;
    }

    public static String LJI(String str) {
        return LJIIIIZZ(str).prePageName;
    }

    public static String LJII(String str) {
        return LJIIIIZZ(str).prePagePlayGid;
    }

    public static PlayerGroupIdRecorderData LJIIIIZZ(String str) {
        PlayerGroupIdRecorderData playerGroupIdRecorderData;
        if (str == null) {
            return LIZLLL;
        }
        Object obj = null;
        Object obj2 = null;
        for (Object obj3 : ((LinkedHashMap) LIZJ).entrySet()) {
            Map.Entry entry = (Map.Entry) obj3;
            if (C123100dR.LIZ((String) entry.getKey()) && (Intrinsics.LJFF(entry.getKey(), str) || u.LJJIIJZLJL((String) entry.getKey(), str, false) || u.LJJIIJZLJL(str, (String) entry.getKey(), false))) {
                obj2 = obj3;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj2;
        if (entry2 == null || (playerGroupIdRecorderData = (PlayerGroupIdRecorderData) entry2.getValue()) == null) {
            PlayerGroupIdRecorderData playerGroupIdRecorderData2 = LIZLLL;
            playerGroupIdRecorderData = new PlayerGroupIdRecorderData(playerGroupIdRecorderData2.lastPlayGid, playerGroupIdRecorderData2.lastPlayMusicId, playerGroupIdRecorderData2.lastPagePlayGid, playerGroupIdRecorderData2.lastPageName, playerGroupIdRecorderData2.lastPagePlayMusicId, playerGroupIdRecorderData2.prePagePlayGid, playerGroupIdRecorderData2.prePageName, playerGroupIdRecorderData2.prePagePlayMusicId, playerGroupIdRecorderData2.authorId, playerGroupIdRecorderData2.requestId);
            try {
                LIZ.getClass();
                ArrayList arrayList = (ArrayList) C13LP.LJJJJLI(LIZJ().getAllKey());
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    String str2 = (String) objPrevious;
                    if (C123100dR.LIZ(str2) && (Intrinsics.LJFF(str2, str) || u.LJJIIJZLJL(str2, str, false) || u.LJJIIJZLJL(str, str2, false))) {
                        obj = objPrevious;
                        break;
                    }
                }
                String str3 = (String) obj;
                if (C123100dR.LIZ(str3)) {
                    LIZ.getClass();
                    PlayerGroupIdRecorderData playerGroupIdRecorderData3 = (PlayerGroupIdRecorderData) C09C2.LIZ().LJII(LIZJ().getString(str3, ""), PlayerGroupIdRecorderData.class);
                    if (playerGroupIdRecorderData3 != null) {
                        playerGroupIdRecorderData = playerGroupIdRecorderData3;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            LIZJ.put(str, playerGroupIdRecorderData);
        }
        return playerGroupIdRecorderData;
    }

    public static String LJIIIZ(String str) {
        Object c098200Yq;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        try {
            n nVar = new n();
            String strLJFF = LJFF(str);
            boolean z10 = false;
            if (strLJFF == null || strLJFF.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = null;
            if (!(!z)) {
                strLJFF = null;
            }
            if (strLJFF != null) {
                nVar.LJJIIJ("last_play_gid", strLJFF);
            }
            String str3 = LJIIIIZZ(str).lastPlayMusicId;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                str3 = null;
            }
            if (str3 != null) {
                nVar.LJJIIJ("last_play_music_id", str3);
            }
            String strLJ = LJ(str);
            if (strLJ == null || strLJ.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!(!z3)) {
                strLJ = null;
            }
            if (strLJ != null) {
                nVar.LJJIIJ("lastpage_play_gid", strLJ);
            }
            String str4 = LJIIIIZZ(str).lastPagePlayMusicId;
            if (str4 == null || str4.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!(!z4)) {
                str4 = null;
            }
            if (str4 != null) {
                nVar.LJJIIJ("lastpage_play_music_id", str4);
            }
            String strLIZLLL = LIZLLL(str);
            if (strLIZLLL == null || strLIZLLL.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!(!z5)) {
                strLIZLLL = null;
            }
            if (strLIZLLL != null) {
                nVar.LJJIIJ("lastpage_name", strLIZLLL);
            }
            String strLJII = LJII(str);
            if (strLJII == null || strLJII.length() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!(!z6)) {
                strLJII = null;
            }
            if (strLJII != null) {
                nVar.LJJIIJ("prepage_play_gid", strLJII);
            }
            String str5 = LJIIIIZZ(str).prePagePlayMusicId;
            if (str5 == null || str5.length() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!(!z7)) {
                str5 = null;
            }
            if (str5 != null) {
                nVar.LJJIIJ("prepage_play_music_id", str5);
            }
            String strLJI = LJI(str);
            if (strLJI == null || strLJI.length() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!(!z8)) {
                strLJI = null;
            }
            if (strLJI != null) {
                nVar.LJJIIJ("prepage_name", strLJI);
            }
            String str6 = LJIIIIZZ(str).authorId;
            if (str6 == null || str6.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!(!z9)) {
                str6 = null;
            }
            if (str6 != null) {
                nVar.LJJIIJ("author_id", str6);
            }
            String str7 = LJIIIIZZ(str).requestId;
            if (str7 == null || str7.length() == 0) {
                z10 = true;
            }
            if (!z10) {
                str2 = str7;
            }
            if (str2 != null) {
                nVar.LJJIIJ("request_id", str2);
            }
            c098200Yq = nVar.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "{ }";
        }
        return (String) c098200Yq;
    }
}
