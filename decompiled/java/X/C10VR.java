package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: X.10VR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10VR {
    public static String LIZ() {
        String localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(3, new Locale(((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage(), C2222691Bz1.LIZ()))).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String lowerCase = localizedPattern.toLowerCase(Locale.ROOT);
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!hashSet.contains(Character.valueOf(cCharAt))) {
                if (cCharAt == 'd') {
                    arrayList.add("dd");
                } else if (cCharAt == 'm') {
                    arrayList.add("mm");
                } else if (cCharAt == 'y') {
                    arrayList.add("yyyy");
                }
                hashSet.add(Character.valueOf(cCharAt));
            }
        }
        return C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_method", str);
        C19249910Sr.LIZIZ.LIZJ(c2344009Gk);
        C20684815ws.LJIILLIIL("guest_mode_age_gate_exit", c2344009Gk.LIZ);
    }
}
