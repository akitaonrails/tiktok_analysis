package X;

import Y.ARunnableS101S0100000_1;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS7S1100000_1;
import android.app.Activity;
import android.os.Build;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.PasskeyRegistrationGoogleErrorEvent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: renamed from: X.14x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20431614x8 {
    public static final C20431614x8 LIZ = new C20431614x8();

    public static int LIZIZ(C20443514z3 c20443514z3) {
        AbstractC20446014zS domError = c20443514z3.getDomError();
        if (domError instanceof C19845912kr) {
            return -3000;
        }
        if (domError instanceof C19846012ks) {
            return -3001;
        }
        if (domError instanceof C20446314zV) {
            return -3002;
        }
        if (domError instanceof C19846212ku) {
            return -3003;
        }
        if (domError instanceof C19849012lM) {
            return -3004;
        }
        if (domError instanceof C20446514zX) {
            return -3005;
        }
        if (domError instanceof C20446614zY) {
            return -3006;
        }
        if (domError instanceof C20446914zb) {
            return -3007;
        }
        if (domError instanceof C20447014zc) {
            return -3008;
        }
        if (domError instanceof C20447114zd) {
            return -3009;
        }
        if (domError instanceof C19846412kw) {
            return -3010;
        }
        if (domError instanceof C20447214ze) {
            return -3011;
        }
        if (domError instanceof C19846612ky) {
            return -3012;
        }
        if (domError instanceof C20447314zf) {
            return -3013;
        }
        if (domError instanceof C19846812l0) {
            return -3014;
        }
        if (domError instanceof C20447414zg) {
            return -3015;
        }
        if (domError instanceof C19847012l2) {
            return -3016;
        }
        if (domError instanceof C19847212l4) {
            return -3017;
        }
        if (domError instanceof C20447514zh) {
            return -3018;
        }
        if (domError instanceof C20447614zi) {
            return -3019;
        }
        if (domError instanceof C20447714zj) {
            return -3020;
        }
        if (domError instanceof C20447814zk) {
            return -3021;
        }
        if (domError instanceof C19847412l6) {
            return -3022;
        }
        if (domError instanceof C20447914zl) {
            return -3023;
        }
        if (domError instanceof C19847612l8) {
            return -3024;
        }
        if (domError instanceof C20446114zT) {
            return -3025;
        }
        if (domError instanceof C19848812lK) {
            return -3026;
        }
        if (domError instanceof C20446214zU) {
            return -3027;
        }
        if (domError instanceof C20446414zW) {
            return -3028;
        }
        return -3029;
    }

    public static Pair LJIIJ(Throwable th) {
        Pair pair;
        String str = "";
        new Pair(0, "");
        if (th instanceof AbstractC20027413Xs) {
            AbstractC20027413Xs abstractC20027413Xs = (AbstractC20027413Xs) th;
            if (abstractC20027413Xs instanceof C20443514z3) {
                Integer numValueOf = Integer.valueOf(LIZIZ((C20443514z3) abstractC20027413Xs));
                String message = abstractC20027413Xs.getMessage();
                if (message != null) {
                    str = message;
                }
                pair = new Pair(numValueOf, str);
            } else if (abstractC20027413Xs instanceof C20027513Xt) {
                Integer numValueOf2 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_CANCELLATION_EXCEPTION.getErrorCode());
                String message2 = abstractC20027413Xs.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                pair = new Pair(numValueOf2, str);
            } else if (abstractC20027413Xs instanceof C20444414zC) {
                Integer numValueOf3 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_NO_CREATE_OPTION_EXCEPTION.getErrorCode());
                String message3 = abstractC20027413Xs.getMessage();
                if (message3 != null) {
                    str = message3;
                }
                pair = new Pair(numValueOf3, str);
            } else if (abstractC20027413Xs instanceof C20444714zF) {
                Integer numValueOf4 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_UNSUPPORTED_EXCEPTION.getErrorCode());
                String message4 = abstractC20027413Xs.getMessage();
                if (message4 != null) {
                    str = message4;
                }
                pair = new Pair(numValueOf4, str);
            } else if (abstractC20027413Xs instanceof C20444314zB) {
                Integer numValueOf5 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_INTERRUPTED_EXCEPTION.getErrorCode());
                String message5 = abstractC20027413Xs.getMessage();
                if (message5 != null) {
                    str = message5;
                }
                pair = new Pair(numValueOf5, str);
            } else if (abstractC20027413Xs instanceof C20444614zE) {
                Integer numValueOf6 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_PROVIDER_CONFIGURATION_EXCEPTION.getErrorCode());
                String message6 = abstractC20027413Xs.getMessage();
                if (message6 != null) {
                    str = message6;
                }
                pair = new Pair(numValueOf6, str);
            } else if (abstractC20027413Xs instanceof C20444514zD) {
                Integer numValueOf7 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_UNKNOWN_EXCEPTION.getErrorCode());
                String message7 = abstractC20027413Xs.getMessage();
                if (message7 != null) {
                    str = message7;
                }
                pair = new Pair(numValueOf7, str);
            } else if (abstractC20027413Xs instanceof C20441314yh) {
                Integer numValueOf8 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_CUSTOM_EXCEPTION.getErrorCode());
                String message8 = abstractC20027413Xs.getMessage();
                if (message8 != null) {
                    str = message8;
                }
                pair = new Pair(numValueOf8, str);
            } else {
                Integer numValueOf9 = Integer.valueOf(EnumC20430014ws.PASSKEY_REGISTRATION_DEFAULT_EXCEPTION.getErrorCode());
                String message9 = abstractC20027413Xs.getMessage();
                if (message9 != null) {
                    str = message9;
                }
                pair = new Pair(numValueOf9, str);
            }
        } else if (th instanceof AbstractC20027713Xv) {
            if (th instanceof C20441914yn) {
                Integer numValueOf10 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_CANCELLATION_EXCEPTION.getErrorCode());
                String message10 = th.getMessage();
                if (message10 != null) {
                    str = message10;
                }
                pair = new Pair(numValueOf10, str);
            } else if (th instanceof C20441414yi) {
                Integer numValueOf11 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_CUSTOM_EXCEPTION.getErrorCode());
                String message11 = th.getMessage();
                if (message11 != null) {
                    str = message11;
                }
                pair = new Pair(numValueOf11, str);
            } else if (th instanceof C20442014yo) {
                Integer numValueOf12 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_INTERRUPTED_EXCEPTION.getErrorCode());
                String message12 = th.getMessage();
                if (message12 != null) {
                    str = message12;
                }
                pair = new Pair(numValueOf12, str);
            } else if (th instanceof C20442914yx) {
                Integer numValueOf13 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_PROVIDER_CONFIGURATION_EXCEPTION.getErrorCode());
                String message13 = th.getMessage();
                if (message13 != null) {
                    str = message13;
                }
                pair = new Pair(numValueOf13, str);
            } else if (th instanceof C20442114yp) {
                Integer numValueOf14 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_UNKNOWN_EXCEPTION.getErrorCode());
                String message14 = th.getMessage();
                if (message14 != null) {
                    str = message14;
                }
                pair = new Pair(numValueOf14, str);
            } else if (th instanceof C20442714yv) {
                Integer numValueOf15 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_UNSUPPORTED_EXCEPTION.getErrorCode());
                String message15 = th.getMessage();
                if (message15 != null) {
                    str = message15;
                }
                pair = new Pair(numValueOf15, str);
            } else if (th instanceof C20441514yj) {
                Integer numValueOf16 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_PUBLIC_KEY_EXCEPTION.getErrorCode());
                String message16 = th.getMessage();
                if (message16 != null) {
                    str = message16;
                }
                pair = new Pair(numValueOf16, str);
            } else if (th instanceof C20442214yq) {
                Integer numValueOf17 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_NO_CREDENTIAL_EXCEPTION.getErrorCode());
                String message17 = th.getMessage();
                if (message17 != null) {
                    str = message17;
                }
                pair = new Pair(numValueOf17, str);
            } else {
                Integer numValueOf18 = Integer.valueOf(EnumC20430314wv.PASSKEY_LOGIN_DEFAULT_EXCEPTION.getErrorCode());
                String message18 = th.getMessage();
                if (message18 != null) {
                    str = message18;
                }
                pair = new Pair(numValueOf18, str);
            }
        } else if (th instanceof C0XZJ) {
            Integer numValueOf19 = Integer.valueOf(((C0XZJ) th).getErrorCode());
            String message19 = th.getMessage();
            if (message19 != null) {
                str = message19;
            }
            pair = new Pair(numValueOf19, str);
        } else if (th instanceof C20432014xC) {
            Integer numValueOf20 = Integer.valueOf(((C20432014xC) th).getErrorCode());
            String message20 = th.getMessage();
            if (message20 != null) {
                str = message20;
            }
            pair = new Pair(numValueOf20, str);
        } else {
            Integer numValueOf21 = Integer.valueOf(C0XWH.LIZ(th));
            String message21 = th.getMessage();
            if (message21 != null) {
                str = message21;
            }
            pair = new Pair(numValueOf21, str);
        }
        LIZ(((Number) pair.getFirst()).intValue(), (String) pair.getSecond());
        return pair;
    }

    public static void LJIIL(String str) {
        WeakReference<Activity> weakReferenceLJIILJJIL;
        Activity activity;
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
        if (iCredentialManagerService != null && (weakReferenceLJIILJJIL = iCredentialManagerService.LJIILJJIL()) != null && (activity = weakReferenceLJIILJJIL.get()) != null && str != null) {
            activity.runOnUiThread(new ARunnableS7S1100000_1(activity, str, 1));
        }
    }

    public static void LJIILIIL(Activity activity) {
        activity.runOnUiThread(new ARunnableS101S0100000_1(activity, 2));
    }

    public static void LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error code: ");
        sbLIZ.append(i);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        C0WQI.LIZ(6, "passkey", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJJI(String str, String str2, String str3) {
        WeakReference<Activity> weakReferenceLJIILJJIL;
        Activity activity;
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
        if (iCredentialManagerService != null && (weakReferenceLJIILJJIL = iCredentialManagerService.LJIILJJIL()) != null && (activity = weakReferenceLJIILJJIL.get()) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            if (str != null) {
                c1397580mTM.LJI(str);
            }
            if (str2 != null) {
                c1397580mTM.LIZIZ(str2);
            }
            if (str3 != null) {
                C985403tE.LIZ(c1397580mTM, new AwS81S1000000_31(str3, 6));
            }
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static void LIZJ(Activity activity, boolean z, Boolean bool, int i) {
        String str = CredentialManagerService.LIZ;
        C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, 0);
        C20432114xD.LJIIL(activity, z, bool);
        C849850XVn.LIZIZ.LIZJ().LJFF("86");
        C20432114xD.LJIIJJI(activity, C0WJT.LIZ(activity), bool, i);
        if (!z) {
            activity.runOnUiThread(new ARunnableS104S0100000_4((Object) activity, 92));
        } else {
            activity.runOnUiThread(new ARunnableS112S0100000_12(activity, 338));
        }
    }

    public static void LJ(Activity activity, boolean z, Boolean bool, int i) {
        String str = CredentialManagerService.LIZ;
        C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, 0);
        C20432114xD.LJIIL(activity, z, bool);
        C849850XVn.LIZIZ.LIZJ().LJFF("86");
        C20432114xD.LJIIJJI(activity, C0WJT.LIZ(activity), bool, i);
        if (!z) {
            LJIILIIL(activity);
        } else {
            activity.runOnUiThread(new ARunnableS112S0100000_12(activity, 338));
        }
    }

    public static void LJIIIZ(Activity activity, boolean z, Boolean bool, int i) {
        String str = CredentialManagerService.LIZ;
        C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, i);
        C20432114xD.LJIIL(activity, z, bool);
        C849850XVn.LIZIZ.LIZJ().LJFF("86");
    }

    public static void LIZLLL(Activity activity, boolean z, Boolean bool, Function0 function0, int i) {
        String str = CredentialManagerService.LIZ;
        C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, i);
        if (!z) {
            LJIILIIL(activity);
            C20432114xD.LJIIJJI(activity, C0WJT.LIZ(activity), bool, i);
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(android.app.Activity r17, java.lang.Throwable r18, boolean r19, boolean r20, android.content.Intent r21, X.InterfaceC852200Xbu r22) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20431614x8.LJFF(android.app.Activity, java.lang.Throwable, boolean, boolean, android.content.Intent, X.0Xbu):void");
    }

    public static void LJII(Activity activity, Throwable th, boolean z, boolean z2, Boolean bool, Function0 function0) {
        int errorCode;
        String str;
        if (th instanceof C20432014xC) {
            C20432014xC c20432014xC = (C20432014xC) th;
            function0.invoke();
            int errorCode2 = c20432014xC.getErrorCode();
            if (errorCode2 == EnumC20430014ws.PASSKEY_REGISTRATION_NOT_ON_PROFILE.getErrorCode()) {
                LIZ(c20432014xC.getErrorCode(), "Passkey not shown due to user not on profile page");
            } else {
                if (errorCode2 == EnumC20430014ws.PASSKEY_REGISTRATION_DISMISS_RECREATION_POP_UP.getErrorCode()) {
                    LIZ(c20432014xC.getErrorCode(), "Passkey not shown due to user rejected passkey recreation");
                    return;
                }
                if (errorCode2 == EnumC20430014ws.PASSKEY_REGISTRATION_NULL_POINTER.getErrorCode()) {
                    LIZLLL(activity, z, bool, function0, c20432014xC.getErrorCode());
                    LIZ(c20432014xC.getErrorCode(), "JSON is null");
                    return;
                }
                if (errorCode2 == EnumC20430014ws.PASSKEY_REGISTRATION_ILLEGAL_ARGUMENT.getErrorCode()) {
                    LIZLLL(activity, z, bool, function0, c20432014xC.getErrorCode());
                    LIZ(c20432014xC.getErrorCode(), "JSON file is wrong");
                    return;
                } else if (errorCode2 == EnumC20430014ws.PASSKEY_REGISTRATION_EXISTING_JOB_RUNNING.getErrorCode()) {
                    LIZLLL(activity, z, bool, function0, c20432014xC.getErrorCode());
                    LIZ(c20432014xC.getErrorCode(), "exiting job running");
                    return;
                } else {
                    int errorCode3 = c20432014xC.getErrorCode();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected custom error: ");
                    sbLIZ.append(c20432014xC.getMessage());
                    LIZ(errorCode3, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            String str2 = CredentialManagerService.LIZ;
            C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, c20432014xC.getErrorCode());
            return;
        }
        if (th instanceof C0XZJ) {
            C0XZJ c0xzj = (C0XZJ) th;
            String str3 = CredentialManagerService.LIZ;
            C20432114xD.LJIIJJI(activity, C0WJT.LIZ(activity), bool, c0xzj.getErrorCode());
            LIZ(c0xzj.getErrorCode(), c0xzj.getMessage());
            if (z) {
                if (z2) {
                    activity.runOnUiThread(new ARunnableS112S0100000_12(activity, 338));
                    return;
                } else {
                    C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, c0xzj.getErrorCode());
                    function0.invoke();
                    return;
                }
            }
            if (!z2) {
                C20432114xD.LJIILJJIL(activity, C0WJT.LIZ(activity), bool, c0xzj.getErrorCode());
            }
            if (c0xzj.getErrorCode() == 2029) {
                activity.runOnUiThread(new ARunnableS104S0100000_4((Object) activity, 91));
                return;
            } else if (c0xzj.getErrorCode() < 0) {
                activity.runOnUiThread(new ARunnableS104S0100000_4((Object) activity, 92));
                return;
            } else {
                LJIILIIL(activity);
                return;
            }
        }
        if (th instanceof AbstractC20027413Xs) {
            AbstractC20027413Xs abstractC20027413Xs = (AbstractC20027413Xs) th;
            if (abstractC20027413Xs instanceof C20443514z3) {
                C20443514z3 c20443514z3 = (C20443514z3) abstractC20027413Xs;
                errorCode = LIZIZ(c20443514z3);
                AbstractC20446014zS domError = c20443514z3.getDomError();
                if (domError instanceof C19846812l0) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        LIZJ(activity, z, bool, errorCode);
                    } else {
                        LJIIIZ(activity, z, bool, errorCode);
                    }
                } else if (!(domError instanceof C19846412kw) && !(domError instanceof C19847412l6)) {
                    LJ(activity, z, bool, errorCode);
                } else {
                    LIZLLL(activity, z, bool, function0, errorCode);
                }
                if (errorCode == -3010) {
                    C1887240zD8 c1887240zD8 = C1887240zD8.LIZ;
                    AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(415);
                    c1887240zD8.getClass();
                    C1887240zD8.LIZJ(activity, aFwS221S0000000_31);
                }
                str = "An error occurred while creating a passkey, please check logs for additional details.";
            } else if (abstractC20027413Xs instanceof C20027513Xt) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_CANCELLATION_EXCEPTION.getErrorCode();
                LJIIIZ(activity, z, bool, errorCode);
                str = "The user intentionally canceled the operation and chose not to register the credential. Check logs for additional details.";
            } else if (abstractC20027413Xs instanceof C20444414zC) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_NO_CREATE_OPTION_EXCEPTION.getErrorCode();
                LIZLLL(activity, z, bool, function0, errorCode);
                str = "no viable creation options were found for the given CreateCredentialRequest.";
            } else if (abstractC20027413Xs instanceof C20444714zF) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_UNSUPPORTED_EXCEPTION.getErrorCode();
                LIZLLL(activity, z, bool, function0, errorCode);
                str = "credential manager is unsupported, typically because the device has disabled it or did not ship with this feature enabled. A software update or a restart after enabling may fix this issue, but in certain cases, the device hardware may be the limiting factor.";
            } else if (abstractC20027413Xs instanceof C20444314zB) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_INTERRUPTED_EXCEPTION.getErrorCode();
                LIZJ(activity, z, bool, errorCode);
                str = "The operation was interrupted, please retry the call. Check logs for additional details.";
            } else if (abstractC20027413Xs instanceof C20444614zE) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_PROVIDER_CONFIGURATION_EXCEPTION.getErrorCode();
                LIZLLL(activity, z, bool, function0, errorCode);
                str = "Your app is missing the provider configuration dependency. Check logs for additional details.";
            } else if (abstractC20027413Xs instanceof C20444514zD) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_UNKNOWN_EXCEPTION.getErrorCode();
                LIZLLL(activity, z, bool, function0, errorCode);
                str = "An unknown error occurred while creating passkey. Check logs for additional details.";
            } else if (abstractC20027413Xs instanceof C20441314yh) {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_CUSTOM_EXCEPTION.getErrorCode();
                LJ(activity, z, bool, errorCode);
                str = "An unknown error occurred from a 3rd party SDK. Check logs for additional details.";
            } else {
                errorCode = EnumC20430014ws.PASSKEY_REGISTRATION_DEFAULT_EXCEPTION.getErrorCode();
                LIZLLL(activity, z, bool, function0, errorCode);
                str = "An unknown error occurred.";
            }
            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
            C844470XAv.LIZ.getClass();
            long jLJIIZILJ = iCredentialManagerService.LJIIZILJ(C844470XAv.LIZ());
            PasskeyRegistrationGoogleErrorEvent passkeyRegistrationGoogleErrorEvent = new PasskeyRegistrationGoogleErrorEvent();
            passkeyRegistrationGoogleErrorEvent.LJI(abstractC20027413Xs.getType(), "error_type");
            passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(abstractC20027413Xs.getErrorMessage()), "error_string");
            passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(errorCode), "error_code");
            passkeyRegistrationGoogleErrorEvent.LJI(String.valueOf(jLJIIZILJ), "gms_version");
            passkeyRegistrationGoogleErrorEvent.LJIIIIZZ();
            LIZ(errorCode, str);
            LIZ(errorCode, abstractC20027413Xs.getMessage());
            return;
        }
        int iLIZ = C0XWH.LIZ(th);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unknown error during Registration: ");
        sbLIZ2.append(th.getMessage());
        LIZ(iLIZ, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJIIIIZZ(boolean z, C20431714x9 c20431714x9, boolean z2, String str, int i, String str2) {
        if (z2) {
            if (z) {
                C20431814xA.LIZ(c20431714x9, EnumC20431914xB.CANCEL, str, i, str2);
            } else {
                C20431814xA.LIZIZ(c20431714x9, str, i, str2);
            }
        }
    }
}
