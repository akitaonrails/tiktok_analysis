package X;

import Y.AComparatorS32S0000000_13;
import Y.ARunnableS82S0200000_13;
import Y.AfS172S0100000_3;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.model.OrgUserInfo;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.AwS20S1100100_13;
import kotlin.jvm.internal.AwS28S0010000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XUD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUD {
    public static C19487011Lw LIZLLL;
    public static C19487011Lw LJ;
    public static volatile int LJIIIIZZ;
    public static volatile int LJIIIZ;
    public static volatile long LJIIJ;
    public static volatile boolean LJIIJJI;
    public static final C0XUD LIZ = new C0XUD();
    public static final C835260Wpg LIZIZ = new C835260Wpg();
    public static final C836390WrV LIZJ = new C836390WrV();
    public static List<BaseLoginMethod> LJFF = Collections.emptyList();
    public static final MutableLiveData<C0XHP> LJI = new MutableLiveData<>(C0XHP.NOT_READY);
    public static volatile boolean LJII = true;

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.LJFF(((BaseLoginMethod) obj).isOneClickLogin(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LIZ(List list, boolean z) {
        long jLongValue;
        Boolean boolValueOf;
        String str;
        BaseLoginMethod c0xut;
        boolean zBooleanValue;
        Boolean bool;
        OrgUserInfo orgUserInfo;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            EncryptedLoginMethod encryptedLoginMethod = (EncryptedLoginMethod) it2.next();
            LoginMethodName loginMethodName = encryptedLoginMethod.loginMethodName;
            String str2 = encryptedLoginMethod.uid;
            Long l = null;
            CommonUserInfo commonUserInfo = new CommonUserInfo(encryptedLoginMethod.userName, encryptedLoginMethod.avatarUrl, null, encryptedLoginMethod.screenName, encryptedLoginMethod.avatarUri, encryptedLoginMethod.avatarExpires);
            Long l2 = encryptedLoginMethod.expirationDate;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = -1;
            }
            Date date = new Date(jLongValue);
            Long l3 = encryptedLoginMethod.lastActiveTime;
            if (C846430XIj.LIZIZ()) {
                boolValueOf = encryptedLoginMethod.isOcl;
            } else {
                boolValueOf = Boolean.valueOf(z);
            }
            Boolean bool2 = Boolean.FALSE;
            if (!z && !C846430XIj.LIZIZ()) {
                str = null;
            } else {
                str = encryptedLoginMethod.oneClickLoginToken;
            }
            String str3 = encryptedLoginMethod.platform;
            Boolean bool3 = encryptedLoginMethod.hasOIDC;
            Boolean bool4 = Boolean.TRUE;
            BaseLoginMethod baseLoginMethod = new BaseLoginMethod(str2, loginMethodName, commonUserInfo, date, null, l3, boolValueOf, bool2, str, str3, Boolean.valueOf(Intrinsics.LJFF(bool3, bool4)), encryptedLoginMethod.successfulLoginToken, encryptedLoginMethod.maskedPhone, encryptedLoginMethod.maskedEmail);
            CommonUserInfo commonUserInfo2 = new CommonUserInfo(encryptedLoginMethod.userName, encryptedLoginMethod.avatarUrl, null, encryptedLoginMethod.screenName, encryptedLoginMethod.avatarUri, encryptedLoginMethod.avatarExpires);
            switch (C0XUV.LIZ[loginMethodName.ordinal()]) {
                case 1:
                case 2:
                    String str4 = encryptedLoginMethod.emailOrUsername;
                    if (str4 != null) {
                        String str5 = encryptedLoginMethod.uid;
                        String str6 = encryptedLoginMethod.orgName;
                        if (str6 != null) {
                            bool = bool4;
                            orgUserInfo = new OrgUserInfo(str6, encryptedLoginMethod.accountType, encryptedLoginMethod.isOrgPeriod);
                        } else {
                            bool = null;
                            orgUserInfo = null;
                        }
                        c0xut = new AccountPassLoginMethod(str5, loginMethodName, str4, commonUserInfo2, -1L, -1L, bool, orgUserInfo, Boolean.valueOf(Intrinsics.LJFF(encryptedLoginMethod.isOrgAccount, bool4)), Boolean.valueOf(Intrinsics.LJFF(encryptedLoginMethod.isMasked, bool4)), null, null, null);
                        c0xut.setExpires(baseLoginMethod.getExpires());
                        c0xut.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
                        c0xut.setOneClickLogin(baseLoginMethod.isOneClickLogin());
                        c0xut.setOneClickLoginToken(baseLoginMethod.getOneClickLoginToken());
                        c0xut.setHasOIDC(baseLoginMethod.getHasOIDC());
                        c0xut.setSuccessfulLoginToken(baseLoginMethod.getSuccessfulLoginToken());
                        c0xut.setMaskedPhone(baseLoginMethod.getMaskedPhone());
                        c0xut.setMaskedEmail(baseLoginMethod.getMaskedEmail());
                        arrayList.add(c0xut);
                    } else {
                        c0xut = baseLoginMethod;
                    }
                    break;
                case 3:
                case 4:
                    Integer num = encryptedLoginMethod.countryCode;
                    if (num != null && encryptedLoginMethod.countryIso != null && encryptedLoginMethod.phoneNumber != null) {
                        PhoneNumberUtil.PhoneNumber phoneNumberCreate = PhoneNumberUtil.PhoneNumber.create(num.intValue(), encryptedLoginMethod.phoneNumber);
                        phoneNumberCreate.setCountryIso(encryptedLoginMethod.countryIso);
                        String str7 = encryptedLoginMethod.uid;
                        Boolean bool5 = encryptedLoginMethod.isOrgAccount;
                        if (bool5 != null) {
                            zBooleanValue = bool5.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        c0xut = new PhoneLoginMethod(str7, LoginMethodName.PHONE_SMS, phoneNumberCreate, commonUserInfo2, -1L, -1L, zBooleanValue, null, null, null);
                        c0xut.setExpires(baseLoginMethod.getExpires());
                        c0xut.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
                        c0xut.setOneClickLogin(baseLoginMethod.isOneClickLogin());
                        c0xut.setOneClickLoginToken(baseLoginMethod.getOneClickLoginToken());
                        c0xut.setHasOIDC(baseLoginMethod.getHasOIDC());
                        c0xut.setSuccessfulLoginToken(baseLoginMethod.getSuccessfulLoginToken());
                        c0xut.setMaskedPhone(baseLoginMethod.getMaskedPhone());
                        c0xut.setMaskedEmail(baseLoginMethod.getMaskedEmail());
                        arrayList.add(c0xut);
                    } else {
                        c0xut = baseLoginMethod;
                    }
                    break;
                case 5:
                    String str8 = encryptedLoginMethod.platform;
                    if (str8 != null) {
                        c0xut = new TPLoginMethod(encryptedLoginMethod.uid, str8, new TPUserInfo(encryptedLoginMethod.userName, encryptedLoginMethod.avatarUrl), false, commonUserInfo2, -1L, -1L, null, null, null);
                        c0xut.setExpires(baseLoginMethod.getExpires());
                        c0xut.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
                        c0xut.setOneClickLogin(baseLoginMethod.isOneClickLogin());
                        c0xut.setOneClickLoginToken(baseLoginMethod.getOneClickLoginToken());
                        c0xut.setHasOIDC(baseLoginMethod.getHasOIDC());
                        c0xut.setSuccessfulLoginToken(baseLoginMethod.getSuccessfulLoginToken());
                        c0xut.setMaskedPhone(baseLoginMethod.getMaskedPhone());
                        c0xut.setMaskedEmail(baseLoginMethod.getMaskedEmail());
                        arrayList.add(c0xut);
                    } else {
                        c0xut = baseLoginMethod;
                    }
                    break;
                case 6:
                    c0xut = new C0XUT(encryptedLoginMethod.uid, commonUserInfo2, l, 250);
                    continue;
                    c0xut.setExpires(baseLoginMethod.getExpires());
                    c0xut.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
                    c0xut.setOneClickLogin(baseLoginMethod.isOneClickLogin());
                    c0xut.setOneClickLoginToken(baseLoginMethod.getOneClickLoginToken());
                    c0xut.setHasOIDC(baseLoginMethod.getHasOIDC());
                    c0xut.setSuccessfulLoginToken(baseLoginMethod.getSuccessfulLoginToken());
                    c0xut.setMaskedPhone(baseLoginMethod.getMaskedPhone());
                    c0xut.setMaskedEmail(baseLoginMethod.getMaskedEmail());
                    arrayList.add(c0xut);
                    break;
                case 7:
                case 8:
                    c0xut = baseLoginMethod;
                    break;
                default:
                    throw new C1954807lC();
            }
            c0xut.setExpires(baseLoginMethod.getExpires());
            c0xut.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
            c0xut.setOneClickLogin(baseLoginMethod.isOneClickLogin());
            c0xut.setOneClickLoginToken(baseLoginMethod.getOneClickLoginToken());
            c0xut.setHasOIDC(baseLoginMethod.getHasOIDC());
            c0xut.setSuccessfulLoginToken(baseLoginMethod.getSuccessfulLoginToken());
            c0xut.setMaskedPhone(baseLoginMethod.getMaskedPhone());
            c0xut.setMaskedEmail(baseLoginMethod.getMaskedEmail());
            arrayList.add(c0xut);
        }
        C19719612Di.LJJIIJ(arrayList, new AwS28S0010000_13(z, 1), true);
        return arrayList;
    }

    public static List LIZIZ(List list, boolean z) {
        boolean zLJFF;
        String name;
        Integer numValueOf;
        String countryIso;
        String nationalNumber;
        String str;
        String str2;
        String strIsOrgPeriod;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        Long lValueOf;
        String oneClickLoginToken;
        String str7;
        Integer num2;
        String str8;
        String oneClickLoginToken2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it2.next();
            boolean zLJFF2 = false;
            if (!z || (Intrinsics.LJFF(baseLoginMethod.isOneClickLogin(), Boolean.TRUE) && (oneClickLoginToken2 = baseLoginMethod.getOneClickLoginToken()) != null && oneClickLoginToken2.length() != 0)) {
                if (baseLoginMethod instanceof PhoneLoginMethod) {
                    PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
                    numValueOf = Integer.valueOf(phoneLoginMethod.getPhoneNumber().getCountryCode());
                    countryIso = phoneLoginMethod.getPhoneNumber().getCountryIso();
                    nationalNumber = phoneLoginMethod.getPhoneNumber().getNationalNumber();
                    zLJFF2 = phoneLoginMethod.isOrgAccount();
                    name = null;
                    str = null;
                    str2 = null;
                    strIsOrgPeriod = null;
                    zLJFF = false;
                } else if (baseLoginMethod instanceof AccountPassLoginMethod) {
                    AccountPassLoginMethod accountPassLoginMethod = (AccountPassLoginMethod) baseLoginMethod;
                    name = accountPassLoginMethod.getName();
                    Boolean boolIsOrgOtp = accountPassLoginMethod.isOrgOtp();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(boolIsOrgOtp, bool)) {
                        OrgUserInfo orgUserInfo = accountPassLoginMethod.getOrgUserInfo();
                        if (orgUserInfo != null) {
                            str = orgUserInfo.orgName;
                        } else {
                            str = null;
                        }
                        OrgUserInfo orgUserInfo2 = accountPassLoginMethod.getOrgUserInfo();
                        if (orgUserInfo2 != null) {
                            str2 = orgUserInfo2.accountType;
                        } else {
                            str2 = null;
                        }
                        OrgUserInfo orgUserInfo3 = accountPassLoginMethod.getOrgUserInfo();
                        if (orgUserInfo3 != null) {
                            strIsOrgPeriod = orgUserInfo3.isOrgPeriod();
                        }
                        zLJFF2 = Intrinsics.LJFF(accountPassLoginMethod.isOrgAccount(), bool);
                        zLJFF = Intrinsics.LJFF(accountPassLoginMethod.isMasked(), bool);
                        numValueOf = null;
                        countryIso = null;
                        nationalNumber = null;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    strIsOrgPeriod = null;
                    zLJFF2 = Intrinsics.LJFF(accountPassLoginMethod.isOrgAccount(), bool);
                    zLJFF = Intrinsics.LJFF(accountPassLoginMethod.isMasked(), bool);
                    numValueOf = null;
                    countryIso = null;
                    nationalNumber = null;
                } else {
                    if (baseLoginMethod instanceof TPLoginMethod) {
                        TPLoginMethod tPLoginMethod = (TPLoginMethod) baseLoginMethod;
                        String str9 = tPLoginMethod.getUserInfo().userName;
                        String str10 = tPLoginMethod.getUserInfo().avatarUrl;
                        CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
                        if (commonUserInfo != null) {
                            str3 = commonUserInfo.screenName;
                        } else {
                            str3 = null;
                        }
                        CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                        if (commonUserInfo2 != null) {
                            str4 = commonUserInfo2.avatarUri;
                        } else {
                            str4 = null;
                        }
                        CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
                        if (commonUserInfo3 != null) {
                            num = commonUserInfo3.avatarExpires;
                        } else {
                            num = null;
                        }
                        baseLoginMethod.setCommonUserInfo(new CommonUserInfo(str9, str10, null, str3, str4, num));
                    }
                    zLJFF = false;
                    name = null;
                    numValueOf = null;
                    countryIso = null;
                    nationalNumber = null;
                    str = null;
                    str2 = null;
                    strIsOrgPeriod = null;
                }
                String uid = baseLoginMethod.getUid();
                LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
                CommonUserInfo commonUserInfo4 = baseLoginMethod.getCommonUserInfo();
                String str11 = "";
                if (commonUserInfo4 == null || (str5 = commonUserInfo4.userName) == null) {
                    str5 = "";
                }
                CommonUserInfo commonUserInfo5 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo5 == null || (str6 = commonUserInfo5.avatarUrl) == null) {
                    str6 = "";
                }
                Date expires = baseLoginMethod.getExpires();
                if (expires != null) {
                    lValueOf = Long.valueOf(expires.getTime());
                } else {
                    lValueOf = null;
                }
                Long lValueOf2 = Long.valueOf(C849680XUw.LIZIZ(baseLoginMethod, 31536000000L));
                if ((!z && !C846430XIj.LIZIZ()) || (oneClickLoginToken = baseLoginMethod.getOneClickLoginToken()) == null) {
                    oneClickLoginToken = "";
                }
                String strFindPlatform = baseLoginMethod.findPlatform();
                CommonUserInfo commonUserInfo6 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo6 != null && (str8 = commonUserInfo6.screenName) != null) {
                    str11 = str8;
                }
                CommonUserInfo commonUserInfo7 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo7 != null) {
                    str7 = commonUserInfo7.avatarUri;
                } else {
                    str7 = null;
                }
                CommonUserInfo commonUserInfo8 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo8 != null) {
                    num2 = commonUserInfo8.avatarExpires;
                } else {
                    num2 = null;
                }
                arrayList.add(new EncryptedLoginMethod(uid, loginMethodName, str5, str6, lValueOf, lValueOf2, oneClickLoginToken, strFindPlatform, name, numValueOf, countryIso, nationalNumber, str11, str7, num2, str, str2, strIsOrgPeriod, Boolean.valueOf(baseLoginMethod.m157isOneClickLogin()), Boolean.valueOf(Intrinsics.LJFF(baseLoginMethod.getHasOIDC(), Boolean.TRUE)), Boolean.valueOf(zLJFF2), Boolean.valueOf(zLJFF), baseLoginMethod.getSuccessfulLoginToken(), baseLoginMethod.getMaskedPhone(), baseLoginMethod.getMaskedEmail()));
            }
        }
        return arrayList;
    }

    public static void LIZLLL(String str, Function1 function1) {
        boolean z;
        MutableLiveData<C0XHP> mutableLiveData = LJI;
        C0XHP value = mutableLiveData.getValue();
        C0XHP c0xhp = C0XHP.NOT_READY;
        if (value == c0xhp && LJ == null) {
            C0XWJ.LIZ.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", str);
            C20684815ws.LJIILLIIL("init_ocl_data_start", c0xgr.LIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C846430XIj.LIZIZ()) {
                AwS20S1100100_13 awS20S1100100_13 = new AwS20S1100100_13(jCurrentTimeMillis, (long) str, (String) function1, (Function1<? super Boolean, Unit>) 1);
                AwS127S1100000_13 awS127S1100000_13 = new AwS127S1100000_13(str, (String) function1, (Function1<? super Boolean, Unit>) 5);
                if (C10EU.LJIILIIL()) {
                    awS127S1100000_13.invoke(new UnsupportedOperationException("OCL is disabled"));
                    return;
                } else {
                    if (LJ != null) {
                        awS127S1100000_13.invoke(new UnsupportedOperationException("Loading is in progress already"));
                        return;
                    }
                    LJ = AbstractC19486711Lt.LJIILIIL(new ARunnableS82S0200000_13(awS127S1100000_13, awS20S1100100_13, 79)).LJIJJLI(C11S5.LIZ()).LJI(new InterfaceC781210Ukh() { // from class: X.0XUI
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            C0XUD.LJ = null;
                        }
                    }).LJIJI(new AfS172S0100000_3((Object) awS127S1100000_13, 76), new InterfaceC781210Ukh() { // from class: X.0XUO
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                        }
                    });
                    return;
                }
            }
            AwS20S1100100_13 awS20S1100100_132 = new AwS20S1100100_13(jCurrentTimeMillis, (long) str, (String) function1, (Function1<? super Boolean, Unit>) 2);
            AwS127S1100000_13 awS127S1100000_132 = new AwS127S1100000_13(str, (String) function1, (Function1<? super Boolean, Unit>) 6);
            if (C10EU.LJIILIIL()) {
                awS127S1100000_132.invoke(new UnsupportedOperationException("OCL is disabled"));
                return;
            } else {
                if (LJ != null) {
                    awS127S1100000_132.invoke(new UnsupportedOperationException("Loading is in progress already"));
                    return;
                }
                LJ = AbstractC19486711Lt.LJIILIIL(new ARunnableS82S0200000_13(awS127S1100000_132, awS20S1100100_132, 81)).LJIJJLI(C11S5.LIZ()).LJI(new InterfaceC781210Ukh() { // from class: X.0XUJ
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C0XUD.LJ = null;
                    }
                }).LJIJI(new AfS172S0100000_3((Object) awS127S1100000_132, 78), new InterfaceC781210Ukh() { // from class: X.0XUP
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                    }
                });
                return;
            }
        }
        if (mutableLiveData.getValue() == c0xhp) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJ("Loading is in progress already");
        } else if (mutableLiveData.getValue() == C0XHP.FAILURE) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJ("OclDataReadiness is FAILURE");
        }
        if (function1 != null) {
            if (mutableLiveData.getValue() == C0XHP.READY) {
                z = true;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static void LJ(List list, Function2 function2) {
        if (C10EU.LJIILIIL()) {
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, -1);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            if (baseLoginMethod.m157isOneClickLogin() && C123100dR.LIZ(baseLoginMethod.getOneClickLoginToken()) && !baseLoginMethod.isExpired()) {
                arrayList.add(obj);
            }
        }
        List listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS32S0000000_13(28), arrayList), 5);
        if (!C846430XIj.LIZIZ()) {
            LJFF(C13LP.LLIIII(listLL), C0XHP.READY);
        }
        C19487011Lw c19487011Lw = LIZLLL;
        if (c19487011Lw != null) {
            c19487011Lw.dispose();
        }
        LIZLLL = AbstractC19486711Lt.LJIILIIL(new ARunnableS82S0200000_13(function2, listLL, 80)).LJIJJLI(C11S5.LIZ()).LJI(new InterfaceC781210Ukh() { // from class: X.0XUG
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C0XUD.LIZLLL = null;
            }
        }).LJIJI(new AfS172S0100000_3(function2, 77), new InterfaceC781210Ukh() { // from class: X.0XUH
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        });
    }

    public static void LJFF(List list, C0XHP c0xhp) {
        LJFF = list;
        LJI.postValue(c0xhp);
    }
}
