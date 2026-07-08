package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Locale;

/* JADX INFO: renamed from: X.0iJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1237950iJt implements InterfaceC1237070iIT {
    public static String LJI(Context context) {
        String lowerCase;
        String strName;
        EnumC1237860iJk currentLoginUser3pPlatform = ((IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class)).getCurrentLoginUser3pPlatform();
        if (currentLoginUser3pPlatform == null || (strName = currentLoginUser3pPlatform.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        return C849680XUw.LIZLLL(context, lowerCase);
    }

    public final String LIZJ(Context context) {
        String strLJI = LJI(context);
        String string = LIZ().getData().getString("source");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 115187) {
                if (iHashCode == 1131379792 && string.equals("fb_social")) {
                    return context.getString(2131836818);
                }
                return strLJI;
            }
            if (!string.equals("tts")) {
                return strLJI;
            }
            return context.getString(2131836817);
        }
        return strLJI;
    }

    public final void LJIIIIZZ(EnumC1237960iJu enumC1237960iJu) {
        Bundle data = LIZ().getData();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", data.getString("enter_from"));
        c0xgr.LIZLLL("enter_method", data.getString("enter_method"));
        c0xgr.LIZ(enumC1237960iJu.getValue(), "type");
        C20684815ws.LJIILLIIL("pii_page_show", c0xgr.LIZ);
    }

    public final void LJII(EnumC1237960iJu enumC1237960iJu, EnumC1237970iJv enumC1237970iJv) {
        Bundle data = LIZ().getData();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", data.getString("enter_from"));
        c0xgr.LIZLLL("enter_method", data.getString("enter_method"));
        c0xgr.LIZ(enumC1237960iJu.getValue(), "type");
        c0xgr.LIZ(enumC1237970iJv.getValue(), "result");
        C20684815ws.LJIILLIIL("pii_page_click", c0xgr.LIZ);
    }
}
