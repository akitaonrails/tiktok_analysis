package X;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848230XPh implements WeakHandler.IHandler {
    public static final C848230XPh LL = new C848230XPh();
    public static boolean LLILLJJLI;
    public static long LLILLL;
    public static final WeakHandler LLILZ;
    public static final C01GW LLILZIL;
    public static String LLILZLL;
    public static User LLIZ;
    public static UserStore.AccountUser LLIZLLLIL;
    public static String LLJ;
    public static C0XO2 LLJI;

    public final synchronized User LIZJ() {
        User userLIZJ;
        userLIZJ = LLIZ;
        if (userLIZJ == null) {
            UserStore.LIZ.getClass();
            userLIZJ = UserStore.LIZJ(false);
        }
        LLIZ = userLIZJ;
        return userLIZJ;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append("/tiktok/v1/kids/check/in/");
        C2188811AlT.LIZIZ(sbLIZ);
        LLILZIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(176));
        LLILLJJLI = false;
        LLILLL = -1L;
        LLILZ = new WeakHandler(Looper.getMainLooper(), LL);
    }

    public static final String LIZLLL() {
        String strLIZLLL;
        if (((Boolean) C282390B4z.LIZ.getValue()).booleanValue()) {
            strLIZLLL = ((SharedPreferences) LLILZIL.getValue()).getString("uid", CardStruct.IStatusCode.DEFAULT);
            if (strLIZLLL == null) {
                return CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            strLIZLLL = LLILZLL;
            if (strLIZLLL == null) {
                UserStore.LIZ.getClass();
                strLIZLLL = UserStore.LIZLLL();
            }
            LLILZLL = strLIZLLL;
            if (strLIZLLL == null) {
                return CardStruct.IStatusCode.DEFAULT;
            }
        }
        return strLIZLLL;
    }

    public static void LJ() {
        Object next;
        UserStore.LIZ.getClass();
        String strLIZLLL = UserStore.LIZLLL();
        synchronized (UserStore.LIZIZ) {
            try {
                Iterator it2 = ((ArrayList) UserStore.LJ()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C848300XPo) next).LIZ, strLIZLLL)) {
                            break;
                        }
                    }
                }
                C848300XPo c848300XPo = (C848300XPo) next;
                if (c848300XPo == null) {
                    return;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(User.class);
                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(User.class))) {
                    if (c848300XPo.LIZIZ().LIZLLL) {
                        c848300XPo.LIZIZ().LIZJ();
                    } else {
                        c848300XPo.LIZIZ().LIZJ();
                    }
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(UserStore.AccountUser.class))) {
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(SignificantUserInfo.class))) {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJI() {
        UserStore userStore = UserStore.LIZ;
        String strLIZLLL = LIZLLL();
        userStore.getClass();
        return !UserStore.LJFF(strLIZLLL);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.01kM] */
    public final void LJIIIIZZ() {
        UserStore.LIZ.getClass();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C11NZ.LJJJJI(new Callable() { // from class: X.0XPk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("UserStore@9550.save$1");
                UserStore.LIZ.getClass();
                synchronized (UserStore.LIZIZ) {
                    try {
                        Iterator it2 = ((ArrayList) UserStore.LJ()).iterator();
                        while (it2.hasNext()) {
                            ((C848300XPo) it2.next()).LIZLLL();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                UserStore.LIZ.getClass();
                UserStore.LIZLLL.edit().putString("current_foreground_uid", UserStore.LIZLLL()).apply();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("UserStore@9550.save$1");
                return unit;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(c259800zU, 234));
        C848040XOo c848040XOo = C848040XOo.LIZ;
        User userLIZJ = LIZJ();
        c848040XOo.getClass();
        C848040XOo.LIZIZ(5, null, userLIZJ);
        if (C848040XOo.LIZIZ != null) {
            C0XGN.LJ();
        }
    }

    public final boolean LJFF() {
        if (LIZJ().getAgeGatePostAction() == 1) {
            return true;
        }
        UserStore.AccountUser accountUserLIZ = LLIZLLLIL;
        if (accountUserLIZ == null) {
            UserStore userStore = UserStore.LIZ;
            String strLIZLLL = LIZLLL();
            userStore.getClass();
            accountUserLIZ = UserStore.LIZ(strLIZLLL);
        }
        LLIZLLLIL = accountUserLIZ;
        return accountUserLIZ != null && accountUserLIZ.isKidsMode;
    }

    public static UserStore.AccountUser LIZ(String str) {
        UserStore.LIZ.getClass();
        return UserStore.LIZ(str);
    }

    public static final void LIZIZ(String str) {
        Object next;
        if (str != null) {
            UserStore userStore = UserStore.LIZ;
            userStore.getClass();
            if (!UserStore.LJFF(str)) {
                String strLIZLLL = LLILZLL;
                if (strLIZLLL == null) {
                    userStore.getClass();
                    strLIZLLL = UserStore.LIZLLL();
                }
                LLILZLL = strLIZLLL;
                if (Intrinsics.LJFF(str, strLIZLLL)) {
                    LLILZLL = null;
                    LLIZ = null;
                    LLIZLLLIL = null;
                }
                if (Intrinsics.LJFF(str, UserStore.LIZLLL())) {
                    UserStore.LJ.putString("current_foreground_uid", CardStruct.IStatusCode.DEFAULT).apply();
                }
                synchronized (UserStore.LIZIZ) {
                    try {
                        Iterator it2 = ((ArrayList) UserStore.LJ()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((C848300XPo) next).LIZ, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C848300XPo c848300XPo = (C848300XPo) next;
                        if (c848300XPo != null) {
                            c848300XPo.LIZIZ().LJ(null);
                            c848300XPo.LIZ().LJ(null);
                            c848300XPo.LIZJ().LJ(null);
                            c848300XPo.LIZLLL();
                        }
                        UserStore.LIZ.getClass();
                        C19719512Dh.LIZ(UserStore.LJ()).remove(c848300XPo);
                        SharedPreferences.Editor editor = UserStore.LJ;
                        List listLIZIZ = UserStore.LIZIZ();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listLIZIZ) {
                            if (!Intrinsics.LJFF((String) obj, str)) {
                                arrayList.add(obj);
                            }
                        }
                        editor.putString("logged_in_uid_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62)).apply();
                        UserStore.LIZ.getClass();
                        List listLIZIZ2 = UserStore.LIZIZ();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listLIZIZ2) {
                            if (!Intrinsics.LJFF((String) obj2, str)) {
                                arrayList2.add(obj2);
                            }
                        }
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                        Keva keva = (Keva) C848280XPm.LIZ.getValue();
                        if (keva != null) {
                            keva.storeString("user_ids", strLJJLIIIJ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                UserStore.LJI.postValue(UserStore.LIZIZ());
                C0XGC.LIZ.getClass();
                C0XGC.LIZ(str);
            }
        }
    }

    public static void LJII(boolean z) {
        boolean zLJI = MethodIDManager.LJI(202453);
        C1BVK.LIZIZ().LIZ(LLILZ, new C0XHI(((IAccountHelperService) C0XPY.LIZIZ(IAccountHelperService.class)).selfUserApi(), z), 112);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIIZ(String str) {
        String strLIZLLL = LLILZLL;
        if (strLIZLLL == null) {
            UserStore.LIZ.getClass();
            strLIZLLL = UserStore.LIZLLL();
        }
        LLILZLL = strLIZLLL;
        if (Intrinsics.LJFF(str, strLIZLLL)) {
            return;
        }
        LLIZ = null;
        LLILZLL = str;
        LLIZLLLIL = null;
        UserStore.LIZ.getClass();
        UserStore.LJ.putString("current_foreground_uid", str).apply();
    }

    public static void LJIIJ(String str) {
        if (str == null) {
            return;
        }
        LLJ = str;
        synchronized (UserStore.LIZ) {
            if (Intrinsics.LJFF(UserStore.LJIIIZ, str)) {
                return;
            }
            UserStore.LJIIIZ = str;
            UserStore.LJ.putString("latest_logged_in_uid_list", str).apply();
        }
    }

    public static SignificantUserInfo LJIIJJI(String str) {
        SignificantUserInfo significantUserInfoLIZJ;
        Object next;
        UserStore.LIZ.getClass();
        synchronized (UserStore.LIZIZ) {
            try {
                Iterator it2 = ((ArrayList) UserStore.LJ()).iterator();
                while (true) {
                    significantUserInfoLIZJ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C848300XPo) next).LIZ, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C848300XPo c848300XPo = (C848300XPo) next;
                if (c848300XPo == null) {
                    return null;
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(SignificantUserInfo.class);
                if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(User.class))) {
                    if (c848300XPo.LIZIZ().LIZLLL) {
                        significantUserInfoLIZJ = (SignificantUserInfo) c848300XPo.LIZIZ().LIZJ();
                    } else {
                        significantUserInfoLIZJ = (SignificantUserInfo) c848300XPo.LIZIZ().LIZJ();
                    }
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(UserStore.AccountUser.class))) {
                    significantUserInfoLIZJ = (SignificantUserInfo) c848300XPo.LIZ().LIZJ();
                } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(SignificantUserInfo.class))) {
                    significantUserInfoLIZJ = c848300XPo.LIZJ().LIZJ();
                }
                return significantUserInfoLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL(final UserStore.AccountUser accountUser) {
        if (Intrinsics.LJFF(accountUser.uid, LIZLLL())) {
            LLIZLLLIL = null;
        }
        UserStore.LIZ.getClass();
        C11NZ.LJJJJI(new Callable() { // from class: X.0XPi
            /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01ae A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01c2 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:19:0x0063, B:20:0x006d, B:22:0x0074, B:24:0x0083, B:26:0x0087, B:28:0x0099, B:29:0x00c6, B:30:0x00cb, B:32:0x00d7, B:33:0x00e1, B:35:0x00ed, B:37:0x00f9, B:39:0x010d, B:49:0x0148, B:51:0x0151, B:53:0x0159, B:55:0x015f, B:57:0x0198, B:58:0x019e, B:59:0x01a8, B:61:0x01ae, B:64:0x01be, B:66:0x01c2, B:68:0x01d4, B:69:0x0201, B:71:0x020a, B:73:0x0216, B:74:0x0220, B:76:0x022c, B:70:0x0204, B:77:0x0236, B:78:0x023a, B:80:0x0240, B:40:0x0116, B:42:0x0122, B:43:0x0129, B:45:0x0135, B:47:0x0142), top: B:90:0x0063 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x01be A[EDGE_INSN: B:94:0x01be->B:64:0x01be BREAK  A[LOOP:1: B:59:0x01a8->B:96:?], SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 600
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC848240XPi.call():java.lang.Object");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
    }

    public final void LJIILIIL(User user) {
        boolean zLJI = MethodIDManager.LJI(196648);
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            User userLIZJ = LIZJ();
            LLILLL = -1L;
            LLILLJJLI = true;
            LJIIJ(user.getUid());
            C848040XOo.LIZ.getClass();
            C848040XOo.LIZIZ(4, userLIZJ, user);
            LLIZ = user;
            UserStore.LIZ.getClass();
            UserStore.LJII(user);
            LJIIIZ(user.getUid());
            LJIIIIZZ();
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (!(HandlerHook.getMessageObj(message.obj) instanceof Exception) && message.what == 112 && HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof User)) {
            LJIILIIL((User) HandlerHook.getMessageObj(message.obj));
        }
    }
}
