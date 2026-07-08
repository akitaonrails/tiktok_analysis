package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpImpl;

/* JADX INFO: renamed from: X.0e8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class DialogInterfaceOnDismissListenerC1077340e8q implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1077340e8q dialogInterfaceOnDismissListenerC1077340e8q, DialogInterface dialogInterface) {
        C1003350cDV c1003350cDV = (C1003350cDV) dialogInterfaceOnDismissListenerC1077340e8q.l0;
        c1003350cDV.logAd((InterfaceC1023400cjq) c1003350cDV.LJII.getValue());
        ((InterfaceC1014270cV7) dialogInterfaceOnDismissListenerC1077340e8q.l1).LJIJ(C991720buk.LIZ, (AbstractC1014240cV4) dialogInterfaceOnDismissListenerC1077340e8q.l2);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1077340e8q dialogInterfaceOnDismissListenerC1077340e8q, DialogInterface dialogInterface) {
        String str;
        InterfaceC1034470d1h interfaceC1034470d1h;
        ((AdLandingPagePopUpImpl) dialogInterfaceOnDismissListenerC1077340e8q.l0).LIZ = false;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C343960De6) {
            str = "system_back";
        } else if (abstractC343940De4LJIIJJI instanceof C343970De7) {
            str = "slide";
        } else {
            str = "button";
        }
        C128Y c128y = (Fragment) dialogInterfaceOnDismissListenerC1077340e8q.l1;
        if ((c128y instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) c128y) != null) {
            interfaceC1034470d1h.LLLIL(str);
        }
        C1028100crQ popUpCustomConfig = ((C1026310coX) dialogInterfaceOnDismissListenerC1077340e8q.l2).getPopUpCustomConfig();
        if (popUpCustomConfig != null && popUpCustomConfig.getShouldBindBothNativeBottomLayout()) {
            C1440005kM.LIZ(new C1017490caJ());
        }
    }

    public DialogInterfaceOnDismissListenerC1077340e8q(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
