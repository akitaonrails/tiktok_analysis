package X;

import android.view.ViewParent;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595350rcL {
    public static final IInboxMobEventService LIZ = (IInboxMobEventService) ServiceManager.get().getService(IInboxMobEventService.class);

    public static final <T extends InterfaceC1891350zJl> int LIZ(PowerCell<T> powerCell) {
        List<InterfaceC1891350zJl> listLJII;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewParent parent = powerCell.itemView.getParent();
        if ((parent instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) parent) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            listLJII = state.LJII();
        } else {
            listLJII = null;
        }
        int i = 0;
        if (listLJII != null) {
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLJII) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if (i2 < powerCell.getBindingAdapterPosition() && LIZ.LIZJ(interfaceC1891350zJl2)) {
                        i++;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return i + 1;
    }

    public static void LIZLLL(PowerCell powerCell) {
        LIZ.LIZLLL(powerCell, null);
    }

    public static void LIZJ(PowerCell powerCell, String str, String str2, int i, String str3, Map map, int i2) {
        String str4;
        int iLIZ;
        if ((i2 & 2) != 0) {
            str4 = "notification_page";
        } else {
            str4 = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            iLIZ = LIZ(powerCell);
        } else {
            iLIZ = 0;
        }
        if ((i2 & 32) != 0) {
            str3 = "";
        }
        if ((i2 & 64) != 0) {
            map = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("cell_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LIZJ(iLIZ, "rank");
        c2344009Gk.LJIIIIZZ("group_id", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C20684815ws.LJIILLIIL("inbox_skylight_show", c2344009Gk.LIZ);
    }

    public static void LIZIZ(PowerCell powerCell, String str, String str2, Integer num, int i, String str3, Map map, int i2) {
        String str4;
        if ((i2 & 2) != 0) {
            str4 = "notification_page";
        } else {
            str4 = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            num = -1;
        }
        if ((i2 & 16) != 0) {
            i = LIZ(powerCell);
        }
        String str5 = "";
        if ((i2 & 32) != 0) {
            str3 = "";
        }
        if ((i2 & 64) != 0) {
            map = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("cell_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJ(num, "follow_status");
        c2344009Gk.LIZJ(i, "rank");
        c2344009Gk.LJIIIIZZ("group_id", str3);
        String str6 = C0NBD.LIZ;
        if (str6 != null) {
            str5 = str6;
        }
        c2344009Gk.LJIIIIZZ("inbox_session_id", str5);
        if (Intrinsics.LJFF(str4, "notification_page")) {
            c2344009Gk.LIZJ(C1599780rjU.LIZ.LIZJ(C1181204ji.LIZ(str, str2)), "is_first_screen");
            c2344009Gk.LJFF("enter_method", C1595250rcB.LIZ);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C20684815ws.LJIILLIIL("inbox_skylight_click", c2344009Gk.LIZ);
    }
}
