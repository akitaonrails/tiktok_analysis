package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0M4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562670M4z {
    public static Boolean LJFF;
    public static final C562670M4z LIZ = new C562670M4z();
    public static final Keva LIZIZ = Keva.getRepo("text_to_image_mode");
    public static final Keva LIZJ = Keva.getRepo("text_to_image_mode_cover");
    public static final Keva LIZLLL = Keva.getRepo("text_to_image_mode_creation_aweme");
    public static final Keva LJ = Keva.getRepo("text_to_image_mode_post_type");
    public static boolean LJI = true;

    public static boolean LIZ() {
        if (C07CI.LIZIZ()) {
            return LIZIZ.getBoolean("shown_text_to_image_ai_guide", false);
        }
        C528180KnY.LIZ.getClass();
        if (C528180KnY.LJ()) {
            return LIZIZ.getBoolean("shown_text_to_image_guide", false);
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (C07CI.LIZIZ()) {
            return LIZIZ.getBoolean("shown_text_to_image_ai_tag", false);
        }
        C528180KnY.LIZ.getClass();
        return C528180KnY.LJ() ? LIZIZ.getBoolean("shown_new_tag", false) : !C528180KnY.LJFF();
    }

    public static void LIZLLL() {
        if (C07CI.LIZIZ()) {
            LIZIZ.storeBoolean("shown_text_to_image_ai_guide", true);
            return;
        }
        C528180KnY.LIZ.getClass();
        if (C528180KnY.LJ()) {
            LIZIZ.storeBoolean("shown_text_to_image_guide", true);
        }
    }

    public static void LIZJ(String str, List list) {
        LIZIZ.erase(str);
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            LIZJ.erase((String) it2.next());
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2331209Bm(str, null), 3);
    }
}
