package X;

import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0cdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019400cdO {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1019420cdQ());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1019410cdP());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1019520cda());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1019440cdS());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1019430cdR());
    public static final Map<String, C1019450cdT> LJFF = new LinkedHashMap();

    public static C1019490cdX LIZ() {
        return (C1019490cdX) LIZIZ.getValue();
    }

    public static C1019510cdZ LIZJ() {
        return (C1019510cdZ) LIZ.getValue();
    }

    public static C1019480cdW LIZLLL() {
        return (C1019480cdW) LJ.getValue();
    }

    public static C1019460cdU LJ() {
        return (C1019460cdU) LIZLLL.getValue();
    }

    public static void LJI() {
        LIZ().LJ();
        LIZJ().LJ();
        ((AbstractC1019470cdV) LIZJ.getValue()).LJ();
        Iterator it2 = ((LinkedHashMap) LJFF).values().iterator();
        while (it2.hasNext()) {
            ((AbstractC1019470cdV) it2.next()).LJ();
        }
        LJ().LJ();
        LIZLLL().LJ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZIZ(String str) {
        int i = 0;
        AdSessionPositionHelper.LIZ.getClass();
        int iLJZI = C13LP.LJZI(C1697810uHb.LJIIJJI(Integer.valueOf(LIZJ().LJ), Integer.valueOf(LIZ().LJ), Integer.valueOf(AdSessionPositionHelper.LJJI), Integer.valueOf(AdSessionPositionHelper.LJJ), Integer.valueOf(AdSessionPositionHelper.LJJIFFI)));
        switch (str.hashCode()) {
            case -1654439916:
                if (str.equals("mid_roll")) {
                    i = LIZ().LJ;
                }
                break;
            case -600094315:
                if (str.equals("friends")) {
                    i = AdSessionPositionHelper.LJJIFFI;
                }
                break;
            case 101885:
                if (str.equals("fyp")) {
                    i = AdSessionPositionHelper.LJJ;
                }
                break;
            case 3506150:
                if (str.equals("roi2")) {
                    i = LIZLLL().LJ;
                }
                break;
            case 765915793:
                if (str.equals("following")) {
                    i = AdSessionPositionHelper.LJJI;
                }
                break;
            case 1223472756:
                if (str.equals("profile_feed")) {
                    i = LIZJ().LJ;
                }
                break;
            case 1318614811:
                if (str.equals("soft_ads")) {
                    i = LJ().LJ;
                }
                break;
        }
        return iLJZI - i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJFF(String str, List list) {
        switch (str.hashCode()) {
            case -1654439916:
                if (str.equals("mid_roll")) {
                    LIZ().LIZLLL(list);
                }
                break;
            case -248734249:
                if (str.equals("home_series")) {
                    ((AbstractC1019470cdV) LIZJ.getValue()).LIZLLL(list);
                }
                break;
            case 3506150:
                if (str.equals("roi2")) {
                    LIZLLL().LIZLLL(list);
                }
                break;
            case 1223472756:
                if (str.equals("profile_feed")) {
                    LIZJ().LIZLLL(list);
                }
                break;
            case 1318614811:
                if (str.equals("soft_ads")) {
                    LJ().LIZLLL(list);
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJII(Aweme aweme, String str) {
        switch (str.hashCode()) {
            case -1654439916:
                if (str.equals("mid_roll")) {
                    LIZ().LJFF(aweme);
                }
                break;
            case -248734249:
                if (str.equals("home_series")) {
                    ((AbstractC1019470cdV) LIZJ.getValue()).LJFF(aweme);
                }
                break;
            case 3506150:
                if (str.equals("roi2")) {
                    LIZLLL().LJFF(aweme);
                }
                break;
            case 1223472756:
                if (str.equals("profile_feed")) {
                    LIZJ().LJFF(aweme);
                }
                break;
            case 1318614811:
                if (str.equals("soft_ads")) {
                    LJ().LJFF(aweme);
                }
                break;
        }
    }
}
