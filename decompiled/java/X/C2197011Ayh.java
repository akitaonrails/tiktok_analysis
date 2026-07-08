package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Ayh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197011Ayh {
    public static final C2197011Ayh LIZ = new C2197011Ayh();
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;

    static {
        MinisConfigSettings.GamesIntroPopupControl gamesIntroPopupControl = MinisConfigSettings.LIZ().gameIntroPopupControl;
        LIZIZ = gamesIntroPopupControl != null ? gamesIntroPopupControl.period : 1209600L;
        MinisConfigSettings.DramaAddLauncherPopupControl dramaAddLauncherPopupControl = MinisConfigSettings.LIZ().dramaAddLauncherPopupControl;
        LIZJ = dramaAddLauncherPopupControl != null ? dramaAddLauncherPopupControl.period : 1209600L;
        MinisConfigSettings.GamesAddLauncherPopupControl gamesAddLauncherPopupControl = MinisConfigSettings.LIZ().gamesAddLauncherPopupControl;
        LIZLLL = gamesAddLauncherPopupControl != null ? gamesAddLauncherPopupControl.period : 1209600L;
    }

    public static boolean LIZ() {
        String strLIZ;
        Keva repo = KevaImpl.getRepo("minis_keva", 1);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0 || (strLIZ = C2195221Avo.LIZ()) == null || strLIZ.length() == 0) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HAS_SHOWN_MINIS_PRIVACY_TOAST-");
        sbLIZ.append(curUserId);
        return !repo.getStringSet(C2188811AlT.LIZIZ(sbLIZ), C08CX.INSTANCE).contains(strLIZ);
    }

    public static Keva LIZLLL() {
        return KevaImpl.getRepo("minis_keva", 1);
    }

    public static Keva LJFF() {
        return KevaImpl.getRepo("minis_keva", 1);
    }

    public static void LJI() {
        Keva repo = KevaImpl.getRepo("minis_keva", 1);
        Set<String> setLLIIIZ = C13LP.LLIIIZ(repo.getStringSet("TTKMinisEnter", new LinkedHashSet()));
        if (setLLIIIZ.contains(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return;
        }
        setLLIIIZ.add(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        repo.storeStringSet("TTKMinisEnter", setLLIIIZ);
    }

    public static void LJII() {
        Keva repo = KevaImpl.getRepo("minis_keva", 1);
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ADD_TO_SCREEN_POPUP_SHOWN_TIMES_KEY-");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set setLLIIIZ = C13LP.LLIIIZ(repo.getStringSet(strLIZIZ, C08CX.INSTANCE));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setLLIIIZ.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(Long.valueOf(System.currentTimeMillis()));
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it3.next()).longValue()));
        }
        repo.storeStringSet(strLIZIZ, C13LP.LLIIJI(arrayList3));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ADD_TO_SCREEN_POPUP_SHOWN_SUM_TIMES_KEY-");
        sbLIZ2.append(strLIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        repo.storeInt(strLIZIZ2, repo.getInt(strLIZIZ2, 0) + 1);
    }

    public static boolean LIZIZ() {
        Set setLLIIIZ = C13LP.LLIIIZ(LJFF().getStringSet("V3_GUIDANCE_SHOWN_TIMES", C08CX.INSTANCE));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setLLIIIZ.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJLLJ(arrayList));
        if (arrayList2.size() < 3) {
            return true;
        }
        if (System.currentTimeMillis() - ((Number) C13LP.LJJLIIIJJI(arrayList2)).longValue() < 604800000) {
            return false;
        }
        arrayList2.clear();
        LJFF().storeStringSet("V3_GUIDANCE_SHOWN_TIMES", C08CX.INSTANCE);
        return true;
    }

    public static boolean LIZJ() {
        return LIZLLL().getBoolean("NATIVE_GAME_ENABLE_CLICK_ICON_DEBUG", false);
    }

    public static JSONObject LJ() {
        String string = LIZLLL().getString("NATIVE_GAME_DEBUG_INFO_KEY", C786410Ut5.J3(new JSONObject()));
        return string.length() > 0 ? new JSONObject(string) : new JSONObject();
    }

    public static void LJIIIZ() {
        Set setLLIIIZ = C13LP.LLIIIZ(LJFF().getStringSet("V3_GUIDANCE_SHOWN_TIMES", C08CX.INSTANCE));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setLLIIIZ.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJLLJ(arrayList));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (arrayList2.size() >= 3 && jCurrentTimeMillis - ((Number) C13LP.LJJLIIIJJI(arrayList2)).longValue() >= 604800000) {
            arrayList2.clear();
        }
        arrayList2.add(Long.valueOf(jCurrentTimeMillis));
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((Number) it3.next()).longValue()));
        }
        LJFF().storeStringSet("V3_GUIDANCE_SHOWN_TIMES", C13LP.LLIIJI(arrayList3));
    }

    public static JSONObject LJIIJ() {
        String string = LJFF().getString("TTMinis3pIdLastDismissMap", "");
        if (string.length() == 0) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static void LJIIIIZZ(JSONObject jSONObject) {
        LIZLLL().storeString("NATIVE_GAME_DEBUG_INFO_KEY", C786410Ut5.J3(jSONObject));
    }
}
