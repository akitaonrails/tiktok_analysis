package X;

import Y.AComparatorS32S0000000_13;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.ClearCredScene;
import com.ss.android.ugc.aweme.services.ClearLoginCredentialsService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XUE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUE {
    public static final C0XUE LIZ = new C0XUE();
    public static List<BaseLoginMethod> LIZIZ;

    public final synchronized BaseLoginMethod LIZLLL() {
        BaseLoginMethod next;
        BaseLoginMethod baseLoginMethod;
        Iterator<BaseLoginMethod> it2 = LIZIZ.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                BaseLoginMethod baseLoginMethod2 = next;
                Long lastActiveTime = baseLoginMethod2.getLastActiveTime();
                long jLongValue = (lastActiveTime != null ? lastActiveTime.longValue() : -1L) > 0 ? baseLoginMethod2.getLastActiveTime().longValue() : baseLoginMethod2.safeExpires().getTime() - 31536000000L;
                do {
                    BaseLoginMethod next2 = it2.next();
                    BaseLoginMethod baseLoginMethod3 = next2;
                    Long lastActiveTime2 = baseLoginMethod3.getLastActiveTime();
                    long time = (lastActiveTime2 == null || lastActiveTime2.longValue() <= 0) ? baseLoginMethod3.safeExpires().getTime() - 31536000000L : baseLoginMethod3.getLastActiveTime().longValue();
                    if (jLongValue < time) {
                        next = next2;
                        jLongValue = time;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        baseLoginMethod = next;
        if (baseLoginMethod == null) {
            LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
            CommonUserInfo.Companion.getClass();
            baseLoginMethod = new BaseLoginMethod("", loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), -1L, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null);
        }
        return baseLoginMethod;
    }

    public final synchronized BaseLoginMethod LJFF() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        if (((C0XUL) C1943907jR.LIZ(C0XPY.LIZIZ, C0XUL.class)).LIZ()) {
            return LIZLLL();
        }
        LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
        CommonUserInfo.Companion.getClass();
        return new BaseLoginMethod("", loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), -1L, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: Exception -> 0x0154, TryCatch #0 {Exception -> 0x0154, blocks: (B:12:0x0058, B:14:0x0065, B:15:0x0069, B:17:0x0072, B:19:0x0080, B:21:0x008c, B:23:0x0092, B:24:0x0096, B:27:0x00a5, B:56:0x0121, B:58:0x012d, B:59:0x0131, B:61:0x0137, B:26:0x00a1, B:30:0x00ae, B:36:0x00c0, B:38:0x00cc, B:39:0x00d0, B:41:0x00d6, B:33:0x00b7, B:42:0x00df, B:44:0x00e7, B:45:0x00f0, B:47:0x00f8, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:53:0x0117, B:62:0x0140, B:64:0x0148, B:25:0x0099), top: B:81:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[Catch: Exception -> 0x0154, TryCatch #0 {Exception -> 0x0154, blocks: (B:12:0x0058, B:14:0x0065, B:15:0x0069, B:17:0x0072, B:19:0x0080, B:21:0x008c, B:23:0x0092, B:24:0x0096, B:27:0x00a5, B:56:0x0121, B:58:0x012d, B:59:0x0131, B:61:0x0137, B:26:0x00a1, B:30:0x00ae, B:36:0x00c0, B:38:0x00cc, B:39:0x00d0, B:41:0x00d6, B:33:0x00b7, B:42:0x00df, B:44:0x00e7, B:45:0x00f0, B:47:0x00f8, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:53:0x0117, B:62:0x0140, B:64:0x0148, B:25:0x0099), top: B:81:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121 A[Catch: Exception -> 0x0154, TryCatch #0 {Exception -> 0x0154, blocks: (B:12:0x0058, B:14:0x0065, B:15:0x0069, B:17:0x0072, B:19:0x0080, B:21:0x008c, B:23:0x0092, B:24:0x0096, B:27:0x00a5, B:56:0x0121, B:58:0x012d, B:59:0x0131, B:61:0x0137, B:26:0x00a1, B:30:0x00ae, B:36:0x00c0, B:38:0x00cc, B:39:0x00d0, B:41:0x00d6, B:33:0x00b7, B:42:0x00df, B:44:0x00e7, B:45:0x00f0, B:47:0x00f8, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:53:0x0117, B:62:0x0140, B:64:0x0148, B:25:0x0099), top: B:81:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    static {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XUE.<clinit>():void");
    }

    public static List LIZIZ(List list) {
        Object next;
        long jLongValue;
        long jLongValue2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            if (baseLoginMethod.getUid().length() > 0 && !Intrinsics.LJFF(baseLoginMethod.getUid(), CardStruct.IStatusCode.DEFAULT)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String uid = ((BaseLoginMethod) obj2).getUid();
            Object arrayList2 = linkedHashMap.get(uid);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(uid, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterator it2 = ((List) entry.getValue()).iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    Long loginTime = ((BaseLoginMethod) next).getLoginTime();
                    if (loginTime != null) {
                        jLongValue = loginTime.longValue();
                    } else {
                        jLongValue = Long.MIN_VALUE;
                    }
                    do {
                        Object next2 = it2.next();
                        Long loginTime2 = ((BaseLoginMethod) next2).getLoginTime();
                        if (loginTime2 != null) {
                            jLongValue2 = loginTime2.longValue();
                        } else {
                            jLongValue2 = Long.MIN_VALUE;
                        }
                        if (jLongValue < jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it2.hasNext());
                }
            }
            linkedHashMap2.put(key, next);
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((BaseLoginMethod) it3.next()).getUid());
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listLJJJJI.iterator();
        while (it4.hasNext()) {
            Object obj3 = linkedHashMap2.get(it4.next());
            if (obj3 != null) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final synchronized List<BaseLoginMethod> LIZJ(List<String> list) {
        C1133920fc6 c1133920fc6 = new C1133920fc6(C09RB.LJIIIZ(new C1939607ik(LIZIZ), AFwS247S0000000_13.get$arr$(63)), new AComparatorS32S0000000_13(36));
        if (C086I.LIZIZ(list)) {
            return C09RB.LJJII(c1133920fc6);
        }
        return C09RB.LJJII(C09RB.LJIIIZ(c1133920fc6, new AwS592S0100000_13((List) list, (List<String>) 98)));
    }

    public final synchronized List<BaseLoginMethod> LJ(String str) {
        ArrayList arrayList;
        List<BaseLoginMethod> list = LIZIZ;
        arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : list) {
            if (Intrinsics.LJFF(baseLoginMethod.getUid(), str)) {
                arrayList.add(baseLoginMethod);
            }
        }
        return arrayList;
    }

    public final synchronized void LJIIJ(String str) {
        boolean z = false;
        for (BaseLoginMethod baseLoginMethod : (ArrayList) LIZIZ) {
            if (Intrinsics.LJFF(baseLoginMethod.getUid(), str)) {
                Boolean hasOIDC = baseLoginMethod.getHasOIDC();
                Boolean bool = Boolean.FALSE;
                if (!Intrinsics.LJFF(hasOIDC, bool)) {
                    baseLoginMethod.setHasOIDC(bool);
                    z = true;
                } else {
                    return;
                }
            }
        }
        if (z) {
            C0XU4 c0xu4 = C0XU4.LIZ;
            List<BaseLoginMethod> list = LIZIZ;
            c0xu4.getClass();
            C0XU4.LIZJ(list, false);
        }
    }

    public final synchronized void LJIILJJIL(User user) {
        List<BaseLoginMethod> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((BaseLoginMethod) obj).getUid(), user.getUid())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((BaseLoginMethod) it2.next()).updateUserInfo(user);
        }
        C0XU4 c0xu4 = C0XU4.LIZ;
        List<BaseLoginMethod> list2 = LIZIZ;
        c0xu4.getClass();
        C0XU4.LIZJ(list2, false);
    }

    public final synchronized void LJIILL(SignificantUserInfo significantUserInfo) {
        if (significantUserInfo == null) {
            return;
        }
        List<BaseLoginMethod> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((BaseLoginMethod) obj).getUid(), significantUserInfo.uid)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((BaseLoginMethod) it2.next()).updateUserInfo(significantUserInfo);
        }
        C0XU4 c0xu4 = C0XU4.LIZ;
        List<BaseLoginMethod> list2 = LIZIZ;
        c0xu4.getClass();
        C0XU4.LIZJ(list2, false);
    }

    public final synchronized void LIZ(BaseLoginMethod baseLoginMethod, User user) {
        if (C0XUK.LIZ()) {
            BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) C13LP.LJJJLL(LJ(user.getUid()));
            String successfulLoginToken = null;
            if (user.isPhoneBinded()) {
                String uid = user.getUid();
                LoginMethodName loginMethodName = LoginMethodName.PHONE_NUMBER_PASS;
                PhoneNumberUtil.PhoneNumber phoneNumberCreateEmptyPhoneNumber = PhoneNumberUtil.PhoneNumber.createEmptyPhoneNumber();
                Long loginTime = baseLoginMethod.getLoginTime();
                if (baseLoginMethod2 != null) {
                    successfulLoginToken = baseLoginMethod2.getSuccessfulLoginToken();
                }
                String bindPhone = user.getBindPhone();
                CommonUserInfo.Companion.getClass();
                LJI(new PhoneLoginMethod(uid, loginMethodName, phoneNumberCreateEmptyPhoneNumber, C0XTZ.LIZ(), loginTime, -1L, false, successfulLoginToken, bindPhone, null), true);
            } else if (user.isHasEmail()) {
                String uid2 = user.getUid();
                LoginMethodName loginMethodName2 = LoginMethodName.EMAIL_PASS;
                Long loginTime2 = baseLoginMethod.getLoginTime();
                Boolean bool = Boolean.TRUE;
                if (baseLoginMethod2 != null) {
                    successfulLoginToken = baseLoginMethod2.getSuccessfulLoginToken();
                }
                String email = user.getEmail();
                CommonUserInfo.Companion.getClass();
                LJI(new AccountPassLoginMethod(uid2, loginMethodName2, "", C0XTZ.LIZ(), loginTime2, -1L, null, null, null, bool, successfulLoginToken, null, email), true);
            } else {
                LJIIIIZZ(user.getUid(), true);
            }
        } else {
            LJIIIIZZ(user.getUid(), true);
        }
    }

    public final synchronized void LJI(BaseLoginMethod baseLoginMethod, boolean z) {
        CommonUserInfo commonUserInfo;
        Object next;
        boolean zLJFF;
        String oneClickLoginToken;
        boolean zLJFF2;
        Long lastActiveTime;
        if (baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT && (lastActiveTime = baseLoginMethod.getLastActiveTime()) != null && lastActiveTime.longValue() == -1) {
            baseLoginMethod.setLastActiveTime(Long.valueOf(System.currentTimeMillis()));
        }
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            commonUserInfo = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((BaseLoginMethod) next).getUid(), baseLoginMethod.getUid())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) next;
        if (C293990Bfh.LIZ() && baseLoginMethod.getCommonUserInfo() == null) {
            if (baseLoginMethod2 != null) {
                commonUserInfo = baseLoginMethod2.getCommonUserInfo();
            }
            baseLoginMethod.setCommonUserInfo(commonUserInfo);
        }
        if (baseLoginMethod2 == null) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(baseLoginMethod2.isOneClickLogin(), Boolean.TRUE);
        }
        baseLoginMethod.setOneClickLogin(Boolean.valueOf(zLJFF));
        if (baseLoginMethod2 == null || (oneClickLoginToken = baseLoginMethod2.getOneClickLoginToken()) == null) {
            oneClickLoginToken = "";
        }
        baseLoginMethod.setOneClickLoginToken(oneClickLoginToken);
        if (baseLoginMethod2 == null) {
            zLJFF2 = false;
        } else {
            zLJFF2 = Intrinsics.LJFF(baseLoginMethod2.getHasOIDC(), Boolean.TRUE);
        }
        baseLoginMethod.setHasOIDC(Boolean.valueOf(zLJFF2));
        C19719612Di.LJJIIJ(LIZIZ, new AwS592S0100000_13(baseLoginMethod, 99), true);
        baseLoginMethod.setHistoryRemoved(Boolean.FALSE);
        ClearLoginCredentialsService clearLoginCredentialsService = ClearLoginCredentialsService.INSTANCE;
        if (clearLoginCredentialsService.shouldTryBlockHLCredentialsSave() && !clearLoginCredentialsService.keepLoginMethodByPlatform(baseLoginMethod)) {
            clearLoginCredentialsService.triggerClearCredET(ClearCredScene.BLOCK_HL, 1);
        } else {
            ((ArrayList) LIZIZ).add(baseLoginMethod);
        }
        if (z) {
            C0XU4 c0xu4 = C0XU4.LIZ;
            List<BaseLoginMethod> list = LIZIZ;
            c0xu4.getClass();
            C0XU4.LIZJ(list, false);
        }
    }

    public final synchronized void LJII(List<? extends BaseLoginMethod> list, boolean z) {
        List listLIZIZ = LIZIZ(C13LP.LJLIL(list, LIZIZ));
        ((ArrayList) LIZIZ).clear();
        ((ArrayList) LIZIZ).addAll(listLIZIZ);
        C0XU4 c0xu4 = C0XU4.LIZ;
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (!arrayList.isEmpty()) {
            z = false;
        }
        c0xu4.getClass();
        C0XU4.LIZJ(arrayList, z);
    }

    public final synchronized void LJIIIIZZ(String str, boolean z) {
        if (C846430XIj.LIZIZ()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(LJ(str));
            if (baseLoginMethod == null) {
                return;
            }
            List<BaseLoginMethod> list = LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (!Intrinsics.LJFF(((BaseLoginMethod) obj).getUid(), str)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            LIZIZ = arrayList2;
            if (z) {
                arrayList2.add(new BaseLoginMethod(str, LoginMethodName.DEFAULT, baseLoginMethod.getCommonUserInfo(), baseLoginMethod.getExpires(), baseLoginMethod.getLoginTime(), baseLoginMethod.getLastActiveTime(), baseLoginMethod.isOneClickLogin(), Boolean.FALSE, null, null, baseLoginMethod.getHasOIDC(), baseLoginMethod.getSuccessfulLoginToken(), baseLoginMethod.getMaskedPhone(), baseLoginMethod.getMaskedEmail()));
            }
            if (Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.TRUE) && !z) {
                C0XU4 c0xu4 = C0XU4.LIZ;
                List<BaseLoginMethod> list2 = LIZIZ;
                c0xu4.getClass();
                C0XU4.LJ(str, "", list2, false, null, null);
            } else {
                C0XU4 c0xu42 = C0XU4.LIZ;
                List<BaseLoginMethod> list3 = LIZIZ;
                c0xu42.getClass();
                C0XU4.LIZJ(list3, false);
            }
            return;
        }
        List<BaseLoginMethod> list4 = LIZIZ;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : (ArrayList) list4) {
            if (!Intrinsics.LJFF(((BaseLoginMethod) obj2).getUid(), str)) {
                arrayList3.add(obj2);
            }
        }
        LIZIZ = new ArrayList(arrayList3);
        C0XU4 c0xu43 = C0XU4.LIZ;
        List<BaseLoginMethod> list5 = LIZIZ;
        c0xu43.getClass();
        C0XU4.LIZJ(list5, false);
    }

    public final synchronized void LJIIIZ(String str, String str2) {
        boolean z = false;
        for (BaseLoginMethod baseLoginMethod : (ArrayList) LIZIZ) {
            if (Intrinsics.LJFF(baseLoginMethod.getUid(), str) && baseLoginMethod.getLoginMethodName() == LoginMethodName.EMAIL_PASS && (baseLoginMethod instanceof AccountPassLoginMethod)) {
                ((AccountPassLoginMethod) baseLoginMethod).setName(str2);
                z = true;
            }
        }
        if (z) {
            C0XU4 c0xu4 = C0XU4.LIZ;
            List<BaseLoginMethod> list = LIZIZ;
            c0xu4.getClass();
            C0XU4.LIZJ(list, false);
        }
    }

    public final synchronized void LJIIJJI(long j, String str) {
        for (BaseLoginMethod baseLoginMethod : (ArrayList) LIZIZ) {
            if (Intrinsics.LJFF(baseLoginMethod.getUid(), str)) {
                baseLoginMethod.setLastActiveTime(Long.valueOf(j));
                baseLoginMethod.setExpires(new Date(31536000000L + j));
            }
        }
    }

    public final synchronized void LJIILIIL(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z = false;
        for (BaseLoginMethod baseLoginMethod : (ArrayList) LIZIZ) {
            if (Intrinsics.LJFF(baseLoginMethod.getUid(), str)) {
                CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo == null || (str3 = commonUserInfo.avatarUrl) == null) {
                    str3 = "";
                }
                CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo2 == null || (str4 = commonUserInfo2.secUid) == null) {
                    str4 = "";
                }
                CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo3 == null || (str5 = commonUserInfo3.screenName) == null) {
                    str5 = "";
                }
                CommonUserInfo commonUserInfo4 = baseLoginMethod.getCommonUserInfo();
                Integer num = null;
                if (commonUserInfo4 != null) {
                    str6 = commonUserInfo4.avatarUri;
                } else {
                    str6 = null;
                }
                CommonUserInfo commonUserInfo5 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo5 != null) {
                    num = commonUserInfo5.avatarExpires;
                }
                baseLoginMethod.setCommonUserInfo(new CommonUserInfo(str2, str3, str4, str5, str6, num));
                if (baseLoginMethod.getLoginMethodName() == LoginMethodName.USER_NAME_PASS && (baseLoginMethod instanceof AccountPassLoginMethod)) {
                    ((AccountPassLoginMethod) baseLoginMethod).setName(str2);
                }
                z = true;
            }
        }
        if (z) {
            C0XU4 c0xu4 = C0XU4.LIZ;
            List<BaseLoginMethod> list = LIZIZ;
            c0xu4.getClass();
            C0XU4.LIZJ(list, false);
        }
    }

    public final synchronized void LJIIL(String str, String str2, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
        boolean z;
        boolean z2 = true;
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) C13LP.LJJJLL(LJ(str));
        List<BaseLoginMethod> list = null;
        if (baseLoginMethod == null) {
            LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
            CommonUserInfo.Companion.getClass();
            BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(str, loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), -1L, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null);
            UserStore.LIZ.getClass();
            User userLJI = UserStore.LJI(str);
            if (userLJI != null) {
                CommonUserInfo.Companion.getClass();
                baseLoginMethod2.setCommonUserInfo(C0XTZ.LIZIZ(userLJI, null));
            }
            LJI(baseLoginMethod2, false);
        } else if (Intrinsics.LJFF(baseLoginMethod.isOneClickLogin(), Boolean.valueOf(z)) && Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.valueOf(z))) {
            z2 = false;
        } else {
            baseLoginMethod.setOneClickLogin(Boolean.valueOf(z));
            baseLoginMethod.setHasOIDC(Boolean.valueOf(z));
        }
        C0XU4 c0xu4 = C0XU4.LIZ;
        if (z2) {
            list = LIZIZ;
        }
        c0xu4.getClass();
        C0XU4.LJ(str, str2, list, false, function0, function1);
    }
}
