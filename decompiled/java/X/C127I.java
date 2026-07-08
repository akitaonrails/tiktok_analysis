package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.127I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127I {
    public static final C127I LIZ = new C127I();

    public static void LIZ(Context context) {
        C735800Ste c735800Ste = new C735800Ste("enter_general_setting");
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c735800Ste.LJFF("previous_page", "settings_page", c2082308Dt);
        c735800Ste.LJFF("enter_method", "click_button", c2082308Dt);
        c735800Ste.LJIILJJIL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        C20684815ws.LJIILLIIL("display_settings", c2344009Gk.LIZ);
        SmartRouter.buildRoute(context, "aweme://display/setting?enter_from=settings&enter_method=click_manage").open();
    }

    public static List LIZIZ(PushSettings pushSettings) {
        List<ContentLanguage> list;
        if (C294270Bg9.LIZ()) {
            C20703515zt.LIZ.getClass();
            List listLJ = C20703515zt.LJ();
            if (listLJ == null) {
                return C13BV.INSTANCE;
            }
            return listLJ;
        }
        C20703515zt.LIZ.getClass();
        List listLJ2 = C20703515zt.LJ();
        if (listLJ2 != null) {
            return listLJ2;
        }
        if (pushSettings != null && (list = pushSettings.selectedDoNotTranslate) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<ContentLanguage> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getLocalName());
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }
}
