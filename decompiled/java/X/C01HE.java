package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01HE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HE {
    public static C01HF LIZ;
    public static C01FV LIZIZ;
    public static HashSet<C01HG> LIZJ;

    public static InterfaceC917640ZzG LIZ() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (objLJIIIZ instanceof InterfaceC917640ZzG) {
            return (InterfaceC917640ZzG) objLJIIIZ;
        }
        return null;
    }

    public static boolean LIZIZ() {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        return C930480aJy.LJIJI(userLJIJJLI);
    }

    public static boolean LIZJ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        InterfaceC917640ZzG interfaceC917640ZzGLIZ = LIZ();
        if (interfaceC917640ZzGLIZ == null || (abstractC928510aGnLIZ = interfaceC917640ZzGLIZ.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return false;
        }
        Iterator it2 = listLJJIII.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            User user = ((LinkListUser) next).user;
            if (user != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                return (next == null || LIZIZ()) ? false : true;
            }
        }
        return false;
    }

    public static C01FV LJ() {
        return LIZIZ() ? C01FV.ANCHOR : LIZJ() ? C01FV.GUEST : C01FV.AUDIENCE;
    }

    public static void LJFF() {
        C01FV c01fvLJ = LJ();
        if (LIZIZ != c01fvLJ) {
            HashSet<C01HG> hashSet = LIZJ;
            if (hashSet != null) {
                Iterator<C01HG> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c01fvLJ == C01FV.AUDIENCE);
                }
            }
            LIZIZ = c01fvLJ;
        }
    }

    public static String LIZLLL(long j) {
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        String str;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        String str2;
        InterfaceC917530Zz5 interfaceC917530Zz5;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        List listLJJIII3;
        String str3;
        int i = C01FW.LIZ[LJ().ordinal()];
        Object obj = null;
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJFF()) {
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
                if ((objLJIIIZ instanceof InterfaceC917530Zz5) && (interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ) != null && (abstractC928510aGnLIZ3 = interfaceC917530Zz5.LIZ()) != null && (listLJJIII3 = abstractC928510aGnLIZ3.LJJIII()) != null) {
                    Iterator it2 = listLJJIII3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        User user = ((LinkPlayerInfo) next).mUser;
                        if (user != null && user.getId() == j) {
                            obj = next;
                            break;
                        }
                    }
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                    if (linkPlayerInfo != null && (str3 = linkPlayerInfo.mInteractIdStr) != null) {
                        return str3;
                    }
                }
                AbstractC919790a2j.LJIIJJI.getClass();
                return AbstractC919790a2j.LJIILL;
            }
            InterfaceC917640ZzG interfaceC917640ZzGLIZ = LIZ();
            if (interfaceC917640ZzGLIZ != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzGLIZ.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                Iterator it3 = listLJJIII2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    User user2 = ((LinkListUser) next2).user;
                    if (user2 != null && user2.getId() == j) {
                        obj = next2;
                        break;
                    }
                }
                LinkListUser linkListUser = (LinkListUser) obj;
                if (linkListUser != null && (str2 = linkListUser.linkMicId) != null) {
                    return str2;
                }
            }
            AbstractC919790a2j.LJIIJJI.getClass();
            return AbstractC919790a2j.LJIILL;
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((objLJIIIZ2 instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ2) != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            Iterator it4 = listLJJIII.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                User user3 = ((LinkPlayerInfo) next3).mUser;
                if (user3 != null && user3.getId() == j) {
                    obj = next3;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 != null && (str = linkPlayerInfo2.mInteractIdStr) != null) {
                return str;
            }
        }
        AbstractC919790a2j.LJIIJJI.getClass();
        return AbstractC919790a2j.LJIILL;
    }

    public static long LJI(String str) {
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        User user;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        User user2;
        InterfaceC917530Zz5 interfaceC917530Zz5;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        List listLJJIII3;
        User user3;
        int i = C01FW.LIZ[LJ().ordinal()];
        Object obj = null;
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJFF()) {
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
                if ((objLJIIIZ instanceof InterfaceC917530Zz5) && (interfaceC917530Zz5 = (InterfaceC917530Zz5) objLJIIIZ) != null && (abstractC928510aGnLIZ3 = interfaceC917530Zz5.LIZ()) != null && (listLJJIII3 = abstractC928510aGnLIZ3.LJJIII()) != null) {
                    Iterator it2 = listLJJIII3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.LJFF(((LinkPlayerInfo) next).mInteractIdStr, str)) {
                            obj = next;
                            break;
                        }
                    }
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                    if (linkPlayerInfo != null && (user3 = linkPlayerInfo.mUser) != null) {
                        return user3.getId();
                    }
                }
                AbstractC919790a2j.LJIIJJI.getClass();
                return AbstractC919790a2j.LJIILJJIL;
            }
            InterfaceC917640ZzG interfaceC917640ZzGLIZ = LIZ();
            if (interfaceC917640ZzGLIZ != null && (abstractC928510aGnLIZ2 = interfaceC917640ZzGLIZ.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                Iterator it3 = listLJJIII2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(((LinkListUser) next2).linkMicId, str)) {
                        obj = next2;
                        break;
                    }
                }
                LinkListUser linkListUser = (LinkListUser) obj;
                if (linkListUser != null && (user2 = linkListUser.user) != null) {
                    return user2.getId();
                }
            }
            AbstractC919790a2j.LJIIJJI.getClass();
            return AbstractC919790a2j.LJIILJJIL;
        }
        Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((objLJIIIZ2 instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ2) != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            Iterator it4 = listLJJIII.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                if (Intrinsics.LJFF(((LinkPlayerInfo) next3).mInteractIdStr, str)) {
                    obj = next3;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 != null && (user = linkPlayerInfo2.mUser) != null) {
                return user.getId();
            }
        }
        AbstractC919790a2j.LJIIJJI.getClass();
        return AbstractC919790a2j.LJIILJJIL;
    }
}
