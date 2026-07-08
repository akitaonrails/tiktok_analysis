package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0lSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358720lSg {
    public static final C1358720lSg LIZ = new C1358720lSg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1358740lSi());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1358730lSh());
    public static C08I7<String, Unit> LIZLLL;

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static C08I7 LIZJ() {
        int iIntValue = ((Number) C263840AVq.LIZ.getValue()).intValue();
        if (LIZLLL == null) {
            LIZLLL = new C08I7<>(iIntValue);
            try {
                for (String str : (List) ((Gson) LIZJ.getValue()).LJIIIIZZ(LIZIZ().getString(LIZ("repost_quick_heart_click"), ""), new TypeToken<List<? extends String>>() { // from class: X.0lSf
                }.getType())) {
                    C08I7<String, Unit> c08i7 = LIZLLL;
                    if (c08i7 != null) {
                        c08i7.LIZLLL(str, Unit.LIZ);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C08I7<String, Unit> c08i72 = LIZLLL;
        return c08i72 == null ? new C08I7(iIntValue) : c08i72;
    }

    public static String LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
