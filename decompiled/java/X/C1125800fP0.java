package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0fP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125800fP0 {
    public static C1130230fW9 LIZ;
    public static final List<C1125380fOK> LIZIZ = new LinkedList();
    public static C1125380fOK LIZJ;
    public static boolean LIZLLL;

    public static EnumC1125400fOM LIZIZ() {
        List<C1125380fOK> list = LIZIZ;
        return ((LinkedList) list).size() == 1 ? ((C1125380fOK) C13LP.LJJJJZI(list)).LIZIZ : EnumC1125400fOM.ANCHOR;
    }

    public static User LIZJ() {
        if (!LIZLLL) {
            C1AF0.LJFF(new RuntimeException("gift_panel_to_user_invalid"), "gift_panel_to_user_invalid");
        }
        List<C1125380fOK> list = LIZIZ;
        if (((LinkedList) list).size() == 1) {
            C1125380fOK c1125380fOK = (C1125380fOK) C13LP.LJJJLL(list);
            if (c1125380fOK != null) {
                return c1125380fOK.LIZ;
            }
            return null;
        }
        C1125380fOK c1125380fOK2 = LIZJ;
        if (c1125380fOK2 != null) {
            return c1125380fOK2.LIZ;
        }
        return null;
    }

    public static List LIZLLL() {
        if (!LIZLLL) {
            C1AF0.LJFF(new RuntimeException("gift_panel_to_user_invalid"), "gift_panel_to_user_invalid");
        }
        return LIZIZ;
    }

    public static int LJ() {
        List<C1125380fOK> list = LIZIZ;
        LinkedList linkedList = (LinkedList) list;
        return linkedList.size() == 1 ? ((C1125380fOK) C13LP.LJJJJZI(list)).LIZIZ == EnumC1125400fOM.GUEST ? 2 : 1 : linkedList.size() > 1 ? 3 : -1;
    }

    public static boolean LJFF() {
        return ((LinkedList) LIZIZ).size() > 1;
    }

    public static boolean LJI() {
        if (((LinkedList) LIZIZ).size() <= 1) {
            return LIZIZ() == EnumC1125400fOM.ANCHOR || LIZIZ() == EnumC1125400fOM.GUEST;
        }
        return false;
    }

    public static void LIZ(C474500IjA c474500IjA) {
        List<C1125380fOK> list = LIZIZ;
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 1) {
            C1125380fOK c1125380fOK = (C1125380fOK) C13LP.LJJJLL(list);
            if (c1125380fOK != null) {
                c474500IjA.LJJII(Long.valueOf(c1125380fOK.LIZ.getId()), "to_user_id");
                IInteractService iInteractService = C1128450fTH.LIZ;
                c474500IjA.LJJII(C1128450fTH.LJIJI(c1125380fOK.LIZ), "to_user_type");
                c474500IjA.LJJII(1, "send_gift_ucnt");
                return;
            }
            return;
        }
        C1125380fOK c1125380fOK2 = LIZJ;
        if (c1125380fOK2 != null) {
            c474500IjA.LJJII(Long.valueOf(c1125380fOK2.LIZ.getId()), "to_user_id");
            IInteractService iInteractService2 = C1128450fTH.LIZ;
            c474500IjA.LJJII(C1128450fTH.LJIJI(c1125380fOK2.LIZ), "to_user_type");
        }
        c474500IjA.LJJII(Integer.valueOf(linkedList.size()), "send_gift_ucnt");
    }
}
