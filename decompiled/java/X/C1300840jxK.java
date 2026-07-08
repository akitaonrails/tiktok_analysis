package X;

import android.telephony.TelephonyManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0jxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300840jxK {
    public static String LIZJ(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getNetworkCountryIso", 1476440071);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getNetworkCountryIso", new AwS421S0200000_20(telephonyManager, certFindCert, 6));
        }
        try {
            String strLIZIZ = LIZIZ(telephonyManager, certFindCert);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJ(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getNetworkOperator", 1476440069);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getNetworkOperator", new C1286710jaX(telephonyManager, certFindCert));
        }
        try {
            String strLIZLLL = LIZLLL(telephonyManager, certFindCert);
            if (strLIZLLL != null) {
                return strLIZLLL;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJI(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getNetworkOperatorName", 1476440070);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getNetworkOperatorName", new C1300850jxL(telephonyManager, certFindCert));
        }
        try {
            String strLJFF = LJFF(telephonyManager, certFindCert);
            if (strLJFF != null) {
                return strLJFF;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJIIIIZZ(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getSimCountryIso", 1476440068);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getSimCountryIso", new C1300860jxM(telephonyManager, certFindCert));
        }
        try {
            String strLJII = LJII(telephonyManager, certFindCert);
            if (strLJII != null) {
                return strLJII;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJIIJ(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getSimOperator", 1476440066);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getSimOperator", new C1284090jWJ(telephonyManager, certFindCert));
        }
        try {
            String strLJIIIZ = LJIIIZ(telephonyManager, certFindCert);
            if (strLJIIIZ != null) {
                return strLJIIIZ;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LJIIL(TelephonyManager telephonyManager) {
        Cert certFindCert;
        Cert cert = C837950Wu1.LIZ;
        if (C837910Wtx.LJFF) {
            certFindCert = CertProviderManagerKt.findCert("bpea-getSimOperatorName", 1476440067);
        } else {
            certFindCert = C837950Wu1.LIZ;
        }
        if (C837910Wtx.LIZJ) {
            return (String) C837880Wtu.LIZ(C794320VDy.LIZJ, "TelephonyManager_getSimOperatorName", new C1300870jxN(telephonyManager, certFindCert));
        }
        try {
            String strLJIIJJI = LJIIJJI(telephonyManager, certFindCert);
            if (strLJIIJJI != null) {
                return strLJIIJJI;
            }
            return "";
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZIZ(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100921, "TelephonyManager_getNetworkCountryIso", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getNetworkCountryIso()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(telephonyManager, 28));
    }

    public static String LIZLLL(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100919, "TelephonyManager_getNetworkOperator", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getNetworkOperator()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new C1300820jxI(telephonyManager));
    }

    public static String LJFF(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100920, "TelephonyManager_getNetworkOperatorName", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getNetworkOperatorName()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new C1300880jxO(telephonyManager));
    }

    public static String LJII(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100922, "TelephonyManager_getSimCountryIso", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getSimCountryIso()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new C1300890jxP(telephonyManager));
    }

    public static String LJIIIZ(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100917, "TelephonyManager_getSimOperator", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getSimOperator()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new C1300830jxJ(telephonyManager));
    }

    public static String LJIIJJI(TelephonyManager telephonyManager, Cert cert) {
        C825940Wae c825940WaeLIZ = LIZ(100918, "TelephonyManager_getSimOperatorName", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/telephony/TelephonyManager", "getSimOperatorName()Ljava/lang/String;", null);
        return (String) C838080WuE.LIZ(c825940WaeLIZ, new C1300900jxQ(telephonyManager));
    }

    public static C825940Wae LIZ(int i, String str, Cert cert) {
        return new C825940Wae(cert, str, new String[]{"country/carrier"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", i);
    }
}
